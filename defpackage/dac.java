package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dac implements dap {
    private final Set a = Collections.newSetFromMap(new WeakHashMap());
    private boolean b;
    private boolean c;

    @Override // defpackage.dap
    public final void a(daq daqVar) {
        this.a.add(daqVar);
        if (this.c) {
            daqVar.k();
        } else if (this.b) {
            daqVar.l();
        } else {
            daqVar.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        this.c = true;
        Iterator it = ddn.h(this.a).iterator();
        while (it.hasNext()) {
            ((daq) it.next()).k();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.b = true;
        Iterator it = ddn.h(this.a).iterator();
        while (it.hasNext()) {
            ((daq) it.next()).l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        this.b = false;
        Iterator it = ddn.h(this.a).iterator();
        while (it.hasNext()) {
            ((daq) it.next()).m();
        }
    }

    @Override // defpackage.dap
    public final void e(daq daqVar) {
        this.a.remove(daqVar);
    }
}
