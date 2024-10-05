package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yxm extends BroadcastReceiver {
    private final Context a;
    private final yxn b;
    private final ypa c;
    private Map d;

    public yxm(Context context, yxn yxnVar, ypa ypaVar) {
        context.getClass();
        this.a = context;
        yxnVar.getClass();
        this.b = yxnVar;
        ypaVar.getClass();
        this.c = ypaVar;
    }

    public final void a() {
        this.d = this.b.h();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        this.a.registerReceiver(this, intentFilter);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Map map = this.d;
        Map h = this.b.h();
        this.d = h;
        if (h.equals(map)) {
            return;
        }
        this.b.i();
        this.c.d(new yxl(this.d));
    }
}
