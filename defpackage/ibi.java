package defpackage;

import com.google.android.apps.youtube.app.common.ui.actionbar.AppTabsBar;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ibi implements axpg {
    public final /* synthetic */ AppTabsBar a;
    private final /* synthetic */ int b;

    public /* synthetic */ ibi(AppTabsBar appTabsBar, int i) {
        this.b = i;
        this.a = appTabsBar;
    }

    @Override // defpackage.axpg
    public final Object get() {
        int i = this.b;
        if (i != 0 && i == 1) {
            return this.a;
        }
        return this.a;
    }
}
