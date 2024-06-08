/*Vamos exercitar todo o conteúdo apresentado no módulo de 
Sintaxe codificando o seguinte cenário.

Crie o projeto ContaBanco que receberá dados via terminal 
contendo as características de conta em banco conforme 
atributos abaixo:
Dentro do projeto, crie a classe ContaTerminal.java para 
realizar toda a codificação do nosso programa.
*/

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da Conta !");
        String numero = scanner.next();

        System.out.println("Por favor, digite o número da agência  !");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o Seu nome !");
        String nomeCliente = scanner.next();


        double saldo = Double.valueOf(args[0]);

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
        "sua agencia é "+agencia+", conta "+numero+", e seu saldo "+saldo+", já está disponível para saque" );
    }
}
