package objWithoutNewKeyWord;
public class Class4NameInst {
	
	    public void display() {
	        System.out.println("Object created using Class.forName() and newInstance()");
	    }

	    public static void main(String[] args) {
	        try {
	            // Use getDeclaredConstructor().newInstance() to create the instance
	            Class<?> clazz = Class.forName("com.obj.Class4NameInst");
	            Class4NameInst example = (Class4NameInst) clazz.getDeclaredConstructor().newInstance();
	            System.out.println("Sucesfully obj created........!!");
	            example.display();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}

