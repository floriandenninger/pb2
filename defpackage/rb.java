package defpackage;

import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rb implements PopupWindow.OnDismissListener {
    final /* synthetic */ rc a;

    public rb(rc rcVar) {
        this.a = rcVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
