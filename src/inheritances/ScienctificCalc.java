package inheritances;

public class ScienctificCalc extends AdvCalc{ //multilevel inheritance
	public int power(int a,int b) {
		return (int)Math.pow(a,b);
	}
	public int sqrts(int a) {
		return (int)Math.sqrt(a);
	}
}
