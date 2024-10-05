package defpackage;

import com.facebook.litho.ComponentTree;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhq implements Callable {
    final /* synthetic */ dhr a;

    public dhq(dhr dhrVar) {
        this.a = dhrVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        djx djxVar;
        djx djxVar2;
        dhe dheVar;
        synchronized (this.a) {
            djxVar = null;
            if (!this.a.j) {
                dhr dhrVar = this.a;
                ComponentTree componentTree = dhrVar.k;
                dhr dhrVar2 = true != componentTree.z ? null : dhrVar;
                synchronized (componentTree) {
                    dlr a = dlr.a(dhrVar.k.w);
                    djxVar2 = dhrVar.k.v;
                    dheVar = new dhe(dhrVar.a, a, dhrVar.l, (djw) null, (byte[]) null, (byte[]) null, (byte[]) null);
                    dhrVar.k.d.a(a);
                }
                djx n = djx.n(dheVar, dhrVar.b, dhrVar2, dhrVar.k.x, dhrVar.c, dhrVar.d, dhrVar.e, djxVar2, dhrVar.h, dhrVar.i);
                synchronized (this.a) {
                    if (!this.a.j) {
                        djxVar = n;
                    }
                }
            }
        }
        return djxVar;
    }
}
