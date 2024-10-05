package defpackage;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rnh extends rnc {
    private final qpc a;

    public rnh(qpc qpcVar) {
        this.a = qpcVar;
    }

    @Override // defpackage.rnc
    public final void b(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2) {
        Status n = rnk.n(i, bundle);
        if (bundle2 != null) {
            bundle2.getBoolean("rewindable");
            bundle2.getInt("width");
            bundle2.getInt("height");
        }
        this.a.d(new rnj(n, parcelFileDescriptor));
    }
}
