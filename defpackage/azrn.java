package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class azrn extends AtomicReference {
    private static final long serialVersionUID = -733876083048047795L;
    final List a;
    volatile boolean b;
    volatile int c;

    public azrn() {
        aysw.c(16, "capacityHint");
        this.a = new ArrayList(16);
    }

    public final void a(Object obj) {
        this.a.add(obj);
        this.c++;
        this.b = true;
    }

    public final void b(azrm azrmVar) {
        int i;
        if (azrmVar.getAndIncrement() != 0) {
            return;
        }
        List list = this.a;
        ayqd ayqdVar = azrmVar.a;
        Object obj = azrmVar.c;
        int i2 = 0;
        if (obj != null) {
            i2 = ((Integer) obj).intValue();
        } else {
            azrmVar.c = 0;
        }
        int i3 = 1;
        while (!azrmVar.d) {
            int i4 = this.c;
            while (i4 != i2) {
                if (!azrmVar.d) {
                    Object obj2 = list.get(i2);
                    if (!this.b || (i = i2 + 1) != i4 || i != (i4 = this.c)) {
                        ayqdVar.c(obj2);
                        i2++;
                    } else {
                        if (azqm.g(obj2)) {
                            ayqdVar.sh();
                        } else {
                            ayqdVar.b(azqm.d(obj2));
                        }
                        azrmVar.c = null;
                        azrmVar.d = true;
                        return;
                    }
                } else {
                    azrmVar.c = null;
                    return;
                }
            }
            if (i2 == this.c) {
                azrmVar.c = Integer.valueOf(i2);
                i3 = azrmVar.addAndGet(-i3);
                if (i3 == 0) {
                    return;
                }
            }
        }
        azrmVar.c = null;
    }
}
