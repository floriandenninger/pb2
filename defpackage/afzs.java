package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afzs {
    final /* synthetic */ afzu a;

    public afzs(afzu afzuVar) {
        this.a = afzuVar;
    }

    public final void a(asjl asjlVar, asjn asjnVar) {
        synchronized (this.a.b) {
            this.a.a.Z(afzu.a(asjlVar));
            if (asjnVar == null) {
                afzu afzuVar = this.a;
                afzr afzrVar = new afzr(afzuVar, afzu.a(asjlVar));
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    afzuVar.d.post(afzrVar);
                } else {
                    afzrVar.run();
                }
            }
            afzu afzuVar2 = this.a;
            afzuVar2.c.h((ajce) afzuVar2.b.get(afzu.a(asjlVar)));
        }
    }

    public final void b(asjl asjlVar) {
        a(asjlVar, null);
    }
}
