/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
class Main 
{
  public static void main(String[] args) 
	{
    DACArecipient person1 = new DACArecipient();
    DACArecipient person2 = new DACArecipient();

    person1.setAll(
      "Mendez",
      "Javier",
      "56-3-445",
      "El Salvador",
      2451564,
      2459001,
      2460001,
      'M'
    );

    person2.setAll(
      "Mendez",
      "Javier",
      "56-3-445",
      "El Salvador",
      2451564,
      2459001,
      2460001,
      'M'
    );

    // Test toString
    System.out.println("TOSTRING TEST:");
    System.out.println(person1);

    // Test equals
    System.out.println("\nEQUALS TEST:");
    System.out.println(person1.equals(person2));

    // Print cards
    System.out.println("\nCARD 1:");
    System.out.println(person1.printCard());

    System.out.println("\nCARD 2:");
    System.out.println(person2.printCard());
  }
}