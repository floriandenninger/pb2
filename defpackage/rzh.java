package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rzh extends rzg {
    private Object a = null;

    @Override // defpackage.rzk
    public final boolean e() {
        return this.a != null;
    }

    @Override // defpackage.rzk
    public final int f(sba sbaVar, Object obj) {
        Object obj2 = this.a;
        if (obj2 == null) {
            return 2;
        }
        return obj2.equals(obj) ? 1 : 3;
    }

    @Override // defpackage.rzk
    public final boolean g(List list) {
        Object obj = null;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            float f = Float.MAX_VALUE;
            while (it.hasNext()) {
                say sayVar = (say) it.next();
                sba sbaVar = sayVar.c;
                float f2 = sayVar.f;
                if (f2 < f) {
                    obj = sayVar.e;
                    f = f2;
                }
            }
        }
        Object obj2 = this.a;
        this.a = obj;
        a();
        boolean z = true;
        if (obj2 != null ? obj2.equals(this.a) : this.a == null) {
            z = false;
        }
        if (z) {
            b();
        }
        return z;
    }
}
