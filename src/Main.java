import java.awt.EventQueue;

public class Main
{
	private static CircleFrame frame;
	
	public static void main(String[] args)
	{
			EventQueue.invokeLater(() -> {createFrame();});
	}
	
	private static void createFrame()
	{
		frame = new CircleFrame();
		frame.setVisible(true);
	}

}
