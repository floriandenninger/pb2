package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dba {
    private static volatile dba c;
    boolean a;
    private final Context e;
    private boolean f;
    private final BroadcastReceiver d = new daz(this);
    final Set b = new HashSet();

    private dba(Context context) {
        this.e = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dba a(Context context) {
        if (c == null) {
            synchronized (dba.class) {
                if (c == null) {
                    c = new dba(context);
                }
            }
        }
        return c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean d(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        did.ap(connectivityManager);
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(coq coqVar) {
        this.b.add(coqVar);
        if (!this.f && !this.b.isEmpty()) {
            this.a = d(this.e);
            try {
                this.e.registerReceiver(this.d, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.f = true;
            } catch (SecurityException e) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register", e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(coq coqVar) {
        this.b.remove(coqVar);
        if (this.f && this.b.isEmpty()) {
            this.e.unregisterReceiver(this.d);
            this.f = false;
        }
    }
}
