package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anir extends anhb {
    public anhy a;
    public ScheduledFuture b;

    public anir(anhy anhyVar) {
        anhyVar.getClass();
        this.a = anhyVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.anfm
    public final String b() {
        anhy anhyVar = this.a;
        ScheduledFuture scheduledFuture = this.b;
        if (anhyVar == null) {
            return null;
        }
        String valueOf = String.valueOf(anhyVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("inputFuture=[");
        sb.append(valueOf);
        sb.append("]");
        String sb2 = sb.toString();
        if (scheduledFuture == null) {
            return sb2;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return sb2;
        }
        String valueOf2 = String.valueOf(sb2);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 43);
        sb3.append(valueOf2);
        sb3.append(", remaining delay=[");
        sb3.append(delay);
        sb3.append(" ms]");
        return sb3.toString();
    }

    @Override // defpackage.anfm
    protected final void qf() {
        n(this.a);
        ScheduledFuture scheduledFuture = this.b;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.a = null;
        this.b = null;
    }
}
