public class Mage extends Personnage {

    private int nbMana;
    private String magicWand;
    private String pet;

    public Mage(String name, String race, String equipmentType, int lvl, int strength, int agility, int endurance, int intelligence, int nbMana, String magicWand, String pet) {
        super(name, race, equipmentType, lvl, strength, agility, endurance, intelligence);
        this.nbMana = nbMana;
        this.magicWand = magicWand;
        this.pet = pet;
    }

    public void petInvocation() {
        if (getLvl() >= 4 & nbMana >= 120) {
            System.out.println("Votre niveau de " + lvl + " et votre mana de " + nbMana + " vous permette d'invoquer un " + pet + ".");
        } if (getLvl() < 4) {
            System.out.println("Votre niveau de " + lvl + " ne vous permet pas encore d'invoquer un " + pet + ".");
        } if (nbMana < 120) {
            System.out.println("Votre mana de " + nbMana + " est insufisant pour invoquer un " + pet + ".");
        }

    }


    @Override
    public void startGame() {
        intelligence += ((getIntelligence() * 20) / 100);
        System.out.println("Votre mage s'appelle " + name + " et pars à l'aventure.");
        System.out.println("Il est de la race " + race + ".");
        System.out.println("Son type de catalyseur magic de prédilection est un(e) " + magicWand + " et il porte du " + equipmentType + " comme armure.");
        System.out.println("Son niveau actuel est : " + lvl + ".");
        System.out.println("Il dispose de " + nbMana + " points de mana.");
        System.out.println("C'est un mage et dispose donc d'une intelligence de " + intelligence + " : elle est bien supérieur aux autres classes !");
        petInvocation();

    }
}
