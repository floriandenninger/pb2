package defpackage;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqj implements cqr {
    private final Collection b;

    @SafeVarargs
    public cqj(cqr... cqrVarArr) {
        if (cqrVarArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.b = Arrays.asList(cqrVarArr);
    }

    @Override // defpackage.cqi
    public final void a(MessageDigest messageDigest) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((cqr) it.next()).a(messageDigest);
        }
    }

    @Override // defpackage.cqr
    public final ctd b(Context context, ctd ctdVar, int i, int i2) {
        Iterator it = this.b.iterator();
        ctd ctdVar2 = ctdVar;
        while (it.hasNext()) {
            ctd b = ((cqr) it.next()).b(context, ctdVar2, i, i2);
            if (ctdVar2 != null && !ctdVar2.equals(ctdVar) && !ctdVar2.equals(b)) {
                ctdVar2.e();
            }
            ctdVar2 = b;
        }
        return ctdVar2;
    }

    @Override // defpackage.cqi
    public final boolean equals(Object obj) {
        if (obj instanceof cqj) {
            return this.b.equals(((cqj) obj).b);
        }
        return false;
    }

    @Override // defpackage.cqi
    public final int hashCode() {
        return this.b.hashCode();
    }
}
