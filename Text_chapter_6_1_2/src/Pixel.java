import java.awt.Color;

class Point{
	private int x, y;
	
	public Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		this(0,0);
	}
	
	public String toString() {
		return "点："+x+","+y;
	}
}

public class Pixel extends Point{
		Color c;
		
		public Pixel(int x,int y,Color c) {
			super(x,y);
			this.c = c;
		}
		
		public String toString() {
			return super.toString()+"颜色："+c;
		}
		
		public static void main(String[] args) {
			Pixel x = new Pixel(3,24,Color.blue);
			System.out.println(x);
		}
}
