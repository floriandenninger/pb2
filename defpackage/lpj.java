package defpackage;

import android.content.Intent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lpj implements View.OnClickListener {
    final /* synthetic */ lpk a;

    public lpj(lpk lpkVar) {
        this.a = lpkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.b.startActivity(new Intent("com.google.android.apps.wellbeing.action.WIND_DOWN"));
    }
}
