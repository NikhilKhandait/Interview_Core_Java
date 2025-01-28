package objWithoutNewKeyWord;

public class Cloning implements Cloneable {
	 public void display() {
	        System.out.println("Object created using clone()");
	    }

	    @Override
	    protected Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }

	    public static void main(String[] args) {
	        try {
	        	Cloning original = new Cloning();
	        	Cloning clone = (Cloning) original.clone();
	        	System.out.println("object of is clone.......!!");
	            clone.display();
	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
	    }
	}

