public class Main{
	public static void main(String[] args){


		for(int a=0;a<args.length;a++){
				System.out.println(args[a]);
			}

 		if (args.length==0){
			System.out.println("no hay argumentos");
		}else{
			System.out.println("hay "+ args.length + "argumentos");
		}
	}
}
