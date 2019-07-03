package by.aazqsc.home.xlabs;

import org.springframework.beans.factory.annotation.Value;

public class Manager {

    @Value("true")
    private boolean txModeTrue;

    public boolean isTxModeTrue() {
        return txModeTrue;
    }

    public void setTxModeTrue(boolean txModeTrue) {
        this.txModeTrue = txModeTrue;
    }
}
