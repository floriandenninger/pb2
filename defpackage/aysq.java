package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aysq implements Callable, ayrv {
    public final Object a;

    public aysq(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        return this.a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a;
    }
}
