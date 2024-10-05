package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ubs implements ubq {
    private final ammv a;
    private final tzh b;

    public ubs(ammv ammvVar, tzh tzhVar) {
        this.a = ammvVar;
        this.b = tzhVar;
    }

    private static String b(twu twuVar) {
        if (twuVar == null) {
            return null;
        }
        return twuVar.b;
    }

    private static String c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((txb) it.next()).a);
        }
        return TextUtils.join(", ", arrayList);
    }

    @Override // defpackage.ubq
    public final void a(tyr tyrVar) {
        aojx aojxVar;
        String i = tyrVar.i();
        twu c = tyrVar.c();
        List j = tyrVar.j();
        boolean k = tyrVar.k();
        if ("com.google.android.libraries.notifications.NOTIFICATION_CLICKED".equals(i)) {
            tzk.d("EventCallbackHelper", "Notification clicked for account [%s], on threads [%s]", b(c), c(j));
            tzf a = this.b.a(aoic.CLICKED);
            ((tzj) a).w = 2;
            a.d(c);
            a.c(j);
            a.i();
            if (k) {
                return;
            } else {
                return;
            }
        }
        if ("com.google.android.libraries.notifications.NOTIFICATION_DISMISSED".equals(i)) {
            tzk.d("EventCallbackHelper", "Notification removed for account [%s], on threads [%s]", b(c), c(j));
            tzf a2 = this.b.a(aoic.DISMISSED);
            ((tzj) a2).w = 2;
            a2.d(c);
            a2.c(j);
            a2.i();
            ((udb) ((amna) this.a).a).c(j);
            return;
        }
        if ("com.google.android.libraries.notifications.NOTIFICATION_EXPIRED".equals(i)) {
            tzk.d("EventCallbackHelper", "Notification expired for account [%s], on threads [%s]", b(c), c(j));
            tzf a3 = this.b.a(aoic.EXPIRED);
            a3.d(c);
            a3.c(j);
            a3.i();
            return;
        }
        if (TextUtils.isEmpty(i)) {
            return;
        }
        amkq.E(j.size() == 1);
        Iterator it = ((txb) j.get(0)).n.iterator();
        while (true) {
            if (!it.hasNext()) {
                aojxVar = null;
                break;
            }
            twy twyVar = (twy) it.next();
            if (i.equals(twyVar.a)) {
                aojxVar = twyVar.b();
                break;
            }
        }
        txb txbVar = (txb) j.get(0);
        Object[] objArr = new Object[3];
        objArr[0] = aojxVar.c == 4 ? (String) aojxVar.d : "";
        objArr[1] = b(c);
        objArr[2] = txbVar.a;
        tzk.d("EventCallbackHelper", "Notification action [%s] clicked for account [%s], on thread [%s]", objArr);
        tzf a4 = this.b.a(aoic.ACTION_CLICK);
        tzj tzjVar = (tzj) a4;
        tzjVar.w = 2;
        tzjVar.h = aojxVar.c == 4 ? (String) aojxVar.d : "";
        a4.d(c);
        a4.b(txbVar);
        a4.i();
        if (k) {
        } else {
            ((udb) ((amna) this.a).a).a(aojxVar);
        }
    }
}
