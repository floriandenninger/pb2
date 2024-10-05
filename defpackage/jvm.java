package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jvm implements ykl {
    final /* synthetic */ Map a;

    public jvm(Map map) {
        this.a = map;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        String str = (String) obj;
        if (this.a.containsKey(str)) {
            ((ykl) this.a.get(str)).a(str, exc);
        }
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        String str = (String) obj;
        Boolean bool = (Boolean) obj2;
        if (this.a.containsKey(str)) {
            ((ykl) this.a.get(str)).b(str, bool);
        }
    }
}
