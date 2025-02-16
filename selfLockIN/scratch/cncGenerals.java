
import java.util.Scanner;

public class cncGenerals {
    abstract class Army {
        //public abstract void deployUnit();
    }
    public class Units {
        private String faction;
        private String type;
        private String subType;
        private int cost;
        private int damage;
        private String slogan;

        public Units(String faction, String type, String subType, int cost, int damage, String slogan) {
            this.faction = faction;
            this.type = type;
            this.subType = subType;
            this.cost = cost;
            this.damage = damage;
            this.slogan = slogan;
        }


    }


    public static boolean chooseFaction() {
        Scanner scan = new Scanner (System.in);

        boolean queueUnits = true, factionSelected = true;
        String structure = "";
        System.out.println("Choose your faction (USA, China, GLA)");
        String faction = scan.nextLine().toLowerCase();
  
        try {
            while (queueUnits == true) {
                if (factionSelected == true) {
                    if (faction == "USA") {
                        structure = chooseStructure();
                    } 
                    else if (faction == "China"){
                        structure = chooseStructure();
                    } 
                    else if (faction == "GLA") {
                        structure = chooseStructure();
                    }
                    
                } else {
                    factionSelected = false;
                    queueUnits = false;
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        return true;
    }

    public static String chooseStructure() {
        Scanner scan = new Scanner (System.in);

        String unit = "";
        System.out.println("Choose your unit structure.");
        String structure = scan.nextLine().toLowerCase();

        if (structure == "Barracks") {
            structure = "Barracks";
            unit = chooseUnitType();
        }
        else if (structure == "War Factory"){
            structure = "War Factory";
            unit = chooseUnitType();
        }
        else if (structure == "AirField"){
            structure = "AirField";
            unit = chooseUnitType();
        }
        return structure;
    }

    public static String chooseUnitType() {
        Scanner scan = new Scanner (System.in);

        System.out.println("Choose your unit.");
        String unitType = scan.nextLine().toLowerCase();
        if (unitType == "") {
            
        } 
        return"";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        //Units unit = new Units(null, null, null, 0, 0, null);

        int maxQuantity = 50;
        int budget = 50_000;
        int total_cost = 0;
        String faction = "";
    
        System.out.println("Welcome General, we are ready for your command.\n");

        chooseFaction();


    }           
}




