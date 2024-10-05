package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pfx implements pgf {
    private RandomAccessFile a;
    private long b;
    private boolean c;

    public pfx() {
    }

    public pfx(byte[] bArr) {
    }

    @Override // defpackage.pfq
    public final int a(byte[] bArr, int i, int i2) {
        long j = this.b;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.a.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.b -= read;
            }
            return read;
        } catch (IOException e) {
            throw new pfw(e);
        }
    }

    @Override // defpackage.pfq
    public final long b(pfs pfsVar) {
        try {
            pfsVar.a.toString();
            RandomAccessFile randomAccessFile = new RandomAccessFile(pfsVar.a.getPath(), "r");
            this.a = randomAccessFile;
            randomAccessFile.seek(pfsVar.d);
            long j = pfsVar.e;
            if (j == -1) {
                j = this.a.length() - pfsVar.d;
            }
            this.b = j;
            if (j < 0) {
                throw new EOFException();
            }
            this.c = true;
            return j;
        } catch (IOException e) {
            throw new pfw(e);
        }
    }

    @Override // defpackage.pfq
    public final void c() {
        RandomAccessFile randomAccessFile = this.a;
        if (randomAccessFile != null) {
            try {
                try {
                    randomAccessFile.close();
                    this.a = null;
                    if (this.c) {
                        this.c = false;
                    }
                } catch (IOException e) {
                    throw new pfw(e);
                }
            } catch (Throwable th) {
                this.a = null;
                if (this.c) {
                    this.c = false;
                }
                throw th;
            }
        }
    }
}
