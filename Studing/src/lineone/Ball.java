package lineone;

public class Ball {
	private int left;
	private int top;
	private int radius;
	private Speed speed;
	
	public Ball(int left, int top, int radius, Speed speed) {
		this.left = left;
		this.top = top;
		this.radius = radius;
		this.speed = speed;
	}
	public int left() {
		return this.left;
	}
	public int top() {
		return this.top;
	}
	public int diametr() {
		return this.radius * 2;
	}
	public int right() {
		return this.left + this.diametr();
	}
	public int bottom() {
		return this.top + this.diametr();
	}
	public void move() {
		this.left += this.speed.x;
		this.top  += this.speed.y;
	}
	public Speed getSpeed() {
		return this.speed;
	}
	
}
