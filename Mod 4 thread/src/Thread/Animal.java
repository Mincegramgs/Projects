package Thread;

import java.util.Random;

public class Animal implements Runnable {
	private String name;
	private int Position;
	private int speed;
	private int restMax;
	private static boolean winner = false;
	private static Animal Hare;
	private static Animal Tortoise;
	private static Thread hareThread;
	private static Thread tortoiseThread;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPosition() {
		return Position;
	}
	public void setPosition(int position) {
		Position = position;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getRestMax() {
		return restMax;
	}
	public void setRestMax(int restMax) {
		this.restMax = restMax;
	}
	
	public static void main(String[] args) {
		Hare = new Animal();
		Hare.setName("Hare");
		Hare.setPosition(0);
		Hare.setRestMax(220);
		Hare.setSpeed(9);
		
		Tortoise = new Animal();
		Tortoise.setName("Tortoise");
		Tortoise.setPosition(0);
		Tortoise.setRestMax(165);
		Tortoise.setSpeed(5);
		hareThread = new Thread(Hare);
		tortoiseThread = new Thread(Tortoise);
		
		hareThread.start();
		tortoiseThread.start();
	}
	
	@Override
	public void run() {
		 while(Position >= 120 && !winner) {
			 Random rand = new Random();
		            try {
		            	int rest = rand.nextInt(restMax);
						Thread.sleep(rest); 
						Position += speed;
						System.out.println("The " + getName() + " is running and their position is " + getPosition() + " yards." );
		            
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
		           
			 if(!winner) {
				 winner = true;
				 System.out.println("The winner is " + getName());
			 }
		 }
	 }
	}
