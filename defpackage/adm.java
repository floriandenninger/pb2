package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class adm implements adj {
    public static final Comparator a;
    protected final TreeMap b;

    static {
        bea beaVar = bea.b;
        a = beaVar;
        new adm(new TreeMap(beaVar));
    }

    public adm(TreeMap treeMap) {
        this.b = treeMap;
    }

    public static void c(adj adjVar) {
        Set<adi> unmodifiableSet;
        if (adm.class.equals(adjVar.getClass())) {
            return;
        }
        TreeMap treeMap = new TreeMap(a);
        adm admVar = (adm) adjVar;
        for (adh adhVar : Collections.unmodifiableSet(admVar.b.keySet())) {
            Map map = (Map) admVar.b.get(adhVar);
            if (map == null) {
                unmodifiableSet = Collections.emptySet();
            } else {
                unmodifiableSet = Collections.unmodifiableSet(map.keySet());
            }
            ArrayMap arrayMap = new ArrayMap();
            for (adi adiVar : unmodifiableSet) {
                Map map2 = (Map) admVar.b.get(adhVar);
                if (map2 == null) {
                    throw new IllegalArgumentException("Option does not exist: " + adhVar);
                }
                if (!map2.containsKey(adiVar)) {
                    throw new IllegalArgumentException("Option does not exist: " + adhVar + " with priority=" + adiVar);
                }
                arrayMap.put(adiVar, map2.get(adiVar));
            }
            treeMap.put(adhVar, arrayMap);
        }
        new adm(treeMap);
    }

    @Override // defpackage.adj
    public final Object a(adh adhVar) {
        try {
            Map map = (Map) this.b.get(adhVar);
            if (map == null) {
                throw new IllegalArgumentException("Option does not exist: " + adhVar);
            }
            return map.get((adi) Collections.min(map.keySet()));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
