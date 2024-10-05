package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yll implements ywr {
    public final Runnable a;
    public final ywp b;
    public final ylg c;
    private final Executor d;
    private final aooy e;

    public yll(Executor executor, ylg ylgVar, Runnable runnable, ambx ambxVar, aooy aooyVar) {
        this.a = runnable;
        this.b = new ywp(ambxVar, aooyVar);
        this.d = executor;
        this.c = ylgVar;
        this.e = aooyVar;
    }

    private final anhy e(final anfz anfzVar) {
        anhy a;
        if (this.c.f()) {
            try {
                a = anfzVar.a(this.b);
            } catch (Exception e) {
                this.c.e();
                return anaf.N(e);
            }
        } else {
            a = anaf.T(new anfy() { // from class: yli
                @Override // defpackage.anfy
                public final anhy a() {
                    yll yllVar = yll.this;
                    anfz anfzVar2 = anfzVar;
                    yllVar.c.c();
                    try {
                        return anfzVar2.a(yllVar.b);
                    } catch (Throwable th) {
                        yllVar.c.e();
                        return anaf.N(th);
                    }
                }
            }, this.d);
        }
        try {
            return aney.i(anfq.h(anht.q(a), new ylh(this, 1), angq.a), Throwable.class, new anfz() { // from class: ylj
                @Override // defpackage.anfz
                public final anhy a(Object obj) {
                    yll.this.c.e();
                    return anaf.N((Throwable) obj);
                }
            }, angq.a);
        } catch (Exception e2) {
            this.c.e();
            return anaf.N(e2);
        }
    }

    @Override // defpackage.ywr
    public final anhy a() {
        return e(ufj.f);
    }

    @Override // defpackage.ywr
    public final anhy b(final amml ammlVar) {
        return e(new anfz() { // from class: ylk
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                return anfq.h(((ywp) obj).b(ammlVar), new ylh(yll.this, 0), angq.a);
            }
        });
    }

    @Override // defpackage.ywr
    public final aooy c() {
        ylg ylgVar;
        try {
            try {
                try {
                    this.c.c();
                    return this.b.c();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    ylgVar = this.c;
                    ylgVar.e();
                    return this.e;
                }
            } catch (Exception unused2) {
                zga.b("Failed to read the valye from PDS");
                ylgVar = this.c;
                ylgVar.e();
                return this.e;
            }
        } finally {
            this.c.e();
        }
    }

    @Override // defpackage.ywr
    public final aypn d() {
        return this.b.b;
    }
}
