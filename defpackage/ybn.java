package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class ybn implements DialogInterface.OnDismissListener, ajom {
    boolean a;
    final aoae b;

    public ybn(aoae aoaeVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.b = aoaeVar;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.b.b.remove(this);
    }

    protected abstract void d();

    @Override // defpackage.ajom
    public void oB(ajok ajokVar, Object obj) {
        throw null;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.a) {
            d();
        }
    }
}
