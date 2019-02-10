
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
        System.out.println("Grâce à ma " + warWeapon + " je peux attaquer 2 fois.");
    }

    public void strongWarrior(int strength) {
        getStrength();
        strength += 20 % getStrength();
        System.out.println("Je suis un guerrier et donc une force de " + strength + " : elle est bien supérieur aux autres classes !");
    }

    @Override
    public void startGame() {
        System.out.println("Je m'appelle " + name + " et je pars à l'aventure.");
        System.out.println("Je suis de la race " + race + ".");
        System.out.println("Mon type d'armure de prédilection est en " + equipmentType + ".");
        System.out.println("Mon niveau actuel est : " + lvl + ".");
        System.out.println("Je dispose de " + nbRage + " points de rage.");
        doubleAttack();
        strongWarrior(strength);
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


