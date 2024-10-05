package defpackage;

import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bano extends bajn {
    private static final long serialVersionUID = 7811976468055766265L;
    private final long[] e;
    private final int[] f;
    private final int[] g;
    private final String[] h;
    private final banm i;

    private bano(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, banm banmVar) {
        super(str);
        this.e = jArr;
        this.f = iArr;
        this.g = iArr2;
        this.h = strArr;
        this.i = banmVar;
    }

    public static bano o(DataInput dataInput, String str) {
        int readUnsignedByte;
        int readUnsignedShort = dataInput.readUnsignedShort();
        String[] strArr = new String[readUnsignedShort];
        for (int i = 0; i < readUnsignedShort; i++) {
            strArr[i] = dataInput.readUTF();
        }
        int readInt = dataInput.readInt();
        long[] jArr = new long[readInt];
        int[] iArr = new int[readInt];
        int[] iArr2 = new int[readInt];
        String[] strArr2 = new String[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            jArr[i2] = aynu.t(dataInput);
            iArr[i2] = (int) aynu.t(dataInput);
            iArr2[i2] = (int) aynu.t(dataInput);
            if (readUnsignedShort < 256) {
                try {
                    readUnsignedByte = dataInput.readUnsignedByte();
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new IOException("Invalid encoding");
                }
            } else {
                readUnsignedByte = dataInput.readUnsignedShort();
            }
            strArr2[i2] = strArr[readUnsignedByte];
        }
        return new bano(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? new banm(str, (int) aynu.t(dataInput), banp.c(dataInput), banp.c(dataInput)) : null);
    }

    @Override // defpackage.bajn
    public final int a(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.f[binarySearch];
        }
        int i = binarySearch ^ (-1);
        if (i < jArr.length) {
            if (i > 0) {
                return this.f[i - 1];
            }
            return 0;
        }
        banm banmVar = this.i;
        if (banmVar == null) {
            return this.f[i - 1];
        }
        return banmVar.a(j);
    }

    @Override // defpackage.bajn
    public final int c(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.g[binarySearch];
        }
        int i = binarySearch ^ (-1);
        if (i >= jArr.length) {
            banm banmVar = this.i;
            return banmVar == null ? this.g[i - 1] : banmVar.e;
        }
        if (i > 0) {
            return this.g[i - 1];
        }
        return 0;
    }

    @Override // defpackage.bajn
    public final long e(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        int i = binarySearch >= 0 ? binarySearch + 1 : binarySearch ^ (-1);
        int length = jArr.length;
        if (i < length) {
            return jArr[i];
        }
        banm banmVar = this.i;
        if (banmVar == null) {
            return j;
        }
        long j2 = jArr[length - 1];
        if (j < j2) {
            j = j2;
        }
        return banmVar.e(j);
    }

    @Override // defpackage.bajn
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bano) {
            bano banoVar = (bano) obj;
            if (this.c.equals(banoVar.c) && Arrays.equals(this.e, banoVar.e) && Arrays.equals(this.h, banoVar.h) && Arrays.equals(this.f, banoVar.f) && Arrays.equals(this.g, banoVar.g)) {
                banm banmVar = this.i;
                banm banmVar2 = banoVar.i;
                if (banmVar != null ? banmVar.equals(banmVar2) : banmVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.bajn
    public final long f(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return j > Long.MIN_VALUE ? j - 1 : j;
        }
        int i = binarySearch ^ (-1);
        if (i < jArr.length) {
            if (i > 0) {
                long j2 = jArr[i - 1];
                if (j2 > Long.MIN_VALUE) {
                    return j2 - 1;
                }
            }
            return j;
        }
        banm banmVar = this.i;
        if (banmVar != null) {
            long f = banmVar.f(j);
            if (f < j) {
                return f;
            }
        }
        long j3 = jArr[i - 1];
        return j3 > Long.MIN_VALUE ? j3 - 1 : j;
    }

    @Override // defpackage.bajn
    public final String g(long j) {
        long[] jArr = this.e;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch >= 0) {
            return this.h[binarySearch];
        }
        int i = binarySearch ^ (-1);
        if (i < jArr.length) {
            return i > 0 ? this.h[i - 1] : "UTC";
        }
        banm banmVar = this.i;
        if (banmVar == null) {
            return this.h[i - 1];
        }
        return banmVar.g(j);
    }

    @Override // defpackage.bajn
    public final boolean l() {
        return false;
    }
}
