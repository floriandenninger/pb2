package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fiu implements ypd {
    public final Set a = new HashSet();
    public final Set b = new HashSet();
    private final azrw c;

    public fiu(azrw azrwVar) {
        this.c = azrwVar;
    }

    public final ayqj a() {
        return ayqj.F(amsx.p(this.b));
    }

    public final ayqj b() {
        return ayqj.F(amsx.p(this.a));
    }

    public final void c() {
        ((ypa) this.c.get()).g(this);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{jqc.class, jqd.class, agko.class, agkp.class, aglb.class};
        }
        if (i == 0) {
            this.a.add(((jqc) obj).a);
            return null;
        }
        if (i == 1) {
            this.a.remove(((jqd) obj).a);
            return null;
        }
        if (i == 2) {
            this.b.remove(((agko) obj).a);
            return null;
        }
        if (i == 3) {
            this.b.add(((agkp) obj).a);
            return null;
        }
        if (i == 4) {
            this.a.remove(((aglb) obj).a);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
