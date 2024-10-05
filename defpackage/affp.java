package defpackage;

import com.google.android.libraries.youtube.media.player.scripted.jni.NativeSupport;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class affp {
    public final long a;

    public affp(long j, byte[] bArr) {
        this.a = j;
    }

    public affp(long j, byte[] bArr, byte[] bArr2) {
        pse.e(j >= 0);
        this.a = j;
    }

    public affp(long j, char[] cArr) {
        this.a = j;
    }

    private static boolean d(long j, int i) {
        return (j & ((long) (i + (-1)))) > 0;
    }

    public final afjh a(byte[] bArr) {
        long nativeLoadScript = NativeSupport.nativeLoadScript(this.a, bArr);
        if (nativeLoadScript != 0) {
            return new afjh(this.a, nativeLoadScript, null);
        }
        return null;
    }

    public final int b() {
        if (d(this.a, 9)) {
            return 9;
        }
        return d(this.a, 3) ? 3 : 1;
    }

    public final int c() {
        if (d(this.a, 5)) {
            return 5;
        }
        return d(this.a, 2) ? 2 : 1;
    }

    public affp(asuh asuhVar) {
        long j;
        if (asuhVar == null || (asuhVar.c & 2) == 0) {
            j = 0;
        } else {
            awau awauVar = asuhVar.e;
            j = (awauVar == null ? awau.a : awauVar).c;
        }
        this.a = j;
    }

    public affp(long j) {
        amkq.E(j != 0);
        this.a = j;
    }
}
