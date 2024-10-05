package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akyk extends akye {
    private static final akyr b = akyr.a(1);
    private static final akyr c = akyr.a(3);
    private final BroadcastReceiver d;
    private final SharedPreferences.OnSharedPreferenceChangeListener e;
    private final Context f;
    private final ConnectivityManager g;
    private final SharedPreferences h;
    private final zgd i;

    public akyk(Context context, SharedPreferences sharedPreferences) {
        super(3);
        this.d = new akyi(this);
        this.e = new akyj(this);
        this.f = context;
        this.g = (ConnectivityManager) context.getSystemService("connectivity");
        this.h = sharedPreferences;
        this.i = new akyh(context);
    }

    @Override // defpackage.akye
    protected final void e() {
        this.f.registerReceiver(this.d, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.h.registerOnSharedPreferenceChangeListener(this.e);
    }

    @Override // defpackage.akye
    protected final void f() {
        this.f.unregisterReceiver(this.d);
        this.h.unregisterOnSharedPreferenceChangeListener(this.e);
    }

    @Override // defpackage.akyq
    public final akyr g() {
        NetworkInfo activeNetworkInfo = this.g.getActiveNetworkInfo();
        boolean equals = ((String) this.i.get()).equals(this.h.getString(yny.UPLOAD_NETWORK_POLICY, null));
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return equals ? c : b;
        }
        if (activeNetworkInfo.getType() != 1 && equals) {
            return c;
        }
        return akyr.a;
    }

    public final boolean h() {
        NetworkInfo activeNetworkInfo = this.g.getActiveNetworkInfo();
        return (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected()) ? false : true;
    }

    public final boolean i() {
        if (!((String) this.i.get()).equals(this.h.getString(yny.UPLOAD_NETWORK_POLICY, null))) {
            return false;
        }
        NetworkInfo activeNetworkInfo = this.g.getActiveNetworkInfo();
        return (activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1) ? false : true;
    }
}
