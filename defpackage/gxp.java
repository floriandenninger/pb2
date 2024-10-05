package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gxp extends lul implements nrg, ypd {
    private final gxo a;

    public gxp(ajvb ajvbVar, ypa ypaVar, zaw zawVar, ajfh ajfhVar, shf shfVar, jap japVar, ammv ammvVar, ajun ajunVar, aasm aasmVar, acra acraVar, ajxe ajxeVar, ammv ammvVar2) {
        super(ajvbVar, ypaVar, zawVar, ajfhVar, shfVar, japVar, ammvVar, ajunVar, aasmVar, acraVar, ajxeVar);
        amkq.E(ammvVar2.h());
        this.a = (gxo) ammvVar2.c();
    }

    @Override // defpackage.nrg
    public final void d() {
        this.a.m();
    }

    @Override // defpackage.nrg
    public final void h() {
        this.a.n();
    }

    @Override // defpackage.lul, defpackage.ajvj, defpackage.ajud, defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (cls == gxp.class) {
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
