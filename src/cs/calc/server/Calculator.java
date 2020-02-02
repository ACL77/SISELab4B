package cs.calc.server;
import javax.jws.WebService;
import java.util.concurrent.atomic.AtomicInteger;

@WebService //to make calculator a webservice
//dentro da pasta libs esta la como é que ele
//interpreta isto
public class Calculator {
    private AtomicInteger last = new AtomicInteger(0);

    public Calculator(){

    }

    public int last(){
        return last.get();
    }

    public int sum(int a, int b){
        //we make this variable so that the sum does not get stopped
        //for another client if I am waiting for a last execution
        int x = a+b;
        last.set(x);
        return x;
    }

    public int mul(int a,int b){
        //we make this variable so that the sum does not get stopped
        //for another client if I am waiting for a last execution
        int x = a*b;
        last.set(x);
        return x;
    }
}
