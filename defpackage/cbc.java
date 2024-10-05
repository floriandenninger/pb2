package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cbc implements bzs {
    private final Context a;

    static {
        ajbh.S("SystemAlarmScheduler");
    }

    public cbc(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.bzs
    public final void b(String str) {
        this.a.startService(cas.g(this.a, str));
    }

    @Override // defpackage.bzs
    public final void c(cda... cdaVarArr) {
        for (cda cdaVar : cdaVarArr) {
            ajbh X = ajbh.X();
            String.format("Scheduling work with workSpecId %s", cdaVar.c);
            X.T(new Throwable[0]);
            this.a.startService(cas.f(this.a, cdaVar.c));
        }
    }

    @Override // defpackage.bzs
    public final boolean d() {
        return true;
    }
}
