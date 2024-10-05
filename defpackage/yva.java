package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yva implements yvl {
    public yui b;
    private final ScheduledExecutorService d;
    private final long e;
    private final long f;
    private ScheduledFuture h;
    private final Runnable g = new Runnable() { // from class: yuz
        @Override // java.lang.Runnable
        public final void run() {
            yva yvaVar = yva.this;
            yvaVar.b.getClass();
            int i = yvaVar.a != 2 ? 1 : 2;
            yvaVar.a = 3;
            yui yuiVar = yvaVar.b;
            yul yulVar = yuiVar.a;
            UrlRequest urlRequest = yuiVar.b;
            yulVar.e = i;
            urlRequest.cancel();
        }
    };
    public volatile int a = 0;

    public yva(ScheduledExecutorService scheduledExecutorService, long j, long j2) {
        this.d = scheduledExecutorService;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.yvl
    public final void a() {
        this.a = 3;
        ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    @Override // defpackage.yvl
    public final void b() {
        this.a = 3;
        ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    @Override // defpackage.yvl
    public final void c() {
        this.h.getClass();
        amkq.O(this.a == 2, "Read completed in non READING_RESPONSE state");
        this.h.cancel(false);
        this.h = this.d.schedule(this.g, this.f, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.yvl
    public final void d() {
        this.h.getClass();
        amkq.O(this.a == 1, "Redirect can only be received in CONNECTING state");
        this.h.cancel(false);
        this.h = this.d.schedule(this.g, this.e, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.yvl
    public final void e() {
        this.h.getClass();
        amkq.O(this.a == 1, "Response started can only be received in CONNECTING state");
        this.a = 2;
        this.h.cancel(false);
        this.h = this.d.schedule(this.g, this.f, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.yvl
    public final void f() {
        this.h.getClass();
        this.a = 3;
        this.h.cancel(false);
    }

    @Override // defpackage.yvl
    public final void g(yui yuiVar) {
        amkq.O(this.a == 0, "Other request is already being monitored");
        this.b = yuiVar;
        this.a = 1;
        this.h = this.d.schedule(this.g, this.e, TimeUnit.MILLISECONDS);
    }
}
