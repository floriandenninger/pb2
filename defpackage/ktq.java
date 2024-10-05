package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.player.YouTubePlayerViewNotForReflection;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;
import com.google.android.libraries.youtube.player.ui.PlayerView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ktq implements kts, kig {
    public final fgq a;
    public final aivb b;
    public final PlayerView c;
    public final gjp d;
    public final fku e;
    public final aiva f;
    public final View.OnLayoutChangeListener g;
    public final fgp h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public aypn m;
    public aypo n;
    private final avaz o;
    private final avaw p;
    private final kih q;
    private boolean r;

    public ktq(fgq fgqVar, aivb aivbVar, kch kchVar, gjp gjpVar, fku fkuVar, kih kihVar, avaz avazVar) {
        this.o = avazVar;
        avbb avbbVar = avazVar.g;
        this.p = (avaw) (avbbVar == null ? avbb.a : avbbVar).pX(avaw.b);
        this.a = fgqVar;
        this.b = aivbVar;
        YouTubePlayerViewNotForReflection youTubePlayerViewNotForReflection = ((kcz) kchVar.get()).aT;
        youTubePlayerViewNotForReflection.getClass();
        this.c = youTubePlayerViewNotForReflection;
        this.d = gjpVar;
        this.e = fkuVar;
        this.q = kihVar;
        this.f = new ktn(this);
        this.g = new ktp(this);
        this.h = new kto(this);
    }

    @Override // defpackage.kts
    public final aypn a() {
        if (this.m == null) {
            this.m = aypn.k(new aypp() { // from class: ktl
                @Override // defpackage.aypp
                public final void a(aypo aypoVar) {
                    final ktq ktqVar = ktq.this;
                    ktqVar.n = aypoVar;
                    ktqVar.a.i(ktqVar.h);
                    ktqVar.b.a(ktqVar.f);
                    ktqVar.c.addOnLayoutChangeListener(ktqVar.g);
                    ktqVar.i = etx.t(ktqVar.d.a());
                    ktqVar.j = ktqVar.b.d();
                    ktqVar.k = ktqVar.a.g().b();
                    ktqVar.l = evr.bx(ktqVar.e.a(), 1.0f);
                    ktqVar.d();
                    aypoVar.si(aynu.e(new ayrm() { // from class: ktm
                        @Override // defpackage.ayrm
                        public final void a() {
                            ktq ktqVar2 = ktq.this;
                            ktqVar2.a.j(ktqVar2.h);
                            ktqVar2.b.c(ktqVar2.f);
                            ktqVar2.c.removeOnLayoutChangeListener(ktqVar2.g);
                            ktqVar2.m = null;
                            ktqVar2.n = null;
                        }
                    }));
                }
            }, aypg.BUFFER);
        }
        return this.m;
    }

    @Override // defpackage.kts
    public final void b() {
        this.q.a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if (r4 != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r6 = this;
            aypo r0 = r6.n
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            fku r2 = r6.e
            float r2 = r2.a()
            boolean r1 = defpackage.evr.by(r1, r2)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L16
        L14:
            r2 = 0
            goto L34
        L16:
            boolean r1 = r6.l
            if (r1 != 0) goto L23
            boolean r1 = r6.j
            boolean r4 = r6.i
            r1 = r1 ^ r4
            if (r1 == 0) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            avaw r4 = r6.p
            boolean r4 = r4.c
            boolean r5 = r6.k
            if (r5 == 0) goto L14
            if (r1 == 0) goto L14
            boolean r1 = r6.r
            if (r1 != 0) goto L34
            if (r4 == 0) goto L14
        L34:
            avaz r1 = r6.o
            kta r1 = defpackage.kta.b(r2, r1)
            r0.d(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ktq.d():void");
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
        if (this.r) {
            this.r = false;
            d();
        }
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
        if (this.r) {
            return;
        }
        this.r = true;
        d();
    }
}
