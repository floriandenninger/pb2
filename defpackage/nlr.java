package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nlr implements akxi {
    public final Map a = new HashMap();
    private final Executor b;
    private final Runnable c;
    private final hak d;
    private final /* synthetic */ int e;

    public nlr(hak hakVar, Executor executor, Runnable runnable, int i, byte[] bArr) {
        this.e = i;
        this.d = hakVar;
        this.b = executor;
        this.c = runnable;
        ynm.k(hakVar.a(), executor, lra.e, new ynl(null) { // from class: nlh
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                nlr nlrVar = nlr.this;
                amru amruVar = (amru) obj;
                int size = amruVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    akzs akzsVar = (akzs) amruVar.get(i2);
                    nlrVar.a.put(akzsVar.k, akzsVar);
                }
            }
        });
    }

    public static /* synthetic */ void p(Throwable th) {
        zga.d("Error occurred getting reel uploads", th);
    }

    public static /* synthetic */ void q(Throwable th) {
        zga.d("Error occurred getting reel uploads", th);
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void a(String str, boolean z, boolean z2) {
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void b(String str, long j, long j2) {
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void c(String str, akzw akzwVar) {
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void d(String str, aufk aufkVar) {
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void e(String str, double d) {
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void f(String str, long j, long j2, double d) {
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void g(String str, akzp akzpVar) {
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void i(String str, akzs akzsVar) {
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void j(String str) {
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void l(String str, avuh avuhVar) {
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void m(String str, String str2) {
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void n(String str, akzr akzrVar) {
    }

    @Override // defpackage.akxi
    public final /* synthetic */ void o(String str, int i) {
    }

    @Override // defpackage.akxi
    public final void h(akzs akzsVar) {
        if (this.e != 0) {
            this.a.put(akzsVar.k, akzsVar);
        } else {
            this.a.put(akzsVar.k, akzsVar);
        }
    }

    public nlr(hak hakVar, Executor executor, Runnable runnable, int i) {
        this.e = i;
        this.d = hakVar;
        this.b = executor;
        this.c = runnable;
        ynm.k(hakVar.a(), executor, lra.f, new ynl() { // from class: nlq
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                nlr nlrVar = nlr.this;
                amru amruVar = (amru) obj;
                int size = amruVar.size();
                for (int i2 = 0; i2 < size; i2++) {
                    akzs akzsVar = (akzs) amruVar.get(i2);
                    nlrVar.a.put(akzsVar.k, akzsVar);
                }
            }
        });
    }

    @Override // defpackage.akxi
    public final void k(String str, boolean z) {
        if (this.e != 0) {
            akzs akzsVar = (akzs) this.a.get(str);
            if (akzsVar != null) {
                akzq a = akzq.a(akzsVar.l);
                if (a == null) {
                    a = akzq.UNKNOWN_UPLOAD;
                }
                if (a == akzq.REELS_UPLOAD) {
                    this.b.execute(this.c);
                    return;
                }
                return;
            }
            return;
        }
        akzs akzsVar2 = (akzs) this.a.get(str);
        if (akzsVar2 != null) {
            akzq a2 = akzq.a(akzsVar2.l);
            if (a2 == null) {
                a2 = akzq.UNKNOWN_UPLOAD;
            }
            if (a2 == akzq.REELS_UPLOAD) {
                this.b.execute(this.c);
            }
        }
    }
}
