package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aygu extends aygq {
    final /* synthetic */ ayhf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aygu(ayhg ayhgVar, ayhf ayhfVar) {
        super(ayhgVar.a);
        this.a = ayhfVar;
    }

    @Override // defpackage.aygq
    public final void a() {
        List list;
        ayhf ayhfVar = this.a;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (ayhfVar) {
                if (ayhfVar.b.isEmpty()) {
                    ayhfVar.b = null;
                    ayhfVar.a = true;
                    return;
                } else {
                    list = ayhfVar.b;
                    ayhfVar.b = arrayList;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            list.clear();
            arrayList = list;
        }
    }
}
