package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azuh implements azux, azug {
    private static final Map a;
    private static final HashMap b;
    private static final HashMap c;
    private static final HashMap d;
    private final Class e;

    static {
        Map map;
        List h = aype.h(new Class[]{aztj.class, aztu.class, azty.class, aztz.class, azua.class, azub.class, azuc.class, azud.class, azue.class, azuf.class, aztk.class, aztl.class, aztm.class, aztn.class, azto.class, aztp.class, aztq.class, aztr.class, azts.class, aztt.class, aztv.class, aztw.class, aztx.class});
        ArrayList<azrz> arrayList = new ArrayList(aype.f(h));
        int i = 0;
        for (Object obj : h) {
            int i2 = i + 1;
            if (i < 0) {
                aype.d();
            }
            arrayList.add(aype.k((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        int size = arrayList.size();
        if (size == 0) {
            map = azsi.a;
        } else if (size == 1) {
            azrz azrzVar = (azrz) arrayList.get(0);
            azrzVar.getClass();
            map = Collections.singletonMap(azrzVar.a, azrzVar.b);
            map.getClass();
        } else {
            map = new LinkedHashMap(azth.f(arrayList.size()));
            for (azrz azrzVar2 : arrayList) {
                map.put(azrzVar2.a, azrzVar2.b);
            }
        }
        a = map;
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        b = hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        c = hashMap2;
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        values.getClass();
        for (String str : values) {
            StringBuilder sb = new StringBuilder();
            sb.append("kotlin.jvm.internal.");
            str.getClass();
            sb.append(azul.j(str));
            sb.append("CompanionObject");
            azrz k = aype.k(sb.toString(), str + ".Companion");
            hashMap3.put(k.a, k.b);
        }
        for (Map.Entry entry : a.entrySet()) {
            Class cls = (Class) entry.getKey();
            int intValue = ((Number) entry.getValue()).intValue();
            hashMap3.put(cls.getName(), "kotlin.Function" + intValue);
        }
        d = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(azth.f(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), azul.j((String) entry2.getValue()));
        }
    }

    public azuh(Class cls) {
        this.e = cls;
    }

    @Override // defpackage.azug
    public final Class a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof azuh) && azul.c(azuj.a(this), azuj.a((azux) obj));
    }

    public final int hashCode() {
        return azuj.a(this).hashCode();
    }

    public final String toString() {
        return this.e.toString() + " (Kotlin reflection is not available)";
    }
}
