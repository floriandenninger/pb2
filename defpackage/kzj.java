package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kzj implements ayrv {
    public final /* synthetic */ kzm a;
    private final /* synthetic */ int b;

    public /* synthetic */ kzj(kzm kzmVar, int i) {
        this.b = i;
        this.a = kzmVar;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        if (this.b == 0) {
            agnv agnvVar = (agnv) obj;
            jti jtiVar = this.a.a;
            agnvVar.getClass();
            kyt kytVar = (kyt) jtiVar.g(agnv.class, kyt.class, agnvVar, null);
            if (kytVar != null) {
                return kytVar;
            }
            Log.e("CommuteShelfPresenter", "offlineRendererGenerator.generateRenderer() returned null");
            return new kys().a();
        }
        agni agniVar = (agni) obj;
        jti jtiVar2 = this.a.a;
        agniVar.getClass();
        kyt kytVar2 = (kyt) jtiVar2.g(agni.class, kyt.class, agniVar, null);
        if (kytVar2 != null) {
            return kytVar2;
        }
        Log.e("CommuteShelfPresenter", "offlineRendererGenerator.generateRenderer() returned null");
        return new kys().a();
    }
}
