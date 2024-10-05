package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bxw {
    private bxw() {
    }

    public static final byr a(Map map) {
        byr byrVar = new byr(map);
        byr.e(byrVar);
        return byrVar;
    }

    public static final void b(Map map, Map map2) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                map2.put(str, null);
            } else {
                Class<?> cls = value.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    map2.put(str, value);
                } else if (cls == boolean[].class) {
                    map2.put(str, byr.f((boolean[]) value));
                } else if (cls == byte[].class) {
                    map2.put(str, byr.g((byte[]) value));
                } else if (cls == int[].class) {
                    map2.put(str, byr.j((int[]) value));
                } else if (cls == long[].class) {
                    map2.put(str, byr.k((long[]) value));
                } else if (cls == float[].class) {
                    map2.put(str, byr.i((float[]) value));
                } else if (cls == double[].class) {
                    map2.put(str, byr.h((double[]) value));
                } else {
                    throw new IllegalArgumentException(String.format("Key %s has invalid type %s", str, cls));
                }
            }
        }
    }

    public static final void c(String str, byte[] bArr, Map map) {
        map.put(str, byr.g(bArr));
    }

    public static final void d(String str, String str2, Map map) {
        map.put(str, str2);
    }
}
