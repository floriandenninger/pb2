package defpackage;

import android.view.View;
import com.google.android.youtube.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jgd implements adlr, fgp, jgb, jfj {
    public static final /* synthetic */ int b = 0;
    Optional a;
    private final ci c;
    private final adlt d;
    private final fgq e;
    private final azrs f;
    private final aypy g;
    private final amnv h;
    private boolean i;
    private ce j;
    private final ahey k;

    static {
        zga.a("MDX.LazyInitializer");
    }

    public jgd(ci ciVar, adlt adltVar, ahey aheyVar, fgq fgqVar, byte[] bArr, byte[] bArr2) {
        jgc jgcVar = new jgc(0);
        azrh aN = azrh.aN(Optional.empty());
        this.f = aN;
        this.g = aN.aj(ivh.s);
        this.i = true;
        ciVar.getClass();
        this.c = ciVar;
        adltVar.getClass();
        this.d = adltVar;
        aheyVar.getClass();
        this.k = aheyVar;
        this.h = jgcVar;
        this.e = fgqVar;
        this.a = Optional.empty();
    }

    private final View h() {
        return this.c.findViewById(R.id.mdx_fragment_container);
    }

    private final synchronized void i() {
        if (this.i) {
            return;
        }
        if (this.d.g() != null) {
            if (g() == null) {
                amkq.N(g() == null);
                Object obj = this.h.get();
                this.j = (ce) obj;
                dn k = this.c.getSupportFragmentManager().k();
                k.q(R.id.mdx_fragment_container, (ce) obj, "MdxWatchFragment");
                k.d();
                ce ceVar = this.j;
                if (ceVar instanceof jga) {
                    this.f.c(Optional.of((jga) ceVar));
                }
            }
            ce g = g();
            if (this.a.isPresent() && (g instanceof jga)) {
                ((jga) g).o(((fxp) this.a.get()).a);
            }
        }
    }

    private final void m() {
        if (this.i || this.d.g() != null || g() == null) {
            return;
        }
        ce g = g();
        g.getClass();
        dn k = this.c.getSupportFragmentManager().k();
        k.m(g);
        k.d();
        this.j = null;
        this.f.c(Optional.empty());
    }

    @Override // defpackage.jfj
    public final aypy a() {
        return this.g;
    }

    @Override // defpackage.jgb
    public final void b() {
        this.d.i(this);
        this.e.i(this);
    }

    @Override // defpackage.jgb
    public final void c() {
        this.d.k(this);
        this.e.j(this);
    }

    @Override // defpackage.jgb
    public final void d() {
        this.i = true;
    }

    @Override // defpackage.jgb
    public final void e() {
        this.i = false;
        i();
        m();
    }

    @Override // defpackage.jgb
    public final void f(int i) {
        if (!this.a.isPresent()) {
            this.a = Optional.of(new fxp());
        }
        ((fxp) this.a.get()).c(0, i);
        View h = h();
        jga jgaVar = (jga) g();
        if (jgaVar == null || h == null || h.getVisibility() != 0) {
            return;
        }
        jgaVar.o(((fxp) this.a.get()).a);
    }

    final ce g() {
        if (this.j == null) {
            this.j = this.c.getSupportFragmentManager().f("MdxWatchFragment");
        }
        return this.j;
    }

    @Override // defpackage.adlr
    public final void j(adlm adlmVar) {
    }

    @Override // defpackage.adlr
    public final void k(adlm adlmVar) {
        m();
        this.k.f(false);
    }

    @Override // defpackage.adlr
    public final void l(adlm adlmVar) {
        i();
        this.k.f(true);
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oQ(fhg fhgVar) {
    }

    @Override // defpackage.fgp
    public final void oR(fhg fhgVar, fhg fhgVar2) {
        View h;
        if (fhgVar == fhgVar2 || (h = h()) == null) {
            return;
        }
        h.setVisibility(fhgVar2 == fhg.WATCH_WHILE_MAXIMIZED ? 0 : 8);
    }
}
