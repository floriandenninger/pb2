package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class pln implements poh {
    private final Context a;
    private final bae b = bae.b;

    public pln(Context context) {
        this.a = context;
    }

    @Override // defpackage.poh
    public poe[] rl(Handler handler, bhn bhnVar, awb awbVar, pqb pqbVar, ppa ppaVar) {
        ArrayList arrayList = new ArrayList();
        bgt bgtVar = new bgt(this.a, azx.a, this.b, 5000L, handler, bhnVar, 50);
        bgtVar.k = false;
        bgtVar.l = false;
        bgtVar.m = false;
        arrayList.add(bgtVar);
        awx awxVar = new awx(avo.a(this.a), new awr(new avr[0]), 0);
        axa axaVar = new axa(this.a, azx.a, this.b, handler, awbVar, awxVar);
        axaVar.k = false;
        axaVar.l = false;
        axaVar.m = false;
        arrayList.add(axaVar);
        arrayList.add(new pqc(pqbVar, handler.getLooper()));
        arrayList.add(new ppb(ppaVar, handler.getLooper()));
        arrayList.add(new bho());
        return (poe[]) arrayList.toArray(new poe[0]);
    }
}
