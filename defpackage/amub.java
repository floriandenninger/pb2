package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amub extends ampa {
    final /* synthetic */ Map.Entry a;
    final /* synthetic */ amuh b;

    public amub(Map.Entry entry, amuh amuhVar) {
        this.a = entry;
        this.b = amuhVar;
    }

    @Override // defpackage.ampa, java.util.Map.Entry
    public final Object getKey() {
        return this.a.getKey();
    }

    @Override // defpackage.ampa, java.util.Map.Entry
    public final Object getValue() {
        amuh amuhVar = this.b;
        this.a.getKey();
        return amuhVar.a(this.a.getValue());
    }
}
