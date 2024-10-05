package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pia {
    public final byte[] a;
    public final int b;
    public final int c;

    public pia(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pia)) {
            return false;
        }
        pia piaVar = (pia) obj;
        return Arrays.equals(this.a, piaVar.a) && this.b == piaVar.b && this.c == piaVar.c;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(Arrays.hashCode(this.a)), Integer.valueOf(this.b), Integer.valueOf(this.c));
    }
}
