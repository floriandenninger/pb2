package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.youtube.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uby implements ubp {
    private final ubt a;

    public uby(ubt ubtVar) {
        this.a = ubtVar;
    }

    @Override // defpackage.ubp
    public final dy a(String str, twu twuVar, List list, boolean z, ucx ucxVar) {
        if (tyo.l()) {
            ubt ubtVar = this.a;
            amkq.E(list != null);
            amkq.E(!list.isEmpty());
            dy dyVar = new dy(ubtVar.a);
            dyVar.G = 2;
            dyVar.r(ubtVar.d.a.intValue());
            int e = aocz.e(((txb) Collections.max(list, unt.b)).d.l);
            dyVar.k = ubt.g(e != 0 ? e : 1);
            String c = ubtVar.c(twuVar, list);
            if (!TextUtils.isEmpty(c)) {
                dyVar.t(c);
            }
            if (ubtVar.d.c != null) {
                dyVar.z = ubtVar.a.getResources().getColor(ubtVar.d.c.intValue());
            }
            ubtVar.c.d(dyVar, (txb) list.get(0));
            ubtVar.e(dyVar, twuVar, list.size());
            dyVar.g = ubtVar.b.d(str, twuVar, list, ucxVar);
            dyVar.m(ubtVar.b.e(str, twuVar, list));
            return dyVar;
        }
        if (list.size() == 1) {
            return (dy) this.a.a(str, twuVar, (txb) list.get(0), z, twd.b(), ucxVar).first;
        }
        ubt ubtVar2 = this.a;
        amkq.E(list != null);
        amkq.E(list.size() >= 2);
        dz dzVar = new dz();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aokd aokdVar = ((txb) it.next()).d;
            if (aokdVar.d.isEmpty()) {
                dzVar.c(ubtVar2.b(R.string.chime_notification_title, aokdVar.c));
            } else {
                dzVar.c(ubtVar2.b(R.string.combined_notification_text, aokdVar.c, aokdVar.d));
            }
        }
        dy dyVar2 = new dy(ubtVar2.a);
        dyVar2.k(ubtVar2.a.getString(ubtVar2.d.b.intValue()));
        dyVar2.j(ubtVar2.a.getResources().getQuantityString(R.plurals.public_notification_text, list.size(), Integer.valueOf(list.size())));
        dyVar2.r(ubtVar2.d.a.intValue());
        dyVar2.s(dzVar);
        String c2 = ubtVar2.c(twuVar, list);
        if (!TextUtils.isEmpty(c2)) {
            dyVar2.t(c2);
        }
        if (ubtVar2.d.c != null) {
            dyVar2.z = ubtVar2.a.getResources().getColor(ubtVar2.d.c.intValue());
        }
        ubtVar2.f(dyVar2, ((txb) list.get(0)).d, z);
        ubtVar2.e(dyVar2, twuVar, list.size());
        dyVar2.g = ubtVar2.b.d(str, twuVar, list, null);
        dyVar2.m(ubtVar2.b.e(str, twuVar, list));
        return dyVar2;
    }

    @Override // defpackage.ubp
    public final Pair b(String str, twu twuVar, txb txbVar, boolean z, twd twdVar, ucx ucxVar) {
        return this.a.a(str, twuVar, txbVar, z, twdVar, ucxVar);
    }
}
