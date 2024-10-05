package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aelu {
    public static final aelt a = aelt.a(-1, -1);
    public final byte[] b;
    public final String c;
    public final int d;
    public final long e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final String j;
    public aelt k;

    public aelu(byte[] bArr, String str, int i, long j, long j2, boolean z, boolean z2, String str2, long j3, aelt aeltVar) {
        this.b = (byte[]) afki.a(bArr);
        afki.a(str);
        this.c = str;
        this.d = i;
        this.e = j;
        this.f = j2;
        this.g = z;
        this.h = z2;
        this.j = str2;
        this.i = j3;
        afki.a(aeltVar);
        this.k = aeltVar;
        if (aeltVar == a || bArr.length == aeltVar.b - aeltVar.a) {
            return;
        }
        afsi.b(1, 8, "data_byte_range_mismatch");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aelu) {
            aelu aeluVar = (aelu) obj;
            if (this.c.equals(aeluVar.c) && this.d == aeluVar.d && this.e == aeluVar.e && this.f == aeluVar.f && this.g == aeluVar.g && this.h == aeluVar.h) {
                aelt aeltVar = this.k;
                long j = aeltVar.a;
                aelt aeltVar2 = aeluVar.k;
                return j == aeltVar2.a && aeltVar.b == aeltVar2.b && Arrays.equals(this.b, aeluVar.b);
            }
        }
        return false;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }
}
