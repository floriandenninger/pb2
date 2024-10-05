package defpackage;

import android.app.Activity;
import android.content.res.Configuration;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oia extends lul implements ypd {
    private static final ammy a = mjw.n;
    private final Activity b;
    private final ajng c;
    private final ajng d;
    private final ajoc e;

    public oia(Activity activity, abds abdsVar, ajvb ajvbVar, ypa ypaVar, zaw zawVar, acra acraVar, ajun ajunVar, ajfh ajfhVar, shf shfVar, jap japVar, ammv ammvVar) {
        super(ajvbVar, ypaVar, zawVar, ajfhVar, shfVar, japVar, ammvVar, ajunVar, abdsVar, acraVar, null);
        this.b = activity;
        ajpd ajpdVar = this.i;
        this.c = ajpdVar;
        ajoc ajocVar = new ajoc();
        this.e = ajocVar;
        ajocVar.m(ajpdVar);
        this.d = new ajnp(ajpdVar, a);
        L(new ohv(1));
        ajpdVar.mK(new ajve(this));
    }

    @Override // defpackage.lul, defpackage.ajvj
    public final void i(aalz aalzVar) {
        super.i(aalzVar);
        r(this.b.getResources().getConfiguration());
    }

    @Override // defpackage.lul, defpackage.ajvj, defpackage.ajud, defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (cls == oia.class) {
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
        return this.e;
    }

    @Override // defpackage.ajud, defpackage.ajvc
    public final void lE(Configuration configuration) {
        r(configuration);
    }

    final void r(Configuration configuration) {
        if (configuration == null) {
            return;
        }
        if (configuration.orientation == 2) {
            this.e.r(this.c, this.d);
        } else {
            this.e.r(this.d, this.c);
        }
    }
}
