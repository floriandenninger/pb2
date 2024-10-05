package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czj {
    public final ctm a;
    public final ctk b;

    public czj(ctm ctmVar, ctk ctkVar) {
        this.a = ctmVar;
        this.b = ctkVar;
    }

    public final void a(Bitmap bitmap) {
        this.a.d(bitmap);
    }

    public final void b(byte[] bArr) {
        ctk ctkVar = this.b;
        if (ctkVar == null) {
            return;
        }
        ctkVar.c(bArr);
    }

    public final byte[] c(int i) {
        ctk ctkVar = this.b;
        return ctkVar == null ? new byte[i] : (byte[]) ctkVar.a(i, byte[].class);
    }
}
