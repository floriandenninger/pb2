package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyg implements cyh {
    private final ctk a;
    private final List b;
    private final crk c;

    public cyg(ParcelFileDescriptor parcelFileDescriptor, List list, ctk ctkVar) {
        did.ap(ctkVar);
        this.a = ctkVar;
        did.ap(list);
        this.b = list;
        this.c = new crk(parcelFileDescriptor);
    }

    @Override // defpackage.cyh
    public final int a() {
        return gm.x(this.b, new cqf(this.c, this.a));
    }

    @Override // defpackage.cyh
    public final Bitmap b(BitmapFactory.Options options) {
        return BitmapFactory.decodeFileDescriptor(this.c.a().getFileDescriptor(), null, options);
    }

    @Override // defpackage.cyh
    public final ImageHeaderParser$ImageType c() {
        return gm.A(this.b, new cqc(this.c, this.a));
    }

    @Override // defpackage.cyh
    public final void d() {
    }
}
