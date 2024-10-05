package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azga extends AtomicReference implements aypz, ayqx {
    private static final long serialVersionUID = -3434801548987643227L;
    final ayqd a;

    public azga(ayqd ayqdVar) {
        this.a = ayqdVar;
    }

    @Override // defpackage.aypm
    public final void a() {
        if (e()) {
            return;
        }
        try {
            this.a.sh();
        } finally {
            ayrz.c(this);
        }
    }

    @Override // defpackage.aypm
    public final void c(Throwable th) {
        Throwable nullPointerException = th == null ? new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.") : th;
        if (!e()) {
            try {
                this.a.b(nullPointerException);
                return;
            } finally {
                ayrz.c(this);
            }
        }
        aynu.j(th);
    }

    @Override // defpackage.aypm
    public final void d(Object obj) {
        if (obj == null) {
            c(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else {
            if (e()) {
                return;
            }
            this.a.c(obj);
        }
    }

    @Override // defpackage.aypz, defpackage.ayqx
    public final boolean e() {
        return ayrz.d((ayqx) get());
    }

    @Override // defpackage.aypz
    public final void f(ayrr ayrrVar) {
        ayrz.f(this, new ayrx(ayrrVar));
    }

    @Override // defpackage.aypz
    public final boolean g(Throwable th) {
        throw null;
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
