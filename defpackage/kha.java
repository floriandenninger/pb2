package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kha implements ayrv {
    public final /* synthetic */ aypn a;
    private final /* synthetic */ int b;

    public /* synthetic */ kha(aypn aypnVar, int i) {
        this.b = i;
        this.a = aypnVar;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            aypn aypnVar = this.a;
            khl khlVar = khb.b;
            return ((Boolean) obj).booleanValue() ? aypnVar : aypn.r();
        }
        if (i != 1) {
            if (i != 2) {
                return ((Boolean) obj).booleanValue() ? this.a : aypn.r();
            }
            return ((nrl) obj) == nrl.NON_ENGAGEMENT_PANEL ? aypn.r() : this.a;
        }
        aypn aypnVar2 = this.a;
        aypn C = aypn.C(aypnVar2.ai(), aypn.Q(khb.a.toMillis(), TimeUnit.MILLISECONDS));
        aysw.b(C, "other is null");
        azau azauVar = new azau(aypnVar2, C);
        ayrv ayrvVar = aynu.j;
        return azauVar;
    }
}
