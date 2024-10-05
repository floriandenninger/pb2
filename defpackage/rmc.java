package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rmc extends FileInputStream implements vdq, vdg {
    private final ParcelFileDescriptor a;

    public rmc(ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor.getFileDescriptor());
        this.a = parcelFileDescriptor;
    }

    @Override // defpackage.vdq
    public final Long a() {
        return Long.valueOf(this.a.getStatSize());
    }

    @Override // defpackage.vdg
    public final FileChannel b() {
        return getChannel();
    }

    @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } finally {
            this.a.close();
        }
    }
}
