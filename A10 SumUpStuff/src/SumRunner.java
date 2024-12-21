public class SumRunner
{
	public static void main( String[] args )
	{
		Sum test = new Sum();				
		test.setNums(2,6);
		test.calculateSum( );
		test.print();

        test.setNums(10, 15);
        test.calculateSum();
        test.print();

        test.setNums(20, 25);
        test.calculateSum();
        test.print();

        test.setNums(40, 65);
        test.calculateSum();
        test.print();

        test.setNums(-5, 20);
        test.calculateSum();
        test.print();
		
        }
	}