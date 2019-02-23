public class Rogue extends Personnage {

    private int souplesse;
    private String rogueShadow;
    private String rogueWeapon;

    public Rogue(String name, String race, String equipmentType, int lvl, int strength, int agility, int endurance, int intelligence, int souplesse, String rogueShadow, String rogueWeapon) {
        super(name, race, equipmentType, lvl, strength, agility, endurance, intelligence);
        this.souplesse = souplesse;
        this.rogueShadow = rogueShadow;
        this.rogueWeapon = rogueWeapon;
    }


    @Override
    public void startGame() {
        agility += ((getAgility() * 20) / 100);
        System.out.println("Votre mage s'appelle " + name + " et pars à l'aventure.");
        System.out.println("Il est de la race " + race + ".");
        System.out.println("Son type d'arme de prédilection est un(e) " + rogueWeapon + " et il porte du " + equipmentType + " comme armure.");
        System.out.println("Son niveau actuel est : " + lvl + ".");
        System.out.println("Il dispose de " + rogueShadow + " points de souplesse.");
        System.out.println("C'est un voleur et il dispose donc d'une agilité de " + agility + " : elle est bien supérieur aux autres classes !");

    }

    public int getSouplesse() {
        return souplesse;
    }

    public void setSouplesse(int souplesse) {
        this.souplesse = souplesse;
    }

    public String getRogueShadow() {
        return rogueShadow;
    }

    public void setRogueShadow(String rogueShadow) {
        this.rogueShadow = rogueShadow;
    }

    public String getRogueWeapon() {
        return rogueWeapon;
    }

    public void setRogueWeapon(String rogueWeapon) {
        this.rogueWeapon = rogueWeapon;
    }
}
