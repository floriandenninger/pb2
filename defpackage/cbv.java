package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class cbv extends cbx {
    private final BroadcastReceiver f;

    static {
        ajbh.S("BrdcstRcvrCnstrntTrckr");
    }

    public cbv(Context context, cfa cfaVar) {
        super(context, cfaVar);
        this.f = new cbu(this);
    }

    public abstract IntentFilter a();

    public abstract void c(Intent intent);

    @Override // defpackage.cbx
    public final void d() {
        ajbh X = ajbh.X();
        String.format("%s: registering receiver", getClass().getSimpleName());
        X.T(new Throwable[0]);
        this.a.registerReceiver(this.f, a());
    }

    @Override // defpackage.cbx
    public final void e() {
        ajbh X = ajbh.X();
        String.format("%s: unregistering receiver", getClass().getSimpleName());
        X.T(new Throwable[0]);
        this.a.unregisterReceiver(this.f);
    }
}
