package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qmh extends qmi {
    public qmh(int i, Bundle bundle) {
        super(i, 2, bundle);
    }

    @Override // defpackage.qmi
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new qmj("Invalid response to one way request"));
        }
    }

    @Override // defpackage.qmi
    public final boolean b() {
        return true;
    }
}
