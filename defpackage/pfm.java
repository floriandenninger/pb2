package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pfm implements pgf {
    private final AssetManager a;
    private InputStream b;
    private long c;
    private boolean d;

    public pfm(Context context) {
        this.a = context.getAssets();
    }

    @Override // defpackage.pfq
    public final int a(byte[] bArr, int i, int i2) {
        long j = this.c;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new pfl(e);
            }
        }
        int read = this.b.read(bArr, i, i2);
        if (read > 0) {
            long j2 = this.c;
            if (j2 != -1) {
                this.c = j2 - read;
            }
        }
        return read;
    }

    @Override // defpackage.pfq
    public final long b(pfs pfsVar) {
        try {
            pfsVar.a.toString();
            String path = pfsVar.a.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            pfsVar.a.toString();
            InputStream open = this.a.open(path, 1);
            this.b = open;
            if (open.skip(pfsVar.d) < pfsVar.d) {
                throw new EOFException();
            }
            long j = pfsVar.e;
            if (j != -1) {
                this.c = j;
            } else {
                j = this.b.available();
                this.c = j;
                if (j == 2147483647L) {
                    this.c = -1L;
                    j = -1;
                }
            }
            this.d = true;
            return j;
        } catch (IOException e) {
            throw new pfl(e);
        }
    }

    @Override // defpackage.pfq
    public final void c() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            try {
                try {
                    inputStream.close();
                    this.b = null;
                    if (this.d) {
                        this.d = false;
                    }
                } catch (IOException e) {
                    throw new pfl(e);
                }
            } catch (Throwable th) {
                this.b = null;
                if (this.d) {
                    this.d = false;
                }
                throw th;
            }
        }
    }
}
