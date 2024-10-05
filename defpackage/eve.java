package defpackage;

import android.content.DialogInterface;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class eve implements DialogInterface.OnClickListener {
    public final /* synthetic */ evg a;
    public final /* synthetic */ Intent b;
    private final /* synthetic */ int c;

    public /* synthetic */ eve(evg evgVar, Intent intent, int i) {
        this.c = i;
        this.a = evgVar;
        this.b = intent;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.c != 0) {
            evg evgVar = this.a;
            evgVar.b.startActivity(this.b);
        } else {
            evg evgVar2 = this.a;
            evgVar2.b.startActivity(this.b);
        }
    }
}
