package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayfr extends ayin {
    public final aygo a;
    public final String b;
    final /* synthetic */ ayfs d;
    private volatile Status e;
    private Status f;
    private Status g;
    public final AtomicInteger c = new AtomicInteger(-2147483647);
    private final ayfq h = new ayfq(this);

    public ayfr(ayfs ayfsVar, aygo aygoVar, String str) {
        this.d = ayfsVar;
        aygoVar.getClass();
        this.a = aygoVar;
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.ayin
    protected final aygo a() {
        return this.a;
    }

    public final void b() {
        synchronized (this) {
            if (this.c.get() != 0) {
                return;
            }
            Status status = this.f;
            Status status2 = this.g;
            this.f = null;
            this.g = null;
            if (status != null) {
                super.j(status);
            }
            if (status2 != null) {
                super.k(status2);
            }
        }
    }

    @Override // defpackage.ayin, defpackage.ayli
    public final void j(Status status) {
        status.getClass();
        synchronized (this) {
            if (this.c.get() < 0) {
                this.e = status;
                this.c.addAndGet(Integer.MAX_VALUE);
                if (this.c.get() != 0) {
                    this.f = status;
                } else {
                    super.j(status);
                }
            }
        }
    }

    @Override // defpackage.ayin, defpackage.ayli
    public final void k(Status status) {
        status.getClass();
        synchronized (this) {
            if (this.c.get() < 0) {
                this.e = status;
                this.c.addAndGet(Integer.MAX_VALUE);
            } else if (this.g != null) {
                return;
            }
            if (this.c.get() != 0) {
                this.g = status;
            } else {
                super.k(status);
            }
        }
    }

    @Override // defpackage.ayin, defpackage.aygg
    public final aygd l(aych aychVar, aycd aycdVar, axzo axzoVar, ayep[] ayepVarArr) {
        aygd aygdVar;
        ayaw ayawVar = axzoVar.h;
        ayaw ayawVar2 = ayawVar == null ? null : ayawVar;
        if (ayawVar2 != null) {
            aylr aylrVar = new aylr(this.a, aychVar, aycdVar, axzoVar, this.h, ayepVarArr, null, null, null);
            if (this.c.incrementAndGet() <= 0) {
                try {
                    Executor executor = (Executor) amkq.Z(axzoVar.c, this.d.a);
                    axzl axzlVar = new axzl(aylrVar);
                    aycy aycyVar = (aycy) amkq.Z((aycy) this.a.m().c(ayiq.a), aycy.NONE);
                    if (!((aydm) ayawVar2).b || aycyVar == aycy.PRIVACY_AND_INTEGRITY) {
                        try {
                            aydm.w((String) amkq.Z(null, this.b), aychVar);
                            ((aydm) ayawVar2).c.b(executor, new aydj((aydm) ayawVar2, axzlVar));
                        } catch (StatusException e) {
                            axzlVar.a(e.a);
                        }
                    } else {
                        Status status = Status.i;
                        String valueOf = String.valueOf(aycyVar);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 96);
                        sb.append("Credentials require channel with PRIVACY_AND_INTEGRITY security level. Observed security level: ");
                        sb.append(valueOf);
                        axzlVar.a(status.withDescription(sb.toString()));
                    }
                } catch (Throwable th) {
                    aylrVar.a(Status.i.withDescription("Credentials should use fail() instead of throwing exceptions").c(th));
                }
                synchronized (aylrVar.f) {
                    aygdVar = aylrVar.g;
                    if (aygdVar == null) {
                        aylrVar.i = new ayhx();
                        aygdVar = aylrVar.i;
                        aylrVar.g = aygdVar;
                    }
                }
                return aygdVar;
            }
            this.h.a();
            return new ayii(this.e, ayepVarArr, null, null, null);
        }
        if (this.c.get() >= 0) {
            return new ayii(this.e, ayepVarArr, null, null, null);
        }
        return this.a.l(aychVar, aycdVar, axzoVar, ayepVarArr);
    }
}
