
public class Disc implements GameObject {

	private final int number;
	private Disc child;
	private int currentPole;

	public Disc(Disc child, int number) {
		this.setChild(child);
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public Disc getChild() {
		return child;
	}

	public void setChild(Disc child) {
		this.child = child;
	}

	public int getCurrentPole() {
		return currentPole;
	}

	public void setCurrentPole(int currentPole) {
		this.currentPole = currentPole;
	}

	@Override
	public void moveTo(int nextPole) {
		if (this.child == null) {
			this.printMove(nextPole);
			this.currentPole = nextPole;

		} else {
			//TO DO FIX
			int childToMove = 1;
			this.child.moveTo(childToMove);
			this.printMove(nextPole);
			this.child.moveTo(nextPole);
			
		}

	}
  private void printMove(int nextPole){
	  System.out.println(
				String.format("Disc %d moved from %d pole to %d pole", this.number, this.currentPole, nextPole));
  }
}
