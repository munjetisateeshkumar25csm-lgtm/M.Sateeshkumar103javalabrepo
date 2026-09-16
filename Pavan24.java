import java.awt.*;
class logoframe extends frame
{
	logoframe()
	{
		this.setvisible(true);
		this.setsize(900,300);
		this.setbackground(colour.green);
		this.settitle("logoframe"):
	}
	public void paint(graphics.g)
	{
		font f = new font("arial",font.bold,40);
		g.setfont(f);
		this.setforeground(colour.red);
		string logo = "rox solutions";
		g.drawstring(logo,100,150);
	}
}
class Pavan24
{
	public static void main (string[]args)
	{
		logoframe if = new logoframe();
	}
}