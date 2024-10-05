package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class jre {
    public final Resources a;
    public final OfflineArrowView b;

    /* JADX INFO: Access modifiers changed from: protected */
    public jre(OfflineArrowView offlineArrowView, View.OnClickListener onClickListener) {
        this.b = offlineArrowView;
        offlineArrowView.setOnClickListener(onClickListener);
        this.a = offlineArrowView.getResources();
    }

    public final void a() {
        this.b.setVisibility(0);
        this.b.setEnabled(true);
    }

    public final void b(boolean z) {
        this.b.setContentDescription(this.a.getString(true != z ? R.string.accessibility_offline_button_cannot_save : R.string.accessibility_offline_button_save));
    }

    public final void c() {
        a();
        OfflineArrowView offlineArrowView = this.b;
        offlineArrowView.b(offlineArrowView.m);
        this.b.k();
    }

    public final void d() {
        this.b.setVisibility(8);
    }

    public final void e() {
        this.b.setVisibility(0);
        this.b.setEnabled(true);
    }

    public final void f(int i) {
        this.b.setContentDescription(this.a.getString(i));
    }

    public final void g() {
        e();
        this.b.e();
        this.b.k();
    }

    public final void h() {
        e();
        this.b.e();
        OfflineArrowView offlineArrowView = this.b;
        offlineArrowView.a(wbs.S(offlineArrowView.getContext(), R.attr.ytIconDisabled));
    }

    public jre(OfflineArrowView offlineArrowView, View.OnClickListener onClickListener, byte[] bArr) {
        this.b = offlineArrowView;
        this.a = offlineArrowView.getResources();
        offlineArrowView.setOnClickListener(onClickListener);
    }
}
