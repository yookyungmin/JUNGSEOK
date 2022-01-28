package Ch10;

import java.util.Calendar;

public class Ex10_Calendar {

	public static void main(String[] args) {
		final int[] TIME_UNIT = {3600, 60, 1}; // 큰단위를 앞에 놓는다.
		final String[] TIME_UNIT_NAME = {"시간", "분,", "초"};
		
		
		Calendar time1 = Calendar.getInstance(); //현재의 날짜와 시간이 셋팅됨 객체생성
		Calendar time2 = Calendar.getInstance();
		
		int thisYear = time1.get(Calendar.YEAR);
		System.out.println(thisYear); //올해가 몇년인지 알아낸다
		int lastDayOfMonth = time1.getActualMaximum(Calendar.DATE); //
		
		time1.set(Calendar.HOUR_OF_DAY, 10); //10시
		time1.set(Calendar.MINUTE, 20); // 20분
		time1.set(Calendar.SECOND,30); // 30초

		time2.set(Calendar.HOUR_OF_DAY, 20); //20시
		time1.set(Calendar.MINUTE, 30); //  300분
		time1.set(Calendar.SECOND, 10); // 10초
		
		//WEEOK_OF_YEAR 1월1일부터 지금까지 몇번쨰주인지
		//WEEK_OF_MONTH 그달의  지금까지 몇번쨰주인지
		//DAY_OF_MONTH 그달의 몇번쨰일인지
		//DAY_OF_YEAR 그해의 몇번째일인지
		//DAY_OF_WEEK 요일
		//DAY_OF_WEEK_IN_MONTH 그달의 몇번째요일
		
		System.out.println("이해의 년도"+time1.get(Calendar.YEAR));
		System.out.println("월(0~11, 0:1월):"+time1.get(Calendar.MONTH)); // 나오는 출력의 값에 +1 해야 현재 월
		System.out.println("이해의 몇째주 : "+ time1.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이달의 몇 재 주:"+time1.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이달의 몇일>>:"+time1.get(Calendar.DAY_OF_MONTH));
		System.out.println("이해의 몇일>>:"+time1.get(Calendar.DAY_OF_YEAR));
		System.out.println("오전_오후(0:오전 , 1:오후):"+time1.get(Calendar.AM_PM));
		
		System.out.println("이달의 마지막날:"+time1.getActualMaximum(Calendar.DATE));//이달의 마지막날
		
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


