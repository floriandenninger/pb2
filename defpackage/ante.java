package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ante implements qqy {
    private final /* synthetic */ int a;

    public ante(int i) {
        this.a = i;
    }

    @Override // defpackage.qqy
    public final Exception a(Status status) {
        if (this.a != 0) {
            return qar.m(status);
        }
        return status.g == 8 ? new antd(status.b()) : new answ(status.b());
    }
}
