package defpackage;

import com.google.protos.youtube.api.innertube.LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class exu implements aaha {
    private final agsg a;
    private final azrw b;
    private final agto c;

    public exu(agsg agsgVar, azrw azrwVar, agto agtoVar) {
        this.a = agsgVar;
        this.b = azrwVar;
        this.c = agtoVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        if (apxfVar.pY(LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.localWatchHistoryCommand)) {
            LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand = (LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand) apxfVar.pX(LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.localWatchHistoryCommand);
            String d = ((agof) this.b.get()).d();
            int dc = amkq.dc(localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.b);
            if (dc == 0) {
                dc = 1;
            }
            int i = dc - 1;
            if (i != 1) {
                if (i == 2) {
                    this.c.a();
                    return;
                } else if (i == 3) {
                    this.a.I(d, true);
                    return;
                } else {
                    if (i != 4) {
                        return;
                    }
                    this.a.I(d, false);
                    return;
                }
            }
            if (localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.c.isEmpty()) {
                return;
            }
            agto agtoVar = this.c;
            String str = localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.c;
            anhy anhyVar = agtoVar.h;
            if (anhyVar == null || anhyVar.isCancelled() || agtoVar.h.isDone()) {
                agtoVar.h = anfq.i(anht.q(anaf.O(((agof) agtoVar.e.get()).a())), new jrq(str, 2), agtoVar.a);
                ynm.k(agtoVar.h, angq.a, afka.p, new agtl(agtoVar, 1));
            }
        }
    }
}
