package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pht extends atb {
    private RandomAccessFile a;
    private Uri b;
    private long c;
    private boolean d;
    private final String e;

    public pht(String str) {
        super(false);
        this.e = str;
    }

    @Override // defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.c;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.a;
            int i3 = pts.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.c -= read;
                c(read);
            }
            return read;
        } catch (IOException e) {
            String str = this.e;
            throw new phs(str.length() != 0 ? "c.file.read;src.".concat(str) : new String("c.file.read;src."), e);
        }
    }

    @Override // defpackage.ate
    public final long h(ath athVar) {
        try {
            Uri uri = athVar.a;
            this.b = uri;
            e(athVar);
            try {
                String path = uri.getPath();
                pse.c(path);
                RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
                this.a = randomAccessFile;
                randomAccessFile.seek(athVar.g);
                long j = athVar.h;
                if (j == -1) {
                    j = this.a.length() - athVar.g;
                }
                this.c = j;
                if (j < 0) {
                    throw new atf(2008);
                }
                this.d = true;
                f(athVar);
                return this.c;
            } catch (FileNotFoundException e) {
                String str = this.e;
                throw new phs(str.length() != 0 ? "c.FileNotFound;src.".concat(str) : new String("c.FileNotFound;src."), e);
            }
        } catch (Exception e2) {
            String str2 = this.e;
            throw new phs(str2.length() != 0 ? "c.file.open;src.".concat(str2) : new String("c.file.open;src."), e2);
        }
    }

    @Override // defpackage.ate
    public final Uri i() {
        return this.b;
    }

    @Override // defpackage.ate
    public final void j() {
        this.b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                String str = this.e;
                throw new phs(str.length() != 0 ? "c.close;src.".concat(str) : new String("c.close;src."), e);
            }
        } finally {
            this.a = null;
            if (this.d) {
                this.d = false;
                d();
            }
        }
    }
}
