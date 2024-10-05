package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyf implements cyh {
    private final crh a;
    private final ctk b;
    private final List c;

    public cyf(InputStream inputStream, List list, ctk ctkVar) {
        did.ap(ctkVar);
        this.b = ctkVar;
        did.ap(list);
        this.c = list;
        this.a = new crh(inputStream, ctkVar);
    }

    @Override // defpackage.cyh
    public final int a() {
        return gm.w(this.c, this.a.a(), this.b);
    }

    @Override // defpackage.cyh
    public final Bitmap b(BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(this.a.a(), null, options);
    }

    @Override // defpackage.cyh
    public final ImageHeaderParser$ImageType c() {
        return gm.z(this.c, this.a.a(), this.b);
    }

    @Override // defpackage.cyh
    public final void d() {
        this.a.a.a();
    }
}
