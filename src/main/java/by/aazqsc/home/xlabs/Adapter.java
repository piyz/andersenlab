package by.aazqsc.home.xlabs;

import org.springframework.beans.factory.annotation.Value;

public class Adapter {

    @Value("${sd.sd:false}")
    private boolean txModeTrue;

    private Manager manager;

    Adapter(){
        manager = new Manager();
    }

    public boolean isTxMode() {
        return txModeTrue;
/*        if (manager != null) {
            System.out.println(1);
            return manager.isTxModeTrue();
        } else {
            System.out.println(2);
            return false;
        }*/
    }


}
