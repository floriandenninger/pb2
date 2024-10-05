package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rhd implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ rff b;

    public rhd(rff rffVar, String str) {
        this.b = rffVar;
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.b.a.w();
        return this.b.a.j().q(this.a);
    }
}
