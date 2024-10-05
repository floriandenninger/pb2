package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jrt implements anhh {
    final /* synthetic */ jru a;
    private final /* synthetic */ int b;

    public jrt(jru jruVar, int i) {
        this.b = i;
        this.a = jruVar;
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
    }

    @Override // defpackage.anhh
    public final /* synthetic */ void b(Object obj) {
        if (this.b == 0) {
            ammv ammvVar = (ammv) obj;
            anhy anhyVar = this.a.c;
            if (anhyVar == null || anhyVar.isCancelled()) {
                return;
            }
            this.a.d(ammvVar != null && ammvVar.h() && ((agnv) ammvVar.c()).i() == agnq.PLAYABLE);
            return;
        }
        List list = (List) obj;
        anhy anhyVar2 = this.a.d;
        if (anhyVar2 == null || anhyVar2.isCancelled()) {
            return;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((agnv) it.next()).i() == agnq.PLAYABLE) {
                    this.a.d(true);
                    return;
                }
            }
        }
        this.a.d(false);
    }
}
