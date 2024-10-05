package defpackage;

import com.google.android.libraries.youtube.common.ui.RtlAwareViewPager;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zbp implements byg {
    final /* synthetic */ RtlAwareViewPager a;

    public zbp(RtlAwareViewPager rtlAwareViewPager) {
        this.a = rtlAwareViewPager;
    }

    @Override // defpackage.byg
    public final void a(int i) {
        byg bygVar = this.a.k;
        if (bygVar != null) {
            bygVar.a(i);
        }
        Iterator it = this.a.j.iterator();
        while (it.hasNext()) {
            ((byg) it.next()).a(i);
        }
    }

    @Override // defpackage.byg
    public final void b(int i, float f, int i2) {
        RtlAwareViewPager rtlAwareViewPager = this.a;
        byg bygVar = rtlAwareViewPager.k;
        if (bygVar != null) {
            bygVar.b(rtlAwareViewPager.y(i), f, i2);
        }
        Iterator it = this.a.j.iterator();
        while (it.hasNext()) {
            ((byg) it.next()).b(this.a.y(i), f, i2);
        }
    }

    @Override // defpackage.byg
    public final void c(int i) {
        RtlAwareViewPager rtlAwareViewPager = this.a;
        byg bygVar = rtlAwareViewPager.k;
        if (bygVar != null) {
            bygVar.c(rtlAwareViewPager.y(i));
        }
        Iterator it = this.a.j.iterator();
        while (it.hasNext()) {
            ((byg) it.next()).c(this.a.y(i));
        }
    }
}
