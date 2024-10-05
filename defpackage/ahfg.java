package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahfg implements aheq {
    private final Set a = Collections.newSetFromMap(new WeakHashMap());

    public ahfg(aheq... aheqVarArr) {
        for (int i = 0; i < 2; i++) {
            a(aheqVarArr[i]);
        }
    }

    public final void a(aheq aheqVar) {
        this.a.add(aheqVar);
    }

    @Override // defpackage.aheq
    public final void kV() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((aheq) it.next()).kV();
        }
    }

    @Override // defpackage.aheq
    public final void m(atzm atzmVar, boolean z) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((aheq) it.next()).m(atzmVar, z);
        }
    }

    @Override // defpackage.aheq
    public final void n(long j, long j2) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((aheq) it.next()).n(j, j2);
        }
    }
}
