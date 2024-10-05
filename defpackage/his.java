package defpackage;

import android.content.Context;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class his extends pln {
    private final Context a;
    private final hir b;

    public his(Context context, hir hirVar) {
        super(context);
        this.a = context;
        this.b = hirVar;
    }

    @Override // defpackage.pln, defpackage.poh
    public final poe[] rl(Handler handler, bhn bhnVar, awb awbVar, pqb pqbVar, ppa ppaVar) {
        return new poe[]{new bgt(this.a, bae.b, 5000L, handler, bhnVar, 50), new axa(this.a, bae.b, handler, awbVar, new awx(avo.a(this.a), new awr(this.b).a)), new hil(this.a, bae.b, new him(this.b))};
    }
}
