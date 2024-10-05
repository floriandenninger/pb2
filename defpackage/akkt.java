package defpackage;

import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akkt implements abdr {
    public final List a;
    private final aadw b;

    public akkt(aadw aadwVar, Executor executor, PackageManager packageManager) {
        aadwVar.getClass();
        this.b = aadwVar;
        executor.getClass();
        this.a = new ArrayList();
        executor.execute(new akks(this, packageManager));
    }

    @Override // defpackage.abdr
    public final void no(abdu abduVar) {
        atej atejVar = this.b.b().k;
        if (atejVar == null) {
            atejVar = atej.a;
        }
        apet apetVar = atejVar.m;
        if (apetVar == null) {
            apetVar = apet.a;
        }
        atej atejVar2 = this.b.b().k;
        if (atejVar2 == null) {
            atejVar2 = atej.a;
        }
        if ((atejVar2.b & 131072) != 0) {
            synchronized (this) {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    Integer I = ahbx.I((String) it.next(), apetVar);
                    if (I != null) {
                        abduVar.d(I.intValue());
                    }
                }
            }
        }
    }
}
