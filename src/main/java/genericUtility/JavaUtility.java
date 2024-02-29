 package genericUtility;

import java.util.Date;
import java.util.Random;

/**
 * This class contains java specific methods
 * @param args
 */
public class JavaUtility {
	    /**
	     * This method will generate random number for every run
	     * @return
	     */
		public int getRandomNum()
		{
			Random r = new Random();
			int Num = r.nextInt(9999999);
			
			if(Num > 9999990)
			{
				Num++;
			}
			return Num;
		}
		
		
		/**
		 * This method will generate System date
		 * @return
		 */
		public String getSystemDate()
		{
		    Date d=new Date();
			return d.toString();
		}
		
		public String getSystemDateInFormat()
		{
			Date d=new Date();
			String dArr []=d.toString().split(" ");
			String day=dArr[2];
			String month=dArr[1];
			String year=dArr[5];
			String time=dArr[3].replaceAll(":","-");
			String date=day+"-"+month+"-"+year+"-"+time;
			return date;
			
		}
		
		
		public long getRandomMobileNum() 
		{
			Random r = new Random();
			long mobileNumber=0;
			
			for(;;)
			{
			   long rNum = r.nextLong(9873214563l);
			   try 
			   {
				   if(rNum>9123456789l && rNum<9999999999l)
				   {
					   mobileNumber=rNum;
					   break;
				   }
			   }
			   catch (Exception e) 
			   {
				   
			   }
			   
			}
			return mobileNumber;
		}
		
		public int getSingleRandomnumber()
		{
			Random r = new Random();
			int num = r.nextInt(12);
			return num;
		}
		
		
		public Long getHighestRandomNumber()
		{
			Random r = new Random();
			Long Num = r.nextLong(999999999999999999l);
			return Num;
		}

	

}
