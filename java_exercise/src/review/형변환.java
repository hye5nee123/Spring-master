package review;

/*
 * 형변환 : 캐스트연산자 (타입)
 * 정수형 : byte < short < int   < long
 * 실수형 :                float < double
 * 
 * 스트링   ---->  byte     Byte.parseByte(변수)     
 *                short    Short.parseShort 
 *                int      Integer.parseInt
 *                long
 *                float
 *                double
 *                char
 *                boolean
 *         <----  
 * String.valueOf(   )       
 */
public class 형변환 {
	public static void main(String[] args) {

		Integer score = 100;
		String s = Integer.toString(score);

		double avg = 90.5;
		s = Double.toString(avg);

		// 스트링 -> int
		score = Integer.parseInt(s);
		avg = Double.parseDouble(s);
		
	}
}
