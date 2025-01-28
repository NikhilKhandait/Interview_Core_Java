package objWithoutNewKeyWord;

import java.lang.reflect.Constructor;

public class RefelectionAPIConstructor {
	 public void display() {
	        System.out.println("Object created using Constructor.newInstance()");
	    }

	    public static void main(String[] args) {
	        try {
	            Constructor<Class4NameInst> constructor = Class4NameInst.class.getDeclaredConstructor();
	            Class4NameInst example = constructor.newInstance();
	            example.display();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

