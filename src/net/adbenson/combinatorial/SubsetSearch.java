package net.adbenson.combinatorial;

public class SubsetSearch extends Backtrack<Boolean> {
	
	@Override
	public boolean is_a_solution(Boolean[]a, int k, int n) {
		return (k == n);		
	}
	
	@Override
	public Boolean[] construct_candidates(Boolean a[], int k, int n) {
		Boolean[] c = new Boolean[] {true, false};
		return c;
	}
	
	@Override
	public void process_solution(Boolean[] a, int k, int n) {

		System.out.print("{");
		for (int i = 1; i < k; i++) {
			if (a[i]) {
				System.out.print(" " + i);
			}
		}
		
		System.out.println(" }");
	}
	
	public void generate_subsets(int n) {
		Boolean[] a = new Boolean[n];
		
		backtrack(a, 0, n - 1);
	}

}
