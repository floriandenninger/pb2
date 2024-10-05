package defpackage;

import android.view.MenuItem;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ixb implements fzk {
    final /* synthetic */ ixc a;

    public ixb(ixc ixcVar) {
        this.a = ixcVar;
    }

    @Override // defpackage.fze
    public final int g() {
        return R.id.menu_save_playlist;
    }

    @Override // defpackage.fze
    public final int h() {
        return R.menu.playlist_editor_menu;
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
        menuItem.setShowAsAction(6);
        menuItem.setIcon(R.drawable.ic_menu_upload_send_mtrl_alpha);
    }

    @Override // defpackage.fze
    public final boolean m() {
        this.a.aF(new ixa(this));
        return true;
    }

    @Override // defpackage.fzk
    public final int n() {
        return 0;
    }

    @Override // defpackage.fzk
    public final CharSequence o() {
        return "";
    }
}
