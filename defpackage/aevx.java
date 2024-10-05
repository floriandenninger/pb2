package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aevx implements Callable {
    final /* synthetic */ aevy a;
    private final bbr b;
    private final long c;
    private final long d;
    private final afhs e;

    public aevx(aevy aevyVar, bbr bbrVar, long j, long j2, afhs afhsVar) {
        this.a = aevyVar;
        this.b = bbrVar;
        this.c = j;
        this.d = j2;
        this.e = afhsVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        boolean c = this.a.e.c(this.c);
        aevw aevwVar = this.a.g;
        if (aevwVar == null || aevwVar.a != this.b) {
            if (aevwVar != null) {
                if (aevwVar.c == null) {
                    if (this.e.v()) {
                        aevy aevyVar = this.a;
                        if (!aevyVar.f.contains(aevyVar.g)) {
                            this.a.d.g(new afih("player.exception", this.d, "c.SetNextMediaSource"));
                            aevy aevyVar2 = this.a;
                            aevyVar2.f.remove(aevyVar2.g);
                        }
                    }
                    aevy aevyVar3 = this.a;
                    aevyVar3.y(aevyVar3.g);
                    aevy aevyVar22 = this.a;
                    aevyVar22.f.remove(aevyVar22.g);
                } else {
                    aevwVar.d = true;
                }
                c = true;
            }
            this.a.g = new aevw(this.b);
            this.a.g.b(this.d);
            aevy aevyVar4 = this.a;
            aevw aevwVar2 = aevyVar4.g;
            aevyVar4.x(aevwVar2, aevwVar2.a);
            aevy aevyVar5 = this.a;
            aevw aevwVar3 = aevyVar5.g;
            if (aevwVar3 != null) {
                aevyVar5.f.add(aevwVar3);
            }
        } else {
            c |= aevwVar.b(this.d);
        }
        return Boolean.valueOf(c);
    }
}
