package orario;

import java.util.Scanner;

public class Orario {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // lettura di ore e minuti
        int ore,minuti;
        System.out.println("Inserire ore e minuti: ");
        ore = input.nextInt();
        minuti = input.nextInt();
        input.nextLine();
        // lettura di am/pm
        String ampm;
        System.out.println("Inserire 'am' o 'pm': ");
        ampm = input.nextLine();
        // controlla che ore sia compreso tra 0 e 23 e che minuti sia compreso tra 0 e 59
        if((ore>=1) && (ore<=12) && (minuti>=0) && (minuti<=59)) {
            if(ampm.equalsIgnoreCase("am") || ampm.equalsIgnoreCase("pm"))
                System.out.println("Avete inserito l'orario: " + ore + ":" + minuti + ampm);
            else 
                System.out.println("Non è un orario a causa di 1");
        }
        else 
            System.out.println("Non è un orario a causa di ore/minuti");   

    }
}
