package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eic implements axpp, axqj {
    public final aph a;
    public final efz b;
    private azrw c;
    private azrw d;
    private final eic e;

    public eic(efz efzVar, aph aphVar) {
        this.e = this;
        this.b = efzVar;
        this.a = aphVar;
        this.c = new efo(this, 0);
        this.d = new efo(this, 1);
    }

    @Override // defpackage.axpp
    public final Map a() {
        return amrz.l("com.google.apps.tiktok.concurrent.futuresmixin.FuturesMixinViewModel", this.c, "com.google.apps.tiktok.dataservice.SubscriptionMixinViewModel", this.d);
    }

    public eic() {
    }
}
