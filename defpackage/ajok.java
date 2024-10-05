package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajok extends acrd {
    public final aeg d;
    private Map e;

    public ajok() {
        this.d = new aeg();
    }

    public final int b(String str, int i) {
        Object obj = this.d.get(str);
        return obj instanceof Integer ? ((Integer) obj).intValue() : i;
    }

    public final Object c(String str) {
        return this.d.get(str);
    }

    public final Object d(String str, Object obj) {
        Object obj2 = this.d.get(str);
        return obj2 == null ? obj : obj2;
    }

    public final Map e() {
        Map map = this.e;
        return map == null ? Collections.emptyMap() : map;
    }

    public final void f(String str, Object obj) {
        this.d.put(str, obj);
    }

    public final void g(Map map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        if (this.e == null) {
            this.e = new HashMap();
        }
        this.e.putAll(map);
    }

    public final void h() {
        this.a = acra.l;
        this.d.clear();
        Map map = this.e;
        if (map != null) {
            map.clear();
        }
    }

    public final void i(ajok ajokVar) {
        ajokVar.getClass();
        h();
        this.a = ajokVar.a;
        this.b = ajokVar.b;
        g(ajokVar.e);
        this.d.k(ajokVar.d);
    }

    public final boolean j(String str, boolean z) {
        Object obj = this.d.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z;
    }

    public final String k(String str) {
        Object obj = this.d.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public ajok(ajok ajokVar) {
        this();
        i(ajokVar);
    }
}
