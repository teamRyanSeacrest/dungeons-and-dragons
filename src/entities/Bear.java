package entities;

public class Bear extends A_RangerDecorator
{

	public Bear(A_Ranger r) 
	{
		super(r);
	}
	
	public int getHealth() 
	{		
		return 2 + ranger.getHealth();
	}
	
	public int getMaxHealth()
	{
		return ranger.getMaxHealth() + 2;
	}
	
	public int getAtkMod() 
	{		
		return ranger.getAtkMod() - 1;
	}
	
	public int getDmgMod() 
	{		
		return 1 + ranger.getDmgMod();
	}
	
	public String getDmgDice() 
	{		
		return ranger.getDmgDice();
	}
	
	public int getDmgReduction() 
	{		
		return ranger.getDmgReduction();
	}
	
	public int getArmorClass() 
	{		
		return ranger.getArmorClass();
	}

}

