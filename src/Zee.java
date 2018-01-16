
class Zee {
	
	int[] zeex = {0,0,1,1,0,0,5,5,5,5,5,0};
	
void schieten(int positie){
		switch(zeex[positie]){
			case 0:
		//		miss();
				System.out.println("miss");
				break;
			case 1:
				System.out.println("hit");
		//		sleepboot.hit();
				break;
		//	case 5:
		//		vliegdekschip.geraakt();
		//		break;
			default:
				System.out.println("IN DEFAULT");
		}
	}
void vaarruimte (){
	

	
	Boot boot1 = new Boot();
	Boot boot2 = new Boot();
	Boot boot3 = new Boot();
	Boot boot4 = new Boot();
	Boot boot5 = new Boot();
	
	boot1.varen();
	boot2.varen();
	boot3.varen();
	boot4.varen();
	boot5.varen();

	
}
}
