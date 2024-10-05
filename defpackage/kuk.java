package defpackage;

import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kuk implements kts, kig, ypd {
    public final ypa a;
    public boolean b;
    public int c = -1;
    public aypo d;
    public aypn e;
    private final avaz f;
    private final avba g;
    private final kih h;
    private boolean i;

    public kuk(ypa ypaVar, kih kihVar, avaz avazVar) {
        this.a = ypaVar;
        this.h = kihVar;
        this.f = avazVar;
        avbb avbbVar = avazVar.g;
        this.g = (avba) (avbbVar == null ? avbb.a : avbbVar).pX(avba.b);
    }

    public static int d(long j) {
        double d = j;
        Double.isNaN(d);
        return (int) (d / 1000.0d);
    }

    @Override // defpackage.kts
    public final aypn a() {
        if (this.e == null) {
            this.e = aypn.k(new aypp() { // from class: kui
                @Override // defpackage.aypp
                public final void a(aypo aypoVar) {
                    final kuk kukVar = kuk.this;
                    kukVar.d = aypoVar;
                    kukVar.a.g(kukVar);
                    aypoVar.si(aynu.e(new ayrm() { // from class: kuj
                        @Override // defpackage.ayrm
                        public final void a() {
                            kuk kukVar2 = kuk.this;
                            kukVar2.a.m(kukVar2);
                            kukVar2.d = null;
                            kukVar2.e = null;
                        }
                    }));
                    kukVar.e();
                }
            }, aypg.BUFFER);
        }
        return this.e;
    }

    @Override // defpackage.kts
    public final void b() {
        this.h.a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
    
        if (r4 == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (r7.b == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r7 = this;
            aypo r0 = r7.d
            if (r0 == 0) goto L40
            avba r1 = r7.g
            r2 = 1
            r3 = 0
            if (r1 != 0) goto Lc
        La:
            r2 = 0
            goto L37
        Lc:
            boolean r4 = r1.f
            boolean r5 = r7.i
            if (r5 != 0) goto L15
            if (r4 != 0) goto L15
            goto La
        L15:
            int r4 = r7.c
            int r1 = r1.c
            long r5 = (long) r1
            int r1 = d(r5)
            if (r4 < r1) goto La
            int r1 = r7.c
            avba r4 = r7.g
            int r4 = r4.d
            long r4 = (long) r4
            int r4 = d(r4)
            if (r1 >= r4) goto La
            avba r1 = r7.g
            boolean r1 = r1.e
            if (r1 == 0) goto L37
            boolean r1 = r7.b
            if (r1 == 0) goto La
        L37:
            avaz r1 = r7.f
            kta r1 = defpackage.kta.c(r2, r1, r3)
            r0.d(r1)
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kuk.e():void");
    }

    @Override // defpackage.kig
    public final /* synthetic */ void i(ControlsOverlayStyle controlsOverlayStyle) {
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aheg.class, ahej.class};
        }
        if (i == 0) {
            int d = d(((aheg) obj).e());
            if (d == this.c) {
                return null;
            }
            this.c = d;
            e();
            return null;
        }
        if (i == 1) {
            this.b = ((ahej) obj).e();
            e();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
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
        if (this.i) {
            this.i = false;
            e();
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
        if (this.i) {
            return;
        }
        this.i = true;
        e();
    }
}
