package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class agjo implements Runnable {
    final /* synthetic */ agjs a;

    public agjo(agjs agjsVar) {
        this.a = agjsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        agjs agjsVar = this.a;
        agjsVar.f.close();
        try {
            if (agjsVar.i != null) {
                List g = agjsVar.b.g();
                for (agjy agjyVar : agjsVar.i.b()) {
                    if (agjyVar.b() == agnf.COMPLETE || agjyVar.b() == agnf.REQUIRES_CONTENT_VERIFICATION) {
                        agjm a = agjsVar.i.a(agjyVar.c().f());
                        if (a != null) {
                            agnm c = a.c();
                            agnm a2 = a.a();
                            boolean z = false;
                            if (agjsVar.o(c, g) && agjsVar.o(a2, g)) {
                                z = true;
                            }
                            a.f(z);
                        }
                    }
                }
                Iterator it = agjsVar.g.iterator();
                while (it.hasNext()) {
                    ((agfo) it.next()).a.v(new agkk());
                }
            }
        } finally {
            agjsVar.f.open();
        }
    }
}
