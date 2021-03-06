package entities;

import com.badlogic.gdx.graphics.Texture;

public class Blue extends A_Ranger
{
	public static Texture _blueRangerTexture;
	
	public Blue()
	{
		super();
		_texture = _blueRangerTexture;
	}

	public int getHealth() 
	{
		return 10;
	}
	
	public int getMaxHealth()
	{
		return 10;
	}

	public int getAtkMod() 
	{
		return 2;
	}

	public int getDmgMod() 
	{
		return 3;
	}

	public String getDmgDice() 
	{
		return "2d6";
	}

	public int getDmgReduction() 
	{
		return 0;
	}

	public int getArmorClass() 
	{
		return 10;
	}
}
