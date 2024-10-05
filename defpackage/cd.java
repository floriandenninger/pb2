package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cd {
    final /* synthetic */ abb a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ aam c;
    final /* synthetic */ aac d;
    final /* synthetic */ ce e;

    public cd() {
    }

    public cd(ce ceVar, abb abbVar, AtomicReference atomicReference, aam aamVar, aac aacVar) {
        this.e = ceVar;
        this.a = abbVar;
        this.b = atomicReference;
        this.c = aamVar;
        this.d = aacVar;
    }

    public final void a() {
        ce ceVar = this.e;
        this.b.set(((aaj) this.a.a(null)).b("fragment_" + ceVar.l + "_rq#" + ceVar.ac.getAndIncrement(), this.e, this.c, this.d));
    }
}
