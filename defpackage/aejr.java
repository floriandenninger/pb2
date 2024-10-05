package defpackage;

import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.chromium.net.NetworkException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aejr extends afja {
    public final eun b;
    private final afjl c;
    private final long d;
    private final shf e;
    private long f;
    private final aypn g;
    private final aypn h;
    private final aelw i;
    private final afjf j;
    private final Executor k;
    private final ayqw l;
    private int m;

    public aejr(atr atrVar, aelw aelwVar, afjf afjfVar, shf shfVar, aypn aypnVar, aypn aypnVar2, Executor executor, afjl afjlVar, long j) {
        super(atrVar);
        this.l = new ayqw();
        this.m = 0;
        this.c = afjlVar;
        this.d = j;
        this.e = shfVar;
        this.g = aypnVar;
        this.h = aypnVar2;
        this.i = aelwVar;
        this.b = new eun((char[]) null);
        this.j = afjfVar;
        this.k = executor;
    }

    @Override // defpackage.afja, defpackage.atr, defpackage.ate
    public final long h(ath athVar) {
        this.f = this.e.d();
        final int i = 0;
        final int i2 = 1;
        this.l.g(this.h.ai().n().al(TimeUnit.MILLISECONDS).E(azre.b(this.k)).X(new ayrs(this) { // from class: aejo
            public final /* synthetic */ aejr a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i == 0) {
                    this.a.b.e();
                } else {
                    this.a.b.e();
                }
            }
        }), this.g.ai().n().al(TimeUnit.MILLISECONDS).E(azre.b(this.k)).s(oht.t).X(new ayrs(this) { // from class: aejo
            public final /* synthetic */ aejr a;

            {
                this.a = this;
            }

            @Override // defpackage.ayrs
            public final void a(Object obj) {
                if (i2 == 0) {
                    this.a.b.e();
                } else {
                    this.a.b.e();
                }
            }
        }));
        while (true) {
            try {
                return super.h(athVar);
            } catch (atw e) {
                if (!(e.getCause() instanceof NetworkException)) {
                    throw e;
                }
                NetworkException networkException = (NetworkException) e.getCause();
                this.i.b(e);
                if (networkException.getErrorCode() == 2) {
                    this.b.f();
                    if (this.m == 0) {
                        zhy b = zhy.b(athVar.a);
                        b.g("retry", "1");
                        athVar = athVar.d(b.a());
                    }
                    int i3 = this.m + 1;
                    this.m = i3;
                    aelw aelwVar = this.i;
                    String num = Integer.toString(i3);
                    synchronized (aelwVar.b) {
                        aesa aesaVar = aelwVar.a;
                        if (aesaVar != null) {
                            aesaVar.j("oroid", num);
                        } else {
                            aelwVar.c.add(new aelv(num));
                        }
                        long a = this.c.a(this.m);
                        if (this.d != 0 && this.e.d() + a <= this.f + this.d) {
                            try {
                                this.b.c(a);
                                this.j.X();
                            } catch (InterruptedException e2) {
                                Thread.currentThread().interrupt();
                                throw new atw(new IOException(e2), athVar);
                            }
                        } else {
                            throw new atw(athVar, (byte[]) null);
                        }
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    @Override // defpackage.afja, defpackage.atr, defpackage.ate
    public final void j() {
        this.m = 0;
        this.l.c();
        super.j();
    }
}
