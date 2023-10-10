import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Dino> listdino = new ArrayList<>();
        List<Plant> listplant = new ArrayList<>();
        List<Mamife> listmam = new ArrayList<>();
        Dino dino1 = new Dino("Diego", "19/2/2003","Plesohico" ,"Argentina","Herviboro", 13.1, 500);
        Dino dino2 = new Dino("Diego", "19/2/1999","Plesohico" ,"Ecuador","Carnivor", 1.20, 50);
        listdino.add(dino1);
        listdino.add(dino2);

        Plant plant1 = new Plant("Christian", "1/2/2005", "Plesohico", "Finlandia", "Hongo", "500 a.c");
        Plant plant2 = new Plant("Federico", "14/4/2003", "Pesohico", "Colombia", "Conifera", "1.5 m a.c");
        listplant.add(plant1);
        listplant.add(plant2);

        Mamife mam1 = new Mamife("Diego", "14/7/2003", "Plesosohico", "Estados Unidos", "Plantas y semillas", "Terrestre");
        listmam.add(mam1);

        while(true){
            System.out.println("MENU");
            System.out.println("1. Agregar nuevo fosil");
            System.out.println("2. Mostrar todos los especimenes");
            System.out.println("3. Ver los tres Dinosaurios mas grandes");
            System.out.println("4. Mostrar resumen de descubridores");
            System.out.println("5. Salir");
            Scanner sc = new Scanner(System.in);  
            System.out.println("Elige la accion que quieras realizar: ");
            int op = sc.nextInt();
            sc.nextLine();

            switch(op){
                case 1:
                    Scanner scs = new Scanner(System.in);
                    System.out.println("¿ Qué tipo de fosil quieres registrar ?");
                    System.out.println("1. Dinosaurio");
                    System.out.println("2. Planta");
                    System.out.println("3. Mamifero");
                    System.out.println("4. Salir");
                    int opp = scs.nextInt();
                    scs.nextLine();
                    switch(opp){
                        case 1:
                            System.out.println("Ingrese los datos del especimen como se le indica a continuacion");
                            System.out.println("----------------------------------------------------------------");
                            System.out.println("Descubridor : ");
                            String desc = sc.nextLine();
                            System.out.println("Fecha(DD/MM/AA/) : ");
                            String fecha = sc.nextLine();
                            System.out.println("Era : ");
                            String era = sc.nextLine();
                            System.out.println("Ubicacion : ");
                            String ubi = sc.nextLine();
                            System.out.println("Tipo (herbivoro o carnivoro) : ");
                            String tip = sc.nextLine();
                            System.out.println("Tamano en metros : ");
                            double tam = sc.nextDouble();
                            System.out.println("Peso en kilogramos : ");
                            double pes = sc.nextDouble();
                            Dino dino = new Dino(desc, fecha, era, ubi, tip, tam, pes);
                            listdino.add(dino);
                            break;

                        case 2: 
                            System.out.println("Ingrese los datos del especimen como se le indica a continuacion");
                            System.out.println("----------------------------------------------------------------");
                            System.out.println("Descubridor : ");
                            String desc1 = sc.nextLine();
                            System.out.println("Fecha(DD/MM/AA/) : ");
                            String fecha1 = sc.nextLine();
                            System.out.println("Era : ");
                            String era1 = sc.nextLine();
                            System.out.println("Ubicacion : ");
                            String ubi1 = sc.nextLine();
                            System.out.println("Tipo : ");
                            String tip1 = sc.nextLine();
                            System.out.println("Periodo : ");
                            String per = sc.nextLine();
                            Plant plant = new Plant(desc1, fecha1, era1, ubi1, tip1, per);
                            listplant.add(plant);
                        
                        case 3:
                            System.out.println("Ingrese los datos del especimen como se le indica a continuacion");
                            System.out.println("----------------------------------------------------------------");
                            System.out.println("Descubridor : ");
                            String desc2 = sc.nextLine();
                            System.out.println("Fecha(DD/MM/AA/) : ");
                            String fecha2 = sc.nextLine();
                            System.out.println("Era : ");
                            String era2 = sc.nextLine();
                            System.out.println("Ubicacion : ");
                            String ubi2 = sc.nextLine();
                            System.out.println("Dieta : ");
                            String diet = sc.nextLine();
                            System.out.println("Habitat : ");
                            String habit = sc.nextLine();
                            Mamife mamife = new Mamife(desc2, fecha2, era2, ubi2, diet, habit);
                            listmam.add(mamife);
                        
                        case 4: 
                            System.exit(0);
                            break;

                        default: 
                            System.out.println("Opcion invalida");
                    }
                    
                    break;
                case 2:
                    System.out.println("Dinosaurios");
                    for (Dino Dino : listdino) {
                        System.out.println("Descubridor: " + Dino.finder + ", Fecha: " + Dino.date + ", Era: " + Dino.era + ", Ubicacion: " + Dino.ubi + ", Tipo: " + Dino.ali + ", Tamano en metros: " + Dino.size + ", Peso en kilos: " + Dino.weigth);
                    }

                    System.out.println("Plantas");
                    for (Plant Plant : listplant) {
                        System.out.println("Descubridor: " + Plant.finder + ", Fecha: " + Plant.date + ", Era: " + Plant.era + ", Ubicacion: " + Plant.ubi + ", Tipo: " + Plant.tipo + ", Perido: " + Plant.period);
                    }

                    System.out.println("Mamiferos");
                    for (Mamife Mamife : listmam) {
                        System.out.println("Descubridor: " + Mamife.finder + ", Fecha: " + Mamife.date + ", Era: " + Mamife.era + ", Ubicacion: " + Mamife.ubi + ", Dieta: " + Mamife.diet + ", Habitat: " + Mamife.habit);
                    }
                    break;

                case 3:
                    Collections.sort(listdino, Comparator.comparing(Dino::getWeigth).reversed());
                    int cantidad = Math.min(3, listdino.size()); 
                    for (int i = 0; i < cantidad; i++) {
                        Dino Dino = listdino.get(i);
                        System.out.println("Descubridor: " + Dino.finder + ", Fecha: " + Dino.date + ", Era: " + Dino.era + ", Ubicacion: " + Dino.ubi + ", Tipo: " + Dino.ali + ", Tamano en metros: " + Dino.size + ", Peso en kilos: " + Dino.weigth);
                    }
                    break;

                case 4:
                    System.out.println("Escribe el nombre del descubridor que quieras saber el resumen:");
                    Scanner scc = new Scanner(System.in);
                    String desc = scc.nextLine();

                    System.out.println("Dinosaurios");
                    for (Dino Dino : listdino) {
                        if (Dino.finder.equals(desc)) {
                            System.out.println("Descubridor: " + Dino.finder + ", Fecha: " + Dino.date + ", Era: " + Dino.era + ", Ubicacion: " + Dino.ubi + ", Tipo: " + Dino.ali + ", Tamano en metros: " + Dino.size + ", Peso en kilos: " + Dino.weigth);
                        }
                    }

                    System.out.println("Plantas");
                    for (Plant Plant : listplant) {
                        if (Plant.finder.equals(desc)) {
                            System.out.println("Descubridor: " + Plant.finder + ", Fecha: " + Plant.date + ", Era: " + Plant.era + ", Ubicacion: " + Plant.ubi + ", Tipo: " + Plant.tipo + ", Perido: " + Plant.period);
                        }
                    }
                    System.out.println("Mamiferos");
                    for (Mamife Mamife : listmam) {
                        if (Mamife.finder.equals(desc)) {
                            System.out.println("Descubridor: " + Mamife.finder + ", Fecha: " + Mamife.date + ", Era: " + Mamife.era + ", Ubicacion: " + Mamife.ubi + ", Dieta: " + Mamife.diet + ", Habitat: " + Mamife.habit);
                        }
                    }
                    break;

                case 5:
                    System.exit(0);
                    break;

                default: 
                    System.out.println("Opcion invalida");     
            }
        }
    } 
}
