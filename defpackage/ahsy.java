package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahsy extends aixi {
    final /* synthetic */ long a;
    final /* synthetic */ ahsz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahsy(ahsz ahszVar, long j) {
        super(9223372036854775806L, Long.MAX_VALUE, 1, 1, null);
        this.b = ahszVar;
        this.a = j;
    }

    @Override // defpackage.aixi
    protected final void b(boolean z, boolean z2, boolean z3) {
        ahsz ahszVar = this.b;
        if (ahszVar.i) {
            Executor executor = ahszVar.a;
            final long j = this.a;
            executor.execute(new Runnable() { // from class: ahsx
                @Override // java.lang.Runnable
                public final void run() {
                    ahsy ahsyVar = ahsy.this;
                    long j2 = j;
                    ahsz ahszVar2 = ahsyVar.b;
                    ahszVar2.d.i(ahszVar2.e);
                    ahsz ahszVar3 = ahsyVar.b;
                    ahszVar3.d.i(ahszVar3.f);
                    ahsz ahszVar4 = ahsyVar.b;
                    ahszVar4.d.i(ahszVar4.g);
                    ahsz ahszVar5 = ahsyVar.b;
                    ahszVar5.d.c(ahszVar5.e);
                    ahsz ahszVar6 = ahsyVar.b;
                    ahszVar6.d.c(ahszVar6.f);
                    ahsz ahszVar7 = ahsyVar.b;
                    ahszVar7.d.c(ahszVar7.g);
                    ahsyVar.b.d(j2);
                }
            });
        }
    }
}
