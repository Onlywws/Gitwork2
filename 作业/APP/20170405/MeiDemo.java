public class MeiDemo{
	public static void main(String [] args){
		ColorDemo color = ColorDemo.RED;
		System.out.println(color);
		System.out.println(color.name());
		System.out.println(color.ordinal());

		ColorDemo color1 = ColorDemo.GREEN;
		System.out.println(color1);
		System.out.println(color1.name());
		System.out.println(color1.ordinal());

		ColorDemo color2 = ColorDemo.BLUE;
		System.out.println(color2);
		System.out.println(color2.name());
		System.out.println(color2.ordinal());
	}
}

enum ColorDemo{
	RED("ºì"),GREEN("ÂÌ"),BLUE("À¶");
	private String name;
	private ColorDemo(String name){
	    this.name = name;
	}
	public String getName(){
	    return name;
	}
	public String toString() {
	    return this.name;
	}
}