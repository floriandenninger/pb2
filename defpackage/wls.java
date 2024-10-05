package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wls implements DialogInterface.OnShowListener {
    final /* synthetic */ wlt a;

    public wls(wlt wltVar) {
        this.a = wltVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        wlt wltVar = this.a;
        wltVar.g = wltVar.d.getButton(-1);
        wlt wltVar2 = this.a;
        wltVar2.h = wltVar2.d.getButton(-2);
        this.a.g.setOnClickListener(new wlr(this, 1));
        this.a.h.setOnClickListener(new wlr(this, 0));
    }
}
