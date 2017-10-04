

public class miniMax {
	int miniMaxMethod(double height, double currentDepth, int currentIndex, int[] leaves, boolean isMin) {
		
		if(height==currentDepth)
			return leaves[currentIndex];
		else {
			if(!isMin) {
				return Math.max(miniMaxMethod(height,currentDepth+1, currentIndex*2, leaves, true), miniMaxMethod(height,currentDepth+1, currentIndex*2+1, leaves, true));
			}
			else {
				return Math.min(miniMaxMethod(height,currentDepth+1, currentIndex*2, leaves, false), miniMaxMethod(height,currentDepth+1, currentIndex*2+1, leaves, false));
			}
		}
	}
}
