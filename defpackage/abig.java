package defpackage;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abig {
    public final LinkedList a = new LinkedList();

    public abig(byte[] bArr) {
    }

    public final void a(abif abifVar) {
        this.a.add(new WeakReference(abifVar));
    }

    public final void b(abif abifVar, boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            abif abifVar2 = (abif) ((WeakReference) it.next()).get();
            if (abifVar2 != null && !abifVar2.equals(abifVar)) {
                abifVar2.d(z);
            }
        }
    }

    public final void c(imm immVar) {
        this.a.add(new WeakReference(immVar));
    }

    public abig() {
    }
}
