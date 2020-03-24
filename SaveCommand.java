/**
 * 
 * @author samkellogg
 *
 */
public class SaveCommand {
	private Document doc;
	
	SaveCommand(Document doc){
		this.doc = doc;
	}
	
	public execute(){
		doc.save();
	}
}
