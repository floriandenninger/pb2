package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bfc extends atb {
    private final ContentResolver a;
    private Uri b;
    private AssetFileDescriptor c;
    private FileInputStream d;
    private long e;
    private boolean f;

    public bfc(Context context) {
        super(false);
        this.a = context.getContentResolver();
    }

    @Override // defpackage.atc
    public final int g(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new bfb(e, 2000);
            }
        }
        FileInputStream fileInputStream = this.d;
        int i3 = pts.a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.e;
        if (j2 != -1) {
            this.e = j2 - read;
        }
        c(read);
        return read;
    }

    @Override // defpackage.ate
    public final long h(ath athVar) {
        AssetFileDescriptor openAssetFileDescriptor;
        long j;
        try {
            Uri uri = athVar.a;
            this.b = uri;
            e(athVar);
            if ("content".equals(athVar.a.getScheme())) {
                Bundle bundle = new Bundle();
                if (pts.a >= 31) {
                    bfa.a(bundle);
                }
                openAssetFileDescriptor = this.a.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                openAssetFileDescriptor = this.a.openAssetFileDescriptor(uri, "r");
            }
            this.c = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Could not open file descriptor for: ");
                sb.append(valueOf);
                throw new bfb(new IOException(sb.toString()), 2000);
            }
            long length = openAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
            this.d = fileInputStream;
            if (length != -1 && athVar.g > length) {
                throw new bfb(null, 2008);
            }
            long startOffset = openAssetFileDescriptor.getStartOffset();
            long skip = fileInputStream.skip(athVar.g + startOffset) - startOffset;
            if (skip != athVar.g) {
                throw new bfb(null, 2008);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.e = -1L;
                    j = -1;
                } else {
                    j = size - channel.position();
                    this.e = j;
                    if (j < 0) {
                        throw new bfb(null, 2008);
                    }
                }
            } else {
                long j2 = length - skip;
                this.e = j2;
                if (j2 < 0) {
                    throw new bfb(null, 2008);
                }
                j = j2;
            }
            long j3 = athVar.h;
            if (j3 != -1) {
                if (j != -1) {
                    j3 = Math.min(j, j3);
                }
                this.e = j3;
            }
            this.f = true;
            f(athVar);
            long j4 = athVar.h;
            return j4 != -1 ? j4 : this.e;
        } catch (bfb e) {
            throw e;
        } catch (IOException e2) {
            throw new bfb(e2, true == (e2 instanceof FileNotFoundException) ? 2005 : 2000);
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
                FileInputStream fileInputStream = this.d;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.d = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.c = null;
                        if (this.f) {
                            this.f = false;
                            d();
                        }
                    }
                } catch (IOException e) {
                    throw new bfb(e, 2000);
                }
            } catch (IOException e2) {
                throw new bfb(e2, 2000);
            }
        } catch (Throwable th) {
            this.d = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.c = null;
                    if (this.f) {
                        this.f = false;
                        d();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new bfb(e3, 2000);
                }
            } catch (Throwable th2) {
                this.c = null;
                if (this.f) {
                    this.f = false;
                    d();
                }
                throw th2;
            }
        }
    }
}
