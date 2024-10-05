package defpackage;

import android.os.Looper;
import android.os.MessageQueue;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class agfl implements Runnable {
    public final /* synthetic */ agfp a;
    private final /* synthetic */ int b;

    public /* synthetic */ agfl(agfp agfpVar, int i) {
        this.b = i;
        this.a = agfpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List e;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                this.a.l.h();
                return;
            }
            if (i == 2) {
                agfp agfpVar = this.a;
                agfpVar.t.h();
                agfpVar.f48J.y();
                return;
            } else if (i == 3) {
                agfp agfpVar2 = this.a;
                agfpVar2.l.k(agfpVar2.G);
                return;
            } else {
                final agfp agfpVar3 = this.a;
                yjk.f();
                Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: agfg
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        agfp agfpVar4 = agfp.this;
                        agfpVar4.k.execute(new agfl(agfpVar4, 3));
                        return false;
                    }
                });
                return;
            }
        }
        agfp agfpVar4 = this.a;
        if (agfpVar4.z()) {
            Iterator it = agfpVar4.f48J.f().iterator();
            while (it.hasNext()) {
                ((agff) agfpVar4.y.get()).x(((agng) it.next()).a);
            }
            aggk aggkVar = (aggk) agfpVar4.z.get();
            yjk.e();
            if (!aggkVar.b.z()) {
                e = amru.q();
            } else {
                e = ((agjl) aggkVar.e.get()).e();
            }
            Iterator it2 = e.iterator();
            while (it2.hasNext()) {
                aggkVar.i(((bagd) it2.next()).a);
            }
            Iterator it3 = agfpVar4.f48J.s().iterator();
            while (it3.hasNext()) {
                ((aghc) agfpVar4.v.get()).G(((agnv) it3.next()).m(), 1);
            }
        }
    }
}
