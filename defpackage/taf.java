package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class taf {
    static final sxc a = sxc.a().a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dha a(dhe dheVar, szo szoVar, sxc sxcVar, AtomicReference atomicReference, AtomicReference atomicReference2) {
        if (atomicReference2.get() == null || ((WeakReference) atomicReference2.get()).get() != szoVar) {
            atomicReference2.set(new WeakReference(szoVar));
            atomicReference.set(null);
        }
        dha dhaVar = (dha) atomicReference.get();
        if (dhaVar != null) {
            return dhaVar;
        }
        dha a2 = szoVar.a(dheVar, sxcVar);
        atomicReference.set(a2);
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(baql baqlVar, baql baqlVar2) {
        baqlVar.a = new AtomicReference();
        baqlVar2.a = new AtomicReference();
    }
}
