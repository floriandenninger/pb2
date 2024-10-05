package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bhq {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static bagd a(byte[] bArr) {
        return b(new ptg(bArr), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bd, code lost:
    
        if (r12 != 3) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.bagd b(defpackage.ptg r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhq.b(ptg, boolean):bagd");
    }

    private static int c(ptg ptgVar) {
        int d = ptgVar.d(5);
        return d == 31 ? ptgVar.d(6) + 32 : d;
    }

    private static int d(ptg ptgVar) {
        int d = ptgVar.d(4);
        if (d == 15) {
            return ptgVar.d(24);
        }
        if (d < 13) {
            return b[d];
        }
        throw pnr.a(null, null);
    }
}
