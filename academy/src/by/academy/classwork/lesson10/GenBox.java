package by.academy.classwork.lesson10;

public class GenBox<T> {
	
	 T item;
	
	public GenBox(T item) {
				
		this.item = item ;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	

}
