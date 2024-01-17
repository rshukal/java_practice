package BasicOfJava;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser objFF=new Firefox();
		objFF.openBrowser();
		objFF.closeBrowser();
		
		Browser objChr=new Chrome();
				objChr.openBrowser();
		     	objChr.closeBrowser();
	}

}
