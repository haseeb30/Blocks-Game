package eecs2030.lab4;

import java.awt.Color;

public class IBlock extends Block {

	public IBlock(Point2 pos, Color col) {
		super(4, pos, col);
		this.grid.set(1, 0);
		this.grid.set(1, 1);
		this.grid.set(1, 2);
		this.grid.set(1, 3);

	}

	@Override
	public void spinRight() {
		// TODO Auto-generated method stub
		// converting from A to B
		if (this.grid.get(1, 0)) {
			this.grid.clearAll();
			this.grid.set(0, 2);
			this.grid.set(1, 2);
			this.grid.set(2, 2);
			this.grid.set(3, 2);
		}
		// converting from B to C
		else if (this.grid.get(0, 2)) {
			this.grid.clearAll();
			this.grid.set(2, 0);
			this.grid.set(2, 1);
			this.grid.set(2, 2);
			this.grid.set(2, 3);
		}
		// converting from C to D
		else if (this.grid.get(2, 0)) {
			this.grid.clearAll();
			this.grid.set(0, 1);
			this.grid.set(1, 1);
			this.grid.set(2, 1);
			this.grid.set(3, 1);
		}
		// converting from D back to A
		else if (this.grid.get(0, 1)) {
			this.grid.clearAll();
			this.grid.set(1, 0);
			this.grid.set(1, 1);
			this.grid.set(1, 2);
			this.grid.set(1, 3);
		}
	}

	@Override
	public void spinLeft() {
		// TODO Auto-generated method stub
		// converting from A to D
		if (this.grid.get(1, 0)) {
			this.grid.clearAll();
			this.grid.set(0, 1);
			this.grid.set(1, 1);
			this.grid.set(2, 1);
			this.grid.set(3, 1);
		}
		// from B to A
		else if (this.grid.get(0, 2)) {
			this.grid.clearAll();
			this.grid.set(1, 0);
			this.grid.set(1, 1);
			this.grid.set(1, 2);
			this.grid.set(1, 3);
		}
		// from C to B
		else if (this.grid.get(2, 0)) {
			this.grid.clearAll();
			this.grid.set(0, 2);
			this.grid.set(1, 2);
			this.grid.set(2, 2);
			this.grid.set(3, 2);
		}
		else if (this.grid.get(0, 1)) {
			this.grid.clearAll();
			this.grid.set(2, 0);
			this.grid.set(2, 1);
			this.grid.set(2, 2);
			this.grid.set(2, 3);
		}
	}
}
