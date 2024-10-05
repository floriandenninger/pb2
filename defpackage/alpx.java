package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alpx extends alpq {
    final /* synthetic */ IBinder a;
    final /* synthetic */ alpz b;

    public alpx(alpz alpzVar, IBinder iBinder) {
        this.b = alpzVar;
        this.a = iBinder;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.os.IInterface, java.lang.Object] */
    @Override // defpackage.alpq
    public final void a() {
        alqa alqaVar = this.b.a;
        alqaVar.k = alqaVar.g.a(this.a);
        alqa alqaVar2 = this.b.a;
        try {
            alqaVar2.k.asBinder().linkToDeath(alqaVar2.i, 0);
        } catch (RemoteException e) {
            alqaVar2.l.l(e, "linkToDeath failed", new Object[0]);
        }
        this.b.a.e = false;
        Iterator it = this.b.a.b.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.b.a.b.clear();
    }
}
