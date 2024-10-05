package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayad {
    public static final ayad a = new ayad(new ayaa(1), ayaa.a);
    private final ConcurrentMap b = new ConcurrentHashMap();

    public ayad(ayac... ayacVarArr) {
        for (ayac ayacVar : ayacVarArr) {
            this.b.put(ayacVar.b(), ayacVar);
        }
    }
}
