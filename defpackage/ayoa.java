package defpackage;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayoa {
    private final AtomicBoolean a = new AtomicBoolean(false);
    private final ayep[] b;

    static {
        new ayoa(new ayep[0], null, null, null);
    }

    public ayoa(ayep[] ayepVarArr, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = ayepVarArr;
    }

    public static ayoa m(ayep[] ayepVarArr, axzj axzjVar, aycd aycdVar) {
        ayoa ayoaVar = new ayoa(ayepVarArr, null, null, null);
        for (ayep ayepVar : ayepVarArr) {
            ayepVar.s(axzjVar, aycdVar);
        }
        return ayoaVar;
    }

    public final void a() {
        for (ayep ayepVar : this.b) {
            ayepVar.p();
        }
    }

    public final void b(aycd aycdVar) {
        for (ayep ayepVar : this.b) {
            ayepVar.q(aycdVar);
        }
    }

    public final void c() {
        for (ayep ayepVar : this.b) {
            ayepVar.r();
        }
    }

    public final void d(int i) {
        for (ayep ayepVar : this.b) {
            ayepVar.g(i);
        }
    }

    public final void e(int i, long j, long j2) {
        for (ayep ayepVar : this.b) {
            ayepVar.h(i, j, j2);
        }
    }

    public final void f(long j) {
        for (ayep ayepVar : this.b) {
            ayepVar.i(j);
        }
    }

    public final void g(long j) {
        for (ayep ayepVar : this.b) {
            ayepVar.j(j);
        }
    }

    public final void h(int i) {
        for (ayep ayepVar : this.b) {
            ayepVar.k(i);
        }
    }

    public final void i(int i, long j, long j2) {
        for (ayep ayepVar : this.b) {
            ayepVar.l(i, j, j2);
        }
    }

    public final void j(long j) {
        for (ayep ayepVar : this.b) {
            ayepVar.m(j);
        }
    }

    public final void k(long j) {
        for (ayep ayepVar : this.b) {
            ayepVar.n(j);
        }
    }

    public final void l(Status status) {
        if (this.a.compareAndSet(false, true)) {
            for (ayep ayepVar : this.b) {
                ayepVar.o(status);
            }
        }
    }
}
