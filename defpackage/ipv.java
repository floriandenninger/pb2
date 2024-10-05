package defpackage;

import android.view.MenuItem;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ipv implements fzk {
    final /* synthetic */ ipw a;
    private MenuItem b;
    private ajyf c;

    public ipv(ipw ipwVar) {
        this.a = ipwVar;
    }

    @Override // defpackage.fze
    public final int g() {
        return R.id.menu_save_metadata;
    }

    @Override // defpackage.fze
    public final int h() {
        return R.menu.save_metadata_menu;
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
        this.b = menuItem;
        menuItem.setActionView(R.layout.upload_menu_button);
        menuItem.setShowAsAction(2);
        this.c = this.a.d.a((YouTubeTextView) menuItem.getActionView().findViewById(R.id.upload_menu_button));
        menuItem.getActionView().findViewById(R.id.upload_menu_button_wrapper).setOnClickListener(new ipu(0));
        MenuItem menuItem2 = this.b;
        if (menuItem2 != null) {
            menuItem2.setEnabled(false);
            YouTubeTextView youTubeTextView = (YouTubeTextView) this.b.getActionView().findViewById(R.id.upload_menu_button);
            ajyf ajyfVar = this.c;
            aong aongVar = (aong) apmg.a.createBuilder();
            aongVar.copyOnWrite();
            apmg apmgVar = (apmg) aongVar.instance;
            apmgVar.d = 2;
            apmgVar.c = 1;
            aongVar.copyOnWrite();
            apmg apmgVar2 = (apmg) aongVar.instance;
            apmgVar2.b |= 64;
            apmgVar2.h = true;
            aqyg aqygVar = null;
            ajyfVar.b((apmg) aongVar.build(), null);
            aszh aszhVar = this.a.b;
            if ((aszhVar.b & 2) != 0 && (aqygVar = aszhVar.c) == null) {
                aqygVar = aqyg.a;
            }
            youTubeTextView.setText(ajcq.b(aqygVar));
            youTubeTextView.setOnClickListener(new ipu(2));
            youTubeTextView.setEnabled(false);
        }
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
