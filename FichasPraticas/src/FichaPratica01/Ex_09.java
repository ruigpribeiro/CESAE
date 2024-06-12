package FichaPratica01;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        int code, workingDays, salBruto, subAli;
        double salLiq, retIrs, retSegSocial;
        final double IRS = 0.11, SEGSOCIAL = 0.2375;

        // scanner para introduzir inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza o código de funcionário: ");
        code = scanner.nextInt();
        System.out.print("Introduza o número de dias trabalhado: ");
        workingDays = scanner.nextInt();

        // calculos referentes ao salario
        salBruto = workingDays * 40;
        subAli = workingDays * 5;
        retIrs = salBruto * IRS;
        retSegSocial = salBruto * SEGSOCIAL;
        salLiq = salBruto + subAli - retSegSocial - retIrs;


        System.out.println("Valor Bruto: " + salBruto);
        System.out.println("Subsidio de Alimentação: " + subAli);
        System.out.println("Retenção de IRS: " + retIrs);
        System.out.println("Segurança Social: " + retSegSocial);
        System.out.println("Valor Liquido: " + salLiq);

    }
}
