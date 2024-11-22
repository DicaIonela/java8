public class Main {
    public static void main(String[] args) {
        // Crearea unui magazin
        Magazin magazin = new Magazin();

        // Aprovizionăm magazinul cu produse
        magazin.aprovizioneaza(101, "Laptop", 3500.99f, 10);  // Adăugăm un laptop
        magazin.aprovizioneaza(102, "Telefon", 1500.49f, 20);  // Adăugăm un telefon
        magazin.aprovizioneaza(103, "Televizor", 2000.75f, 5);  // Adăugăm un televizor

        // Afișăm situația inițială a vânzărilor
        System.out.println("Situația inițială a vânzărilor:");
        magazin.situatieVanzari();

        // Realizăm o vânzare pentru 5 laptopuri
        System.out.println("\nSe încearcă vânzarea a 5 laptopuri:");
        magazin.vanzare(101, 5);  // Vânzăm 5 laptopuri
        magazin.situatieVanzari();  // Afișăm situația după vânzare

        // Realizăm o vânzare de 20 de telefoane (mai mult decât stocul disponibil)
        System.out.println("\nSe încearcă vânzarea a 20 telefoane (mai mult decât stocul disponibil):");
        magazin.vanzare(102, 20);  // Vânzăm 20 de telefoane
        magazin.situatieVanzari();  // Afișăm situația după vânzare

        // Realizăm o vânzare de 1 televizor
        System.out.println("\nSe vinde 1 televizor:");
        magazin.vanzare(103);  // Vânzăm 1 televizor
        magazin.situatieVanzari();  // Afișăm situația după vânzare

        // Aprovizionăm laptopul cu încă 5 unități
        System.out.println("\nAprovizionăm cu 5 laptopuri suplimentare:");
        magazin.aprovizioneaza(101, 5);  // Adăugăm 5 laptopuri
        magazin.situatieVanzari();  // Afișăm situația după aprovizionare

        // Încercăm să vindem 15 telefoane (mai mult decât stocul actual)
        System.out.println("\nSe încearcă vânzarea a 15 telefoane:");
        magazin.vanzare(102, 15);  // Vânzăm 15 telefoane
        magazin.situatieVanzari();  // Afișăm situația după vânzare
    }
}
