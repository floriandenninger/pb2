package defpackage;

import com.google.android.apps.youtube.app.common.ui.systemui.PipWindowInsetsHelper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oqi implements fgp, ypd {
    private final ypa b;
    private final gop c;
    private final PipWindowInsetsHelper d;
    private final zaz e;
    private final adlt f;
    private final ainy g;
    private final fgq h;
    private final okd i;
    private final aaea j;
    private final okf k;
    private final oqk n;
    private final axzg o;
    private fhg l = fhg.NONE;
    public gnb a = gnb.DISABLE_FULLSCREEN;
    private boolean m = false;

    public oqi(ypa ypaVar, gop gopVar, PipWindowInsetsHelper pipWindowInsetsHelper, zaz zazVar, adlt adltVar, ainy ainyVar, fgq fgqVar, okd okdVar, aaea aaeaVar, axzg axzgVar, okf okfVar, oqk oqkVar, byte[] bArr, byte[] bArr2) {
        this.b = ypaVar;
        this.c = gopVar;
        this.d = pipWindowInsetsHelper;
        this.e = zazVar;
        this.f = adltVar;
        this.g = ainyVar;
        this.h = fgqVar;
        this.i = okdVar;
        this.j = aaeaVar;
        this.o = axzgVar;
        this.k = okfVar;
        this.n = oqkVar;
        ypaVar.g(this);
        fgqVar.i(this);
        oqkVar.a.ax(new ayrs() { // from class: oqh
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                oqi oqiVar = oqi.this;
                oqiVar.a = (gnb) obj;
                oqiVar.a();
            }
        });
        okfVar.t(new oqg(this));
    }

    private final void d() {
        if (!this.h.g().b() || this.m || this.g.Q() || !e()) {
            return;
        }
        this.e.k(0);
    }

    private final boolean e() {
        return this.f.g() == null;
    }

    public final void a() {
        b(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (r0.a != false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(boolean r6) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oqi.b(boolean):void");
    }

    public final void c(boolean z) {
        if (this.c.isInMultiWindowMode()) {
            return;
        }
        this.m = z;
        if (!z) {
            d();
        } else {
            if (!this.h.g().b() || this.e.n() == 4) {
                return;
            }
            this.e.k(1);
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahee.class, aheh.class};
        }
        if (i == 0) {
            c(((ahee) obj).a);
            return null;
        }
        if (i == 1) {
            c(false);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        if (!fhgVar.m()) {
            this.l = fhgVar;
        }
        a();
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }
}
