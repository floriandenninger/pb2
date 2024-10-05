package defpackage;

import android.view.MenuItem;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class nlx implements fze {
    final /* synthetic */ nmb a;
    private final String b;

    public nlx(nmb nmbVar, String str) {
        this.a = nmbVar;
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.fze
    public final int g() {
        return R.id.menu_delete_playlist;
    }

    @Override // defpackage.fze
    public final int h() {
        return R.menu.delete_playlist_menu;
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
    }

    @Override // defpackage.fze
    public final boolean m() {
        this.a.e.a(this.b).show();
        return true;
    }
}
