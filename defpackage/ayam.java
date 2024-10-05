package defpackage;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayam {
    static final ammr a = new ammr(",");
    public static final ayam b = a().b(new ayaa(1), true).b(ayaa.a, false);
    public final Map c;
    public final byte[] d;

    private ayam() {
        this.c = new LinkedHashMap(0);
        this.d = new byte[0];
    }

    public static ayam a() {
        return new ayam();
    }

    public final ayam b(ayak ayakVar, boolean z) {
        return new ayam(ayakVar, z, this);
    }

    private ayam(ayak ayakVar, boolean z, ayam ayamVar) {
        String b2 = ayakVar.b();
        amkq.F(!b2.contains(","), "Comma is currently not allowed in message encoding");
        int size = ayamVar.c.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(ayamVar.c.containsKey(ayakVar.b()) ? size : size + 1);
        for (ayal ayalVar : ayamVar.c.values()) {
            String b3 = ayalVar.a.b();
            if (!b3.equals(b2)) {
                linkedHashMap.put(b3, new ayal(ayalVar.a, ayalVar.b));
            }
        }
        linkedHashMap.put(b2, new ayal(ayakVar, z));
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.c = unmodifiableMap;
        ammr ammrVar = a;
        HashSet hashSet = new HashSet(unmodifiableMap.size());
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            if (((ayal) entry.getValue()).b) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.d = ammrVar.d(Collections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }
}
