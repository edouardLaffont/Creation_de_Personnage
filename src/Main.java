

public class Main {


    public static void main(String[] args) {
        Personnage warrior = new Warrior("Fury", "Orc","Plaques",1,10,10,10,10,4,"Loup","Hache");
        Personnage mage = new Mage("Lethan","Elfe","Tissu",1,10,10,10,10,100,"baguette de Sorcier","Elementaire");
        newGame();
        warrior.startGame();
        mage.startGame();

    }
    public static void newGame() {
        System.out.println("Vous commencez une nouvelle partie");
    }

}
