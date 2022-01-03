package id.ac.id.telkomuniversity.tass.myscreentime;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;

import androidx.core.app.NotificationCompat;

public class alarmNotif {

    private final int notifID = 1001;
    private String chID = "ch_id";
    private String chName = "notif";

    public void sendNotif(String judul, String pesan, Context context){
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, chID)
                .setSmallIcon(R.drawable.ic_baseline_hourglass_empty_24)
                .setLargeIcon(BitmapFactory.decodeResource(Resources.getSystem(),R.drawable.ic_baseline_hourglass_empty_24))
                .setContentTitle(judul)
                .setContentText(pesan)
                .setAutoCancel(true);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel = new NotificationChannel(chID, chName, NotificationManager.IMPORTANCE_DEFAULT);
            channel.setDescription(chName);
            builder.setChannelId(chID);
                    if(notificationManager != null){
                        channel.setDescription("Sample Channel description");
                        channel.enableLights(true);
                        channel.setLightColor(Color.RED);
                        channel.setVibrationPattern(new long[]{0, 1000, 500, 1000});
                        channel.enableVibration(true);
                        notificationManager.createNotificationChannel(channel);
                    }
        }
        Notification notification = builder.build();
        if(notificationManager != null){
            notificationManager.notify(notifID,notification);
        }
    }
}
