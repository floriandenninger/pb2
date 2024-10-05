package defpackage;

import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lvf implements byg {
    final /* synthetic */ lvi a;

    public lvf(lvi lviVar) {
        this.a = lviVar;
    }

    @Override // defpackage.byg
    public final void a(int i) {
        Iterator it = this.a.d.iterator();
        while (it.hasNext()) {
            ((gaa) it.next()).ov(i);
        }
    }

    @Override // defpackage.byg
    public final void b(int i, float f, int i2) {
        ((DefaultTabsBar) this.a.a.get()).q(i, f, true);
        Iterator it = this.a.d.iterator();
        while (it.hasNext()) {
            ((gaa) it.next()).e(f);
        }
    }

    @Override // defpackage.byg
    public final void c(int i) {
        this.a.l(i, false);
    }
}
