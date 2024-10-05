package androidx.work;

import defpackage.bxw;
import defpackage.byr;
import defpackage.byv;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class OverwritingInputMerger extends byv {
    @Override // defpackage.byv
    public final byr a(List list) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashMap2.putAll(((byr) it.next()).c());
        }
        bxw.b(hashMap2, hashMap);
        return bxw.a(hashMap);
    }
}
