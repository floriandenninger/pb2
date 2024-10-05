package defpackage;

import android.os.ParcelFileDescriptor;
import java.nio.channels.FileChannel;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bafl implements bafn {
    final /* synthetic */ ParcelFileDescriptor a;

    public bafl(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = parcelFileDescriptor;
    }

    @Override // defpackage.bafn
    public final FileChannel a() {
        if (this.a.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(this.a).getChannel();
        }
        this.a.close();
        throw new IllegalArgumentException("Not a file: " + this.a);
    }
}
