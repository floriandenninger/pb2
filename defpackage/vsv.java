package defpackage;

import android.content.Context;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vsv implements poh {
    private final Context a;
    private final vsq b = new vsq();
    private final vrx c;
    private final vrw d;
    private final vyw e;

    public vsv(Context context, vrx vrxVar, vrw vrwVar, vyw vywVar) {
        this.a = context;
        this.c = vrxVar;
        this.d = vrwVar;
        this.e = vywVar;
    }

    @Override // defpackage.poh
    public final poe[] rl(Handler handler, bhn bhnVar, awb awbVar, pqb pqbVar, ppa ppaVar) {
        return new poe[]{new vsp(this.a, this.b, this.c), new vso(this.a, this.d, new vsn(this.e))};
    }
}
