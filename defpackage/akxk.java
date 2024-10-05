package defpackage;

import java.util.Collections;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akxk extends aase {
    public akxk(ajoy ajoyVar, afsx afsxVar, aone aoneVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, afsxVar, "upload/feedback", aoneVar, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final void c() {
        aone aoneVar = (aone) a();
        amkq.O(((asdt) aoneVar.instance).d.size() + ((asdt) aoneVar.instance).e.size() > 0, "Empty feedback polling request");
        for (avtt avttVar : Collections.unmodifiableList(((asdt) aoneVar.instance).d)) {
            amkq.O((!avttVar.c.isEmpty() ? 1 : 0) + (!avttVar.d.isEmpty() ? 1 : 0) == 1, "Exactly one feedback id needs to be specified");
        }
        Iterator it = Collections.unmodifiableList(((asdt) aoneVar.instance).e).iterator();
        while (it.hasNext()) {
            amkq.O(!((String) it.next()).isEmpty(), "Empty feedback continuation");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aaqh
    public final boolean p() {
        return false;
    }
}
