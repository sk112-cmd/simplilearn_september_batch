package eg1;

public class MobileV2 extends MobileV1 {

	public void camera() {
		System.out.println("Click photos from V2 of Mobile");
	}
	
	public void browsing() {
		System.out.println("Browsing feature from V2");
	}
	
	public void socialApps() {
		System.out.println("Social N/wng apps from V2");
	}
	
	@Override
	 public void displayMenu() {
		System.out.println("Displaymenu in V2 updated with GRID view.....");
		super.displayMenu();//calling parent's displayMenu
	}
}
/*What all the things of a class cannot be overridden?
 * static
 * final
 * private
 * and we can upgrade the visibilty in the child class from the parent
 * 
 */
