package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ihd implements iii {
    final /* synthetic */ anhh a;
    final /* synthetic */ long b;
    final /* synthetic */ ihl c;
    private final /* synthetic */ int d;

    public ihd(ihl ihlVar, anhh anhhVar, long j, int i) {
        this.d = i;
        this.c = ihlVar;
        this.a = anhhVar;
        this.b = j;
    }

    @Override // defpackage.iii
    public final void a() {
        if (this.d != 0) {
            this.a.qg(new Exception("ReelWatchSequence has error response"));
        } else {
            this.a.qg(new Exception("ReelWatchSequence has error response"));
        }
    }

    @Override // defpackage.iii
    public final void b() {
        if (this.d == 0) {
            this.a.b(Optional.ofNullable(this.c.n.I(this.b)));
        } else {
            this.a.b(Optional.ofNullable(this.c.n.H(this.b)));
        }
    }
}
