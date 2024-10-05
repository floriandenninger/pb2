package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yyo {
    public final Executor a;
    volatile int e;
    volatile int f;
    volatile int g;
    volatile int h;
    volatile boolean i;
    volatile int j;
    public final shf k;
    final Deque c = new ArrayDeque();
    final List d = new ArrayList();
    public final azrj b = azrj.W();

    public yyo(Executor executor, shf shfVar) {
        this.a = executor;
        this.k = shfVar;
    }

    public final synchronized int a() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(ArrayList arrayList) {
        if (this.i) {
            this.j += arrayList.size();
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            yyp yypVar = (yyp) arrayList.get(i);
            if (yypVar.h) {
                this.c.addFirst(yypVar);
            } else {
                this.c.addLast(yypVar);
            }
        }
        h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(int i) {
        this.h += i;
        h();
    }

    public final synchronized void d(List list) {
        list.addAll(this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e(int i) {
        this.e += i;
    }

    public final synchronized void f() {
        this.d.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        if (!this.i || this.f < this.e - this.j) {
            return;
        }
        this.b.sh();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        ArrayList arrayList;
        yyp yypVar;
        synchronized (this) {
            arrayList = null;
            while (this.g < this.h && (yypVar = (yyp) this.c.pollFirst()) != null) {
                this.g++;
                if (arrayList == null) {
                    arrayList = new ArrayList(16);
                }
                arrayList.add(yypVar);
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                yyp yypVar2 = (yyp) arrayList.get(i);
                yypVar2.b(this, true);
                this.a.execute(yypVar2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void i() {
        this.i = true;
        g();
    }
}
