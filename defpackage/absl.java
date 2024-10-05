package defpackage;

import android.text.Spanned;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class absl {
    public int a = -1;
    public Spanned b;
    public final Runnable c;
    private final int d;

    public absl(int i, Spanned spanned, Runnable runnable) {
        this.d = i;
        this.b = spanned;
        this.c = runnable;
    }

    public final String toString() {
        int i = this.d;
        int i2 = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
        sb.append("[HealthStatus: id=");
        sb.append(i);
        sb.append(", state=");
        sb.append(i2);
        sb.append(", text=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }
}
