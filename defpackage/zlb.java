package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class zlb implements View.OnClickListener {
    final /* synthetic */ zld a;

    public zlb(zld zldVar) {
        this.a = zldVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.b.dismiss();
    }
}
