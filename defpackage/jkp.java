package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jkp implements DialogInterface.OnClickListener {
    final /* synthetic */ agzm a;
    private final /* synthetic */ int b;

    public jkp(agzm agzmVar, int i) {
        this.b = i;
        this.a = agzmVar;
    }

    public /* synthetic */ jkp(agzm agzmVar, int i, byte[] bArr) {
        this.b = i;
        this.a = agzmVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.b != 0) {
            this.a.b();
        } else {
            this.a.b();
        }
    }
}
