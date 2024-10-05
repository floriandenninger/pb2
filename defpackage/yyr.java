package defpackage;

import java.security.InvalidParameterException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yyr {
    private static final ThreadLocal d = new ThreadLocal();
    public final yyo[] a;
    public final List b = new CopyOnWriteArrayList();
    public final AtomicReference c;
    private final yys e;
    private final String f;
    private volatile ayqx g;

    public yyr(yys yysVar, String str) {
        this.e = yysVar;
        this.f = str;
        shf shfVar = null;
        if (yysVar.a) {
            this.c = new AtomicReference();
            shfVar = yysVar.e;
        } else {
            this.c = null;
        }
        this.a = new yyo[]{new yyo(yysVar.c(), shfVar), new yyo((Executor) yysVar.d.get(), shfVar)};
    }

    public static yyp a() {
        Deque deque = (Deque) d.get();
        if (deque == null) {
            return null;
        }
        return (yyp) deque.peek();
    }

    public static yyq b(int i) {
        return new yyq(i, ayph.f());
    }

    public static yyq c(int i, ayph ayphVar) {
        return new yyq(i, ayphVar);
    }

    public static void j(yyp yypVar) {
        Deque deque = (Deque) d.get();
        if (deque == null || deque.isEmpty() || yypVar != deque.peek()) {
            yyx yyxVar = yypVar.d;
            if (yyxVar != null) {
                StringBuilder sb = new StringBuilder("Invalid popCurrentThreadTask. ");
                if (deque == null) {
                    sb.append("tasks=null");
                } else {
                    sb.append("task:");
                    sb.append(yypVar.b);
                    sb.append(" not first in: ");
                    Iterator it = deque.iterator();
                    while (it.hasNext()) {
                        sb.append(((yyp) it.next()).b);
                    }
                }
                yyxVar.g = new InvalidParameterException(sb.toString());
                return;
            }
            return;
        }
        deque.pop();
    }

    public static void k(yyp yypVar) {
        ThreadLocal threadLocal = d;
        Deque deque = (Deque) threadLocal.get();
        if (deque == null) {
            deque = new ArrayDeque();
            threadLocal.set(deque);
        }
        deque.push(yypVar);
    }

    public final ayph d() {
        yyo[] yyoVarArr = this.a;
        return ayph.y(yyoVarArr[0].b, yyoVarArr[1].b);
    }

    public final void e(int i, int i2) {
        if (i2 == 0) {
            return;
        }
        if (this.e.a && this.c.get() == null) {
            final yyx yyxVar = new yyx(this.f, this.a[i].k, 4);
            if (this.c.compareAndSet(null, yyxVar)) {
                yyxVar.b();
                d().S(new ayrm() { // from class: yyj
                    @Override // defpackage.ayrm
                    public final void a() {
                        yyx.this.a();
                    }
                }, new ayrs() { // from class: yyn
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        yyx yyxVar2 = yyx.this;
                        yyxVar2.g = (Throwable) obj;
                        yyxVar2.a();
                    }
                });
            }
        }
        this.a[i].c(i2);
    }

    public final void f(int i, int i2, Throwable th) {
        if (th != null) {
            this.b.add(th);
        }
        e(0, i2);
        e(1, i);
    }

    public final void g(ayph ayphVar, final int i, final int i2) {
        ayphVar.B(azre.b(this.e.c())).S(new ayrm() { // from class: yyh
            @Override // defpackage.ayrm
            public final void a() {
                yyr.this.f(i, i2, null);
            }
        }, new ayrs() { // from class: yyl
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                yyr.this.f(i, i2, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        this.a[0].b.sh();
        this.a[1].b.sh();
    }

    public final void i() {
        this.a[0].i();
        this.a[1].i();
    }

    public final synchronized void l(long j, ayqi ayqiVar) {
        if (this.g != null) {
            ayrz.c((AtomicReference) this.g);
        }
        this.g = ayph.G(j, TimeUnit.MILLISECONDS, ayqiVar).S(new ayrm() { // from class: yyg
            @Override // defpackage.ayrm
            public final void a() {
                yyr.this.h();
            }
        }, new ayrs() { // from class: yyk
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                yyr yyrVar = yyr.this;
                yyrVar.b.add((Throwable) obj);
                yyrVar.h();
            }
        });
    }

    public final void m(yyq yyqVar, Throwable th) {
        int i = yyqVar.b;
        if (th != null) {
            this.b.add(th);
            i = 2;
        }
        if (i <= 1) {
            this.a[i].b(yyqVar.c);
            return;
        }
        yyo yyoVar = this.a[this.e.a(i)];
        ArrayList arrayList = yyqVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            yyp yypVar = (yyp) arrayList.get(i2);
            yypVar.b(yyoVar, false);
            if (i == 6) {
                yypVar.run();
                ((ymp) this.e.k.get()).a();
            } else if (i == 3) {
                ((Executor) this.e.i.get()).execute(yypVar);
            } else if (i != 4) {
                yyoVar.a.execute(yypVar);
            } else {
                ((Executor) this.e.j.get()).execute(yypVar);
            }
        }
    }

    public final void n(ayqi ayqiVar, yyq... yyqVarArr) {
        int i = 0;
        int i2 = 0;
        for (final yyq yyqVar : yyqVarArr) {
            if (!yyqVar.c.isEmpty()) {
                if (yyqVar.b != 6) {
                    yyqVar.a.B(ayqiVar).S(new ayrm() { // from class: yyi
                        @Override // defpackage.ayrm
                        public final void a() {
                            yyr.this.m(yyqVar, null);
                        }
                    }, new ayrs() { // from class: yym
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            yyr.this.m(yyqVar, (Throwable) obj);
                        }
                    });
                }
                if (this.e.a(yyqVar.b) == 0) {
                    i += yyqVar.c.size();
                } else {
                    i2 += yyqVar.c.size();
                }
            }
        }
        this.a[0].e(i);
        this.a[1].e(i2);
        for (yyq yyqVar2 : yyqVarArr) {
            if (yyqVar2.b == 6 && !yyqVar2.c.isEmpty()) {
                m(yyqVar2, null);
            }
        }
    }
}
