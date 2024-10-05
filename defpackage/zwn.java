package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zwn extends aef {
    public zwn(int i) {
        super(i);
    }

    @Override // defpackage.aef
    protected final /* bridge */ /* synthetic */ int a(Object obj, Object obj2) {
        ammv ammvVar = (ammv) obj2;
        if (ammvVar.h()) {
            return ((Bitmap) ammvVar.c()).getByteCount();
        }
        return 0;
    }
}
