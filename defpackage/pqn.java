package defpackage;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class pqn implements ppx {
    private final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public long c;
    private final PriorityQueue d;
    private pql e;
    private long f;

    public pqn() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new pql());
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new pqm(new asx() { // from class: pqk
                @Override // defpackage.asx
                public final void a(asy asyVar) {
                    pqn pqnVar = pqn.this;
                    pqm pqmVar = (pqm) asyVar;
                    pqmVar.clear();
                    pqnVar.b.add(pqmVar);
                }
            }));
        }
        this.d = new PriorityQueue();
    }

    private final void l(pql pqlVar) {
        pqlVar.clear();
        this.a.add(pqlVar);
    }

    @Override // defpackage.ast
    public final /* bridge */ /* synthetic */ Object a() {
        pse.g(this.e == null);
        if (this.a.isEmpty()) {
            return null;
        }
        pql pqlVar = (pql) this.a.pollFirst();
        this.e = pqlVar;
        return pqlVar;
    }

    @Override // defpackage.ast
    public void d() {
        this.f = 0L;
        this.c = 0L;
        while (!this.d.isEmpty()) {
            pql pqlVar = (pql) this.d.poll();
            int i = pts.a;
            l(pqlVar);
        }
        pql pqlVar2 = this.e;
        if (pqlVar2 != null) {
            l(pqlVar2);
            this.e = null;
        }
    }

    @Override // defpackage.ast
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        ppz ppzVar = (ppz) obj;
        pse.e(ppzVar == this.e);
        pql pqlVar = (pql) ppzVar;
        if (pqlVar.isDecodeOnly()) {
            l(pqlVar);
        } else {
            long j = this.f;
            this.f = 1 + j;
            pqlVar.g = j;
            this.d.add(pqlVar);
        }
        this.e = null;
    }

    @Override // defpackage.ast
    public void f() {
    }

    protected abstract ppw h();

    @Override // defpackage.ast
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public pqa b() {
        if (!this.b.isEmpty()) {
            while (!this.d.isEmpty()) {
                pql pqlVar = (pql) this.d.peek();
                int i = pts.a;
                if (pqlVar.d > this.c) {
                    break;
                }
                pql pqlVar2 = (pql) this.d.poll();
                if (!pqlVar2.isEndOfStream()) {
                    j(pqlVar2);
                    if (!k()) {
                        l(pqlVar2);
                    } else {
                        ppw h = h();
                        pqa pqaVar = (pqa) this.b.pollFirst();
                        pqaVar.e(pqlVar2.d, h, Long.MAX_VALUE);
                        l(pqlVar2);
                        return pqaVar;
                    }
                } else {
                    pqa pqaVar2 = (pqa) this.b.pollFirst();
                    pqaVar2.addFlag(4);
                    l(pqlVar2);
                    return pqaVar2;
                }
            }
        }
        return null;
    }

    protected abstract void j(ppz ppzVar);

    protected abstract boolean k();

    @Override // defpackage.ppx
    public final void w(long j) {
        this.c = j;
    }
}
