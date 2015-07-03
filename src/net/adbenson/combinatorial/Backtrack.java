package net.adbenson.combinatorial;

public class Backtrack {
	
	SearchStrategy search;
	
	boolean finished = false;
	
	public void backtrack(int []a, int k, CombinatorialData input) {
		int c[];
		int i;
		
		if (search.is_a_solution(a, k, input)) {
			search.process_solution(a, k, input);			
		}
		else {
			k = k + 1;
			c = search.construct_candidates(a, k, input);
			for (i = 0; i < c.length; i++) {
				a[k] = c[i];
				search.make_move(a, k, input);
				search.backtrack(a, k, input);
				search.unmake_moce(a, k, input);
				if (finished) return;
			}
		}
	}

}
