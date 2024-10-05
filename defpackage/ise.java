package defpackage;

import android.view.MenuItem;
import android.view.View;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ise extends isc implements fzk {
    MenuItem a;
    final /* synthetic */ isf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ise(isf isfVar) {
        super(isfVar);
        this.b = isfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.isc
    public final void a(boolean z) {
        MenuItem menuItem = this.a;
        if (menuItem != null) {
            menuItem.setVisible(z);
        }
    }

    @Override // defpackage.fze
    public final int g() {
        return R.id.menu_upload_activity_done;
    }

    @Override // defpackage.fze
    public final int h() {
        return R.menu.upload_menu_send;
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
        return false;
    }

    @Override // defpackage.fze
    public final void l(MenuItem menuItem) {
        this.a = menuItem;
        menuItem.setActionView(R.layout.upload_menu_button);
        this.a.setShowAsAction(2);
        this.c = (YouTubeTextView) this.a.getActionView().findViewById(R.id.upload_menu_button);
        this.d = this.b.a.a(this.c);
        View findViewById = this.a.getActionView().findViewById(R.id.upload_menu_button_wrapper);
        findViewById.setFilterTouchesWhenObscured(true);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: isd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ise.this.b.a();
            }
        });
        this.b.c();
    }

    @Override // defpackage.fze
    public final boolean m() {
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
