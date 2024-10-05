package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cru extends WeakReference {
    final cqi a;
    final boolean b;
    ctd c;

    public cru(cqi cqiVar, csx csxVar, ReferenceQueue referenceQueue, boolean z) {
        super(csxVar, referenceQueue);
        did.ap(cqiVar);
        this.a = cqiVar;
        ctd ctdVar = null;
        if (csxVar.a && z) {
            ctdVar = csxVar.b;
            did.ap(ctdVar);
        }
        this.c = ctdVar;
        this.b = csxVar.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.c = null;
        clear();
    }
}
