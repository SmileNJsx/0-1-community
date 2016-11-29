package com.neverlov;

public class Lady
{
	private Man man;
	
	public void say()
	{
		man.say();
	}

	public Man getMan()
	{
		return man;
	}

	public void setMan(Man man)
	{
		this.man = man;
	}
}
