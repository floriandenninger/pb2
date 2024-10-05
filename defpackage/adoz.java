package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adoz implements adlr {
    public final axpg e;
    public final axpg f;
    public final axpg g;
    private final shf k;
    private adlm l;
    private adlo m;
    private adkp n;
    private final long o;
    private final acun p;
    private static final String h = zga.a("MDX.SessionInfoStorageController");
    static final long a = TimeUnit.MINUTES.toMillis(1);
    static final long b = TimeUnit.MINUTES.toMillis(2);
    static final long c = TimeUnit.MINUTES.toMillis(10);
    private final adlq q = new adox(this);
    private final Handler i = new Handler(Looper.getMainLooper());
    private final adoy j = new adoy(this);
    public boolean d = false;

    public adoz(shf shfVar, axpg axpgVar, axpg axpgVar2, axpg axpgVar3, acun acunVar) {
        this.k = shfVar;
        this.e = axpgVar;
        this.f = axpgVar2;
        this.g = axpgVar3;
        this.p = acunVar;
        this.o = acunVar.as;
    }

    public final void a() {
        if (this.m == null) {
            zga.m(h, "cannot update values because session builders are null");
            return;
        }
        if (this.n == null) {
            ((adov) this.e.get()).d(this.m.a());
            return;
        }
        long c2 = this.k.c();
        long j = this.n.a().c;
        long j2 = this.o;
        boolean z = false;
        if (j2 > 0) {
            j = this.p.as + c2;
        } else if (j2 < 0) {
            z = true;
        } else {
            adlm adlmVar = this.l;
            if (adlmVar != null) {
                long max = Math.max(b, adlmVar.e() - this.l.c());
                if (this.l.ak() == 2) {
                    max = Math.max(max, c);
                }
                j = max + c2;
            }
        }
        adov adovVar = (adov) this.e.get();
        adlo adloVar = this.m;
        adkp adkpVar = this.n;
        adkpVar.c(c2);
        adkpVar.d(j);
        adkpVar.e(z);
        adloVar.b(adkpVar.a());
        adovVar.d(adloVar.a());
    }

    public final void b() {
        this.i.postDelayed(this.j, a);
    }

    @Override // defpackage.adlr
    public final void j(adlm adlmVar) {
        long c2 = this.k.c();
        adkp a2 = adkq.a();
        a2.b(c2);
        this.n = a2;
        if (this.m == null || this.l != adlmVar) {
            zga.m(h, "session info builder lost or mismatch, using connected time as a proxy for started time");
            adlo b2 = adlmVar.o().b();
            b2.h(c2);
            this.m = b2;
        }
        this.l = adlmVar;
        adlmVar.A(this.q);
        a();
        b();
    }

    @Override // defpackage.adlr
    public final void k(adlm adlmVar) {
        if (adlmVar != this.l) {
            zga.m(h, "Mismatching session disconnect, ignore");
            return;
        }
        adlo adloVar = this.m;
        if (adloVar == null) {
            zga.m(h, "session info builder lost, ignore");
            return;
        }
        adloVar.c(adlmVar.s());
        a();
        ((adpj) this.g.get()).g(this.m.a());
        adlmVar.O(this.q);
        this.i.removeCallbacks(this.j);
        this.l = null;
        this.n = null;
        this.m = null;
    }

    @Override // defpackage.adlr
    public final void l(adlm adlmVar) {
        ynm.m(((adov) this.e.get()).a.b(aczu.t), adha.l);
        this.l = adlmVar;
        this.n = null;
        adlo b2 = adlmVar.o().b();
        b2.h(this.k.c());
        this.m = b2;
        adlp a2 = b2.a();
        if (!this.p.an) {
            ((adov) this.e.get()).d(a2);
        }
        ((adpj) this.g.get()).h(adlmVar);
    }
}
