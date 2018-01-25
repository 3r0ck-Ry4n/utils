package textHandling;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;

public class TextCase {

	public TextCase() {
		
	}
	
	public void clipToLower() {
		
		try {
			Clipboard clipBoard = Toolkit.getDefaultToolkit().getSystemClipboard();
			
			String clip = ((String)clipBoard.getData(DataFlavor.stringFlavor)).toLowerCase();
			
			StringSelection stringSelection = new StringSelection(clip);
			
			clipBoard.setContents(stringSelection, null);
		}
		
		catch(Exception e) {
			
		}
	}
	
	public void clipToUpper() {
		
		try {
			Clipboard clipBoard = Toolkit.getDefaultToolkit().getSystemClipboard();
			
			String clip = ((String)clipBoard.getData(DataFlavor.stringFlavor)).toUpperCase();
			
			StringSelection stringSelection = new StringSelection(clip);
			
			clipBoard.setContents(stringSelection, null);
		}
		
		catch(Exception e) {
			
		}
	}
	
	public void clipToTitleCase() {
		
		try {
			StringBuilder titleCase = new StringBuilder();
			
			System.out.println("Title Case: " + titleCase + "\n");
			
			Clipboard clipBoard = Toolkit.getDefaultToolkit().getSystemClipboard();
			String input = ((String)clipBoard.getData(DataFlavor.stringFlavor)).toLowerCase();
			
			System.out.println("input (from clipBoard): " + input + "\n");
	    
			boolean nextTitleCase = true;

			for (char c : input.toCharArray()) {
				if (Character.isSpaceChar(c)) {
					nextTitleCase = true;
				} 
				
				else if (nextTitleCase) {
					c = Character.toTitleCase(c);
					nextTitleCase = false;
				}

				titleCase.append(c);
			}
						
			StringSelection stringSelection = new StringSelection(titleCase.toString());
			
			clipBoard.setContents(stringSelection, null);
		}
		
		catch(Exception e) {
			
		}
	}
}
