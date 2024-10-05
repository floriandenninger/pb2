package defpackage;

import android.content.Intent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class lwv implements View.OnClickListener {
    public final /* synthetic */ lwy a;
    public final /* synthetic */ Intent b;
    private final /* synthetic */ int c;

    public /* synthetic */ lwv(lwy lwyVar, Intent intent, int i) {
        this.c = i;
        this.a = lwyVar;
        this.b = intent;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.c != 0) {
            lwy lwyVar = this.a;
            lwyVar.a.startActivity(this.b);
        } else {
            lwy lwyVar2 = this.a;
            Intent intent = this.b;
            ynm.n(lwyVar2.d, lwyVar2.c.b(loc.k), llq.k, ynm.b);
            lwyVar2.a.startActivity(intent);
        }
    }
}
