package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ymg extends LinkedHashMap {
    final /* synthetic */ ymh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymg(ymh ymhVar, int i) {
        super(i, 0.75f, true);
        this.a = ymhVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(Map.Entry entry) {
        int size = this.a.b.size();
        ymh ymhVar = this.a;
        if (size <= ymhVar.a) {
            return false;
        }
        ymhVar.b(entry.getKey());
        return false;
    }
}
