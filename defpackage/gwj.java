package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gwj implements View.OnClickListener {
    public final /* synthetic */ gwk a;
    private final /* synthetic */ int b;

    public /* synthetic */ gwj(gwk gwkVar, int i) {
        this.b = i;
        this.a = gwkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        if (i == 0) {
            this.a.i(2);
            return;
        }
        if (i == 1) {
            gwk gwkVar = this.a;
            gwkVar.f();
            gwkVar.i(1);
        } else {
            if (i == 2) {
                this.a.i(2);
                return;
            }
            gwk gwkVar2 = this.a;
            gwkVar2.f();
            gwkVar2.i(1);
        }
    }
}
