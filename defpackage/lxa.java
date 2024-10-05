package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lxa extends lul implements ypd {
    public lxa(ajvb ajvbVar, ypa ypaVar, zaw zawVar, ajfh ajfhVar, shf shfVar, jap japVar, ajun ajunVar, ammv ammvVar, aasm aasmVar, acra acraVar, ajxe ajxeVar) {
        super(ajvbVar, ypaVar, zawVar, ajfhVar, shfVar, japVar, ammvVar, ajunVar, aasmVar, acraVar, ajxeVar);
        K(false);
    }

    @Override // defpackage.lul, defpackage.ajvj, defpackage.ajud, defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (cls == lxa.class) {
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
}
