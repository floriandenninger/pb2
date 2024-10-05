package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.UrlRequest;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yvc implements yuf {
    public final AtomicReference a;
    private final SettableFuture b;
    private final yvo c;
    private final aace d;

    public yvc(final SettableFuture settableFuture, aace aaceVar, yvo yvoVar) {
        this.b = settableFuture;
        yvoVar.getClass();
        this.c = yvoVar;
        this.d = aaceVar;
        this.a = new AtomicReference(null);
        settableFuture.d(new Runnable() { // from class: yvb
            @Override // java.lang.Runnable
            public final void run() {
                yvc yvcVar = yvc.this;
                if (!settableFuture.isCancelled() || yvcVar.a.get() == null) {
                    return;
                }
                ((UrlRequest) yvcVar.a.get()).cancel();
            }
        }, angq.a);
    }

    @Override // defpackage.yuf
    public final void a(yvo yvoVar, cnm cnmVar) {
        if (this.b.isCancelled()) {
            return;
        }
        cnq cnqVar = cnmVar.c;
        if (cnqVar != null) {
            this.b.e(cnqVar);
        } else {
            this.b.o(cnmVar);
        }
        aace aaceVar = this.d;
        if (aaceVar != null) {
            aaceVar.a(yvoVar, cnmVar);
        }
    }

    @Override // defpackage.yuf
    public final void b(UrlRequest urlRequest) {
        this.a.set(urlRequest);
    }

    @Override // defpackage.yuf
    public final boolean c() {
        return this.c.q() || this.b.isCancelled();
    }

    @Override // defpackage.yuf
    public final void d() {
        if (!this.b.isCancelled()) {
            this.b.cancel(true);
        }
        this.c.n();
    }
}
