package com.huawei.xiaozhao;

public class PrinceEscape {

	private int S = 30;//mana
	private int T = 10;//time
	private int M = 220;//meter
	
	private int curTime = 0;
	private int curMeter = 0;
	
	public PrinceEscape() {
		
	
		
		for(int i = 0; i < T; i++)
		{
			if(M <= 0)
			{
				break;
			}
			
			if(S >= 10)
			{
				blink();
			}
			else if(S >= 6)
			{
				if(M > 17)
				{
					if(T - curTime >= 2)
						rest();
					else
						run();
				}
				else
					run();
				
			}else if(S >= 2)
			{
				if(M > 34)
				{
					if(T - curTime >= 3)
						rest();
					else
						run();
				}
				else
					run();
				
			}else
			{
				if(M > 51)
				{
					if(T - curTime >= 4)
						rest();
					else
						run();
				}
				else
					run();
			}
		}
		
		if(M <= 0)
		{
			System.out.println("Yes " + (curTime));
		}else
		{
			System.out.println("No " + (curMeter));
		}
		
	}
	
	public void blink()
	{
//		System.out.println("blink");
		curMeter += 60;
		curTime++;
		this.M = this.M - 60;
		this.S = this.S - 10;
	}
	
	public void rest()
	{
		curTime++;
//		System.out.println("rest");
		this.S = this.S + 4;
	}
	
	public void run()
	{
		curMeter += 17;
		curTime++;
//		System.out.println("run");
		this.M = this.M - 17;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PrinceEscape();

	}

}
