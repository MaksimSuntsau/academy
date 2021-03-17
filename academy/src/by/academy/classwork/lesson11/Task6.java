package by.academy.classwork.lesson11;

public class Task6<T extends Comparable<String>, V extends Animal & Serializable, K extends Number> {

	T t;
	V v;
	K k;

	public Task6(T t, V v, K k) {
		this.t = t;
		this.v = v;
		this.k = k;
	}

	public void setT(T t) {
		this.t = t;
	}

	public void setV(V v) {
		this.v = v;
	}

	public void setK(K k) {
		this.k = k;
	}

	public T getT() {
		return t;
	}

	public V getV() {
		return v;
	}

	public K getK() {
		return k;
	}

	public void printClass() {
		System.out.println(t.getClass().getName());
		System.out.println(v.getClass().getName());
		System.out.println(k.getClass().getName());
	}

}