package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rnj implements rmu {
    private final Status a;
    private final ParcelFileDescriptor b;

    public rnj(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = status;
        this.b = parcelFileDescriptor;
    }

    @Override // defpackage.qom
    public final Status a() {
        return this.a;
    }

    @Override // defpackage.qoj
    public final void b() {
        ParcelFileDescriptor parcelFileDescriptor = this.b;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.rmu
    public final ParcelFileDescriptor c() {
        return this.b;
    }
}
