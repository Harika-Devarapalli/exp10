package com.example.exp10;

import android.app.RemoteInput;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class NotificationReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle remoteinput = RemoteInput.getResultsFromIntent(intent);
        if(remoteinput!=null){
            CharSequence messagereceived = remoteinput.getCharSequence("Reply_message");
            Message answer = new Message(messagereceived,null);
            exp7main.messages.add(answer);

            exp7main.sendMessageNotif(context);
        }
    }
}
