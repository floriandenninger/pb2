package defpackage;

import java.util.concurrent.ScheduledFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class urt {
    private static final urs d = new urs() { // from class: urn
        @Override // defpackage.urs
        public final void a(int i, String str) {
        }
    };
    public volatile urs a = d;
    public ScheduledFuture b;
    public ScheduledFuture c;

    public urt(uok uokVar, anic anicVar) {
        uokVar.a(new urp(this, anicVar));
        uokVar.a(new urr(this, anicVar));
    }

    public final void a() {
        ScheduledFuture scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.b = null;
        }
        ScheduledFuture scheduledFuture2 = this.c;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.c = null;
        }
    }
}
