package Ch10;

import java.util.Calendar;

public class Ex10_Calendar {

	public static void main(String[] args) {
		final int[] TIME_UNIT = {3600, 60, 1}; // 큰단위를 앞에 놓는다.
		final String[] TIME_UNIT_NAME = {"시간", "분,", "초"};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		time1.set(Calendar.HOUR_OF_DAY, 10); //10시
		time1.set(Calendar.MINUTE, 20); // 20분
		time1.set(Calendar.SECOND,30); // 30초

		time2.set(Calendar.HOUR_OF_DAY, 20); //20시
		time1.set(Calendar.MINUTE, 30); //  300분
		time1.set(Calendar.SECOND, 10); // 10초
		
		System.out.println("time1 : "+time1.get(Calendar.HOUR_OF_DAY)+"시"+time1.get(Calendar.MINUTE)+"분"
							+time1.get(Calendar.SECOND)+"초");
		

		System.out.println("time2 :"+time2.get(Calendar.HOUR_OF_DAY)+"시"+time2.get(Calendar.MINUTE)+"분"
				 			+time2.get(Calendar.SECOND)+"초");
			
		long difference = 
		Math.abs(time2.getTimeInMillis()- time1.getTimeInMillis())/1000; //시분초를 초단위로 바꿔서 뺴기
		System.out.println("tim1과 time2의 차이는"+difference+"초입니다. ");
		
		String tmp ="";
		for(int i =0; i<TIME_UNIT.length; i++) {
				tmp +=difference/TIME_UNIT[i]+TIME_UNIT_NAME[i];
				difference %=TIME_UNIT[i];	
		}
		System.out.println("시분초로 변환하면"+tmp + "입니다.");
		}
		
		
		
	}


