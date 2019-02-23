import java.util.Scanner;

public class NouveauJeu {

    public void newAdventure() {
        this.selectCharacter();
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        this.choiceCharacter(nb);
    }

    public void selectCharacter() {
        System.out.println("Choix personnage");
        System.out.println("1 - Guerrier");
        System.out.println("2 - Mage");
        System.out.println("3 - Voleur");
        System.out.println("Que souhaitez-vous choisir ?");
    }

    public void choiceCharacter(int character) {
        switch (character) {
            case 1:
                System.out.println("Vous avez choisi : Guerrier");
                Personnage warrior = new Warrior("Fury", "Orc","Plaques",1,10,10,10,10,4,"Loup","Hache");
                warrior.startGame();
                break;
            case 2:
                System.out.println("Vous avez choisi : Mage");
                Personnage mage = new Mage("Lethan","Elfe","Tissu",1,10,10,10,10,100,"baguette de Sorcier","Elementaire");
                mage.startGame();
                break;
            case 3:
                System.out.println("Vous avez choisi : Voleur");
                break;
        }
    }
}
