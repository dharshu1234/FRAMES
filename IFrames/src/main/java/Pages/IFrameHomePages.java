package Pages;

import org.openqa.selenium.By;

public class IFrameHomePages {
	
//	public static By objFrame = By.xpath("//input[@type='text']");


	public static By objsingleIframe = By.xpath("//iframe[@id='singleframe']");

	
	public static By pre_single_frame = By.xpath("//iframe[@id='singleframe']");

	// single_frame input_button
	public static By pre_single_frame_input = By.xpath("//input[@type='text']");

	// iframeiframe_button
	public static By iframe_iframe_button = By.xpath("//a[normalize-space()='Iframe with in an Iframe']");

	// nested iframe_section
	// parent nested_iframe
	public static By nested_iframe_parent_xpath = By.xpath("//iframe[@src='MultipleFrames.html']");

	// clild nested_iframe
	public static By nested_iframe_child_xpath = By
			.xpath("//iframe[normalize-space()='<p>Your browser does not support iframes.</p>']");

	public static By nested_iframe_input_xpath = By.xpath("//input[@type='text']");

}
