package defpackage;

import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class afdp {
    public static final afdp a = new afdo();
    private final LinkedList b = new LinkedList();
    private aenk c = aenk.a;
    private aeex d = aeex.a;

    public synchronized void a(List list, int i, aenk aenkVar, aeex aeexVar) {
        if (list.isEmpty()) {
            this.b.clear();
            this.c = aenkVar;
            if (aeexVar == null) {
                aeexVar = aeex.a;
            }
            this.d = aeexVar;
            return;
        }
        long j = ((ozz) list.get(0)).g / 1000;
        long j2 = ((ozz) list.get(i - 1)).h / 1000;
        while (!this.b.isEmpty() && ((afdn) this.b.getFirst()).a < j) {
            this.b.removeFirst();
        }
        while (!this.b.isEmpty() && ((afdn) this.b.getLast()).a >= j2) {
            this.b.removeLast();
        }
        this.b.add(new afdn(j2, aenkVar, aeexVar));
    }

    public final synchronized afdn b(long j) {
        afdn afdnVar = new afdn(j, aenk.a, aeex.a);
        if (!this.b.isEmpty() && j >= ((afdn) this.b.getFirst()).a) {
            while (!this.b.isEmpty() && j >= ((afdn) this.b.getFirst()).a) {
                if (j == ((afdn) this.b.getFirst()).a) {
                    afdnVar = (afdn) this.b.getFirst();
                }
                this.b.removeFirst();
            }
            return afdnVar;
        }
        afdn afdnVar2 = new afdn(j, this.c, this.d);
        this.d = aeex.a;
        this.c = aenk.a;
        return afdnVar2;
    }

    public final synchronized void c() {
        this.b.clear();
        this.c = aenk.a;
    }
}
