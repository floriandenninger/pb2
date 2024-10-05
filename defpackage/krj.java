package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class krj implements View.OnClickListener {
    final /* synthetic */ krm a;

    public krj(krm krmVar) {
        this.a = krmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        krm krmVar = this.a;
        krl krlVar = krmVar.d;
        if (krlVar != null) {
            kra kraVar = (kra) krlVar;
            kraVar.b.j(krmVar.i, krmVar.j);
            kraVar.a(xce.USER_SKIPPED);
        }
    }
}
