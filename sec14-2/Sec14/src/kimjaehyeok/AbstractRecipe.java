package kimjaehyeok;

public abstract class AbstractRecipe {
	
	public void execute() {
		getReady();
		goTheDish();
		cleanup();
	}
	
	abstract void getReady();
	abstract void goTheDish();
	abstract void cleanup();
	//prepare
	//recipe
	//cleanup

}
