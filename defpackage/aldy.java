package defpackage;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aldy {
    public final ambf a;
    private boolean b = false;
    private anhy c;
    private ScheduledFuture d;

    public aldy(ambf ambfVar) {
        this.a = ambfVar;
        ambfVar.a(new Runnable() { // from class: aldx
            @Override // java.lang.Runnable
            public final void run() {
                aldy.this.a();
            }
        }, angq.a);
    }

    public final synchronized void a() {
        this.b = true;
        anhy anhyVar = this.c;
        if (anhyVar != null) {
            anhyVar.cancel(true);
        }
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final synchronized void b(anhy anhyVar) {
        this.c = anhyVar;
        if (this.b) {
            anhyVar.cancel(true);
        }
    }

    public final synchronized void c(ScheduledFuture scheduledFuture) {
        this.d = scheduledFuture;
        if (this.b) {
            scheduledFuture.cancel(true);
        }
    }

    public final synchronized boolean d() {
        return this.b;
    }
}
