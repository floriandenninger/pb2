package defpackage;

import android.content.DialogInterface;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class lrp implements DialogInterface.OnClickListener {
    final /* synthetic */ Intent a;
    final /* synthetic */ lrr b;

    public lrp(lrr lrrVar, Intent intent) {
        this.b = lrrVar;
        this.a = intent;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.b.a.startActivity(this.a);
    }
}
