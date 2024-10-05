package defpackage;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayb {
    public final Set a = new HashSet();
    public axt b;

    public final void a(Exception exc, boolean z) {
        this.b = null;
        amru o = amru.o(this.a);
        this.a.clear();
        int size = o.size();
        for (int i = 0; i < size; i++) {
            axt axtVar = (axt) o.get(i);
            int i2 = 1;
            if (true != z) {
                i2 = 3;
            }
            axtVar.h(exc, i2);
        }
    }

    public final void b(axt axtVar) {
        this.a.add(axtVar);
        if (this.b != null) {
            return;
        }
        this.b = axtVar;
        axtVar.j();
    }
}
