package defpackage;

import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alrn {
    public Integer a;
    private Map b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final alro a() {
        c(Collections.unmodifiableMap(b()));
        Map map = this.b;
        if (map == null) {
            throw new IllegalStateException("Missing required properties: splitInstallErrorCodeByModule");
        }
        return new alro(this.a, map);
    }

    public final Map b() {
        Map map = this.b;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
    }

    public final void c(Map map) {
        if (map == null) {
            throw new NullPointerException("Null splitInstallErrorCodeByModule");
        }
        this.b = map;
    }
}
