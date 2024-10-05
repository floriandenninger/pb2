package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class lul extends ajvj implements lxb, ypd {
    private final goo a;
    private final shf b;
    private lui c;
    private long d;
    private long e;
    private String f;
    private final jap g;

    public lul(ajvb ajvbVar, ypa ypaVar, zaw zawVar, ajfh ajfhVar, shf shfVar, jap japVar, ammv ammvVar, ajun ajunVar, aasm aasmVar, acra acraVar, ajxe ajxeVar) {
        super(aasmVar, ajvbVar, ypaVar, zawVar, acraVar, ajxe.a(ajxeVar), new ajpd(), ammvVar);
        this.d = 0L;
        this.e = 0L;
        this.f = null;
        shfVar.getClass();
        this.b = shfVar;
        this.g = japVar;
        if (ajxeVar instanceof luk) {
            luk lukVar = (luk) ajxeVar;
            this.a = new goo(lukVar.a);
            this.d = lukVar.b;
            this.e = lukVar.c;
            this.f = lukVar.d;
        } else {
            this.a = new goo();
        }
        L(new lug());
        L(new luj(ajunVar));
        L(new luh());
        L(ajfhVar);
        if (this.e == 0 || shfVar.d() - this.d < TimeUnit.SECONDS.toMillis(this.e)) {
            String str = this.f;
            long j = this.d;
            if (!TextUtils.equals(str, "library-recent") || j >= japVar.d) {
                return;
            }
        }
        af();
    }

    @Override // defpackage.ajvj
    public void i(aalz aalzVar) {
        super.i(aalzVar);
        this.d = this.b.d();
        askd askdVar = aalzVar.a;
        String str = askdVar.i;
        this.f = str;
        final jap japVar = this.g;
        if (!japVar.c && TextUtils.equals(str, "library-recent")) {
            japVar.c = true;
            japVar.b.d(new fgk() { // from class: jao
                @Override // defpackage.fgk
                public final void g(fhf fhfVar) {
                    jap japVar2 = jap.this;
                    if (fhfVar == null) {
                        return;
                    }
                    japVar2.d = japVar2.a.d();
                }
            });
        }
        int i = askdVar.m;
        long j = i;
        if (j == 0 || i <= 0) {
            this.e = 0L;
        } else {
            this.e = j;
        }
    }

    @Override // defpackage.ajvj, defpackage.ajud, defpackage.ypd
    public Class[] kz(Class cls, Object obj, int i) {
        if (cls == lul.class) {
            switch (i) {
                case -1:
                    return new Class[]{izi.class, aacj.class, aacl.class, aaxa.class, aaxb.class, ajvf.class};
                case 0:
                    n((izi) obj);
                    return null;
                case 1:
                    nl((aacj) obj);
                    return null;
                case 2:
                    nm((aacl) obj);
                    return null;
                case 3:
                    N((aaxa) obj);
                    return null;
                case 4:
                    o((aaxb) obj);
                    return null;
                case 5:
                    M((ajvf) obj);
                    return null;
                default:
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unsupported op code: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
            }
        }
        return super.kz(cls, obj, i);
    }

    public final void n(izi iziVar) {
        Object h = iziVar.h();
        ammv[] ammvVarArr = {iziVar.f(), iziVar.b(), iziVar.e()};
        ammv ammvVar = amlr.a;
        for (int i = 0; i < 3; i++) {
            ammvVar = ammvVar.a(ammvVarArr[i]);
        }
        ammv b = ammvVar.b(loc.j);
        if (b.h()) {
            this.a.b(b.c(), h);
            q(h, b.c());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ae, code lost:
    
        if ((r0.b & 1) == 0) goto L46;
     */
    @Override // defpackage.ajvj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void nk(defpackage.aalz r7) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lul.nk(aalz):void");
    }

    @Override // defpackage.ajvj
    public final void nl(aacj aacjVar) {
        if (!(lC() instanceof ajpd)) {
            super.nl(aacjVar);
            return;
        }
        ajpd ajpdVar = (ajpd) lC();
        int indexOf = ajpdVar.indexOf(aacjVar.b());
        if (indexOf < 0) {
            return;
        }
        G(aacjVar.b());
        boolean z = true;
        if (ajpdVar.size() == 1 && (ajpdVar.get(0) instanceof ajny)) {
            ajpdVar.remove(0);
        } else {
            z = false;
        }
        this.c = new lui(aacjVar.b(), indexOf, z);
    }

    @Override // defpackage.ajvj
    public final void nm(aacl aaclVar) {
        super.nm(aaclVar);
        if (lC() instanceof ajpd) {
            ajpd ajpdVar = (ajpd) lC();
            if (ajpdVar.size() == 1 && (ajpdVar.get(0) instanceof aska)) {
                ajpdVar.remove(0);
            }
        }
    }

    public final void o(aaxb aaxbVar) {
        ammv ammvVar;
        ammv i = ammv.i(aaxbVar.b());
        if (i.h()) {
            ammvVar = this.a.a(i.c());
        } else {
            ammvVar = amlr.a;
        }
        if (!i.h() || !ammvVar.h()) {
            Object c = aaxbVar.c();
            lui luiVar = this.c;
            if (luiVar == null || c == null || !c.equals(luiVar.a)) {
                return;
            }
            ly(aaxbVar.c(), this.c.b);
            if (this.c.c) {
                A(new ajny());
            }
            this.c = null;
            return;
        }
        I(i.c(), ammvVar.c());
    }

    @Override // defpackage.ajvj
    public final void p(askb askbVar) {
        super.p(askbVar);
        aska askaVar = askbVar.c;
        if (askaVar == null) {
            askaVar = aska.a;
        }
        asjx asjxVar = askaVar.g;
        if (asjxVar == null) {
            asjxVar = asjx.a;
        }
        if ((asjxVar.b & 1) != 0) {
            aska askaVar2 = askbVar.c;
            if (askaVar2 == null) {
                askaVar2 = aska.a;
            }
            asjx asjxVar2 = askaVar2.g;
            if (asjxVar2 == null) {
                asjxVar2 = asjx.a;
            }
            aunk aunkVar = asjxVar2.c;
            if (aunkVar == null) {
                aunkVar = aunk.a;
            }
            A(aunkVar);
        }
    }

    @Override // defpackage.ajvj, defpackage.ajud, defpackage.ajtz, defpackage.ajvz
    public final ajxe ph() {
        return new luk(super.ph(), this.a.ph(), this.d, this.e, this.f);
    }

    @Override // defpackage.lxb
    public final void q(Object obj, Object obj2) {
        this.a.b(obj2, obj);
        I(obj, obj2);
    }
}
