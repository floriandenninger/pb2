package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ucb {
    private final Map a = new HashMap();
    private final uca b;

    public ucb(uca ucaVar) {
        this.b = ucaVar;
    }

    public final synchronized Object a(String str) {
        Object obj = this.a.get(str);
        if (obj != null) {
            return obj;
        }
        Object a = this.b.a(str);
        this.a.put(str, a);
        return a;
    }
}
