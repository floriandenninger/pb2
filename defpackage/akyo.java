package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akyo extends akye {
    protected static final akyr b = akyr.a(1);
    private final BroadcastReceiver c;
    private final Context d;
    private final ConnectivityManager e;

    public akyo(Context context) {
        super(1);
        this.c = new akyn(this);
        this.d = context;
        this.e = (ConnectivityManager) context.getSystemService("connectivity");
    }

    @Override // defpackage.akye
    protected final void e() {
        this.d.registerReceiver(this.c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // defpackage.akye
    protected final void f() {
        this.d.unregisterReceiver(this.c);
    }

    @Override // defpackage.akyq
    public final akyr g() {
        NetworkInfo activeNetworkInfo = this.e.getActiveNetworkInfo();
        return (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) ? b : akyr.a;
    }
}
