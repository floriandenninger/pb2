package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pfp implements pgf {
    private final ContentResolver a;
    private AssetFileDescriptor b;
    private InputStream c;
    private long d;
    private boolean e;

    public pfp(Context context) {
        this.a = context.getContentResolver();
    }

    @Override // defpackage.pfq
    public final int a(byte[] bArr, int i, int i2) {
        long j = this.d;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new pfo(e);
            }
        }
        int read = this.c.read(bArr, i, i2);
        if (read > 0) {
            long j2 = this.d;
            if (j2 != -1) {
                this.d = j2 - read;
            }
        }
        return read;
    }

    @Override // defpackage.pfq
    public final long b(pfs pfsVar) {
        try {
            pfsVar.a.toString();
            this.b = this.a.openAssetFileDescriptor(pfsVar.a, "r");
            FileInputStream fileInputStream = new FileInputStream(this.b.getFileDescriptor());
            this.c = fileInputStream;
            if (fileInputStream.skip(pfsVar.d) < pfsVar.d) {
                throw new EOFException();
            }
            long j = pfsVar.e;
            if (j != -1) {
                this.d = j;
            } else {
                j = this.c.available();
                this.d = j;
                if (j == 0) {
                    this.d = -1L;
                    j = -1;
                }
            }
            this.e = true;
            return j;
        } catch (IOException e) {
            throw new pfo(e);
        }
    }

    @Override // defpackage.pfq
    public final void c() {
        try {
            try {
                InputStream inputStream = this.c;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.c = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.b;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new pfo(e);
                    }
                } finally {
                    this.b = null;
                    if (this.e) {
                        this.e = false;
                    }
                }
            } catch (IOException e2) {
                throw new pfo(e2);
            }
        } catch (Throwable th) {
            this.c = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.b;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.b = null;
                    if (this.e) {
                        this.e = false;
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new pfo(e3);
                }
            } catch (Throwable th2) {
                this.b = null;
                if (this.e) {
                    this.e = false;
                }
                throw th2;
            }
        }
    }
}
