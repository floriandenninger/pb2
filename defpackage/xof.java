package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class xof implements DialogInterface.OnShowListener {
    public final /* synthetic */ xoh a;
    private final /* synthetic */ int b;

    public /* synthetic */ xof(xoh xohVar, int i) {
        this.b = i;
        this.a = xohVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        if (this.b != 0) {
            this.a.k();
        } else {
            this.a.k();
        }
    }
}
