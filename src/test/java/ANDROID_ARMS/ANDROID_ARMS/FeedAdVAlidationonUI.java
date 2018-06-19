package ANDROID_ARMS.ANDROID_ARMS;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.testng.annotations.*;

import ru.yandex.qatools.allure.annotations.Title;
import twc.Automation.Driver.Drivers;
import twc.Automation.General.DeviceStatus;
import twc.Automation.HandleWithApp.AppFunctions;
import twc.Automation.HandleWithAppium.AppiumFunctions;
import twc.Automation.HandleWithCharles.CharlesFunctions;
import twc.Automation.ReadDataFromFile.read_excel_data;


public class FeedAdVAlidationonUI 
    extends Drivers
{
	public static String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmm").format(Calendar.getInstance().getTime());
					//Validating_feedads_and_detailpageads_fromUI
	
	//Validating feed1 Ad
	   @Test(priority =1,enabled = true)
		@Title("Validating feed_1 Ad call")
		public void Validating_feed1() throws Exception
		{
		   logStep("Validating the feed_1 TestCase");
			System.out.println("======= Validating feed_1 Ad TestCase Started =======");
			logStep("Clearing the charles session");
			CharlesFunctions.ClearSessions();
			logStep("Cleared the charles session");
			//Launch the App
			//AppiumFunctions.LaunchApp();
			Thread.sleep(5000);
			//select the location 
			logStep("set the location on app");
			AppiumFunctions.selectlocation();						
			Thread.sleep(5000);
			//Scroll the app to feed_1 ad
			logStep("scrolling the app");
			AppFunctions.SwipeUp_Counter(2);
			//checking the feed_1 ad is coming or not
			logStep("Checking the feed_1 is presnted or not");
			AppiumFunctions.Check_feed1_ad();
			System.out.println("====== Validating feed_1 Ad TestCase End =========");
		}
		//Validating feed_2 Ad
			@Test(priority =2,enabled = true)
			@Title("Validating feed_2 Ad call")
			public void Validating_feed2() throws Exception
			{
				logStep("");
				System.out.println("====== Validating feed_2 Ad TestCase Started =======");
				//scroll app to feed_2
				AppFunctions.SwipeUp_Counter(2);
				//checking the feed_2 ad is coming or not
				AppiumFunctions.Check_feed2_ad();
				System.out.println("====== Validating feed_2 Ad TestCase End =======");
			}
			//Validating feed_3 Ad
					@Test(priority =3,enabled = true)
					@Title("Validating feed_3 Ad call")
					public void Validating_feed3() throws Exception
					{
						logStep("Validating feed_3 Ad TestCase Started");
						System.out.println("====== Validating feed_3 Ad TestCase Started =======");
						//scroll app to feed_3
						logStep("Scroll the App to feed_3 ad");
						AppFunctions.SwipeUp_Counter(2);
						//checking the feed_3 ad is coming or not
						AppiumFunctions.Check_feed3_ad();
						System.out.println("====== Validating feed_3 Ad TestCase End =======");
					}
					
					//Validating feed_4 Ad
					@Test(priority =4,enabled = true)
					@Title("Validating feed_3 Ad call")
					public void Validating_feed4() throws Exception
					{ 
						logStep("Validating the Feed_4 Testcase started");
						System.out.println("====== Validating feed_4 Ad TestCase Started =======");
						logStep("scroll to feed_4 ad");
						AppFunctions.SwipeUp_Counter(1);
						AppiumFunctions.Check_feed4_ad();						
						System.out.println("====== Validating feed_4 Ad TestCase End =======");
					}
					//Validating feed_5 Ad
					@Test(priority =5,enabled = true)
					@Title("Validating feed_5 Ad call")
					public void Validating_feed5() throws Exception
					{
						System.out.println("====== Validating feed_4 Ad TestCase Started =======");
						//checking the feed_5 ad is coming or not
						AppFunctions.SwipeUp_Counter(2);
						AppiumFunctions.Check_feed5_ad();
						AppFunctions.Kill_Launch_App();
						System.out.println("====== Validating feed_4 Ad TestCase End =======");
					}
					//Validating Extended hourly page Ad
					@Test(priority =6,enabled = true)
					@Title("Validating Extended hourly page Ad")
					public void Extended_hourly_page_Ad() throws Exception
					{
						System.out.println("====== Validating Extended Hourly page Ad TestCase Started =======");
						try{
							AppFunctions.Kill_Launch_App();
							}
							catch(Exception e)
							{
								AppFunctions.Kill_Launch_App();
							}
						//scroll to hourly submodule and checking the hourly submodule ad is coming or not
						AppFunctions.SwipeUp_Counter_hourly_submodules();		    
						System.out.println("====== Validating Extended Hourly page Ad TestCase End =======");
					}
					//Validating Extended Daily page Ad
					@Test(priority =7,enabled = true)
					@Title("Validating Extended Daily page Ad")
					public void Extended_Daily_page_Ad() throws Exception
					{
					  System.out.println("====== Validating Extended Daily page Ad TestCase Started =======");
					  //scroll to daily submodule and  checking the Daily submodule  ad is coming or not
					  AppFunctions.SwipeUp_Counter_Daily_submodule();
					  System.out.println("====== Validating Extended Daily page Ad TestCase End =======");    
					}
					//Validating Extended Maps&Radar page Ad
					 @Test(priority =8,enabled = true)
					 @Title("Validating Extended Maps&Radar page Ad")
					 public void Extended_Maps_Radar_page_Ad() throws Exception
					{
						 System.out.println("====== Validating Extended Maps&Radar page Ad TestCase Started =======");
						 AppFunctions.SwipeUp_Counter_Maps_submodule();
						 //AppFunctions.Kill_Launch_App();
						 System.out.println("====== Validating Extended Maps&Radar page Ad TestCase End =======");	    
					}
					
					 @Test(priority =9,enabled = true)
						@Title("Validating Extended News page Ad")
						public void Extended_Newss_page_Ad() throws Exception
						{
							System.out.println("====== Validating Extended News page Ad TestCase Started =======");
							
							//scroll to news submodule and checking the News submodule ad is coming or not	
							AppFunctions.SwipeUp_Counter_news_submodules();	
							System.out.println("====== Validating Extended News page Ad TestCase End =======");
						}
					//Validating cold & flu Ad
					@Test(priority =10,enabled = true)
					 @Title("Validating Extended cold & flu page Ad")
					 public void Extended_cold_flu_page_Ad() throws Exception
					{
						 System.out.println("====== Validating Extended cold & flu TestCase Started =======");
						
						 AppFunctions.Change_to_Test_Mode("TestMode");
						 AppFunctions.Kill_Launch_App();
						 AppFunctions.SwipeUp_Counter_lifestyle_submodule();
						 AppiumFunctions.Check_Cold_Flu_spotAd();
						 //AppFunctions.SwipeUp_Counter(2);
						 //AppiumFunctions.Check_Cold_Flu_BigbannertAd();
						 AppiumFunctions.Clickon_Back_Button();
						 System.out.println("====== Validating Extended cold & flu TestCase  page Ad TestCase End =======");	    
					}
					
					//Validating Allergy Ad
					@Test(priority =11,enabled = true)
					 @Title("Validating Extended allergy page Ad")
					 public void Extended_HealthModule_page_Ad() throws Exception
					{
						 System.out.println("====== Validating Extended allergy TestCase Started =======");
						
						 AppiumFunctions.clickallergy();
						 AppiumFunctions.Check_Allergy_spotAd();
						 AppFunctions.SwipeUp_Counter(2);
						 //AppiumFunctions.Check_Allergy_BigbannerAd();
						 AppiumFunctions.Clickon_Back_Button();
						 System.out.println("====== Validating Extended allergy TestCase End =======");	    
					}
						
					
					//Validating GoRunAd 
					@Test(priority =12,enabled = true)
					 @Title("Validating Extended GoRun page Ad")
					 public void Extended_GoRunhModule_page_Ad() throws Exception
					{
						 System.out.println("====== Validating Extended GoRun TestCase Started =======");
						 AppiumFunctions.clickGoRun();
						 AppiumFunctions.Check_GoRun_spotAd();
						 AppFunctions.SwipeUp_Counter(2);
						 AppiumFunctions.Check_GoRun_BigbannerAd();
						 //AppiumFunctions.Clickon_Back_Button();
						 System.out.println("====== Validating Extended allergy TestCase End =======");	    
					}
				/*	@Test(priority =11,enabled = true)
					@Title("Validating Extended News page Ad")
					public void Extended_Newss_page_Ad() throws Exception
					{
						System.out.println("====== Validating Extended News page Ad TestCase Started =======");
						
						//scroll to news submodule and checking the News submodule ad is coming or not	
						AppFunctions.SwipeUp_Counter_news_submodules();	
						System.out.println("====== Validating Extended News page Ad TestCase End =======");
					}*/
	
	//Validating feed1 Ad
	/*@Test(priority =1,enabled = true)
	@Title("Validating feed_1 Ad call")
	public void Validating_feed1() throws Exception
	{
		System.out.println("======= Validating feed_1 Ad TestCase Started =======");
		CharlesFunctions.ClearSessions();
		//Launch the App
		AppiumFunctions.LaunchApp();
		Thread.sleep(5000);
		//select the location 
		AppiumFunctions.selectlocation();						
		Thread.sleep(5000);
		//Scroll the app to feed_1 ad
		AppFunctions.SwipeUp_Counter(2);
		//checking the feed_1 ad is coming or not
		AppiumFunctions.Check_feed1_ad();
		System.out.println("====== Validating feed_1 Ad TestCase End =========");
	}
	//Validating feed_2 Ad
	@Test(priority =2,enabled = true)
	@Title("Validating feed_2 Ad call")
	public void Validating_feed2() throws Exception
	{
		System.out.println("====== Validating feed_2 Ad TestCase Started =======");
		//scroll app to feed_2
		AppFunctions.SwipeUp_Counter(1);
		//checking the feed_2 ad is coming or not
		AppiumFunctions.Check_feed2_ad();
		System.out.println("====== Validating feed_2 Ad TestCase End =======");
	}
	
	//Validating feed_3 Ad
		@Test(priority =3,enabled = true)
		@Title("Validating feed_3 Ad call")
		public void Validating_feed3() throws Exception
		{
			System.out.println("====== Validating feed_3 Ad TestCase Started =======");
			//scroll app to feed_3
			AppFunctions.SwipeUp_Counter(3);
			//checking the feed_3 ad is coming or not
			AppiumFunctions.Check_feed3_ad();
			System.out.println("====== Validating feed_3 Ad TestCase End =======");
		}
		
		//Validating feed_4 Ad
		@Test(priority =4,enabled = true)
		@Title("Validating feed_3 Ad call")
		public void Validating_feed4() throws Exception
		{
			System.out.println("====== Validating feed_4 Ad TestCase Started =======");
			//checking the feed_4 ad is coming or not
			AppFunctions.SwipeUp_Counter(2);
			AppiumFunctions.Check_feed4_ad();
			//AppFunctions.Kill_Launch_App();
			System.out.println("====== Validating feed_4 Ad TestCase End =======");
		}
		//Validating feed_5 Ad
		@Test(priority =5,enabled = true)
		@Title("Validating feed_3 Ad call")
		public void Validating_feed5() throws Exception
		{
			System.out.println("====== Validating feed_4 Ad TestCase Started =======");
			//checking the feed_4 ad is coming or not
			AppFunctions.SwipeUp_Counter(2);
			AppiumFunctions.Check_feed5_ad();
			AppFunctions.Kill_Launch_App();
			System.out.println("====== Validating feed_4 Ad TestCase End =======");
		}
		//Validating Extended hourly page Ad
		@Test(priority =5,enabled = true)
		@Title("Validating Extended hourly page Ad")
		public void Extended_hourly_page_Ad() throws Exception
		{
			System.out.println("====== Validating Extended Hourly page Ad TestCase Started =======");
			//scroll to hourly submodule and checking the hourly submodule ad is coming or not
			AppFunctions.SwipeUp_Counter_hourly_submodules();		    
			System.out.println("====== Validating Extended Hourly page Ad TestCase End =======");
		}
		//Validating Extended Daily page Ad
		@Test(priority =6,enabled = true)
		@Title("Validating Extended Daily page Ad")
		public void Extended_Daily_page_Ad() throws Exception
		{
		  System.out.println("====== Validating Extended Daily page Ad TestCase Started =======");
		  //scroll to daily submodule and  checking the Daily submodule  ad is coming or not
		  AppFunctions.SwipeUp_Counter_Daily_submodule();
		  System.out.println("====== Validating Extended Daily page Ad TestCase End =======");    
		}
		//Validating Extended Maps&Radar page Ad
		 @Test(priority =7,enabled = true)
		 @Title("Validating Extended Maps&Radar page Ad")
		 public void Extended_Maps_Radar_page_Ad() throws Exception
		{
			 System.out.println("====== Validating Extended Maps&Radar page Ad TestCase Started =======");
			AppFunctions.Change_to_Test_Mode("TestMode");
			 AppFunctions.Kill_Launch_App();
			 //AppFunctions.SwipeUp_Counter_Allergy_submodule();
			 AppFunctions.scrollInToView("Allergy");
			 AppFunctions.clickOnModule("Allergy");
			 AppiumFunctions.Check_Allergy_spotAd();
			 AppFunctions.SwipeUp_Counter(2);
			 AppiumFunctions.Check_Allergy_BigbannerAd();
			 AppiumFunctions.Clickon_Back_But
			 System.out.println("====== Validating Extended Maps&Radar page Ad TestCase End =======");	    
		}
		 
		//Validating Health Module Allergy page Ad
		 @Test(priority =8,enabled = true)
		 @Title("Validating Extended Health Module Allergy page Ad")
		 public void Health_Allergy_page_Ad() throws Exception
		{
			 System.out.println("====== Validating Extended Health Module Allergy page Ad TestCase Started =======");
			 AppFunctions.Change_to_Test_Mode("TestMode");
			 AppFunctions.Kill_Launch_App();
			 //AppFunctions.SwipeUp_Counter_Allergy_submodule();
			 AppFunctions.scrollInToView("Allergy");
			 AppFunctions.clickOnModule("Allergy");
			 AppiumFunctions.Check_Allergy_spotAd();
			 AppFunctions.SwipeUp_Counter(2);
			 AppiumFunctions.Check_Allergy_BigbannerAd();
			 AppiumFunctions.Clickon_Back_Button();
			 System.out.println("====== Validating Extended Health Module Allergy page Ad TestCase End =======");	    
		}
		 
		//Validating Health Module Cold& Flu page Ad
		 @Test(priority =9,enabled = true)
		 @Title("Validating Extended Health Module Allergy page Ad")
		 public void HealthCold_Flu_page_Ad() throws Exception
		{
			 System.out.println("====== Validating Extended Health Module Cold & Flu page Ad TestCase Started =======");
			 AppFunctions.clickOnModule("Cold & Flu");
			 AppiumFunctions.Check_Cold_Flu_spotAd();
			 AppFunctions.SwipeUp_Counter(2);
			 AppiumFunctions.Check_Cold_Flu_BigbannertAd();
			 System.out.println("====== Validating Extended Health Module Cold & Flu page Ad TestCase End =======");	    
		}*/
	/*@Test(priority =10,enabled = true)
	@Title("Validating Extended News page Ad")
	public void Extended_hourly_page_Ad() throws Exception
	{
		System.out.println("====== Validating Extended News page Ad TestCase Started =======");
		
		//scroll to news submodule and checking the News submodule ad is coming or not	
		AppFunctions.SwipeUp_Counter_news_submodules();	
		System.out.println("====== Validating Extended News page Ad TestCase End =======");
	}*/
		
    @Test
	public void put_app_testmode() throws Exception{
		AppFunctions.Change_to_airlock_testMode("TestMode");
		 AppFunctions.Kill_Launch_App();
		 AppFunctions.Kill_Launch_App();
		 AppFunctions.Kill_Launch_App();
	}
	@BeforeTest
	    public void Before_Test() throws Exception
	{	
		System.out.println("================= Before Test Started =========================");	
		//AppiumFunctions.UnInstallApp();
		CharlesFunctions.charlesOpen();
		CharlesFunctions.openCharlesBrowser();
		AppiumFunctions.delete_screenshots();
		AppiumFunctions.CheckBuildFolder(AppiumFunctions.folder);
		AppiumFunctions.LaunchAppWithFullReset();
		
		System.out.println("================= Before Test End =========================");
	}
    /* @AfterTest
	public void End_Test() throws Exception
	{
		
		CharlesFunctions.StopExportSessionXMLFile();
		Thread.sleep(10000);
		//Ad.quit();
	}*/
	
	}
    
