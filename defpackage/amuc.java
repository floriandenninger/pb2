package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amuc implements amml {
    final /* synthetic */ amuh a;

    public amuc(amuh amuhVar) {
        this.a = amuhVar;
    }

    @Override // defpackage.amml
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        amuh amuhVar = this.a;
        entry.getClass();
        return new amub(entry, amuhVar);
    }
}
