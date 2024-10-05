package defpackage;

import android.content.BroadcastReceiver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tyt {
    private final BroadcastReceiver.PendingResult a;
    private final boolean b;
    private final int c;
    private boolean d;

    public tyt(BroadcastReceiver.PendingResult pendingResult, boolean z, int i) {
        this.a = pendingResult;
        this.b = z;
        this.c = i;
    }

    public final synchronized void a() {
        if (this.d) {
            tzk.a("BroadcastAsyncOperation", "Already finished BroadcastAsyncOperation [%d]", Integer.valueOf(this.c));
            return;
        }
        if (this.b) {
            this.a.setResultCode(-1);
        }
        this.a.finish();
        this.d = true;
        tzk.a("BroadcastAsyncOperation", "Finished BroadcastAsyncOperation [%d]", Integer.valueOf(this.c));
    }

    public final String toString() {
        int i = this.c;
        StringBuilder sb = new StringBuilder(48);
        sb.append("BroadcastAsyncOperation{executionId=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}
