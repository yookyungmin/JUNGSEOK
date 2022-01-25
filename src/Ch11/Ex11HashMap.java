package Ch11;

import java.util.HashMap;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ex11HashMap {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234"); //마지막입력된걸로 저장됨 키값 중복x
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("ID와 PASSWORD 를 입력해주세요");
			System.out.print("id :");
			String id = s.nextLine().trim(); //trim - 앞뒤 공백자르기
			
			System.out.print("password");
			String password = s.nextLine().trim();
			System.out.println();
		
			if(!map.containsKey(id)) {//입력한 id가 없으면
				System.out.println("입력하신 Id는 존재하지 않습니다"+"다시 입력해주세요");
				continue; // id가 틀려서 패스워드를칠필요없어서while(true)로 넘어감
			}else {
				if(!(map.get(id)).equals(password)){
					//asdf 입력하고 id가맞으면 map이 비밀번호 1234로 바뀌고 password도
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요");
				}else {
					System.out.println("id와 비밀번호가 일치합니다");
					break; //
					}
			}
			
			
		}
		
		
	
		

	}

}
