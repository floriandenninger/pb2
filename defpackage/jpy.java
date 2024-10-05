package defpackage;

import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jpy implements jpi {
    private final aahv a;
    private final ywr b;
    private final jpf c;
    private final axzg d;
    private final axzf e;
    private final c f;
    private final c g;
    private final ajoy h;
    private final ajoy i;

    public jpy(aahv aahvVar, ajoy ajoyVar, c cVar, ajoy ajoyVar2, c cVar2, ywr ywrVar, jpf jpfVar, axzf axzfVar, axzg axzgVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.a = aahvVar;
        this.i = ajoyVar;
        this.f = cVar;
        this.h = ajoyVar2;
        this.g = cVar2;
        this.b = ywrVar;
        this.c = jpfVar;
        this.e = axzfVar;
        this.d = axzgVar;
    }

    @Override // defpackage.jpi
    public final int a() {
        return 155;
    }

    @Override // defpackage.jpi
    public final int b() {
        return 141;
    }

    @Override // defpackage.jpi
    public final /* synthetic */ jpg c(aakt aaktVar, String str, jph jphVar) {
        awil awilVar = (awil) aaktVar;
        aqmg d = aqmh.d(str);
        jpx jpxVar = (jpx) jphVar;
        jpx jpxVar2 = new jpx(0.0f, false, 0);
        if (awilVar != null) {
            avxt f = jpf.f(this.c.c(awilVar));
            float f2 = jpxVar != null ? jpxVar.a : 0.0f;
            float max = Math.max(f2, jpf.p(awilVar.f()));
            d.aj(Boolean.valueOf(this.c.m(awilVar)));
            d.d(f);
            jpf jpfVar = this.c;
            d.ah(jpfVar.g(jpfVar.c(awilVar), awilVar.f(), awilVar.b()));
            d.c(Float.valueOf(max));
            d.ak(Float.valueOf(f2));
            d.ai(Boolean.valueOf(jpf.q(awilVar.b())));
            if (this.c.d(awilVar).h()) {
                atpf atpfVar = (atpf) this.c.d(awilVar).c();
                aone aoneVar = d.a;
                aoneVar.copyOnWrite();
                aqmj aqmjVar = (aqmj) aoneVar.instance;
                aqmj aqmjVar2 = aqmj.a;
                aqmjVar.n = atpfVar;
                aqmjVar.c |= 1024;
            }
            boolean z = true;
            if (f != avxt.DOWNLOAD_STATE_COMPLETE && f != avxt.DOWNLOAD_STATE_FAILED) {
                z = false;
            }
            jpxVar2 = new jpx(max, z, 0);
        } else {
            d.d(avxt.DOWNLOAD_STATE_NOT_DOWNLOADED);
        }
        return jpg.b(d.a(this.a.c()), jpxVar2);
    }

    @Override // defpackage.jpi
    public final ammv d(String str) {
        awas z = etx.z(str, this.d);
        return z == null ? amlr.a : ammv.j(fhe.h(z.c));
    }

    @Override // defpackage.jpi
    public final amsx e(String str) {
        awas z = etx.z(str, this.d);
        if (z == null) {
            return amvs.a;
        }
        String str2 = z.c;
        String h = fhe.h(str2);
        amsv i = amsx.i();
        i.c(this.i.G(h));
        i.c(this.i.G(fhe.q(str2)));
        i.c(this.i.G(fhe.s(str2)));
        i.c(this.i.G(fhe.x(str2)));
        i.c(this.f.i());
        i.c(this.i.G(fhe.l(str2)));
        i.c(this.h.F());
        i.c(evr.bD(this.b, jif.r));
        if (this.e.k()) {
            if (jpf.q((atre) this.a.c().f(fhe.q(str2)).g(atre.class).X())) {
                i.c(this.g.k());
            }
        }
        return i.g();
    }

    @Override // defpackage.jpi
    public final Class f() {
        return awil.class;
    }

    @Override // defpackage.jpi
    public final Class g() {
        return aqmi.class;
    }

    @Override // defpackage.jpi
    public final aajc h(String str) {
        return new aajc(2, str);
    }
}
