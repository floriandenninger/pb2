package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rmd extends FileOutputStream implements vdr, vdg {
    private final ParcelFileDescriptor a;

    public rmd(ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor.getFileDescriptor());
        this.a = parcelFileDescriptor;
    }

    @Override // defpackage.vdr
    public final void a() {
        getFD().sync();
    }

    @Override // defpackage.vdg
    public final FileChannel b() {
        return getChannel();
    }

    @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } finally {
            this.a.close();
        }
    }
}
