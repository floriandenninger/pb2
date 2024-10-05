package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iyt implements aapu {
    private final azrw a;
    private final Context b;
    private final aadw c;

    public iyt(Context context, azrw azrwVar, aadw aadwVar) {
        this.a = azrwVar;
        this.b = context;
        this.c = aadwVar;
    }

    @Override // defpackage.aapu
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int round;
        avgg avggVar = (avgg) obj;
        aony aonyVar = avggVar.c;
        if (aonyVar.isEmpty()) {
            return;
        }
        if (aonyVar.size() <= 1 || this.b.getResources().getConfiguration().orientation == 1) {
            ajjz ajjzVar = (ajjz) this.a.get();
            if (aonyVar.size() == 1) {
                round = 1;
            } else {
                float N = yjk.N(this.b);
                avdj avdjVar = this.c.b().u;
                if (avdjVar == null) {
                    avdjVar = avdj.a;
                }
                round = Math.round(N * avdjVar.l);
            }
            ajjzVar.n(avggVar, round, 1);
        }
    }
}
