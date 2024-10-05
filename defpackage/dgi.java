package defpackage;

import java.util.Arrays;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgi {
    int a;
    int b;
    int c;
    int d;
    int e;
    int[] f = {PrivateKeyType.INVALID, PrivateKeyType.INVALID, PrivateKeyType.INVALID, PrivateKeyType.INVALID};

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dgi dgiVar = (dgi) obj;
        return this.b == dgiVar.b && this.d == dgiVar.d && this.c == dgiVar.c && this.e == dgiVar.e && this.a == dgiVar.a && Arrays.equals(this.f, dgiVar.f);
    }

    public final int hashCode() {
        int i = ((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31;
        int[] iArr = this.f;
        return i + (iArr != null ? Arrays.hashCode(iArr) : 0);
    }
}
