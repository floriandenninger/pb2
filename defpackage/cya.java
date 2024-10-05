package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cya implements cqr {
    private final cqr b;
    private final boolean c;

    public cya(cqr cqrVar, boolean z) {
        this.b = cqrVar;
        this.c = z;
    }

    @Override // defpackage.cqi
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }

    @Override // defpackage.cqr
    public final ctd b(Context context, ctd ctdVar, int i, int i2) {
        ctm ctmVar = cnv.b(context).a;
        Drawable drawable = (Drawable) ctdVar.c();
        ctd a = cxz.a(ctmVar, drawable, i, i2);
        if (a != null) {
            ctd b = this.b.b(context, a, i, i2);
            if (!b.equals(a)) {
                return cyj.f(context.getResources(), b);
            }
            b.e();
            return ctdVar;
        }
        if (!this.c) {
            return ctdVar;
        }
        String valueOf = String.valueOf(drawable);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("Unable to convert ");
        sb.append(valueOf);
        sb.append(" to a Bitmap");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // defpackage.cqi
    public final boolean equals(Object obj) {
        if (obj instanceof cya) {
            return this.b.equals(((cya) obj).b);
        }
        return false;
    }

    @Override // defpackage.cqi
    public final int hashCode() {
        return this.b.hashCode();
    }
}
