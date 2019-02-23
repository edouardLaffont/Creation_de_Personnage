
public class Warrior extends Personnage {

    private int nbRage;
    private String warMount;
    private String warWeapon;

    public Warrior(String name, String race, String equipmentType, int lvl, int strength, int agility, int endurance, int intelligence, int nbRage, String warMount, String warWeapon) {
        super(name, race, equipmentType, lvl, strength, agility, endurance, intelligence);
        this.nbRage = nbRage;
        this.warMount = warMount;
        this.warWeapon = warWeapon;
    }

    public void doubleAttack() {
        System.out.println("Grâce à sa " + warWeapon + " il peut attaquer 2 fois.");
    }


    @Override
    public void startGame() {
        strength += ((getStrength() * 20) / 100);
        System.out.println("Votre guerrier s'appelle " + name + " et pars à l'aventure.");
        System.out.println("Il est de la race " + race + ".");
        System.out.println("Son type d'armure de prédilection est en " + equipmentType + ".");
        System.out.println("Son niveau actuel est : " + lvl + ".");
        System.out.println("Il dispose de " + nbRage + " points de rage.");
        System.out.println("C'est un guerrier et dispose donc d'une force de " + strength + " : elle est bien supérieur aux autres classes !");
        doubleAttack();
    }

    public int getNbRage() {
        return nbRage;
    }

    public void setNbRage(int nbRage) {
        this.nbRage = nbRage;
    }

    public String getWarMount() {
        return warMount;
    }

    public void setWarMount(String warMount) {
        this.warMount = warMount;
    }

    public String getWarWeapon() {
        return warWeapon;
    }

    public void setWarWeapon(String warWeapon) {
        this.warWeapon = warWeapon;
    }
}


