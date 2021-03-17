package by.academy.classwork.lesson14;

public class HeavyBox extends Box {

	int weight;

	public HeavyBox() {
		super();
	}

	public HeavyBox(int width, int height, int depth, int weight) {

		this.weight = weight;
		this.height = height;
		this.depth = depth;
		this.width = width;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void printSomething() {
		System.out.println("Something");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HeavyBox [weight=");
		builder.append(weight);
		builder.append(", width=");
		builder.append(width);
		builder.append(", height=");
		builder.append(height);
		builder.append(", depth=");
		builder.append(depth);
		builder.append("]");
		return builder.toString();
	}

}
