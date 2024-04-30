import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CadastroClientes {
    public static void main(String[] args) {
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        listaClientes.add(new Cliente(1, "Luna Oliveira", "05/12/1992", "987.654.321-00"));
        listaClientes.add(new Cliente(2, "Maxwell Silva", "20/07/1985", "123.456.789-00"));
        listaClientes.add(new Cliente(3, "Aurora Santos", "15/03/1998", "555.555.555-55"));

        String inputCodigo = JOptionPane.showInputDialog("Informe o código do cliente para pesquisa:");
        int codigoPesquisa = Integer.parseInt(inputCodigo);

        Cliente clienteEncontrado = null;
        for (Cliente cliente : listaClientes) {
            if (cliente.getCodigoCliente() == codigoPesquisa) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado != null) {
            String mensagem = "Dados do cliente encontrado:\n" +
                    "Código: " + clienteEncontrado.getCodigoCliente() + "\n" +
                    "Nome: " + clienteEncontrado.getNomeCliente() + "\n" +
                    "Data de Nascimento: " + clienteEncontrado.getDataNascimento() + "\n" +
                    "CPF: " + clienteEncontrado.getCpf();
            JOptionPane.showMessageDialog(null, mensagem);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
        }
    }
}