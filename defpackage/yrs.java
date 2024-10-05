package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yrs extends BroadcastReceiver implements yrp {
    public final Application a;
    public final zey b;
    public final yqb c;
    public final yqa d;
    private final azrw e;

    public yrs(Context context, final azrw azrwVar, zey zeyVar) {
        context.getClass();
        Application application = (Application) context.getApplicationContext();
        this.a = application;
        this.e = azrwVar;
        yqb yqbVar = new yqb() { // from class: yrr
            @Override // defpackage.yqb
            public final void a() {
                ((yrn) azrw.this.get()).a.c(true);
            }
        };
        this.c = yqbVar;
        yqa yqaVar = new yqa() { // from class: yrq
            @Override // defpackage.yqa
            public final void c() {
                ((yrn) azrw.this.get()).a.c(false);
            }
        };
        this.d = yqaVar;
        zeyVar.getClass();
        this.b = zeyVar;
        zeyVar.a(yqbVar);
        zeyVar.a(yqaVar);
        application.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            ((yrn) this.e.get()).a.c(true);
            return;
        }
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
        sb.append("Unexpected intent. Received action does not match CONNECTIVITY_ACTION: ");
        sb.append(valueOf);
        zga.l(sb.toString());
    }
}
