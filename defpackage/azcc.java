package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azcc extends AtomicReference implements ayqx {
    private static final long serialVersionUID = -2467358622224974244L;
    public final aypt a;

    public azcc(aypt ayptVar) {
        this.a = ayptVar;
    }

    public final void a(Throwable th) {
        ayqx ayqxVar;
        Throwable nullPointerException = th == null ? new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.") : th;
        if (get() == ayrz.a || (ayqxVar = (ayqx) getAndSet(ayrz.a)) == ayrz.a) {
            aynu.j(th);
            return;
        }
        try {
            this.a.b(nullPointerException);
            if (ayqxVar != null) {
                ayqxVar.qc();
            }
        } catch (Throwable th2) {
            if (ayqxVar != null) {
                ayqxVar.qc();
            }
            throw th2;
        }
    }

    public final void c(Object obj) {
        ayqx ayqxVar;
        if (get() == ayrz.a || (ayqxVar = (ayqx) getAndSet(ayrz.a)) == ayrz.a) {
            return;
        }
        try {
            if (obj == null) {
                this.a.b(new NullPointerException("onSuccess called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                this.a.sc(obj);
            }
            if (ayqxVar != null) {
                ayqxVar.qc();
            }
        } catch (Throwable th) {
            if (ayqxVar != null) {
                ayqxVar.qc();
            }
            throw th;
        }
    }

    @Override // defpackage.ayqx
    public final boolean e() {
        return ayrz.d((ayqx) get());
    }

    @Override // defpackage.ayqx
    public final void qc() {
        ayrz.c(this);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
    }
}
