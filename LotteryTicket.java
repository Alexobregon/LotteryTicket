public class LotteryTicket {

	public static void main(String[] args) {
        int [][] lotterycard = { {20, 15, 7},
                                 {8, 7, 19},
                                 {7, 13, 47}
};
int [][] lotteryCard2 = new int[3][3];
lotteryCard2[0][0] = 20;
lotteryCard2[0][1] = 15;
lotteryCard2[0][2] = 7;


        int left_to_right = 0;
		int right_to_left = 0;
		
		int rows = lotteryCard.length;
		int columns = lotteryCard[0].length;
		
		
		int i = 0;
		int j = 0;
		int k = 0;
		int l = lotteryCard.length -1;
		
		
		while (i < rows && j < columns && k < rows && l >=0) {
			left_to_right += lotteryCard[i][j];
			right_to_left += lotteryCard[k][l];
			System.out.println(l);
			i++;
			j++;
			k++;
			l--;
			
			
		}
		
	  System.out.println(Math.abs(left_to_right - right_to_left));
//	  System.out.println(left_to_right);
//	  System.out.println(right_to_left);
		
		
		
	}
}