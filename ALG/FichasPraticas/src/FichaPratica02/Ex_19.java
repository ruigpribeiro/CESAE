package FichaPratica02;

import java.util.Scanner;

public class Ex_19 {
    public static void main(String[] args) {

        int dias, sal = 0;
        double irs = 0, segSocial = 0, encargo = 0, subAli = 0;
        String code;

        // Import de Scanner e Introduzir os inputs
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza o Código do Funcionário (E-Empregado; C-Chefe; A-Admninistrador): ");
        code = scanner.next();
        System.out.print("Introduza o Número de Dias Trabalhado: ");
        dias = scanner.nextInt();

        // Calculo do Vencimento do Colaborador
        switch (code) {
            case "E":
                sal = dias * 40;
                subAli = dias * 5;
                segSocial = sal * 0.11;
                encargo = sal * 0.2375;
                if (sal < 1000) {
                    irs = sal * 0.1;
                } else {
                    irs = sal * 0.2;
                }
                break;
            case "C":
                sal = dias * 60;
                subAli = dias * 7.5;
                segSocial = sal * 0.11;
                encargo = sal * 0.2375;
                if (sal < 1000) {
                    irs = sal * 0.1;
                } else {
                    irs = sal * 0.2;
                }
                break;
            case "A":
                sal = dias * 80;
                subAli = dias * 7.5;
                segSocial = sal * 0.09;
                encargo = Math.round(sal * 0.21);
                if (sal < 1000) {
                    irs = sal * 0.1;
                } else {
                    irs = sal * 0.2;
                }
                break;
        }

        System.out.println("Valor Bruto: " + sal);
        System.out.println("Subsidio de Alimentação: " + subAli);
        System.out.println("Retenção de IRS: " + irs);
        System.out.println("Segurança Social: " + segSocial + " | Encargo EP: " + encargo);
        System.out.println("Valor Liquido: " + (sal + subAli - irs - segSocial));

    }
}
