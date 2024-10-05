package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ofh extends lul implements ypd {
    public final ajoc a;
    public final gpe b;
    public ayqx c;

    public ofh(abds abdsVar, ajvb ajvbVar, ypa ypaVar, zaw zawVar, acra acraVar, ajun ajunVar, ajfh ajfhVar, shf shfVar, jap japVar, ammv ammvVar, gpe gpeVar) {
        super(ajvbVar, ypaVar, zawVar, ajfhVar, shfVar, japVar, ammvVar, ajunVar, abdsVar, acraVar, null);
        this.a = new ajoc();
        this.b = gpeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(askd askdVar) {
        return (askdVar == null || (askdVar.c & 8) == 0 || !askdVar.i.equals("comments-entry-point")) ? false : true;
    }

    @Override // defpackage.ajud, defpackage.ajtz, defpackage.zfk
    public final void j() {
        super.j();
        Object obj = this.c;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
            this.c = null;
        }
    }

    @Override // defpackage.lul, defpackage.ajvj, defpackage.ajud, defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (cls == ofh.class) {
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

    @Override // defpackage.ajud, defpackage.ajvc
    public final ajng lC() {
        return this.a;
    }
}
