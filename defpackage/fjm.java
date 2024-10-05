package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fjm implements ypd {
    private final Set c = Collections.newSetFromMap(new WeakHashMap());
    public boolean a = false;
    public final azqw b = azqv.aq(false).av();

    public final void a(fjl fjlVar) {
        this.c.add(fjlVar);
    }

    public final void b(fjl fjlVar) {
        this.c.remove(fjlVar);
    }

    public final void c(boolean z) {
        yjk.f();
        if (this.a != z) {
            this.a = z;
            this.b.c(Boolean.valueOf(z));
            if (this.c.isEmpty()) {
                return;
            }
            amru o = amru.o(this.c);
            int size = o.size();
            for (int i = 0; i < size; i++) {
                ((fjl) o.get(i)).a();
            }
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{agll.class, aglm.class, agln.class};
        }
        if (i == 0) {
            c(false);
            return null;
        }
        if (i == 1) {
            c(true);
            return null;
        }
        if (i == 2) {
            c(false);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
