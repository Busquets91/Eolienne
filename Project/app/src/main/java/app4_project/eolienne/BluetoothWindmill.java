package app4_project.eolienne;

/**
 * Created by Vivien on 08/12/2016.
 */

import android.bluetooth.BluetoothAdapter;
//import android.widget.Toast;

public class BluetoothWindmill {
    protected boolean isInitialized = false;
    protected BluetoothAdapter bluetoothAdapter;

    protected void enableBluetooth(){
        if (!bluetoothAdapter.isEnabled()) {
            bluetoothAdapter.enable();
        }
    }

    public boolean init(){
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if (bluetoothAdapter == null) {
            isInitialized = false;
            //TODO pas de bluetooth
            return false;
        }
        else {
            //TODO init bluetooth
            enableBluetooth();
            isInitialized = true;
            return true;
        }
    }

    public boolean connectToModule(){
        return true;
    }


}
