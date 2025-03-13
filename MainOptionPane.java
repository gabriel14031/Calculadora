import javax.swing.JOptionPane;

public class MainOptionPane {
    
    public static void main(String[] args) {
        String stringEntrada = JOptionPane.showInputDialog
        ("Entre com o valor para inicar os cálculos");
        float valorInicial = Float.parseFloat(stringEntrada);
        Calculadora calc = new Calculadora(valorInicial);

        while (true){
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n 1- Somar\n 2- Subtrair \n 3- Dividir\n 4-Multiplicar\n 5- Sair"));
            //Primeira instrução

            if (opcao == 5){
                break;
            }
            else if (opcao < 1 || opcao > 5){
                JOptionPane.showMessageDialog(null, "Valor inválido!");
                continue;
                //O código 'continue' serve para resetar o loop, voltando na primeira instrução
            }
            float valorOperador = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do operando:"));
            if (opcao == 1){
                calc.somar(valorOperador);
                //JOptionPane.showMessageDialog(null, "O valor atual é: "+ calc.valor);
            }
            else if (opcao == 2){
                calc.subtrair(valorOperador);
            }
            else if (opcao == 3){
                if (valorOperador == 0){
                    while (valorOperador == 0){
                        valorOperador = Float.parseFloat(JOptionPane.showInputDialog("Número inválido\nDigite outro valor para o operando:"));
                    }
                }
                else{
                    calc.dividir(valorOperador);
                }
            }
            else if (opcao == 4){
                calc.multiplicar(valorOperador);
            }
            JOptionPane.showMessageDialog(null, "O valor atual é: " + calc.valor);
        }
        JOptionPane.showMessageDialog(null, "O resultado é: " + calc.valor);
    }
}
