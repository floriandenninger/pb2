package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rzl extends rzg {
    private String a = null;

    @Override // defpackage.rzk
    public final boolean e() {
        return this.a != null;
    }

    @Override // defpackage.rzk
    public final int f(sba sbaVar, Object obj) {
        String str = this.a;
        if (str == null) {
            return 2;
        }
        return str.equals(sbaVar.b) ? 1 : 3;
    }

    @Override // defpackage.rzk
    public final boolean g(List list) {
        String str = null;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            float f = Float.MAX_VALUE;
            while (it.hasNext()) {
                say sayVar = (say) it.next();
                float pow = (float) (Math.pow(sayVar.f, 2.0d) + Math.pow(sayVar.g, 2.0d));
                if (pow < f) {
                    str = sayVar.c.b;
                    f = pow;
                }
            }
        }
        String str2 = this.a;
        this.a = str;
        a();
        boolean z = true;
        if (str2 != null ? str2.equals(this.a) : this.a == null) {
            z = false;
        }
        if (z) {
            b();
        }
        return z;
    }
}
