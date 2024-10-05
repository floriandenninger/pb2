package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class qez implements Runnable {
    public final /* synthetic */ qfd a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ qez(qfd qfdVar, int i, int i2) {
        this.c = i2;
        this.a = qfdVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            qfd qfdVar = this.a;
            int i2 = this.b;
            if (i2 == 0) {
                qfe qfeVar = qfdVar.a;
                qfeVar.u = 2;
                qfeVar.c = true;
                qfeVar.d = true;
                synchronized (qfeVar.t) {
                    Iterator it = qfdVar.a.t.iterator();
                    while (it.hasNext()) {
                        ((prh) it.next()).t();
                    }
                }
                return;
            }
            qfe qfeVar2 = qfdVar.a;
            qfeVar2.u = 1;
            synchronized (qfeVar2.t) {
                Iterator it2 = qfdVar.a.t.iterator();
                while (it2.hasNext()) {
                    ((prh) it2.next()).u(i2);
                }
            }
            qfdVar.a.h();
            return;
        }
        if (i == 1) {
            qfd qfdVar2 = this.a;
            qfdVar2.a.v.y(this.b);
            return;
        }
        if (i == 2) {
            qfd qfdVar3 = this.a;
            int i3 = this.b;
            qfe qfeVar3 = qfdVar3.a;
            qfeVar3.n = -1;
            qfeVar3.o = -1;
            qfeVar3.j = null;
            qfeVar3.k = null;
            qfeVar3.l = 0.0d;
            qfeVar3.n();
            qfeVar3.m = false;
            qfeVar3.p = null;
            qfe qfeVar4 = qfdVar3.a;
            qfeVar4.u = 1;
            synchronized (qfeVar4.t) {
                Iterator it3 = qfdVar3.a.t.iterator();
                while (it3.hasNext()) {
                    ((prh) it3.next()).w(i3);
                }
            }
            qfdVar3.a.h();
            qfe qfeVar5 = qfdVar3.a;
            qfeVar5.o(qfeVar5.b);
            return;
        }
        qfd qfdVar4 = this.a;
        int i4 = this.b;
        qfe qfeVar6 = qfdVar4.a;
        qfeVar6.u = 3;
        synchronized (qfeVar6.t) {
            Iterator it4 = qfdVar4.a.t.iterator();
            while (it4.hasNext()) {
                ((prh) it4.next()).v(i4);
            }
        }
    }
}
