public class Practical5{
	public static void main(String args[]){
		int number =5;
		System.out.println(Practical51(number));
		System.out.println(Practical52(number));
		System.out.print(Practical53(number));
	}
	public static int Practical51(int number){
	if(number<2){
	return 1;
}
	else{
	
	int fact=2;
	for(int i=3;i<=number;i++){
	fact=fact*i;
}
	return fact;
}
}
	public static int Practical52(int number){
	int fact=1;
	while(number>=2){
		fact*=number;
		number--;
	}
	return fact;
}
	public static int Practical53(int number){
	if(number<2){
	return 1;
	}
	return number*Practical53(number-1);
}
}

