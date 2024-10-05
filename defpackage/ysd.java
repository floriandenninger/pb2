package defpackage;

import java.util.HashMap;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ysd extends HashMap {
    public ysd(int i) {
        super(i, 1.0f);
    }

    private static Object a(Object obj) {
        return obj instanceof String ? b((String) obj) : obj;
    }

    private static String b(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.ENGLISH);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return super.containsKey(a(obj));
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        return super.get(a(obj));
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put(b((String) obj), obj2);
    }
}
