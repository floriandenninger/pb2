package defpackage;

import android.util.Pair;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class goq implements Callable {
    final /* synthetic */ gor a;

    public goq(gor gorVar) {
        this.a = gorVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        ainy ainyVar = (ainy) this.a.a.get();
        return Pair.create(ainyVar.q(), Long.valueOf(ainyVar.n().b()));
    }
}
