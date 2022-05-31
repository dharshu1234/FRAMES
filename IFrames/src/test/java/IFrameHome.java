import org.testng.annotations.Test;


import Logic.LaunchBrowsers;
import Logic.IFRAMEHOME;

public class IFrameHome extends LaunchBrowsers {
	 /**
     * Method to verify UI element in voot home page
     * @throws Exception
     */
    @Test
    public void homePagevalidation() throws Exception{
//       VootHomePageLogic.verifyHomePageNavigation();
//       VootHomePageLogic.verifyVootLogo();
    	IFRAMEHOME.navigateToContactus();
    	//VootHomePageLogic.iframes();
    	//VootHomePageLogic.single_frame();
    }

}
