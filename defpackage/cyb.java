package defpackage;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyb implements cpz {
    @Override // defpackage.cpz
    public final int a(InputStream inputStream, ctk ctkVar) {
        int b = new amy(inputStream).b();
        if (b == 0) {
            return -1;
        }
        return b;
    }

    @Override // defpackage.cpz
    public final int b(ByteBuffer byteBuffer, ctk ctkVar) {
        return a(ddc.a(byteBuffer), ctkVar);
    }

    @Override // defpackage.cpz
    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // defpackage.cpz
    public final ImageHeaderParser$ImageType d(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
