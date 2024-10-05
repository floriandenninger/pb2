package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class jog implements Runnable {
    public final /* synthetic */ joh a;
    private final /* synthetic */ int b;

    public /* synthetic */ jog(joh johVar, int i) {
        this.b = i;
        this.a = johVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            joh johVar = this.a;
            Iterator it = johVar.c.iterator();
            while (it.hasNext()) {
                ((ayqx) it.next()).qc();
            }
            johVar.c.clear();
            return;
        }
        if (i == 1) {
            joh johVar2 = this.a;
            ((ypa) johVar2.b.get()).g(johVar2);
            johVar2.b();
            return;
        }
        this.a.b();
    }
}
