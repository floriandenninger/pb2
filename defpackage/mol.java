package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mol implements View.OnClickListener {
    final /* synthetic */ mon a;

    public mol(mon monVar) {
        this.a = monVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        mon monVar = this.a;
        mom momVar = monVar.c;
        if (momVar == null) {
            return;
        }
        momVar.c = true;
        monVar.b.setText(momVar.b);
        monVar.a.setVisibility(8);
    }
}
