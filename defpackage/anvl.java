package defpackage;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anvl {
    private final String a;
    private Map b = null;

    public anvl(String str) {
        this.a = str;
    }

    public final anvm a() {
        String str = this.a;
        Map map = this.b;
        return new anvm(str, map == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(map)));
    }

    public final void b(Annotation annotation) {
        if (this.b == null) {
            this.b = new HashMap();
        }
        this.b.put(anvv.class, annotation);
    }
}
