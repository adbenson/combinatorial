package net.adbenson.combinatorial;

public abstract class Backtrack<Type> {
		
	boolean finished = false;
	
	public final void backtrack(Type[] partial, int currentIndex, int n) {
		
		if (is_a_solution(partial, currentIndex, n)) {
			process_solution(partial, currentIndex, n);			
		}
		else {
			Type[] candidates = construct_candidates(partial, currentIndex, n);
			
			for (int i = 0; i < candidates.length; i++) {
				
				partial[currentIndex] = candidates[i];
				make_move(partial, currentIndex, n);
				backtrack(partial, currentIndex + 1, n);
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
