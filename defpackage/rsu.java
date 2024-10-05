package defpackage;

import android.app.Application;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rsu implements apo {
    private final Application a;
    private final rsy b;
    private final ruf c;

    public rsu(Application application, rsy rsyVar, ruf rufVar) {
        this.a = application;
        this.b = rsyVar;
        this.c = rufVar;
    }

    @Override // defpackage.apo
    public final apm a(Class cls) {
        amkq.F(cls == rsv.class, "LinkingStateViewMode.Factory should only be used for AccountLinkingViewModel");
        return new rsv(this.a, this.b, this.c);
    }
}
