package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gxs extends lul implements nrg, ypd {
    public boolean a;
    private final aahd b;
    private final fgq c;
    private final acpl d;
    private apwr e;
    private ayqx f;
    private final gxr g;
    private final axze n;

    public gxs(ajvb ajvbVar, ypa ypaVar, zaw zawVar, ajfh ajfhVar, shf shfVar, jap japVar, ammv ammvVar, ajun ajunVar, aasm aasmVar, acra acraVar, ajxe ajxeVar, ammv ammvVar2, aahd aahdVar, fgq fgqVar, acpl acplVar, axze axzeVar, byte[] bArr, byte[] bArr2) {
        super(ajvbVar, ypaVar, zawVar, ajfhVar, shfVar, japVar, ammvVar, ajunVar, aasmVar, acraVar, ajxeVar);
        this.a = false;
        amkq.E(ammvVar2.h());
        this.g = (gxr) ammvVar2.c();
        this.b = aahdVar;
        this.c = fgqVar;
        this.d = acplVar;
        this.n = axzeVar;
    }

    @Override // defpackage.nrg
    public final void d() {
        if (this.e != null && !this.g.s()) {
            if (this.g.t() && this.c.g().i()) {
                apwr apwrVar = this.e;
                if ((apwrVar.b & 1) != 0) {
                    aahd aahdVar = this.b;
                    apxf apxfVar = apwrVar.c;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                    aahdVar.a(apxfVar);
                }
            }
            if (!this.g.t()) {
                apwr apwrVar2 = this.e;
                if ((apwrVar2.b & 2) != 0) {
                    aahd aahdVar2 = this.b;
                    apxf apxfVar2 = apwrVar2.d;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    aahdVar2.a(apxfVar2);
                    if (this.a) {
                        acpl acplVar = this.d;
                        arpn a = arpp.a();
                        aone createBuilder = apwt.a.createBuilder();
                        String h = this.g.h();
                        createBuilder.copyOnWrite();
                        apwt apwtVar = (apwt) createBuilder.instance;
                        h.getClass();
                        apwtVar.b |= 1;
                        apwtVar.c = h;
                        a.copyOnWrite();
                        ((arpp) a.instance).cl((apwt) createBuilder.build());
                        acplVar.c((arpp) a.build());
                    }
                }
            }
        }
        this.g.o();
        Object obj = this.f;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
            this.f = null;
        }
    }

    @Override // defpackage.nrg
    public final void h() {
        this.g.p();
        this.f = this.n.a.a.Y(axzb.k).B().ay(new ayrs() { // from class: gxq
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                gxs.this.a = ((Boolean) obj).booleanValue();
            }
        }, ggk.o);
    }

    @Override // defpackage.lul, defpackage.ajvj
    public final void i(aalz aalzVar) {
        super.i(aalzVar);
        for (Object obj : aalzVar.b()) {
            if (obj instanceof apwr) {
                this.e = (apwr) obj;
            }
        }
    }

    @Override // defpackage.lul, defpackage.ajvj, defpackage.ajud, defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (cls == gxs.class) {
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

    @Override // defpackage.nrg
    public final void oS() {
    }

    @Override // defpackage.nrg
    public final void oT() {
    }

    @Override // defpackage.nrg
    public final /* synthetic */ void oX() {
    }
}
