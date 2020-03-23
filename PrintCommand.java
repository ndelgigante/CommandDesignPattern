/**
 * 
 * @author Austin Tindal
 *
 */
public class PrintCommand implements Command{
	private Document doc;
	
	PrintCommand(Document doc) {
		this.doc = doc;
	}
	
	public void execute() {
		doc.print();
	}
}
