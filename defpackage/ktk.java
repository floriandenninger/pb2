package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ktk implements kts, kig, nun, fgp {
    public final aioc a;
    public final ayqw b;
    public aypo c;
    public aypn d;
    private final kih e;
    private final nqp f;
    private final fgq g;
    private final avaz h;
    private final avay i;
    private final ywr j;
    private boolean k;
    private boolean l;

    public ktk(aioc aiocVar, kih kihVar, nqp nqpVar, fgq fgqVar, ywr ywrVar, avaz avazVar) {
        this.a = aiocVar;
        this.h = avazVar;
        avbb avbbVar = avazVar.g;
        this.i = (avay) (avbbVar == null ? avbb.a : avbbVar).pX(avay.b);
        this.e = kihVar;
        this.f = nqpVar;
        this.g = fgqVar;
        this.b = new ayqw();
        this.j = ywrVar;
    }

    @Override // defpackage.kts
    public final aypn a() {
        if (this.d == null) {
            this.d = aypn.k(new aypp() { // from class: kth
                @Override // defpackage.aypp
                public final void a(aypo aypoVar) {
                    final ktk ktkVar = ktk.this;
                    ktkVar.c = aypoVar;
                    ktkVar.b.d(ktkVar.a.ao().Y(new ayrs() { // from class: ktj
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            ktk.this.d();
                        }
                    }, ktf.c));
                    ktkVar.d();
                    aypoVar.si(aynu.e(new ayrm() { // from class: kti
                        @Override // defpackage.ayrm
                        public final void a() {
                            ktk ktkVar2 = ktk.this;
                            ktkVar2.b.c();
                            ktkVar2.d = null;
                            ktkVar2.c = null;
                        }
                    }));
                }
            }, aypg.BUFFER);
        }
        return this.d;
    }

    @Override // defpackage.kts
    public final void b() {
        this.e.a(this);
        this.f.g().a(this);
        this.g.i(this);
        this.l = this.g.g().b();
    }

    public final void d() {
        aypo aypoVar = this.c;
        if (aypoVar == null) {
            return;
        }
        boolean z = true;
        if (this.k && !this.l && ((fof) this.j.c()).j < 2) {
            String i = this.f.i();
            if (i != null) {
                Iterator it = this.i.c.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (i.equals((String) it.next())) {
                            break;
                        }
                    } else {
                        for (aqtn aqtnVar : this.i.d) {
                            if (i.equals((aqtnVar.b & 2) != 0 ? aqtnVar.d : null)) {
                            }
                        }
                    }
                }
            }
            aypoVar.d(kta.b(z, this.h));
        }
        z = false;
        aypoVar.d(kta.b(z, this.h));
    }

    @Override // defpackage.nun
    public final void g(nqg nqgVar) {
        d();
    }

    @Override // defpackage.kig
    public final /* synthetic */ void i(ControlsOverlayStyle controlsOverlayStyle) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void m(fhg fhgVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nA(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nB(zcp zcpVar) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nC(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nD(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nF(ControlsState controlsState) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nX(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void nY(boolean z) {
    }

    @Override // defpackage.kig
    public final void nz(boolean z) {
        if (this.k) {
            this.k = false;
            d();
        }
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        this.l = fhgVar.b();
        d();
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    @Override // defpackage.kig
    public final /* synthetic */ void p(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void q(boolean z) {
    }

    @Override // defpackage.kig
    public final /* synthetic */ void r(boolean z) {
    }

    @Override // defpackage.kig
    public final void s(boolean z) {
        if (this.k) {
            return;
        }
        this.k = true;
        d();
    }
}
