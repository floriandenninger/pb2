package defpackage;

import android.os.Parcel;
import io.grpc.Status;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ayep {
    public static azyy A(azty aztyVar) {
        return new azyu(aztyVar);
    }

    public static /* synthetic */ azym B() {
        return new azyk();
    }

    public static Status a(int i, Parcel parcel) {
        Status fromCodeValue = Status.fromCodeValue((i >> 16) & PrivateKeyType.INVALID);
        return (i & 32) != 0 ? fromCodeValue.withDescription(parcel.readString()) : fromCodeValue;
    }

    public static void b(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(0);
        parcel.writeInt(i);
        parcel.setDataPosition(dataPosition);
    }

    public static boolean c(int i, int i2) {
        return (i & i2) != 0;
    }

    public static ayih d() {
        return new ayih();
    }

    public static aycd f(Parcel parcel, axzj axzjVar) {
        int readInt = parcel.readInt();
        if (readInt == 0) {
            return new aycd();
        }
        Object[] objArr = new Object[readInt + readInt];
        int i = 0;
        int i2 = 0;
        while (i < readInt) {
            int readInt2 = parcel.readInt();
            int i3 = i2 + 4;
            int i4 = i + i;
            objArr[i4] = C(parcel, readInt2, i3);
            int readInt3 = parcel.readInt();
            int i5 = i3 + readInt2 + 4;
            if (readInt3 == -1) {
                throw Status.h.withDescription("Parcelable metadata values not allowed").asException();
            }
            if (readInt3 >= 0) {
                objArr[i4 + 1] = C(parcel, readInt3, i5);
                i++;
                i2 = i5 + readInt3;
            } else {
                throw Status.n.withDescription("Unrecognized metadata sentinel").asException();
            }
        }
        return aybe.d(readInt, objArr);
    }

    public static int t(String str, int i, int i2, int i3) {
        return (int) u(str, i, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long u(java.lang.String r22, long r23, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayep.u(java.lang.String, long, long, long):long");
    }

    public static boolean v(String str) {
        String a = baad.a(str);
        if (a == null) {
            return true;
        }
        return Boolean.parseBoolean(a);
    }

    public static /* synthetic */ int w(String str, int i, int i2, int i3, int i4) {
        int i5 = i2 | (((i4 & 4) != 0 ? 0 : 1) ^ 1);
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return t(str, i, i5, i3);
    }

    public static long y(long j, long j2) {
        return j & (j2 ^ (-1));
    }

    public static long z(long j, int i) {
        return y(j, 1073741823L) | i;
    }

    public final synchronized void e() {
    }

    public void g(int i) {
    }

    public void h(int i, long j, long j2) {
    }

    public void i(long j) {
    }

    public void j(long j) {
    }

    public void k(int i) {
    }

    public void l(int i, long j, long j2) {
    }

    public void m(long j) {
    }

    public void n(long j) {
    }

    public void o(Status status) {
    }

    public void p() {
    }

    public void q(aycd aycdVar) {
    }

    public void r() {
    }

    public void s(axzj axzjVar, aycd aycdVar) {
    }

    private static byte[] C(Parcel parcel, int i, int i2) {
        if (i2 + i > 8192) {
            throw Status.j.withDescription("Metadata too large").asException();
        }
        byte[] bArr = new byte[i];
        if (i > 0) {
            parcel.readByteArray(bArr);
        }
        return bArr;
    }
}
