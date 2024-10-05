package defpackage;

import com.google.apps.tiktok.concurrent.futuresmixin.FuturesMixinViewModel;
import com.google.apps.tiktok.dataservice.SubscriptionMixinViewModel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class efo implements azrw {
    private final int a;
    private final eic b;

    public efo(eic eicVar, int i) {
        this.b = eicVar;
        this.a = i;
    }

    @Override // defpackage.azrw
    public final Object get() {
        if (this.a != 0) {
            eic eicVar = this.b;
            Object obj = eicVar.b.aD.get();
            return new SubscriptionMixinViewModel();
        }
        eic eicVar2 = this.b;
        return new FuturesMixinViewModel(eicVar2.a, (anic) eicVar2.b.h.get());
    }
}
