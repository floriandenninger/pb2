package defpackage;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nrj {
    public final Set a = new HashSet();
    public final ArrayDeque b = new ArrayDeque();
    public final nrb c;

    public nrj(nrb nrbVar, boolean z) {
        g(nrbVar, z);
        this.c = nrbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.b.size();
    }

    public final nrb b() {
        return (nrb) this.b.peek();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ammv c() {
        if (this.b.size() <= 1) {
            return amlr.a;
        }
        nrb nrbVar = (nrb) this.b.pop();
        this.a.remove(nrbVar.a);
        nrbVar.a(4);
        return ammv.j(nrbVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((nrb) it.next()).a(4);
        }
        this.b.clear();
        this.a.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((nrb) it.next()).a(3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(String str) {
        if (!h(str)) {
            return;
        }
        int size = this.b.size();
        while (true) {
            size--;
            if (size <= 0) {
                return;
            }
            nrb nrbVar = (nrb) this.b.peek();
            if (str.equals(nrbVar.a)) {
                return;
            }
            this.b.pop();
            this.a.remove(nrbVar.a);
            nrbVar.a(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(nrb nrbVar, boolean z) {
        if (h(nrbVar.a)) {
            f(nrbVar.a);
            return;
        }
        this.b.push(nrbVar);
        this.a.add(nrbVar.a);
        if (z) {
            nrbVar.a(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(String str) {
        return this.a.contains(str);
    }
}
