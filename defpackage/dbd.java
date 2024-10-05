package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbd implements daq {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.daq
    public final void k() {
        Iterator it = ddn.h(this.a).iterator();
        while (it.hasNext()) {
            ((dcl) it.next()).k();
        }
    }

    @Override // defpackage.daq
    public final void l() {
        Iterator it = ddn.h(this.a).iterator();
        while (it.hasNext()) {
            ((dcl) it.next()).l();
        }
    }

    @Override // defpackage.daq
    public final void m() {
        Iterator it = ddn.h(this.a).iterator();
        while (it.hasNext()) {
            ((dcl) it.next()).m();
        }
    }
}
