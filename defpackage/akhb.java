package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akhb implements View.OnClickListener {
    final /* synthetic */ akhg a;

    public akhb(akhg akhgVar) {
        this.a = akhgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.dismiss();
    }
}
