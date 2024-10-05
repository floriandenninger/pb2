package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cfp implements Callable {
    final /* synthetic */ cfj a;

    public cfp(cfj cfjVar) {
        this.a = cfjVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return new cgf(this.a);
    }
}
