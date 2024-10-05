package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lzf implements fzk {
    private final ggp a;

    public lzf(ggp ggpVar) {
        this.a = ggpVar;
    }

    @Override // defpackage.fze
    public final int g() {
        return R.id.menu_inline_global_play_pause;
    }

    @Override // defpackage.fze
    public final int h() {
        return R.menu.inline_menu;
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
        ggp ggpVar = this.a;
        if (ggpVar.g == null) {
            View inflate = LayoutInflater.from(ggpVar.a).inflate(R.layout.inline_global_play_pause_dialog, (ViewGroup) null);
            ggpVar.d = (RadioButton) inflate.findViewById(R.id.inline_global_play_on);
            ggpVar.e = (RadioButton) inflate.findViewById(R.id.inline_global_play_on_wifi_only);
            ggpVar.f = (RadioButton) inflate.findViewById(R.id.inline_global_play_off);
            ggpVar.h = ggpVar.b.mM();
            ggpVar.h.D(new acqx(acrb.INLINE_DIALOG_SETTINGS_ON));
            ggpVar.h.D(new acqx(acrb.INLINE_DIALOG_SETTINGS_ONLY_WIFI));
            ggpVar.h.D(new acqx(acrb.INLINE_DIALOG_SETTINGS_OFF));
            ggpVar.g = new AlertDialog.Builder(ggpVar.a).setView(inflate).setTitle(R.string.menu_inline_global_play_pause).setPositiveButton(R.string.ok, new ggo(ggpVar)).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setCancelable(true).create();
        }
        int b = ggpVar.c.b();
        if (b == 2) {
            ggpVar.d.setChecked(true);
        } else if (b == 1) {
            ggpVar.e.setChecked(true);
        } else if (b == 0) {
            ggpVar.f.setChecked(true);
        }
        ggpVar.g.show();
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
