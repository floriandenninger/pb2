package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pna {
    public final UUID a;
    public final Uri b;
    public final amrz c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final amru g;
    public final byte[] h;

    public pna(pmz pmzVar) {
        pse.g(true);
        UUID uuid = pmzVar.a;
        pse.c(uuid);
        this.a = uuid;
        this.b = null;
        this.c = pmzVar.c;
        this.d = false;
        this.f = false;
        this.e = false;
        this.g = pmzVar.d;
        byte[] bArr = pmzVar.e;
        this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pna)) {
            return false;
        }
        pna pnaVar = (pna) obj;
        if (this.a.equals(pnaVar.a)) {
            Uri uri = pnaVar.b;
            if (pts.R(null, null) && pts.R(this.c, pnaVar.c)) {
                boolean z = pnaVar.d;
                boolean z2 = pnaVar.f;
                boolean z3 = pnaVar.e;
                if (amkq.aV(this.g, pnaVar.g) && Arrays.equals(this.h, pnaVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 961) + this.c.hashCode()) * 923521) + this.g.hashCode()) * 31) + Arrays.hashCode(this.h);
    }
}
