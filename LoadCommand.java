//Jazzmin Graham
public class LoadCommand implements Command {
	
	private Document doc;

	LoadCommand(Document doc)
	{
		this.doc= doc;
	}
	public void execute()
	{
		doc.print();
	}

}
