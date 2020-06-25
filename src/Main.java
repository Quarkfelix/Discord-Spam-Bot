import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Main {
	static Robot bot;
	
	public static void main(String[] args) {
		try {
			bot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			write("du keck");
		}
		
	}
	
	private static void write(String text) {
		for (int i = 0; i < 100; i++) {
			try {
				type(text.charAt(i));
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		bot.keyPress(KeyEvent.VK_ENTER);
		bot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	private static void type(char c) {
		try {
			bot.keyPress(java.awt.event.KeyEvent.getExtendedKeyCodeForChar(c));
			bot.keyRelease(java.awt.event.KeyEvent.getExtendedKeyCodeForChar(c));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
