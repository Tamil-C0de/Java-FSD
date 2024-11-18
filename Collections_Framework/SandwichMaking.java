package Collections_Framework;

class BuyIngredientsThread extends Thread{
	public void run() {
		System.out.println("Step 1 -> Buy Bread and ingredients...");
		try {
			Thread.sleep(3000);
		} catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Ingredient bought");
	}
}

class MakeSandwichThread extends Thread{
	private Thread ingredientThread;
	
	public MakeSandwichThread(Thread ingredientThread) {
		this.ingredientThread = ingredientThread;
	}
	
	public void run() {
		try {
			ingredientThread.join();
		} catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Step 2 -> Make Sandwich...");
	}
}

public class SandwichMaking {

	public static void main(String[] args) {
		BuyIngredientsThread buyIngredientsThread = new BuyIngredientsThread();
		MakeSandwichThread makeSandwichThread = new MakeSandwichThread(buyIngredientsThread);
		
		buyIngredientsThread.start();
		makeSandwichThread.start();
	}

}
