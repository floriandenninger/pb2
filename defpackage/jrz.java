package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jrz extends jre {
    public jrz(OfflineArrowView offlineArrowView, View.OnClickListener onClickListener) {
        super(offlineArrowView, onClickListener);
    }

    public final void i(agnv agnvVar) {
        int i;
        if (agnvVar == null || agnvVar.s()) {
            super.a();
            this.b.e();
            this.b.k();
            return;
        }
        if (agnvVar.i() == agnq.PLAYABLE) {
            super.a();
            this.b.d();
            this.b.k();
            this.b.setContentDescription(this.a.getString(R.string.accessibility_offline_button_remove_video));
            return;
        }
        if (agnvVar.u()) {
            if (agnvVar.y()) {
                int c = agnvVar.c();
                super.a();
                this.b.b(R.drawable.ic_offline_refresh);
                if (c <= 0) {
                    this.b.k();
                    return;
                } else {
                    this.b.i(c);
                    return;
                }
            }
            c();
            return;
        }
        if (!agnvVar.z()) {
            agnz agnzVar = agnvVar.o;
            boolean z = true;
            if (agnzVar == null || ((i = agnzVar.c) != 1 && i != 2 && i != 8)) {
                z = false;
            }
            int i2 = ((!agnvVar.D() || z) ? (char) 2 : (char) 0) | ((agnvVar.B() || z) ? (char) 4 : (char) 0);
            int c2 = agnvVar.c();
            int i3 = i2 & 4;
            super.a();
            if ((i2 & 2) == 0) {
                this.b.e();
            } else if (i3 != 0) {
                this.b.g();
            } else {
                this.b.h();
            }
            this.b.i(c2);
            this.b.setContentDescription(this.a.getString(R.string.accessibility_offline_button_cancel));
            return;
        }
        c();
    }
}
