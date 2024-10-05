package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class veu implements anhh {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Set b;
    final /* synthetic */ amnp c;
    final /* synthetic */ vex d;
    final /* synthetic */ Integer e;
    final /* synthetic */ vey f;

    public veu(vey veyVar, AtomicBoolean atomicBoolean, Set set, amnp amnpVar, vex vexVar, Integer num) {
        this.f = veyVar;
        this.a = atomicBoolean;
        this.b = set;
        this.c = amnpVar;
        this.d = vexVar;
        this.e = num;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (!this.a.get()) {
            this.b.size();
            vex vexVar = this.d;
            synchronized (vexVar.c) {
                amsx.p(vexVar.b);
            }
            vey.a.convert(this.e.intValue(), this.f.g);
            return;
        }
        this.b.size();
        this.c.a(vey.a);
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
    }
}
