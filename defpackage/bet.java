package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bet extends atb {
    private final AssetManager a;
    private Uri b;
    private InputStream c;
    private long d;
    private boolean e;

    public bet(Context context) {
        super(false);
        this.a = context.getAssets();
    }

    @Override // defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.d;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new bes(e, 2000);
            }
        }
        InputStream inputStream = this.c;
        int i3 = pts.a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.d;
        if (j2 != -1) {
            this.d = j2 - read;
        }
        c(read);
        return read;
    }

    @Override // defpackage.ate
    public final long h(ath athVar) {
        try {
            Uri uri = athVar.a;
            this.b = uri;
            String path = uri.getPath();
            pse.c(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            e(athVar);
            InputStream open = this.a.open(path, 1);
            this.c = open;
            if (open.skip(athVar.g) < athVar.g) {
                throw new bes(null, 2008);
            }
            long j = athVar.h;
            if (j != -1) {
                this.d = j;
            } else {
                long available = this.c.available();
                this.d = available;
                if (available == 2147483647L) {
                    this.d = -1L;
                }
            }
            this.e = true;
            f(athVar);
            return this.d;
        } catch (bes e) {
            throw e;
        } catch (IOException e2) {
            throw new bes(e2, true != (e2 instanceof FileNotFoundException) ? 2000 : 2005);
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
                InputStream inputStream = this.c;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.c = null;
                if (this.e) {
                    this.e = false;
                    d();
                }
            } catch (IOException e) {
                throw new bes(e, 2000);
            }
        } catch (Throwable th) {
            this.c = null;
            if (this.e) {
                this.e = false;
                d();
            }
            throw th;
        }
    }
}
