package com.yao.reflect;

import java.lang.reflect.Field;

/**
 * 利用java反射原理提取对象的field，设置访问权限，并对其赋值
 * @author yaoxiao
 *
 */
public class FieldTest {
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, ClassNotFoundException, InstantiationException {

	//	Person person = new Person();
		Person person = (Person)Class.forName("com.yao.reflect.Person").newInstance();
	//	Class<Person>  person = (Class<Person> )Class.forName("com.yao.reflect.Person");
		Class<Person> personClazz = Person.class;
		
		Field nameField = personClazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(person, "yao xiao");
        
        Field ageField = personClazz.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(person, 26);
        System.out.println(person);
	}
	
}
