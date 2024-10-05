package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class anuy implements anwd, anwc {
    private final Executor c;
    private final Map b = new HashMap();
    public Queue a = new ArrayDeque();

    public anuy(Executor executor) {
        this.c = executor;
    }

    public final synchronized Set a(anwa anwaVar) {
        Map map;
        map = (Map) this.b.get(anwaVar.a());
        return map == null ? Collections.emptySet() : map.entrySet();
    }

    @Override // defpackage.anwd
    public final void b(Class cls, anwb anwbVar) {
        c(cls, this.c, anwbVar);
    }

    @Override // defpackage.anwd
    public final synchronized void c(Class cls, Executor executor, anwb anwbVar) {
        aocz.ae(anwbVar);
        aocz.ae(executor);
        if (!this.b.containsKey(cls)) {
            this.b.put(cls, new ConcurrentHashMap());
        }
        ((ConcurrentHashMap) this.b.get(cls)).put(anwbVar, executor);
    }
}
