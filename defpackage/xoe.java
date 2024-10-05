package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class xoe implements DialogInterface.OnDismissListener {
    public final /* synthetic */ xoh a;
    private final /* synthetic */ int b;

    public /* synthetic */ xoe(xoh xohVar, int i) {
        this.b = i;
        this.a = xohVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.b;
        if (i == 0) {
            this.a.j();
        } else if (i != 1) {
            this.a.j();
        } else {
            this.a.j();
        }
    }
}
