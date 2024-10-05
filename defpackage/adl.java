package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adl extends adm implements adk {
    private static final adi c = adi.OPTIONAL;

    public adl(TreeMap treeMap) {
        super(treeMap);
    }

    @Override // defpackage.adk
    public final void b(adh adhVar, Object obj) {
        adi adiVar = c;
        Map map = (Map) this.b.get(adhVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            this.b.put(adhVar, arrayMap);
            arrayMap.put(adiVar, obj);
            return;
        }
        adi adiVar2 = (adi) Collections.min(map.keySet());
        if (map.get(adiVar2).equals(obj) || ((adiVar2 != adi.ALWAYS_OVERRIDE || adiVar != adi.ALWAYS_OVERRIDE) && (adiVar2 != adi.REQUIRED || adiVar != adi.REQUIRED))) {
            map.put(adiVar, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + adhVar.a + ", existing value (" + adiVar2 + ")=" + map.get(adiVar2) + ", conflicting (" + adiVar + ")=" + obj);
    }
}
