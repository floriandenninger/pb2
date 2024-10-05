package defpackage;

import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anhl implements Runnable {
    anhy a;
    Future b;

    public anhl(anhy anhyVar, Future future) {
        this.a = anhyVar;
        this.b = future;
    }

    @Override // java.lang.Runnable
    public final void run() {
        anaf.Z(this.a, this.b);
        this.a = null;
        this.b = null;
    }
}
