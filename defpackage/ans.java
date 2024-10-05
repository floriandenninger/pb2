package defpackage;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class ans extends BroadcastReceiver {
    public static final SparseArray a = new SparseArray();
    public static int b = 1;

    public static void a(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0 && (intExtra = intent.getIntExtra("android.support.content.wakelockid", 0)) == 0) {
            return;
        }
        SparseArray sparseArray = a;
        synchronized (sparseArray) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray.remove(intExtra);
            } else {
                Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            }
        }
    }
}
