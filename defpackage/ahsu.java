package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahsu extends aixi {
    final /* synthetic */ long a;
    final /* synthetic */ ahsz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahsu(ahsz ahszVar, long j, long j2) {
        super(-9223372036854775806L, j, 1, 1, null);
        this.b = ahszVar;
        this.a = j2;
    }

    @Override // defpackage.aixi
    protected final void b(boolean z, boolean z2, boolean z3) {
        ahsz ahszVar = this.b;
        if (z2) {
            ahszVar.f(0);
            return;
        }
        Executor executor = ahszVar.a;
        final long j = this.a;
        executor.execute(new Runnable() { // from class: ahst
            @Override // java.lang.Runnable
            public final void run() {
                ahsu ahsuVar = ahsu.this;
                ahsuVar.b.d(j);
            }
        });
    }
}
