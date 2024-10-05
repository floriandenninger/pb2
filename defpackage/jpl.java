package defpackage;

import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jpl implements jpi {
    private final aais a;
    private final afsy b;
    private final ywr c;
    private final jpf d;
    private final axzg e;
    private final c f;
    private final ajoy g;
    private final ajoy h;

    public jpl(aais aaisVar, afsy afsyVar, ajoy ajoyVar, c cVar, ajoy ajoyVar2, ywr ywrVar, jpf jpfVar, axzg axzgVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.a = aaisVar;
        this.b = afsyVar;
        this.g = ajoyVar;
        this.f = cVar;
        this.h = ajoyVar2;
        this.c = ywrVar;
        this.d = jpfVar;
        this.e = axzgVar;
    }

    @Override // defpackage.jpi
    public final int a() {
        return 261;
    }

    @Override // defpackage.jpi
    public final int b() {
        return 141;
    }

    @Override // defpackage.jpi
    public final /* synthetic */ jpg c(aakt aaktVar, String str, jph jphVar) {
        asxs asxsVar = (asxs) aaktVar;
        aqmg d = aqmh.d(str);
        jpx jpxVar = (jpx) jphVar;
        jpx jpxVar2 = new jpx(0.0f, false, 1);
        if (asxsVar != null) {
            avxt f = jpf.f(this.d.b(asxsVar));
            asxn b = asxsVar.b();
            atxb b2 = b != null ? b.b() : null;
            float f2 = jpxVar != null ? jpxVar.a : 0.0f;
            float max = Math.max(f2, jpf.p(b2));
            jpf jpfVar = this.d;
            asxn b3 = asxsVar.b();
            atxb b4 = b3 != null ? b3.b() : null;
            d.aj(Boolean.valueOf(jpfVar.n(b4, b4 != null ? b4.f() : null)));
            d.d(f);
            jpf jpfVar2 = this.d;
            asxn b5 = asxsVar.b();
            atxb b6 = b5 != null ? b5.b() : null;
            d.ah(jpfVar2.g(jpfVar2.b(asxsVar), b6, b6 != null ? b6.f() : null));
            d.c(Float.valueOf(max));
            d.ak(Float.valueOf(f2));
            d.ai(false);
            jpxVar2 = new jpx(max, f == avxt.DOWNLOAD_STATE_COMPLETE || f == avxt.DOWNLOAD_STATE_FAILED, 1);
        } else {
            d.d(avxt.DOWNLOAD_STATE_NOT_DOWNLOADED);
        }
        return jpg.b(d.a(this.a.a(this.b.c())), jpxVar2);
    }

    @Override // defpackage.jpi
    public final ammv d(String str) {
        awas z = etx.z(str, this.e);
        return z == null ? amlr.a : ammv.j(fhe.o(z.c));
    }

    @Override // defpackage.jpi
    public final amsx e(String str) {
        awas z = etx.z(str, this.e);
        if (z == null) {
            return amvs.a;
        }
        String str2 = z.c;
        String o = fhe.o(str2);
        amsv i = amsx.i();
        i.c(this.g.E(o));
        i.c(this.g.E(fhe.q(str2)));
        i.c(this.g.E(fhe.s(str2)));
        i.c(this.g.E(fhe.x(str2)));
        i.c(this.g.E(fhe.z(str2)));
        i.c(this.f.i());
        i.c(this.g.E(fhe.l(str2)));
        i.c(this.h.F());
        i.c(evr.bD(this.c, jif.m));
        return i.g();
    }

    @Override // defpackage.jpi
    public final Class f() {
        return asxs.class;
    }

    @Override // defpackage.jpi
    public final Class g() {
        return aqmi.class;
    }

    @Override // defpackage.jpi
    public final aajc h(String str) {
        return new aajc(1, str);
    }
}
