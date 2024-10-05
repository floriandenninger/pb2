package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alln implements View.OnClickListener {
    final /* synthetic */ View.OnClickListener a;
    final /* synthetic */ allo b;

    public alln(allo alloVar, View.OnClickListener onClickListener) {
        this.b = alloVar;
        this.a = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.onClick(view);
        this.b.e(1);
    }
}
