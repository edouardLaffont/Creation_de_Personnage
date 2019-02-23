
abstract class Personnage {
   protected String name;
   protected String race;
   protected String equipmentType;
   protected int lvl;
   protected int strength;
   protected int agility;
   protected int endurance;
   protected int intelligence;

   public Personnage(String name, String race, String equipmentType, int lvl, int strength, int agility, int endurance, int intelligence) {
      this.name = name;
      this.race = race;
      this.equipmentType = equipmentType;
      this.lvl = lvl;
      this.strength = strength;
      this.agility = agility;
      this.endurance = endurance;
      this.intelligence = intelligence;
   }


   public abstract void startGame();

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getRace() {
      return race;
   }

   public void setRace(String race) {
      this.race = race;
   }

   public String getEquipmentType() {
      return equipmentType;
   }

   public void setEquipmentType(String equipmentType) {
      this.equipmentType = equipmentType;
   }

   public int getLvl() {
      return lvl;
   }

   public void setLvl(int lvl) {
      this.lvl = lvl;
   }

   public int getStrength() {
      return strength;
   }

   public void setStrength(int strength) {
      this.strength = strength;
   }

   public int getAgility() {
      return agility;
   }

   public void setAgility(int agility) {
      this.agility = agility;
   }

   public int getEndurance() {
      return endurance;
   }

   public void setEndurance(int endurance) {
      this.endurance = endurance;
   }

   public int getIntelligence() {
      return intelligence;
   }

   public void setIntelligence(int intelligence) {
      this.intelligence = intelligence;
   }

}
