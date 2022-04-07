package BudgetCalculator;

import java.util.Scanner;

public class BudgetCalculatorView {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in);
        System.out.println("Informe o nome da conta: ");
        Calculation nome = new Calculation();
        String cNome = scanf.nextLine();

        System.out.println(cNome);

        Calculation valor = new Calculation();
        
    }
}
