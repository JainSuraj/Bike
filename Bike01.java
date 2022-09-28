class Bike
{
	private int Eng_num;
	private String Color;
	private String Brand;
	private double Cost;
	
	public void setData(int a, String b , String c, double d)
	{
		Eng_num=a;
		Color=b;
		Brand=c;
		Cost=d;
	}
	
	public int getEng_num()
	{
		return Eng_num;
	}
	public String getColor()
	{
		return Color;
	}
	public String getBrand()
	{
		return Brand;
	}
	public double getCost()
	{
		return Cost;
	}
	
}
public class Bike01 {

	public static void main(String[] args) 
	{
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		b1.setData(2156, "Black" , "Bjaj" ,	56000.25);
		b2.setData(4458, "Red", "Duke", 55000.68);
		System.out.println("Bike Engine Number :- "+b1.getEng_num());
		System.out.println("Bike Color is :-"+b1.getColor());
		System.out.println("Bike Brand is :-"+b1.getBrand());
		System.out.println("Bike cost :-"+b1.getCost());
		System.out.println("*****************************************************");
		System.out.println("Bike Engine Number :- "+b2.getEng_num());
		System.out.println("Bike Color is :-"+b2.getColor());
		System.out.println("Bike Brand is :-"+b2.getBrand());
		System.out.println("Bike cost :-"+b2.getCost());


	}

}
