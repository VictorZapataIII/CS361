/**
 * 
 */
package employee;

/**
 * @author Victor
 *
 */

// Resource: https://www.baeldung.com/java-type-casting

// Complete the provided code

public class DemoEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee emp1 = new Employee("John", "Smith", "123456790");

		PartTimeEmployee pEmp1 = new PartTimeEmployee("Jane", "Smith", "123456777", 17.5);

//		Employee emp2 = new Employee("Don", "Holmes", "123456799");

//		PartTimeEmployee pEmp2 = new PartTimeEmployee("Melissa", "Will", "123456666", 23.5);

		// Upcasting
		Employee emp3 = pEmp1;
		System.out.println("emp3");
		emp3.whoAmI();
		// TODO To complete
		//emp3.whoAmI() // prints ... because ...
		/*
		emp3.whoAmI will print Part Time Employee because with emp3 being Upcasted, since both Part Time Employee has and Employee have the method
		whoAmI(), by calling the method, it will grab it from Part Time Employee versus Employee, due to the nature of upcasting.
		*/
		// emp3.getHourlyRate(); // returns syntax error because ...
		/*
		In Employeee.java there is no method called 'getHourlyRate()' because emp3 is Employee that was upcasted from a PartTimeEmployee since emp3 isn't actually a
		Part Time Employee so it doesn't have getHourlyRate thus. Upcasting shares methods from the class that was upclass onyl if they exist Employee.
		 */
		 */
		 */
		*/
		 */
		// TODO To complete
		// Add the condition that test that emp3 is an instance of part time employee at
		// this time
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); // printed
		} else {
			System.out.println("emp3 not instance of part time employee");
		}

		// Downcasting 1
		// TODO Uncomment and run the code
		PartTimeEmployee pEmp3 = (PartTimeEmployee) emp1;
		// TODO To complete
		// This instruction compiles / does not compile
		// This instruction returns a ClassCastException at run time
		// because ...
		/*
		You can not downcast from Employee to PartTimeEmployee because Employee lacks a variable that PartTimeEmployee thus since Employee is missing a major
		component of PartTimeEmployee it can not be casted.
		In this specific case, because emp1 is not a instance of Part Time Employee and is just a regular Employee, he does not have hourlyRate variable, thus can
		not be casted.
		 */
		// Downcasting 2
		// Requires the use of intanceof to avoid a run time cast exception
		// TODO Look at the solution below
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); // printed
			PartTimeEmployee pEmp4 = (PartTimeEmployee) emp3; // cast required
			System.out.println(pEmp4.getHourlyRate());
		} else {
			System.out.println("emp3 not instance of part time employee");
		}
	}
}
