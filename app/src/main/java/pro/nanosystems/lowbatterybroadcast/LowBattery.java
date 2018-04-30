package pro.nanosystems.lowbatterybroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class LowBattery extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String intentAction = intent.getAction();
        switch (intentAction){
            case Intent.ACTION_BATTERY_LOW:
                Toast.makeText(context, "Low Battery................", Toast.LENGTH_SHORT).show();
                break;
            case Intent.ACTION_POWER_CONNECTED:
                Toast.makeText(context, "Power On", Toast.LENGTH_SHORT).show();
                break;
            case Intent.ACTION_BATTERY_OKAY:
                Toast.makeText(context, "Battery Okay.......", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
