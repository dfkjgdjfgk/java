package maayan;

public class CircleArr {
	private final int MAX_CIRCLES=50;
	private Circle[] circleArr;
	private int numOfCirc = 0;
	
	public CircleArr() {
		circleArr = new Circle[MAX_CIRCLES];
		this.numOfCirc=0;
		
	}
	public boolean addCir(Circle o) {
		if(numOfCirc < MAX_CIRCLES) {
			circleArr[numOfCirc++] = new Circle(o);
			return true;
		}
		return false;
			
	}
	public boolean removeCir(Circle o) {
		int found = -1;
		for (int i = 0; i < numOfCirc; i++) {
			if (circleArr[i].isEqual(o)) {
				found = i;
				i=numOfCirc;
			}			
		}
		if(found==-1)
			return false;
		for (int i = found; i<numOfCirc-1; i++) {
			circleArr[i] = circleArr[i+1];
		}
		circleArr[--numOfCirc]=null;
		return true;
	}
	
	}

