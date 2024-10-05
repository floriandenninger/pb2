package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class qma extends BroadcastReceiver {
    private final ExecutorService a;

    public qma() {
        rbd rbdVar = ral.a;
        this.a = rbd.v(new qts("firebase-iid-executor"));
    }

    public final int a(Context context, Intent intent) {
        rpt c;
        if (intent.getExtras() == null) {
            return 500;
        }
        String stringExtra = intent.getStringExtra("google.message_id");
        if (TextUtils.isEmpty(stringExtra)) {
            c = rqr.c(null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("google.message_id", stringExtra);
            qml b = qml.b(context);
            c = b.c(new qmh(b.a(), bundle));
        }
        int b2 = b(context, new CloudMessage(intent));
        try {
            rqr.e(c, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Message ack failed: ");
            sb.append(valueOf);
            Log.w("CloudMessagingReceiver", sb.toString());
        }
        return b2;
    }

    protected abstract int b(Context context, CloudMessage cloudMessage);

    protected void c(Bundle bundle) {
        throw null;
    }

    public final int d(Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(intent.getAction())) {
            c(extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        if (intent == null) {
            return;
        }
        final boolean isOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult goAsync = goAsync();
        this.a.execute(new Runnable() { // from class: qlz
            @Override // java.lang.Runnable
            public final void run() {
                int a;
                qma qmaVar = qma.this;
                Intent intent2 = intent;
                Context context2 = context;
                boolean z = isOrderedBroadcast;
                BroadcastReceiver.PendingResult pendingResult = goAsync;
                try {
                    Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
                    Intent intent3 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent3 != null) {
                        a = qmaVar.d(intent3);
                    } else {
                        a = qmaVar.a(context2, intent2);
                    }
                    if (z) {
                        pendingResult.setResultCode(a);
                    }
                } finally {
                    pendingResult.finish();
                }
            }
        });
    }
}
