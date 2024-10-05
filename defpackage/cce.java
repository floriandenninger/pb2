package defpackage;

import androidx.work.impl.WorkDatabase;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cce implements Runnable {
    final /* synthetic */ WorkDatabase a;
    final /* synthetic */ String b;
    final /* synthetic */ ccg c;

    public cce(ccg ccgVar, WorkDatabase workDatabase, String str) {
        this.c = ccgVar;
        this.a = workDatabase;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cda a = this.a.r().a(this.b);
        if (a == null || !a.c()) {
            return;
        }
        synchronized (this.c.c) {
            this.c.f.put(this.b, a);
            this.c.g.add(a);
            ccg ccgVar = this.c;
            ccgVar.h.a(ccgVar.g);
        }
    }
}
