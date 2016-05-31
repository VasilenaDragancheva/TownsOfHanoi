import java.util.List;
import java.util.Stack;

public class DiscGameEngine implements HanoiGameEngine {

	private final int discsCount;
	private final Disc[] discs;

	public DiscGameEngine(int count) {
		this.discsCount = count;
		this.discs = new Disc[this.discsCount];
	}

	public DiscGameEngine() {
		this.discsCount = 3;
		this.discs = new Disc[this.discsCount];
	}

	private void createDiscs() {
		this.discs[0] = new Disc(null, 0);
		for (int i = 1; i < discsCount; i++) {
			this.discs[i] = new Disc(this.discs[i - 1], i);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see HanoiGameEngine#play()
	 */
	@Override
	public void play() {
		this.createDiscs();
		Disc last = this.discs[this.discsCount - 1];
		last.moveTo(2);
	}
}
