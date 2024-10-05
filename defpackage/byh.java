package defpackage;

import android.database.DataSetObserver;
import androidx.viewpager.widget.ViewPager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class byh extends DataSetObserver {
    final /* synthetic */ ViewPager a;

    public byh(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.f();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.f();
    }
}
