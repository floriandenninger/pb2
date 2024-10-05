package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lcm implements View.OnClickListener {
    final /* synthetic */ lcp a;
    final /* synthetic */ lcq b;

    public lcm(lcq lcqVar, lcp lcpVar) {
        this.b = lcqVar;
        this.a = lcpVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        lbu lbuVar = this.b.h;
        if (lbuVar != null) {
            akef akefVar = this.a.f;
            lbz lbzVar = lbuVar.a;
            lbzVar.ai.e();
            lbzVar.aG();
            lbzVar.aD.setText(akefVar.b);
            whu.D(lbzVar.aD);
            lbzVar.bh();
        }
    }
}
