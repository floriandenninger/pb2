package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayuy extends ayph {
    final aypk[] a;

    public ayuy(aypk[] aypkVarArr) {
        this.a = aypkVarArr;
    }

    @Override // defpackage.ayph
    public final void V(aypi aypiVar) {
        ayqw ayqwVar = new ayqw();
        ayux ayuxVar = new ayux(aypiVar, new AtomicBoolean(), ayqwVar);
        aypiVar.se(ayqwVar);
        aypk[] aypkVarArr = this.a;
        for (int i = 0; i < 2; i++) {
            aypk aypkVar = aypkVarArr[i];
            if (ayqwVar.b) {
                return;
            }
            if (aypkVar != null) {
                aypkVar.U(ayuxVar);
            } else {
                ayqwVar.qc();
                ayuxVar.b(new NullPointerException("A completable source is null"));
                return;
            }
        }
        ayuxVar.sh();
    }
}
