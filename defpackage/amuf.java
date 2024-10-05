package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amuf extends ampa {
    final /* synthetic */ Map.Entry a;

    public amuf(Map.Entry entry) {
        this.a = entry;
    }

    @Override // defpackage.ampa, java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // defpackage.ampa, java.util.Map.Entry
    public final Object getValue() {
        return this.a.getValue();
    }
}
