package defpackage;

import io.grpc.Status;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aygb implements Runnable {
    final /* synthetic */ aygc a;
    private final long b;

    public aygb(aygc aygcVar, long j) {
        this.a = aygcVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ayiz ayizVar = new ayiz();
        this.a.e.b(ayizVar);
        long abs = Math.abs(this.b) / TimeUnit.SECONDS.toNanos(1L);
        long abs2 = Math.abs(this.b) % TimeUnit.SECONDS.toNanos(1L);
        StringBuilder sb = new StringBuilder();
        sb.append("deadline exceeded after ");
        if (this.b < 0) {
            sb.append('-');
        }
        sb.append(abs);
        sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        sb.append("s. ");
        sb.append(ayizVar);
        this.a.e.c(Status.f.a(sb.toString()));
    }
}
