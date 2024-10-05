package defpackage;

import java.io.InputStream;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cfo implements Callable {
    final /* synthetic */ InputStream a;
    final /* synthetic */ String b;

    public cfo(InputStream inputStream, String str) {
        this.a = inputStream;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return cfq.c(this.a, this.b);
    }
}
