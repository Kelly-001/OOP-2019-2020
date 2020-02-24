package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{	


	//float[] rainfall = new float[12]; //how to make an array
	float[] rainfall = {45,37,55,27,38,50,79,48,104,31,100,58}; //assigning elements to an array
	//int to float is okay but other way around is not because a float is bigger than an int
	String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		for(int i =0; i < rainfall.length; i++)
		{
			println(months[i] + "\t" + rainfall[i]);
		}

		// for(float f:rainfall)
		// {
		// 	println(f);
		// }

		// for(String s:months)
		// {
		// 	println(s);
		// }


	}

	void drawBarChart()
	{
		float w =  width / (float) rainfall.length;
		float cGap = 255 / (float) rainfall.length;
		noStroke();
		colorMode(HSB);
		for(int i=0; i<rainfall.length; i++)
		{
			float x = i * w;
			fill(i * cGap,255,255);
			rect(x,height,w,-rainfall[i]);
			
		}

	}

	float offset = 0;

	
	
	public void keyPressed()
	{
		if (key == ' ')
		{
			
		}
	}	


	public void draw()
	{	
		background(0);		
		colorMode(HSB);	
	}
}
