package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahsw extends aixi {
    final /* synthetic */ long a;
    final /* synthetic */ ahsz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahsw(ahsz ahszVar, long j, long j2) {
        super(j, 9223372036854775806L, 1, 1, null);
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
        executor.execute(new Runnable() { // from class: ahsv
            @Override // java.lang.Runnable
            public final void run() {
                ahsw ahswVar = ahsw.this;
                ahswVar.b.d(j);
            }
        });
    }
}
