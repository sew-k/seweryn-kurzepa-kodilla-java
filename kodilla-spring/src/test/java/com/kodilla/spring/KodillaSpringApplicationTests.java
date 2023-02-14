package com.kodilla.spring;

import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Square;
import com.kodilla.spring.shape.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class KodillaSpringApplicationTests {

	@Test
	void testCircleLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.kodilla.spring");
		//Shape shape = context.getBean(Circle.class);
		Shape shape = (Shape)context.getBean("circle");

		//When
		String name = shape.getShapeName();

		//Then
		Assertions.assertEquals("This is a circle", name);

	}
	@Test
	void testTriangleLoadedIntoContainer() {
		//Given
		ApplicationContext context =
				new AnnotationConfigApplicationContext("com.kodilla.spring");
		//Shape shape = context.getBean(Triangle.class);
		Shape shape = (Shape)context.getBean("triangle");

		//When
		String name = shape.getShapeName();

		//Then
		Assertions.assertEquals("This is a triangle", name);

	}
	@Test
	void testSquareLoadedIntoContainer() {
		//Given
		ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
		//Square square = context.getBean(Square.class);
		Shape shape = (Shape)context.getBean("createSquare");

		//When
		String name = shape.getShapeName();

		//Then
		Assertions.assertEquals("This is a square", name);
	}
	@Test
	void testShapeLoadedIntoContainer() {
		//Given
		ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
		Shape shape = (Shape)context.getBean("chosenShape");

		//When
		String name = shape.getShapeName();

		//Then
		System.out.println("Chosen shape says: " + name);

	}

	@Test
	void contextLoads() {
	}

}
