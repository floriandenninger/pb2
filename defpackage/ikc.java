package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ikc implements View.OnClickListener {
    public final /* synthetic */ ikn a;
    private final /* synthetic */ int b;

    public /* synthetic */ ikc(ikn iknVar, int i) {
        this.b = i;
        this.a = iknVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            ilw ilwVar = this.a.t;
            if (ilwVar != null) {
                ilwVar.aR();
                return;
            }
            return;
        }
        if (i != 1) {
            ilw ilwVar2 = this.a.t;
            if (ilwVar2 != null) {
                ilwVar2.aR();
                return;
            }
            return;
        }
        ilw ilwVar3 = this.a.t;
        if (ilwVar3 != null) {
            ilwVar3.aR();
        }
    }
}
