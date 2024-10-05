package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.view.MenuItem;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mae implements fzk {
    private final Activity a;

    public mae(Activity activity) {
        this.a = activity;
    }

    @Override // defpackage.fze
    public final int g() {
        return R.id.menu_privacy_policy;
    }

    @Override // defpackage.fze
    public final int h() {
        return R.menu.menu_privacy_policy;
    }

    @Override // defpackage.fze
    public final fzd i() {
        return null;
    }

    @Override // defpackage.fze
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.fze
    public final boolean k() {
        return true;
    }

    @Override // defpackage.fze
    public final void l(MenuItem menuItem) {
        menuItem.setShowAsAction(0);
    }

    @Override // defpackage.fze
    public final boolean m() {
        fav.F(this.a, Uri.parse(this.a.getResources().getString(R.string.mobile_privacy_uri)));
        return true;
    }

    @Override // defpackage.fzk
    public final int n() {
        return 104;
    }

    @Override // defpackage.fzk
    public final CharSequence o() {
        return "";
    }
}
