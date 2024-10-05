package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayei implements aygd {
    private final ayec a;
    private final ayej b;

    public ayei(ayec ayecVar, ayej ayejVar) {
        this.a = ayecVar;
        this.b = ayejVar;
    }

    @Override // defpackage.aygd
    public final axzj a() {
        throw null;
    }

    @Override // defpackage.aygd
    public final void b(ayiz ayizVar) {
    }

    @Override // defpackage.aygd
    public final void c(Status status) {
        synchronized (this.a) {
            this.a.h(status);
        }
    }

    @Override // defpackage.ayob
    public final void d() {
    }

    @Override // defpackage.aygd
    public final void e() {
        try {
            synchronized (this.b) {
                ayej ayejVar = this.b;
                ayejVar.e();
                ayejVar.f();
            }
        } catch (StatusException e) {
            synchronized (this.a) {
                this.a.g(e.a);
            }
        }
    }

    @Override // defpackage.ayob
    public final void f() {
    }

    @Override // defpackage.ayob
    public final void g(int i) {
        synchronized (this.a) {
            this.a.m(i);
        }
    }

    @Override // defpackage.ayob
    public final void h(ayac ayacVar) {
    }

    @Override // defpackage.aygd
    public final void i(ayaj ayajVar) {
        synchronized (this.b) {
            this.b.b(ayajVar);
        }
    }

    @Override // defpackage.aygd
    public final void j(ayam ayamVar) {
    }

    @Override // defpackage.aygd
    public final void k(int i) {
    }

    @Override // defpackage.aygd
    public final void l(int i) {
    }

    @Override // defpackage.aygd
    public final void m(aygf aygfVar) {
        synchronized (this.a) {
            this.a.k(this.b, aygfVar);
        }
        if (this.b.g()) {
            aygfVar.e();
        }
        try {
            synchronized (this.b) {
                this.b.d();
                this.b.f();
            }
        } catch (StatusException e) {
            synchronized (this.a) {
                this.a.g(e.a);
            }
        }
    }

    @Override // defpackage.ayob
    public final void n(InputStream inputStream) {
        try {
            synchronized (this.b) {
                this.b.c(inputStream);
                this.b.f();
            }
        } catch (StatusException e) {
            synchronized (this.a) {
                this.a.g(e.a);
            }
        }
    }

    @Override // defpackage.ayob
    public final boolean o() {
        return this.b.g();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27 + String.valueOf(valueOf2).length());
        sb.append("MultiMessageClientStream[");
        sb.append(valueOf);
        sb.append("/");
        sb.append(valueOf2);
        sb.append("]");
        return sb.toString();
    }
}
