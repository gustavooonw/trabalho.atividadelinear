import javax.swing.JOptionPane;

public class ListaOrdenada {
    public static void main(String[] args) {
        int tamanhoLista = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números na lista:"));

        int[] numeros = new int[tamanhoLista];

        for (int i = 0; i < tamanhoLista; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número " + (i + 1) + ":"));
        }


        StringBuilder listaOrdenada = new StringBuilder("Lista ordenada:\n");
        for (int num : numeros) {
            listaOrdenada.append(num).append(" ");
        }

        JOptionPane.showMessageDialog(null, listaOrdenada.toString());

        int numeroPesquisado;
        boolean numeroEncontrado;
        do {
            numeroPesquisado = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para pesquisar:"));
            numeroEncontrado = pesquisaLinear(numeros, numeroPesquisado) != -1;
            if (!numeroEncontrado) {
                JOptionPane.showMessageDialog(null, "Número não encontrado. Digite novamente.");
            }
        } while (!numeroEncontrado);

        JOptionPane.showMessageDialog(null, "Número encontrado na posição " + (pesquisaLinear(numeros, numeroPesquisado) + 1));
    }

    public static void ordenacaoBolha(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static int pesquisaLinear(int[] arr, int alvo) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == alvo) {
                return i;
            }
        }
        return -1;
    }
}
