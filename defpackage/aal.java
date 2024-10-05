package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import androidx.activity.result.IntentSenderRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aal {
    public Intent a;
    private final IntentSender b;
    private int c;
    private int d;

    public aal(IntentSender intentSender) {
        this.b = intentSender;
    }

    public final IntentSenderRequest a() {
        return new IntentSenderRequest(this.b, this.a, this.c, this.d);
    }

    public final void b(int i, int i2) {
        this.d = i;
        this.c = i2;
    }
}
