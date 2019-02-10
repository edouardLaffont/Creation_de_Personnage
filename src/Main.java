

public class Main {


    public static void main(String[] args) {
        Personnage warrior = new Warrior("Fury", "Orc","Plaques",1,10,10,10,10,4,"Loup","Hache");
        newGame();
        warrior.startGame();

    }
    public static void newGame() {
        System.out.println("Vous commencez une nouvelle partie");
    }

}
