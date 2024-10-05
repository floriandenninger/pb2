package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anjz {
    public final Object a;
    public final int b;
    public final int c;
    private final byte[] d;

    public anjz(Object obj, byte[] bArr, int i, int i2) {
        this.a = obj;
        this.d = Arrays.copyOf(bArr, bArr.length);
        this.b = i;
        this.c = i2;
    }

    public final byte[] a() {
        byte[] bArr = this.d;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
