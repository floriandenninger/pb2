package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class qmw implements rps {
    private final /* synthetic */ int c;
    public static final /* synthetic */ qmw b = new qmw(1);
    public static final /* synthetic */ qmw a = new qmw(0);

    private /* synthetic */ qmw(int i) {
        this.c = i;
    }

    @Override // defpackage.rps
    public final rpt a(Object obj) {
        if (this.c == 0) {
            return rqr.c(null);
        }
        Bundle bundle = (Bundle) obj;
        if (qms.d(bundle)) {
            return rqr.c(null);
        }
        return rqr.c(bundle);
    }
}
