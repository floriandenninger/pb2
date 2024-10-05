package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bgc extends atb {
    private final Resources a;
    private final String b;
    private Uri c;
    private AssetFileDescriptor d;
    private InputStream e;
    private long f;
    private boolean g;

    public bgc(Context context) {
        super(false);
        this.a = context.getResources();
        this.b = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("rawresource:///");
        sb.append(i);
        return Uri.parse(sb.toString());
    }

    @Override // defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new bgb(null, e, 2000);
            }
        }
        InputStream inputStream = this.e;
        int i3 = pts.a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.f == -1) {
                return -1;
            }
            throw new bgb("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.f;
        if (j2 != -1) {
            this.f = j2 - read;
        }
        c(read);
        return read;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0039, code lost:
    
        if (r1.matches("\\d+") != false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015c  */
    @Override // defpackage.ate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(defpackage.ath r15) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgc.h(ath):long");
    }

    @Override // defpackage.ate
    public final Uri i() {
        return this.c;
    }

    @Override // defpackage.ate
    public final void j() {
        this.c = null;
        try {
            try {
                InputStream inputStream = this.e;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.d = null;
                        if (this.g) {
                            this.g = false;
                            d();
                        }
                    }
                } catch (IOException e) {
                    throw new bgb(null, e, 2000);
                }
            } catch (IOException e2) {
                throw new bgb(null, e2, 2000);
            }
        } catch (Throwable th) {
            this.e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.d = null;
                    if (this.g) {
                        this.g = false;
                        d();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new bgb(null, e3, 2000);
                }
            } catch (Throwable th2) {
                this.d = null;
                if (this.g) {
                    this.g = false;
                    d();
                }
                throw th2;
            }
        }
    }
}
