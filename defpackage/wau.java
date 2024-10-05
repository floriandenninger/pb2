package defpackage;

import android.view.View;
import android.widget.Spinner;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class wau implements View.OnClickListener {
    final /* synthetic */ Spinner a;

    public wau(Spinner spinner) {
        this.a = spinner;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.performClick();
    }
}
