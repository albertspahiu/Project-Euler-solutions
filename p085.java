/* 
 * Solution to Project Euler problem 85
 * By Nayuki Minase
 * 
 * http://nayuki.eigenstate.org/page/project-euler-solutions
 * https://github.com/nayuki/Project-Euler-solutions
 */


public final class p085 implements EulerSolution {
	
	public static void main(String[] args) {
		System.out.println(new p085().run());
	}
	
	
	private static final int TARGET = 2000000;
	
	public String run() {
		int bestDiff = Integer.MAX_VALUE;
		int bestArea = -1;
		for (int w = 1; w <= Library.sqrt(TARGET); w++) {
			for (int h = 1; h <= Library.sqrt(TARGET); h++) {
				int diff = Math.abs(numberOfRectangles(w, h) - TARGET);
				if (diff < bestDiff) {
					bestDiff = diff;
					bestArea = w * h;
				}
			}
		}
		return Integer.toString(bestArea);
	}
	
	
	private static int numberOfRectangles(int m, int n) {
		return (m + 1) * m * (n + 1) * n / 4;  // A bit more than m^2 n^2 / 4
	}
	
}
