package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfp extends atb {
    private RandomAccessFile a;
    private Uri b;
    private long c;
    private boolean d;

    public bfp() {
        super(false);
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
            throw new bfo(e, 2000);
        }
    }

    @Override // defpackage.ate
    public final long h(ath athVar) {
        Uri uri = athVar.a;
        this.b = uri;
        e(athVar);
        try {
            String path = uri.getPath();
            pse.c(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.a = randomAccessFile;
            try {
                randomAccessFile.seek(athVar.g);
                long j = athVar.h;
                if (j == -1) {
                    j = this.a.length() - athVar.g;
                }
                this.c = j;
                if (j >= 0) {
                    this.d = true;
                    f(athVar);
                    return this.c;
                }
                throw new bfo(null, null, 2008);
            } catch (IOException e) {
                throw new bfo(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new bfo(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
            }
            int i = pts.a;
            throw new bfo(e2, true != bfn.a(e2.getCause()) ? 2005 : 2006);
        } catch (SecurityException e3) {
            throw new bfo(e3, 2006);
        } catch (RuntimeException e4) {
            throw new bfo(e4, 2000);
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
                this.a = null;
                if (this.d) {
                    this.d = false;
                    d();
                }
            } catch (IOException e) {
                throw new bfo(e, 2000);
            }
        } catch (Throwable th) {
            this.a = null;
            if (this.d) {
                this.d = false;
                d();
            }
            throw th;
        }
    }
}
