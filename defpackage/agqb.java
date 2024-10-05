package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class agqb implements anfz {
    public final /* synthetic */ amru a;
    public final /* synthetic */ ScheduledExecutorService b;
    public final /* synthetic */ amsx c;
    public final /* synthetic */ anhy d;
    private final /* synthetic */ int e;

    public /* synthetic */ agqb(amru amruVar, ScheduledExecutorService scheduledExecutorService, amsx amsxVar, anhy anhyVar, int i) {
        this.e = i;
        this.a = amruVar;
        this.b = scheduledExecutorService;
        this.c = amsxVar;
        this.d = anhyVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        if (this.e == 0) {
            amru amruVar = this.a;
            ScheduledExecutorService scheduledExecutorService = this.b;
            amsx amsxVar = this.c;
            return aedn.F(aedn.G((anhy) amruVar.get(0), true == (((Exception) obj) instanceof TimeoutException) ? 1 : 2, scheduledExecutorService), amsxVar, new agqb(amruVar, scheduledExecutorService, amsxVar, this.d, 1), scheduledExecutorService);
        }
        amru amruVar2 = this.a;
        final ScheduledExecutorService scheduledExecutorService2 = this.b;
        amsx amsxVar2 = this.c;
        final anhy anhyVar = this.d;
        return aedn.F(aedn.G((anhy) amruVar2.get(1), 2, scheduledExecutorService2), amsxVar2, new anfz() { // from class: agqc
            @Override // defpackage.anfz
            public final anhy a(Object obj2) {
                return aedn.G(anhy.this, 0, scheduledExecutorService2);
            }
        }, scheduledExecutorService2);
    }
}
