package OOps.Conecpts;

public class Var_args {
    void add(int ...a){ //var-args intoduced in 1.5 version
        int sum=0;
        for(int x:a){
            sum+=x;
        }
        System.out.println(sum);
    }
}

class B {
    public static void main(String[] args) {
        Var_args obje = new Var_args();
        obje.add(1,2,3,4);
    }

}
