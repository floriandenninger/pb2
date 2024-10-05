package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uzc extends uzg {
    private final amru a;

    @Deprecated
    public uzc(List list) {
        amrp f = amru.f();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!ammx.e(str)) {
                ammv a = uzd.a(str);
                if (a.h()) {
                    f.h((uzd) a.c());
                }
            }
        }
        this.a = f.g();
    }

    @Override // defpackage.uzg
    protected final boolean b(String str) {
        amru amruVar = this.a;
        int i = ((amvj) amruVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            uzd uzdVar = (uzd) amruVar.get(i2);
            if (uzdVar != null && uzdVar.a.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }
}
