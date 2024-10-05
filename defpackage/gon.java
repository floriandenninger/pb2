package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gon {
    private final Class a;
    private final byte[] b;

    public gon(Class cls, byte[] bArr) {
        this.a = cls;
        this.b = (byte[]) bArr.clone();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gon)) {
            return false;
        }
        gon gonVar = (gon) obj;
        return this.a.equals(gonVar.a) && Arrays.equals(this.b, gonVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + Arrays.hashCode(this.b);
    }
}
