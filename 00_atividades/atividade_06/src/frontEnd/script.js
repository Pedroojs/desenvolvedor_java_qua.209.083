/* ===============================
        TEMA DARK/LIGHT
   =============================== */
const toggleTheme = document.getElementById("toggle-theme");
toggleTheme.onclick = () => {
    document.body.classList.toggle("light");
    document.body.classList.toggle("dark");

    toggleTheme.innerHTML = document.body.classList.contains("light")
        ? '<i class="fa-solid fa-sun"></i>'
        : '<i class="fa-solid fa-moon"></i>';
};

/* ===============================
        MÁSCARAS
   =============================== */
function maskCPF(v) {
    v = v.replace(/\D/g, "");
    v = v.replace(/(\d{3})(\d)/, "$1.$2");
    v = v.replace(/(\d{3})(\d)/, "$1.$2");
    v = v.replace(/(\d{3})(\d{1,2})$/, "$1-$2");
    return v;
}

function maskTelefone(v) {
    v = v.replace(/\D/g, "");
    v = v.replace(/(\d{2})(\d)/, "($1) $2");
    v = v.replace(/(\d{5})(\d)/, "$1-$2");
    return v;
}

function maskCEP(v) {
    v = v.replace(/\D/g, "");
    v = v.replace(/(\d{5})(\d)/, "$1-$2");
    return v;
}

const cpf = document.getElementById("cpf");
const telefone = document.getElementById("telefone");
const cep = document.getElementById("cep");

if(cpf) cpf.oninput = () => cpf.value = maskCPF(cpf.value);
if(telefone) telefone.oninput = () => telefone.value = maskTelefone(telefone.value);
if(cep) cep.oninput = () => cep.value = maskCEP(cep.value);

/* ===============================
        VIACEP
   =============================== */
const cidade = document.getElementById("cidade");
const bairro = document.getElementById("bairro");
const logradouro = document.getElementById("logradouro");

if(cep) {
    cep.onblur = async () => {
        const c = cep.value.replace(/\D/g, "");
        if (c.length !== 8) return;

        try {
            const r = await fetch(`https://viacep.com.br/ws/${c}/json/`);
            const d = await r.json();

            if (!d.erro) {
                if(cidade) cidade.value = d.localidade;
                if(bairro) bairro.value = d.bairro;
                if(logradouro) logradouro.value = d.logradouro;
            }
        } catch(err) {
            console.error("Erro ViaCEP:", err);
        }
    }
}

/* ===============================
        WIZARD MULTI-ETAPAS
   =============================== */
const steps = document.querySelectorAll(".step");
let currentStep = 0;

function showStep(index) {
    steps.forEach((s, i) => {
        s.classList.remove("active");
        if(i === index) s.classList.add("active");
    });

    // Controle visibilidade botões
    const prevBtn = document.querySelector(".prev");
    const nextBtn = document.querySelector(".next");
    const submitBtn = form.querySelector('button[type="submit"]');

    if(index === 0) {
        prevBtn.style.display = "none";
    } else {
        prevBtn.style.display = "inline-flex";
    }

    if(index === steps.length - 1) {
        nextBtn.style.display = "none";
        submitBtn.style.display = "inline-flex";
    } else {
        nextBtn.style.display = "inline-flex";
        submitBtn.style.display = "none";
    }

    updateProgress();
}

const nextBtns = document.querySelectorAll(".next");
const prevBtns = document.querySelectorAll(".prev");

nextBtns.forEach(btn => {
    btn.onclick = () => {
        if(validateStep(currentStep)) {
            currentStep++;
            if(currentStep >= steps.length) currentStep = steps.length -1;
            showStep(currentStep);
        }
    }
});

prevBtns.forEach(btn => {
    btn.onclick = () => {
        currentStep--;
        if(currentStep < 0) currentStep = 0;
        showStep(currentStep);
    }
});

/* ===============================
        VALIDAR PASSO
   =============================== */
function validateStep(index) {
    const inputs = steps[index].querySelectorAll("input[required], select[required]");
    for(let i=0;i<inputs.length;i++){
        if(inputs[i].value.trim() === "") {
            toast("⚠ Preencha todos os campos obrigatórios!");
            return false;
        }
    }
    return true;
}

/* ===============================
        BARRA DE PROGRESSO
   =============================== */
const progress = document.getElementById("progress-bar");

function updateProgress() {
    let total = 0;
    let filled = 0;
    steps.forEach(step => {
        const inputs = step.querySelectorAll("input[required], select[required]");
        total += inputs.length;
        inputs.forEach(i => {
            if(i.value.trim() !== "") filled++;
        });
    });
    const pct = (total === 0) ? 0 : (filled / total) * 100;
    if(progress) progress.style.width = pct + "%";
}

/* Atualiza progresso ao digitar */
document.querySelectorAll("input, select").forEach(i => i.addEventListener("input", updateProgress));

/* ===============================
        TOAST
   =============================== */
function toast(msg) {
    const t = document.getElementById("toast");
    t.innerHTML = msg;
    t.style.bottom = "20px";
    setTimeout(() => t.style.bottom = "-80px", 2500);
}


const form = document.getElementById("form");
const loading = document.getElementById("loading");

form.onsubmit = (e) => {
    e.preventDefault();

 
    if(currentStep !== steps.length - 1){
        toast("Complete todos os passos antes de enviar!");
        return;
    }

    const inputsLastStep = steps[steps.length - 1].querySelectorAll("input[required], select[required]");
    for(let i=0;i<inputsLastStep.length;i++){
        if(inputsLastStep[i].value.trim() === "") {
            toast("⚠ Preencha todos os campos obrigatórios!");
            return; 
        }
    }

    loading.style.display = "flex";

    setTimeout(() => {
        loading.style.display = "none";
        toast("✔ Formulário enviado com sucesso!");
        form.reset();
        currentStep = 0;
        showStep(currentStep);
        updateProgress();
    }, 1800);
};

showStep(currentStep);
updateProgress();
