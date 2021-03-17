package by.academy.classwork.lesson17;


//Создать класс Cat. Создать класс Tiger, наследоваться от Cat.
//Добавить public, protected, private переменные в оба класса.
//Добавить public, protected, private методы в оба класса.
//
//Создать объект Class для Cat.
//Создать объект Class для Tiger.
//
//Вывести на экран все методы Cat. (private в том числе) 
//Вывести на экран все методы Tiger. (private в том числе) 
//
//Вывести на экран все названия переменных класса Cat. (private в том числе) 
//Вывести на экран все названия переменных класса Tiger. (private в том числе)
//
//Изменить 1 переменную класса Cat. (private)
//Изменить 1 переменную класса Tiger. (не private)
//
//Добавить метод run в Tiger с private модификатором доступа, вызвать с помощью invoke().
//
//Создать свою аннотацию, добавить 2 переменные.
//Добавить аннотацию в класс Cat.
//Добавить аннотацию в класс Tiger.
//Вывести на экран значение из аннотации.

import java.lang.reflect.InvocationTargetException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

import by.academy.classwork.lesson17.Cat;
import jdk.jfr.Description;

public class Task1 {
	
	public static void main(String[] args) {
		// example 1
		try {
			Class<?> catClass1 = Class.forName("by.academy.classwork.lesson17.Cat");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// example 2
		Cat cat = new Cat();
		cat.setAge(10);
		Class<? extends Cat> catClass2 = cat.getClass();

		// example 3
		Class<Cat> catClass3 = Cat.class;

		Package p = catClass3.getPackage();
		System.out.println("package " + p.getName() + ";");

		try {
			Cat obj = (Cat) catClass2.getDeclaredConstructor().newInstance();
			System.out.println(obj);
//			Class.forName("by.academy.classwork.lesson17.Cat").getDeclaredConstructor().newInstance();

		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Cat cat1 = new Cat(10, "Barsic");
		Class<? extends Cat> catClass = cat1.getClass();

		Method getAgeMethod;
		try {
			getAgeMethod = catClass.getMethod("getAge");
			Annotation[] annotations = getAgeMethod.getAnnotations();
			System.out.println(Arrays.toString(annotations));

			Description[] annotationsByType = getAgeMethod.getAnnotationsByType(Description.class);
			System.out.println(Arrays.toString(annotationsByType));

			Description descriptionAnnotation = getAgeMethod.getAnnotation(Description.class);
			System.out.println(descriptionAnnotation);
			System.out.println(descriptionAnnotation.value());
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}

	}


}
