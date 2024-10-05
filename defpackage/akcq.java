package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akcq implements View.OnClickListener {
    final /* synthetic */ View.OnClickListener a;
    final /* synthetic */ akce b;

    public akcq(View.OnClickListener onClickListener, akce akceVar) {
        this.a = onClickListener;
        this.b = akceVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener = this.a;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        this.b.b();
    }
}
