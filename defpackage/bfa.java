package defpackage;

import android.media.ApplicationMediaCapabilities;
import android.os.Bundle;
import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfa {
    public static void a(Bundle bundle) {
        bundle.putParcelable("android.provider.extra.MEDIA_CAPABILITIES", new ApplicationMediaCapabilities.Builder().addSupportedVideoMimeType("video/hevc").addSupportedHdrType("android.media.feature.hdr.dolby_vision").addSupportedHdrType("android.media.feature.hdr.hdr10").addSupportedHdrType("android.media.feature.hdr.hdr10_plus").addSupportedHdrType("android.media.feature.hdr.hlg").build());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003d A[EDGE_INSN: B:10:0x003d->B:11:0x003d BREAK  A[LOOP:0: B:2:0x0001->B:9:0x003b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003b A[LOOP:0: B:2:0x0001->B:9:0x003b, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(defpackage.bii r10, byte[] r11, int r12, int r13) {
        /*
            r0 = 0
        L1:
            if (r0 >= r13) goto L3d
            int r1 = r12 + r0
            int r5 = r13 - r0
            r8 = r10
            bid r8 = (defpackage.bid) r8
            r8.i(r5)
            int r2 = r8.f
            int r4 = r8.e
            int r2 = r2 - r4
            r9 = -1
            if (r2 != 0) goto L28
            byte[] r3 = r8.d
            r6 = 0
            r7 = 1
            r2 = r8
            int r2 = r2.a(r3, r4, r5, r6, r7)
            if (r2 != r9) goto L22
            r2 = -1
            goto L38
        L22:
            int r3 = r8.f
            int r3 = r3 + r2
            r8.f = r3
            goto L2c
        L28:
            int r2 = java.lang.Math.min(r5, r2)
        L2c:
            byte[] r3 = r8.d
            int r4 = r8.e
            java.lang.System.arraycopy(r3, r4, r11, r1, r2)
            int r1 = r8.e
            int r1 = r1 + r2
            r8.e = r1
        L38:
            if (r2 != r9) goto L3b
            goto L3d
        L3b:
            int r0 = r0 + r2
            goto L1
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfa.b(bii, byte[], int, int):int");
    }

    public static void c(boolean z, String str) {
        if (!z) {
            throw pnr.a(str, null);
        }
    }

    public static boolean d(bii biiVar, byte[] bArr, int i, int i2) {
        try {
            biiVar.k(bArr, i, i2);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean e(bii biiVar, int i) {
        try {
            biiVar.m(i);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean f(bii biiVar, byte[] bArr, int i, boolean z) {
        try {
            return biiVar.o(bArr, 0, i, z);
        } catch (EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }
}
