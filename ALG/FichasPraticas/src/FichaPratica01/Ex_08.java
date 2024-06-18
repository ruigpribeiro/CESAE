package FichaPratica01;

import java.util.Scanner;

public class Ex_08 {
    public static void main(String[] args) {

        int min1, min2, min3, min4, min5, sec1, sec2, sec3, sec4, sec5;
        int totalSeconds, hours, seconds, minutes;
        final int SECONDS1MIN = 60;

        // scanner para introduzir inputs da musica 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduza minutos da música 1: ");
        min1 = scanner.nextInt();
        System.out.print("Introduza segundos da música 1: ");
        sec1 = scanner.nextInt();

        // scanner para introduzir inputs da musica 2
        System.out.print("Introduza minutos da música 2: ");
        min2 = scanner.nextInt();
        System.out.print("Introduza segundos da música 2: ");
        sec2 = scanner.nextInt();

        // scanner para introduzir inputs da musica 3
        System.out.print("Introduza minutos da música 3: ");
        min3 = scanner.nextInt();
        System.out.print("Introduza segundos da música 3: ");
        sec3 = scanner.nextInt();

        // scanner para introduzir inputs da musica 4
        System.out.print("Introduza minutos da música 4: ");
        min4 = scanner.nextInt();
        System.out.print("Introduza segundos da música 4: ");
        sec4 = scanner.nextInt();

        // scanner para introduzir inputs da musica 5
        System.out.print("Introduza minutos da música 5: ");
        min5 = scanner.nextInt();
        System.out.print("Introduza segundos da música 5: ");
        sec5 = scanner.nextInt();

        // calculo total horas, minutos, segundos
        totalSeconds = min1*SECONDS1MIN + min2*SECONDS1MIN + min3*SECONDS1MIN + min4*SECONDS1MIN + min5*SECONDS1MIN + sec1 + sec2 + sec3 + sec4 + sec5;
        hours = totalSeconds / 3600;
        totalSeconds %= 3600;
        minutes = totalSeconds / 60;
        seconds = totalSeconds % 60;

        System.out.println("Total do Álbum: " + hours+"h" + minutes+"m" + seconds+"s");

    }
}
