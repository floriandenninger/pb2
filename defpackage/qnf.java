package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qnf extends qss {
    public final byte[] a;

    public qnf(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.a = bArr;
    }

    @Override // defpackage.qss
    public final byte[] pU() {
        return this.a;
    }
}
