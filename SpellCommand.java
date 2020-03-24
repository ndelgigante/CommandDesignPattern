/**
 * 
 * @author samkellogg
 *
 */
public class SpellCommand implements Command {
	private Document doc;
	
	SpellCommand(Document doc) {
		this.doc = doc;
	}
	
	public void execute(){
		doc.spellCheck();
	}

}
