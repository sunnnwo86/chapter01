package Chapter01;

public class SwitchTest {

	public static void main(String[] args) {

		int month = 5;
		int days = 0;

//		if(month == 1) {
//			days = 31;
//				}else if(month == 2) {
//					days = 28;
//				}
//				else if(month==3) {
//					days =31;
//				}
//				else if(month==4) {
//					days =30;
//				}
//				else if(month==5) {
//					days =31;
//				}
//				else if(month==6) {
//					days =30;
//				}
//				else if(month==7) {
//					days =31;
//				}else {
//					System.out.println("1-12월까지만 입력해주세요.");
//					return;
//					
//				}
//	
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			days = 31;

		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			days = 30;

		} else if (month == 2) {
			days = 28;

		}
		switch (month) {
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		{
			days = 31;
			break;
		}

		case 4:
		case 6:
		case 9:
		case 11:{
			days = 30;
			break;
		}
		
		case 2: {
			days = 28;
			break;
		}
		default: {
			System.out.println("1-12월까지만 입력해주세요.");
			return;
		
		}
			}
	System.out.println(month+"월"+days+"일");
	}
}



