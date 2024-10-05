package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayir implements aynx {
    @Override // defpackage.aynx
    public final /* bridge */ /* synthetic */ Object a() {
        return Executors.newCachedThreadPool(ayiu.j("grpc-default-executor-%d"));
    }

    @Override // defpackage.aynx
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    public final String toString() {
        return "grpc-default-executor";
    }
}
