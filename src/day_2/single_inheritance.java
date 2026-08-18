package day_2;


	class Parent
	{
		void cancer()
		{
			System.out.println(" understain");
		}
		void bp()
		{
			System.out.println(" understain   bp");
		}
	}

	public class single_inheritance extends Parent{

		public static void main(String[] args) {
			single_inheritance bb= new single_inheritance();
	 		bb.bp();
	 		bb.cancer();
		}
	}

