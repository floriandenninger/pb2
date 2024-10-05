package defpackage;

import android.view.MenuItem;
import com.google.android.apps.youtube.app.extensions.upload.EditVideoActivity;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iqd implements fzk {
    final /* synthetic */ EditVideoActivity a;
    private MenuItem b;
    private boolean c;
    private ajyf d;

    public iqd(EditVideoActivity editVideoActivity) {
        this.a = editVideoActivity;
    }

    private final void c() {
        MenuItem menuItem = this.b;
        if (menuItem != null) {
            menuItem.setEnabled(this.c);
            YouTubeTextView youTubeTextView = (YouTubeTextView) this.b.getActionView().findViewById(R.id.upload_menu_button);
            ajyf ajyfVar = this.d;
            aong aongVar = (aong) apmg.a.createBuilder();
            aongVar.copyOnWrite();
            apmg apmgVar = (apmg) aongVar.instance;
            apmgVar.d = 2;
            apmgVar.c = 1;
            boolean z = this.c;
            aongVar.copyOnWrite();
            apmg apmgVar2 = (apmg) aongVar.instance;
            apmgVar2.b |= 64;
            apmgVar2.h = !z;
            ajyfVar.b((apmg) aongVar.build(), null);
            youTubeTextView.setText(R.string.save_metadata_menu);
            youTubeTextView.setFilterTouchesWhenObscured(true);
            youTubeTextView.setOnClickListener(new iqc(this, 0));
            youTubeTextView.setEnabled(this.c);
        }
    }

    public final void a() {
        if (this.c) {
            EditVideoActivity editVideoActivity = this.a;
            aruy aruyVar = editVideoActivity.s;
            if ((aruyVar.b & 8) != 0) {
                aahd aahdVar = editVideoActivity.h;
                apxf apxfVar = aruyVar.d;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, null);
            }
        }
    }

    public final void b(boolean z) {
        this.c = z;
        c();
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
        this.b.setShowAsAction(2);
        this.d = this.a.m.a((YouTubeTextView) this.b.getActionView().findViewById(R.id.upload_menu_button));
        this.b.getActionView().findViewById(R.id.upload_menu_button_wrapper).setOnClickListener(new iqc(this, 1));
        c();
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
