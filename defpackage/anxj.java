package defpackage;

import com.google.cardboard.sdk.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anxj {
    public final String a;
    private final long b;
    private final long c;

    public anxj() {
    }

    public anxj(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof anxj) {
            anxj anxjVar = (anxj) obj;
            if (this.a.equals(anxjVar.a) && this.b == anxjVar.b && this.c == anxjVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        long j = this.b;
        long j2 = this.c;
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        String str = this.a;
        long j = this.b;
        long j2 = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + R.styleable.AppCompatTheme_windowFixedWidthMinor);
        sb.append("InstallationTokenResult{token=");
        sb.append(str);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(j);
        sb.append(", tokenCreationTimestamp=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
