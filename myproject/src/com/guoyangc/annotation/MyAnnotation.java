package com.guoyangc.annotation;

public class MyAnnotation {

//	@MyAnnotationTest({"1","2","3"})
	@MyAnnotationTest(color =Color.RED)
	public static void main(String[] args) {

	}

}

//±ê¼Ç×¢½â
@interface MyAnnotationDemo {
	
}
enum Color {
	RED,BLACK,SKYBLUE;
}

@interface MyAnnotationTest {
//	String name() default "sherlock";
//	int age();
//	String[] value();
	Color color();
}