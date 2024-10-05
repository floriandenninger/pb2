package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czo implements cqr {
    private final cqr b;

    public czo(cqr cqrVar) {
        did.ap(cqrVar);
        this.b = cqrVar;
    }

    @Override // defpackage.cqi
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.cqr
    public final ctd b(Context context, ctd ctdVar, int i, int i2) {
        czl czlVar = (czl) ctdVar.c();
        ctd cxgVar = new cxg(czlVar.a(), cnv.b(context).a);
        ctd b = this.b.b(context, cxgVar, i, i2);
        if (!cxgVar.equals(b)) {
            cxgVar.e();
        }
        Bitmap bitmap = (Bitmap) b.c();
        czlVar.a.a.e(this.b, bitmap);
        return ctdVar;
    }

    @Override // defpackage.cqi
    public final boolean equals(Object obj) {
        if (obj instanceof czo) {
            return this.b.equals(((czo) obj).b);
        }
        return false;
    }

    @Override // defpackage.cqi
    public final int hashCode() {
        return this.b.hashCode();
    }
}
