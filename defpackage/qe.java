package defpackage;

import android.content.Context;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes4.dex */
class qe {
    final Context a;
    public aeg b;

    public qe(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem a(MenuItem menuItem) {
        if (!(menuItem instanceof gk)) {
            return menuItem;
        }
        gk gkVar = (gk) menuItem;
        if (this.b == null) {
            this.b = new aeg();
        }
        MenuItem menuItem2 = (MenuItem) this.b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        qz qzVar = new qz(this.a, gkVar);
        this.b.put(gkVar, qzVar);
        return qzVar;
    }
}
