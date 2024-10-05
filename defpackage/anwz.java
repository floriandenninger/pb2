package defpackage;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anwz {
    private final FileChannel a;
    private final FileLock b;

    private anwz(FileChannel fileChannel, FileLock fileLock) {
        this.a = fileChannel;
        this.b = fileLock;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.anwz b(android.content.Context r5) {
        /*
            java.lang.String r0 = "generatefid.lock"
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L31 java.io.IOException -> L33
            java.io.File r5 = r5.getFilesDir()     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L31 java.io.IOException -> L33
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L31 java.io.IOException -> L33
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L31 java.io.IOException -> L33
            java.lang.String r0 = "rw"
            r5.<init>(r2, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L31 java.io.IOException -> L33
            java.nio.channels.FileChannel r5 = r5.getChannel()     // Catch: java.nio.channels.OverlappingFileLockException -> L2f java.lang.Error -> L31 java.io.IOException -> L33
            java.nio.channels.FileLock r0 = r5.lock()     // Catch: java.nio.channels.OverlappingFileLockException -> L27 java.lang.Error -> L29 java.io.IOException -> L2b
            anwz r2 = new anwz     // Catch: java.nio.channels.OverlappingFileLockException -> L21 java.lang.Error -> L23 java.io.IOException -> L25
            r2.<init>(r5, r0)     // Catch: java.nio.channels.OverlappingFileLockException -> L21 java.lang.Error -> L23 java.io.IOException -> L25
            return r2
        L21:
            r2 = move-exception
            goto L37
        L23:
            r2 = move-exception
            goto L37
        L25:
            r2 = move-exception
            goto L37
        L27:
            r0 = move-exception
            goto L2c
        L29:
            r0 = move-exception
            goto L2c
        L2b:
            r0 = move-exception
        L2c:
            r2 = r0
            r0 = r1
            goto L37
        L2f:
            r5 = move-exception
            goto L34
        L31:
            r5 = move-exception
            goto L34
        L33:
            r5 = move-exception
        L34:
            r2 = r5
            r5 = r1
            r0 = r5
        L37:
            java.lang.String r3 = "CrossProcessLock"
            java.lang.String r4 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r3, r4, r2)
            if (r0 == 0) goto L45
            r0.release()     // Catch: java.io.IOException -> L44
            goto L45
        L44:
        L45:
            if (r5 == 0) goto L4a
            r5.close()     // Catch: java.io.IOException -> L4a
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anwz.b(android.content.Context):anwz");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        try {
            this.b.release();
            this.a.close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }
}
