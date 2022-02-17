package apps.jobcourse.broadcastproject;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        String msg= "This is default message";
        switch (intent.getAction()){
            case Intent.ACTION_POWER_CONNECTED:
                msg = "The power is connected!";
                break;

            case Intent.ACTION_POWER_DISCONNECTED:
                msg = "The power is disconnected!";
                break;

            case "ACTION_CUSTOM_BROADCAST":
                msg = "Custom broadcast received";
                break;

            case "ACTION_DATA_BROADCAST":
                msg = intent.getStringExtra("Data");
                break;

            default:
                break;
        }
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}