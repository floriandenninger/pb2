package defpackage;

import android.content.Context;
import android.view.View;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rzw implements rzu {
    private final rzv a;

    public rzw(Context context) {
        this.a = new rzv(context);
    }

    @Override // defpackage.rzu
    public final View a(List list) {
        this.a.b.clear();
        this.a.a = null;
        if (list.isEmpty()) {
            return this.a;
        }
        rzt rztVar = (rzt) list.get(0);
        if (list.size() == 1) {
            this.a.a(rztVar.c.toString(), rztVar.d.toString(), rztVar.e);
        } else {
            this.a.a = rztVar.c.toString();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                rzt rztVar2 = (rzt) it.next();
                this.a.a(rztVar2.a, rztVar2.d.toString(), rztVar2.e);
            }
        }
        return this.a;
    }
}
