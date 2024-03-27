package org.learning.variables;

// import


import java.util.Scanner;

public class OSSurvey {

  public static void main(String[] args) {
    // dichiaro e inizializzo lo Scanner
    Scanner keyboardReader = new Scanner(System.in);

    // salvo in variabili quanti utenti per ogni sistema operativo
    int windowsUsers, macUsers, linuxUsers;

    // chiedo all'utente di darmi i valori per i vari sistemi operativi
    System.out.print("How many Windows users? ");
    windowsUsers = keyboardReader.nextInt();
    System.out.print("How many Mac users? ");
    macUsers = keyboardReader.nextInt();
    System.out.print("How many Linux users? ");
    linuxUsers = keyboardReader.nextInt();
    
    // totale utenti
    int totalUsers = windowsUsers + macUsers + linuxUsers;

    // applico la formula della percentuale percSO = utentiSO/totale*100
    double percWindows = (double) windowsUsers / totalUsers * 100;
    double percMac = (double) macUsers / totalUsers * 100;
    double percLinux = (double) linuxUsers / totalUsers * 100;

    // stampo le percentuali per ogni sistema operativo
    System.out.println("Windows users: " + windowsUsers);
    System.out.println("Mac users: " + macUsers);
    System.out.println("Linux users: " + linuxUsers);

    System.out.println("Total users: " + totalUsers);
    System.out.println("% Windows: " + percWindows);
    System.out.println("% Mac: " + percMac);
    System.out.println("% Linux: " + percLinux);

    // chiudo lo scanner
    keyboardReader.close();
  }
}
