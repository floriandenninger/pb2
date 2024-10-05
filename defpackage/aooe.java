package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aooe implements Map.Entry {
    public final Map.Entry a;

    public aooe(Map.Entry entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (((aoog) this.a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof aooy)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        aoog aoogVar = (aoog) this.a.getValue();
        aooy aooyVar = aoogVar.a;
        aoogVar.b = null;
        aoogVar.a = (aooy) obj;
        return aooyVar;
    }
}
