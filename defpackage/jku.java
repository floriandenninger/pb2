package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jku implements DialogInterface.OnClickListener {
    final /* synthetic */ agzn a;
    private final /* synthetic */ int b;

    public jku(agzn agznVar, int i) {
        this.b = i;
        this.a = agznVar;
    }

    public /* synthetic */ jku(agzn agznVar, int i, byte[] bArr) {
        this.b = i;
        this.a = agznVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.b != 0) {
            this.a.a();
        } else {
            this.a.a();
        }
    }
}
