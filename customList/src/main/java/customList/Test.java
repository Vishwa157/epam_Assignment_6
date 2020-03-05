/**
 * 
 */
package customList;

/**
 * @author Vishwanath Reddy
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomList<Integer> customizedList = new CustomList<Integer>();
		
		// Adding Elements in the customized List
		customizedList.addElement(121);
		customizedList.addElement(32221);
		customizedList.addElement(18781);
		customizedList.addElement(67241);
		customizedList.addElement(879081);
		
		// Printing the Elements in List
		System.out.println("The elements in the List are: "+customizedList);
		
		// Removing Elements from the List
		customizedList.removeElement(2);
		customizedList.removeElement(1);
		
		// Getting values of the list
		 System.out.println("Fetching the element in the index position is: "+customizedList.getTheElement(2));
		 System.out.println("Fetching the element in the index position is: "+customizedList.getTheElement(0));
		 
		 // Size of the List
		 System.out.println("The Size of the List is: "+customizedList.sizeOfList());
	}

}
