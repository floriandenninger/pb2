package defpackage;

import android.util.Log;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandomSpi;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uzr extends SecureRandomSpi {
    private static final File a = new File("/dev/urandom");
    private static final Object b = new Object();
    private static DataInputStream c;
    private static OutputStream d;
    private boolean e;

    @Override // java.security.SecureRandomSpi
    protected final byte[] engineGenerateSeed(int i) {
        byte[] bArr = new byte[i];
        engineNextBytes(bArr);
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.security.SecureRandomSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void engineNextBytes(byte[] r7) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uzr.engineNextBytes(byte[]):void");
    }

    @Override // java.security.SecureRandomSpi
    protected final void engineSetSeed(byte[] bArr) {
        OutputStream outputStream;
        try {
            Object obj = b;
            synchronized (obj) {
                synchronized (obj) {
                    if (d == null) {
                        d = new FileOutputStream(a);
                    }
                    outputStream = d;
                }
                outputStream.write(bArr);
                outputStream.flush();
            }
            outputStream.write(bArr);
            outputStream.flush();
        } catch (IOException unused) {
            String valueOf = String.valueOf(a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Failed to mix seed into ");
            sb.append(valueOf);
            Log.w("PrngFixes", sb.toString());
        } finally {
            this.e = true;
        }
    }
}
