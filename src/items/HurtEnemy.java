package items;

import entities.A_BadGuyDecorator;
import entities.A_Villain;
import entities.A_BadGuyDecorator;
import entities.A_Villain;

public class HurtEnemy extends A_BadGuyDecorator
{
	private int _damage = 0;
	public HurtEnemy(A_Villain r) 
	{
		super(r);
	}
	
	public HurtEnemy(A_Villain r, int damage) 
	{
		super(r);
		_damage = damage - getDmgReduction();
	}

	public int getHealth() 
	{		
		if(villain.getHealth() - _damage  < 0)
			villain.die();
		return villain.getHealth() - _damage;
	}
	
	public int getMaxHealth()
	{
		return villain.getMaxHealth();
	}
	
	public int getAtkMod() 
	{		
		return villain.getAtkMod();
	}
	
	public int getDmgMod() 
	{		
		return villain.getDmgMod();
	}
	
	public String getDmgDice() 
	{		
		return villain.getDmgDice();
	}
	
	public int getDmgReduction() 
	{		
		return villain.getDmgReduction();
	}
	
	public int getArmorClass() 
	{		
		return villain.getArmorClass();
	}
}