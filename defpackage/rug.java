package defpackage;

import android.app.Application;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rug implements apo {
    private final Application a;
    private final rsy b;

    public rug(Application application, rsy rsyVar) {
        this.a = application;
        this.b = rsyVar;
    }

    @Override // defpackage.apo
    public final apm a(Class cls) {
        amkq.F(cls == ruh.class, "LinkingStateViewMode.Factory should only be used for AccountLinkingViewModel");
        return new ruh(this.a, this.b);
    }
}
