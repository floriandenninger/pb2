package defpackage;

import androidx.work.impl.WorkDatabase;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cec implements Runnable {
    private final caj a;
    private final String b;
    private final boolean c;

    static {
        ajbh.S("StopWorkRunnable");
    }

    public cec(caj cajVar, String str, boolean z) {
        this.a = cajVar;
        this.b = str;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        boolean e;
        caj cajVar = this.a;
        WorkDatabase workDatabase = cajVar.d;
        bzr bzrVar = cajVar.f;
        cdb r = workDatabase.r();
        workDatabase.h();
        try {
            String str = this.b;
            synchronized (bzrVar.g) {
                containsKey = bzrVar.d.containsKey(str);
            }
            if (this.c) {
                bzr bzrVar2 = this.a.f;
                String str2 = this.b;
                synchronized (bzrVar2.g) {
                    ajbh X = ajbh.X();
                    String.format("Processor stopping foreground work %s", str2);
                    X.T(new Throwable[0]);
                    e = bzr.e(str2, (can) bzrVar2.d.remove(str2));
                }
                ajbh X2 = ajbh.X();
                String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.b, Boolean.valueOf(e));
                X2.T(new Throwable[0]);
                workDatabase.j();
            }
            if (!containsKey && r.h(this.b) == 2) {
                r.k(1, this.b);
            }
            bzr bzrVar3 = this.a.f;
            String str3 = this.b;
            synchronized (bzrVar3.g) {
                ajbh X3 = ajbh.X();
                String.format("Processor stopping background work %s", str3);
                X3.T(new Throwable[0]);
                e = bzr.e(str3, (can) bzrVar3.e.remove(str3));
            }
            ajbh X22 = ajbh.X();
            String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.b, Boolean.valueOf(e));
            X22.T(new Throwable[0]);
            workDatabase.j();
        } finally {
            workDatabase.i();
        }
    }
}
