public class fibnacci {
    public static void main(String[]args){
        int n=10;
        System.out.println("fibnacci series for first"+n+"nuumbers");
        int a=0,b=1;
        System.out.println(a+""+b+"");
        for(int i=0;i<=10;i++){
            int next=a+b;
            System.out.println(next+"");
            a=b;
            b=next;

        }
    } 
}
