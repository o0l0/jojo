package cshi;
import java.awt.*;

public class Gk {
	public static void main(String[] args) {
		new Layout("wdnmd");
	} 

}
class Layout extends Frame{
	public Layout(String title) {
		GridBagLayout layout=new GridBagLayout();
		GridBagConstraints c=new GridBagConstraints();
		this.setLayout(layout);
		
	}
}