package net.adbenson.combinatorial;

public abstract class Backtrack<Type> {
		
	boolean finished = false;
	
	public final void backtrack(Type []a, int k, int n) {
		Type c[];
		int i;
		
		if (is_a_solution(a, k, n)) {
			process_solution(a, k, n);			
		}
		else {
			k = k + 1;
			c = construct_candidates(a, k, n);
			for (i = 0; i < c.length; i++) {
				a[k] = c[i];
				make_move(a, k, n);
				backtrack(a, k, n);
				unmake_move(a, k, n);
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
