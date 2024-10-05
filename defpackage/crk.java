package defpackage;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crk implements cqy {
    private final ParcelFileDescriptorRewinder$InternalRewinder a;

    public crk(ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    @Override // defpackage.cqy
    public final void b() {
    }

    @Override // defpackage.cqy
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ParcelFileDescriptor a() {
        return this.a.rewind();
    }
}
