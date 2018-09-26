package com.example.demo.util;
/**
 * ibm小工具
 * @author shzch 2018.9.18
 *
 */
public class IBMUtil {
	
	public String IBMWay(Integer age,Integer sex,Integer height,Integer weight){
		int min = 0;
		int max = 0;
		int ibm =  (int) (height*0.7 - weight);//IBM公式
		String message = null;
		//性别为男
		if(sex == 0){
			
			if(age > 18 ){
				
			}
			
			if(age <= 18){
				switch (age) {
				case 0:
					min = (int) (ibm-22.3);
					max =  26-ibm;
					break;
				case 1:
					
					break;
				case 2:
					
					break;
				case 3:
					
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				case 6:
					
					break;
				case 7:
					
					break;
				case 8:
					
					break;
				case 9:
					
					break;
				case 10:
					
					break;
				case 11:
					
					break;
				case 12:
					
					break;
				case 13:
					
					break;
				case 14:
					
					break;
				case 15:
					
					break;
				case 16:
					
					break;
				case 17:
					
					break;
				default:
					
					break;
				}
			}
			
		}
		
		//性别为女
		if(sex == 1){
			
			if(age > 18 ){
				
			}
			
			if(age < 18){
				
			}
			
		}
		
		if(min < 0 ){
			message = "偏瘦";
		}
		if(max  <0 ){
			message = "偏胖";
		}
		if(min >0 && max > 0){
			message = "正常";
		}
		
		
		
		
		
		
		return message;
	}
}
