package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class admk implements adph {
    public static final String a = zga.a("MDX.BaseSessionRecoverer");
    public final bpw b;
    public final ysy c;
    public final ypa d;
    public final Handler e;
    public final admj f;
    public final boolean g;
    public int h;
    public adlp i;
    public boolean j;
    private final bph k;
    private final addy l;
    private final Handler.Callback m;
    private adno n;
    private final int o;
    private final ji p = new admh(this);

    public admk(bpw bpwVar, bph bphVar, addy addyVar, ysy ysyVar, ypa ypaVar, int i, boolean z) {
        admi admiVar = new admi(this);
        this.m = admiVar;
        yjk.f();
        this.b = bpwVar;
        this.k = bphVar;
        this.l = addyVar;
        this.c = ysyVar;
        this.d = ypaVar;
        this.o = i;
        this.g = z;
        this.e = new Handler(Looper.getMainLooper(), admiVar);
        this.f = new admj(this);
    }

    private final void i() {
        yjk.f();
        a();
        this.d.m(this.f);
        this.j = false;
        this.n = null;
        this.b.r(this.p);
        this.e.removeCallbacksAndMessages(null);
        this.l.B(this);
    }

    protected abstract void a();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void b(bpv bpvVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(bpv bpvVar) {
        amkq.N(this.h == 1);
        this.h = 4;
        adno adnoVar = this.n;
        if (adnoVar != null) {
            adlp adlpVar = adnoVar.a.d;
            if (adlpVar == null) {
                zga.m(adnr.a, "mdxSessionInRecovery is null when onRecoverCompleted() is called, abort.");
                adnoVar.a.f(3);
            } else if (!adeg.c(bpvVar.c, adlpVar.d)) {
                zga.m(adnr.a, "recovered route id does not match previously stored in progress route id, abort");
                adnoVar.a.f(3);
            } else {
                adnoVar.a.f = bpvVar.c;
                adnoVar.a.e = adlpVar;
                bpw.l(bpvVar);
                adnoVar.a.f(4);
            }
        }
        i();
    }

    @Override // defpackage.adph
    public final void d() {
        yjk.f();
        if (this.h != 1) {
            return;
        }
        this.h = 3;
        i();
    }

    @Override // defpackage.adph
    public final boolean e(adlm adlmVar) {
        yjk.f();
        adlp adlpVar = this.i;
        if (adlpVar != null && this.h == 1 && adlmVar.o().i == this.o) {
            return adcp.f(adlmVar.k()).equals(adlpVar.d);
        }
        return false;
    }

    @Override // defpackage.adph
    public final void f(adlp adlpVar, adno adnoVar) {
        yjk.f();
        adnoVar.getClass();
        this.n = adnoVar;
        this.h = 1;
        this.b.p(this.k, this.p);
        this.i = adlpVar;
        this.l.H(this);
        this.e.sendEmptyMessage(1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g() {
        amkq.N(this.h == 1);
        this.h = 2;
        adno adnoVar = this.n;
        if (adnoVar != null) {
            adnoVar.a.e();
        }
        i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h() {
        if (this.e.hasMessages(1)) {
            return;
        }
        this.e.sendEmptyMessageDelayed(1, 1000L);
    }
}
