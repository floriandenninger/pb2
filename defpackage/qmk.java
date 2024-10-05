package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qmk extends qmi {
    public qmk(int i, Bundle bundle) {
        super(i, 1, bundle);
    }

    @Override // defpackage.qmi
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // defpackage.qmi
    public final boolean b() {
        return false;
    }
}
