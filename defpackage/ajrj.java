package defpackage;

import android.database.DataSetObserver;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajrj extends DataSetObserver {
    final /* synthetic */ ajrk a;

    public ajrj(ajrk ajrkVar) {
        this.a = ajrkVar;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        ajrk ajrkVar = this.a;
        atsu a = ajrkVar.e.a();
        if (a == null) {
            ajrkVar.b();
            return;
        }
        Iterator it = a.h.iterator();
        while (it.hasNext()) {
            ajrn.a((apxf) it.next(), ajrkVar);
        }
        ajrkVar.d(!a.f);
    }
}
