package pro.nanosystems.lowbatterybroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomBroadcast extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "My Custom Broadcast...........", Toast.LENGTH_SHORT).show();
    }
}
