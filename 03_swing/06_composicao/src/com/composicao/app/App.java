package com.composicao.app;
import com.composicao.models.Pessoa;
import com.composicao.models.Veiculo;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(JOptionPane.showInputDialog("Digite o nome do proprietario:"));
        pessoa.setCpf(JOptionPane.showInputDialog("Digite o CPF do proprietario:"));
        pessoa.setTelefone(JOptionPane.showInputDialog("Digite o telefone do proprietario:"));

        Veiculo veiculo = new Veiculo();
        veiculo.setModelo(JOptionPane.showInputDialog("Digite o modelo do veiculo:"));
        veiculo.setPlaca(JOptionPane.showInputDialog("Digite a placa do veiculo:"));
        veiculo.setCor(JOptionPane.showInputDialog("Digite a cor do veiculo:"));
        veiculo.setAno(JOptionPane.showInputDialog("Digite o ano do veiculo:"));
        veiculo.setProprietario(pessoa);

        String mensagem = "Dados do Veículo:\n";
        mensagem += "Modelo: " + veiculo.getModelo() + "\n";
        mensagem += "Placa: " + veiculo.getPlaca() + "\n";
        mensagem += "Cor: " + veiculo.getCor() + "\n";
        mensagem += "Ano: " + veiculo.getAno() + "\n\n";
        mensagem += "Dados do Proprietário:\n";
        mensagem += "Nome: " + veiculo.getProprietario().getNome() + "\n";
        mensagem += "CPF: " + veiculo.getProprietario().getCpf() + "\n";
        mensagem += "Telefone: " + veiculo.getProprietario().getTelefone() + "\n";

        JOptionPane.showMessageDialog(null, mensagem);

    }
}
