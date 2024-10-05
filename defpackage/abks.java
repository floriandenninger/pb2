package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abks implements View.OnClickListener {
    final /* synthetic */ abkt a;

    public abks(abkt abktVar) {
        this.a = abktVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.dismiss();
    }
}
