package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akhe implements View.OnClickListener {
    final /* synthetic */ aurr a;
    final /* synthetic */ akhg b;

    public akhe(akhg akhgVar, aurr aurrVar) {
        this.b = akhgVar;
        this.a = aurrVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.al.d(new akiy());
        this.b.aL(this.a.d);
        aurr aurrVar = this.a;
        if ((aurrVar.b & 4) != 0) {
            this.b.aj.I(3, new acqx(aurrVar.e), null);
        }
        this.b.dismiss();
    }
}
