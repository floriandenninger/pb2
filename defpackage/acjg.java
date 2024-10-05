package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acjg implements View.OnClickListener {
    final /* synthetic */ acjl a;
    private final /* synthetic */ int b;

    public acjg(acjl acjlVar, int i) {
        this.b = i;
        this.a = acjlVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            this.a.aB.V();
        } else {
            this.a.aG();
        }
    }
}
