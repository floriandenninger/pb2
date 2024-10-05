package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akhd implements View.OnClickListener {
    final /* synthetic */ aurz a;
    final /* synthetic */ akhg b;

    public akhd(akhg akhgVar, aurz aurzVar) {
        this.b = akhgVar;
        this.a = aurzVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.al.d(new akiy());
        this.b.aL(this.a.c);
        this.b.dismiss();
    }
}
