package net.adbenson.combinatorial;

public abstract class Backtrack<Type> {
		
	boolean finished = false;
	
	public final void backtrack(Type[] partial, int currentIndex, int n) {
		Type c[];
		int i;
		
		if (is_a_solution(partial, currentIndex, n)) {
			process_solution(partial, currentIndex, n);			
		}
		else {
			currentIndex = currentIndex + 1;
			c = construct_candidates(partial, currentIndex, n);
			for (i = 0; i < c.length; i++) {
				partial[currentIndex] = c[i];
				make_move(partial, currentIndex, n);
				backtrack(partial, currentIndex, n);
				unmake_move(partial, currentIndex, n);
				if (finished) return;
			}
		}
	}
	
	public abstract boolean is_a_solution(Type[] a, int k, int n);

	public abstract Type[] construct_candidates(Type[] a, int k, int n);
	

	public void make_move(Type[] a, int k, int n) {
		// Placeholder stub
	}

	public void unmake_move(Type[] a, int k, int n) {
		// Placeholder stub
	}

	public void process_solution(Type[] a, int k, int n) {
		// Placeholder stub
	}

}
