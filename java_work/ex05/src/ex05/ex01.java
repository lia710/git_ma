package ex05;

public class ex01 {


public static void main(String[] args) {
	int numOfApples = 123;
	int sizeOfBucket = 10;
	
	System.out.println((numOfApples % sizeOfBucket > 0? 1 : 0));
	
	int numOfBucket = numOfApples / sizeOfBucket + 1;
	
	System.out.println("필요한 바구니의 수"+ numOfBucket);
}
}
