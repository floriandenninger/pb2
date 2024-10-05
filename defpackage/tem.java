package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tem implements tej {
    final /* synthetic */ tdu a;

    public tem(tdu tduVar) {
        this.a = tduVar;
    }

    @Override // defpackage.tej
    public final String a(Map map) {
        if (!map.containsKey(this.a)) {
            return null;
        }
        if (map.get(this.a) instanceof Boolean) {
            return true != ((Boolean) map.get(this.a)).booleanValue() ? "0" : "1";
        }
        return String.valueOf(map.get(this.a));
    }
}
