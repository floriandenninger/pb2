package defpackage;

import android.app.Activity;
import android.view.MenuItem;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lze implements fzk {
    private final Activity a;
    private final amnv b;
    private final ffs c;

    public lze(Activity activity, ffs ffsVar, amnv amnvVar) {
        this.a = activity;
        ffsVar.getClass();
        this.c = ffsVar;
        this.b = amnvVar;
    }

    @Override // defpackage.fze
    public final int g() {
        return R.id.menu_help;
    }

    @Override // defpackage.fze
    public final int h() {
        return R.menu.menu_help;
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
        this.c.a(this.a, (String) this.b.get());
        return true;
    }

    @Override // defpackage.fzk
    public final int n() {
        return 105;
    }

    @Override // defpackage.fzk
    public final CharSequence o() {
        return "";
    }
}
