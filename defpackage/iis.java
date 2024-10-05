package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class iis implements ayrv {
    public final /* synthetic */ ahel a;
    private final /* synthetic */ int b;

    public /* synthetic */ iis(ahel ahelVar, int i) {
        this.b = i;
        this.a = ahelVar;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return new Pair(this.a.a(), obj);
            }
            return new Pair(this.a.a(), (aheg) obj);
        }
        ahel ahelVar = this.a;
        int i2 = ijo.bC;
        return ahelVar.a().c();
    }
}
