package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abkl implements View.OnClickListener {
    final /* synthetic */ abkm a;

    public abkl(abkm abkmVar) {
        this.a = abkmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.dismiss();
    }
}
