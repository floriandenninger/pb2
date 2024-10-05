package defpackage;

import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abur implements anhh {
    final /* synthetic */ Map a;
    final /* synthetic */ abus b;

    public abur(abus abusVar, Map map) {
        this.b = abusVar;
        this.a = map;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Iterator it = ((aroe) obj).c.iterator();
        while (it.hasNext()) {
            this.b.b.c((apxf) it.next(), null);
        }
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        whu.K(this.b.a, R.string.lc_highlight_creation_failed, 0);
        ((abvm) this.a.get("callback")).a(((Integer) this.a.get("menuIndex")).intValue());
    }
}
