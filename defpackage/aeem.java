package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeem {
    public final String a;
    public final List b;
    public final long c;
    public final long d;
    public final aeen e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public final Runnable g = new aeel(this);
    public final aeei h;
    private aeek i;

    public aeem(aeei aeeiVar, String str, List list, long j, long j2, aeen aeenVar) {
        this.h = aeeiVar;
        this.a = str;
        this.b = list;
        this.c = j;
        this.d = j2;
        this.e = aeenVar;
    }

    public final void a() {
        this.f.set(true);
        synchronized (this) {
            aeek aeekVar = this.i;
            if (aeekVar != null) {
                aeekVar.a(false);
            }
        }
    }

    public final synchronized void b(aeek aeekVar) {
        this.i = aeekVar;
    }
}
