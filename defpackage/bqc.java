package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bqc implements Runnable {
    private final /* synthetic */ int i;
    public static final /* synthetic */ bqc h = new bqc(20, (char[]) null, (byte[]) (0 == true ? 1 : 0));
    public static final /* synthetic */ bqc g = new bqc(19, (byte[]) (0 == true ? 1 : 0), (byte[]) (0 == true ? 1 : 0));
    public static final /* synthetic */ bqc f = new bqc(18, (float[][][]) (0 == true ? 1 : 0));
    public static final /* synthetic */ bqc e = new bqc(17, (boolean[][][]) (0 == true ? 1 : 0));
    public static final /* synthetic */ bqc d = new bqc(16, (int[][][]) (0 == true ? 1 : 0));
    public static final /* synthetic */ bqc c = new bqc(15, (short[][][]) (0 == true ? 1 : 0));
    public static final /* synthetic */ bqc b = new bqc(14, (char[][][]) (0 == true ? 1 : 0));
    public static final /* synthetic */ bqc a = new bqc(13, (byte[][][]) (0 == true ? 1 : 0));

    public bqc(int i) {
        this.i = i;
        throw new UnsupportedOperationException();
    }

    public bqc(int i, byte[] bArr) {
        this.i = i;
    }

    private /* synthetic */ bqc(int i, byte[] bArr, byte[] bArr2) {
        this.i = i;
    }

    public bqc(int i, char[] cArr) {
        this.i = i;
    }

    private /* synthetic */ bqc(int i, char[] cArr, byte[] bArr) {
        this.i = i;
    }

    public bqc(int i, float[] fArr) {
        this.i = i;
    }

    public bqc(int i, int[] iArr) {
        this.i = i;
    }

    public /* synthetic */ bqc(int i, short[] sArr) {
        this.i = i;
    }

    public bqc(int i, boolean[] zArr) {
        this.i = i;
    }

    public /* synthetic */ bqc(int i, byte[][] bArr) {
        this.i = i;
    }

    public /* synthetic */ bqc(int i, char[][] cArr) {
        this.i = i;
    }

    public /* synthetic */ bqc(int i, int[][] iArr) {
        this.i = i;
    }

    public /* synthetic */ bqc(int i, short[][] sArr) {
        this.i = i;
    }

    public /* synthetic */ bqc(int i, boolean[][] zArr) {
        this.i = i;
    }

    private /* synthetic */ bqc(int i, byte[][][] bArr) {
        this.i = i;
    }

    private /* synthetic */ bqc(int i, char[][][] cArr) {
        this.i = i;
    }

    private /* synthetic */ bqc(int i, float[][][] fArr) {
        this.i = i;
    }

    private /* synthetic */ bqc(int i, int[][][] iArr) {
        this.i = i;
    }

    private /* synthetic */ bqc(int i, short[][][] sArr) {
        this.i = i;
    }

    private /* synthetic */ bqc(int i, boolean[][][] zArr) {
        this.i = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.i;
        if (i == 0) {
            throw null;
        }
        if (i == 8) {
            int i2 = arfr.ACCEPT_FRIEND_INVITE.pV;
            return;
        }
        if (i == 12) {
            try {
                Class.forName("com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity");
                return;
            } catch (ClassNotFoundException unused) {
                return;
            }
        }
        if (i == 16) {
            amrz amrzVar = hzu.a;
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            try {
                Class.forName("com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity");
                return;
            } catch (ClassNotFoundException unused2) {
                return;
            }
        }
        try {
            dzi.b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused3) {
        } finally {
            dzi.c.countDown();
        }
    }
}
