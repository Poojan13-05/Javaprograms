public class getset {
    public static void main(String[] args) {
        number s1=new number(4);
        number s2=new number(6);
        s2.setX(2);
        s1.getX();
        s1.add(s2);
        s1.expo(s2);

    }



}
class number{
    int a,x,sum;
     number(int x){
         x=a;

    }
    void setX(int b){
         a=b;
    }
    int getX(){
        return a;
    }
    void add(number n){
         sum=x+n.x;
        System.out.println(sum);

    }
    void expo(number n){
         int base=x;
         int pow=n.x;
         int res=1;
        for (int i = 0; i <pow ; i++) {
            res=res*base;


        }
        System.out.println(res);
    }
}

