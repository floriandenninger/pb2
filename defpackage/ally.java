package defpackage;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ally extends DataSetObserver {
    final /* synthetic */ TabLayout a;

    public ally(TabLayout tabLayout) {
        this.a = tabLayout;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.h();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.h();
    }
}
