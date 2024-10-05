package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class daz extends BroadcastReceiver {
    final /* synthetic */ dba a;

    public daz(dba dbaVar) {
        this.a = dbaVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ArrayList arrayList;
        dba dbaVar = this.a;
        boolean z = dbaVar.a;
        dbaVar.a = dba.d(context);
        dba dbaVar2 = this.a;
        if (z != dbaVar2.a) {
            synchronized (dbaVar2) {
                arrayList = new ArrayList(this.a.b);
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                coq coqVar = (coq) arrayList.get(i);
                if (this.a.a) {
                    synchronized (coqVar.b) {
                        day dayVar = coqVar.a;
                        for (dbs dbsVar : ddn.h(dayVar.a)) {
                            if (!dbsVar.l() && !dbsVar.k()) {
                                dbsVar.c();
                                if (!dayVar.c) {
                                    dbsVar.b();
                                } else {
                                    dayVar.b.add(dbsVar);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
