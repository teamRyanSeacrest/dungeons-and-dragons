//Sawyer
//package dungeons;

public class A_Items 
{
	
   private int _maxHealth;
   private int _currentHealth;
   private int _attackModifier;
   private int _damageModifier;
   private int _damageReduction;
   private String _damageDi;
   private String _armor;
   private String _name;
	
   public A_Item(){
      this.setMaxHealth(0);
      this.setCurrentHealth(0);
      this.setAttackModifier(0);
      this.setDamageModifier(0);
      this.setDamageDi("");
      this.setDamageReduction(0);
      this.setArmor("");
   }

   public int getMaxHealth() {
      return _maxHealth;
   }

   public void setMaxHealth(int health) {
      this._maxHealth = health;
   }

   public int getCurrentHealth() {
      return _currentHealth;
   }

   public void setCurrentHealth(int health) {
      this._currentHealth = health;
   }
   
   public int getAttackModifier() {
      return _attackModifier;
   }

   public void setAttackModifier(int attackModifier) {
      this._attackModifier = attackModifier;
   }

   public int getDamageModifier() {
      return _damageModifier;
   }

   public void setDamageModifier(int damageModifier) {
      this._damageModifier = damageModifier;
   }

   public String getDamageDi() {
      return _damageDi;
   }

   public void setDamageDi(String damageDi) {
      this._damageDi = damageDi;
   }

   public int getDamageReduction() {
      return _damageReduction;
   }

   public void setDamageReduction(int damageReduction) {
      this._damageReduction = damageReduction;
   }

   public String getArmor() {
      return _armor;
   }

   public void setArmor(String armor) {
      this._armor = armor;
   }
   
   public void turn(){}
}
