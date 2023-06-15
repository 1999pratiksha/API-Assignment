package Jsonobj;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsontoJavapojo {

	public static void main(String[] args) {
		ObjectMapper mapper=new ObjectMapper();
		try {
			Accounting Account=mapper.readValue(new File("data/Simple.json"),Accounting.class);
			System.out.println("firstName:"+Account.getFirstName());
			System.out.println("lastName:"+Account.getLastName());
			System.out.println("age:"+Account.getAge());
			Sales salefield=Account.getSales();
			System.out.println("firstName:"+salefield.getFirstName());
			System.out.println("lastName:"+salefield.getLastName());
			System.out.println("age:"+salefield.getAge());
		} catch (StreamReadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}

}
