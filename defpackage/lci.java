package defpackage;

import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lci implements fzd, fzk {
    public MenuItem a;
    final /* synthetic */ lcl b;

    public lci(lcl lclVar) {
        this.b = lclVar;
    }

    @Override // defpackage.fzd
    public final void a(zau zauVar, int i) {
        ImageButton b;
        if (zauVar == null || (b = b()) == null) {
            return;
        }
        b.setImageDrawable(zauVar.b(b.getContext().getResources().getDrawable(R.drawable.yt_outline_adjust_black_24).mutate(), i));
    }

    public final ImageButton b() {
        MenuItem menuItem = this.a;
        if (menuItem != null) {
            return (ImageButton) menuItem.getActionView();
        }
        return null;
    }

    public final void c(boolean z) {
        MenuItem menuItem = this.a;
        if (menuItem != null) {
            menuItem.setEnabled(z);
        }
    }

    @Override // defpackage.fze
    public final int g() {
        return R.id.menu_filter_results;
    }

    @Override // defpackage.fze
    public final int h() {
        return R.menu.search_results_menu;
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
        menuItem.setActionView(R.layout.search_filter_button);
        this.a.setShowAsAction(2);
        c(this.b.aE.oa());
        if (this.b.aE.G == null) {
            c(false);
        }
        ImageButton b = b();
        if (b != null) {
            b.setOnClickListener(new View.OnClickListener() { // from class: lch
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    lci.this.b.s();
                }
            });
        }
        this.b.r();
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
