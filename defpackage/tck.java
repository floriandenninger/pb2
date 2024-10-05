package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tck {
    static final byte[] a = {82, 73, 70, 70};
    static final byte[] b = {87, 69, 66, 80, 86, 80, 56, 88};
    public static final /* synthetic */ int c = 0;

    public static boolean a(byte[] bArr) {
        for (int i = 0; i < 4; i++) {
            if (bArr[i] != a[i]) {
                return false;
            }
        }
        for (int i2 = 0; i2 < 8; i2++) {
            if (bArr[i2 + 8] != b[i2]) {
                return false;
            }
        }
        return (bArr[20] & 2) != 0;
    }
}
