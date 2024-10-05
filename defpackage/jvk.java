package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class jvk implements Callable {
    final String a;
    final /* synthetic */ jvl b;

    public jvk(jvl jvlVar, String str) {
        this.b = jvlVar;
        zhq.m(str);
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return ((agof) this.b.b.get()).a().i().c(this.a);
    }
}
