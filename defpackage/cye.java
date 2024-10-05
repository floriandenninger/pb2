package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cye implements cyh {
    private final ByteBuffer a;
    private final List b;
    private final ctk c;

    public cye(ByteBuffer byteBuffer, List list, ctk ctkVar) {
        this.a = byteBuffer;
        this.b = list;
        this.c = ctkVar;
    }

    @Override // defpackage.cyh
    public final int a() {
        List list = this.b;
        ByteBuffer d = ddc.d(this.a);
        ctk ctkVar = this.c;
        if (d == null) {
            return -1;
        }
        return gm.x(list, new cqd(d, ctkVar));
    }

    @Override // defpackage.cyh
    public final Bitmap b(BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(ddc.a(ddc.d(this.a)), null, options);
    }

    @Override // defpackage.cyh
    public final ImageHeaderParser$ImageType c() {
        return gm.y(this.b, ddc.d(this.a));
    }

    @Override // defpackage.cyh
    public final void d() {
    }
}
