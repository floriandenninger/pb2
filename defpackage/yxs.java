package defpackage;

import java.util.Arrays;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yxs {
    public final long[] a;
    public final long[] b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final ScheduledFuture h;

    public yxs() {
    }

    public yxs(long[] jArr, long[] jArr2, boolean z, int i, int i2, int i3, int i4, ScheduledFuture scheduledFuture) {
        this.a = jArr;
        this.b = jArr2;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = scheduledFuture;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final boolean b(int i) {
        return wbs.au(i, yyf.d) == 1;
    }

    public final boolean a() {
        return this.d != 0;
    }

    public final yxr c() {
        return new yxr(this);
    }

    public final boolean equals(Object obj) {
        long[] jArr;
        if (obj == this) {
            return true;
        }
        if (obj instanceof yxs) {
            yxs yxsVar = (yxs) obj;
            boolean z = yxsVar instanceof yxs;
            if (Arrays.equals(this.a, z ? yxsVar.a : yxsVar.a)) {
                long[] jArr2 = this.b;
                if (z) {
                    jArr = yxsVar.b;
                } else {
                    jArr = yxsVar.b;
                }
                if (Arrays.equals(jArr2, jArr) && this.c == yxsVar.c && this.d == yxsVar.d && this.e == yxsVar.e && this.f == yxsVar.f && this.g == yxsVar.g) {
                    ScheduledFuture scheduledFuture = this.h;
                    ScheduledFuture scheduledFuture2 = yxsVar.h;
                    if (scheduledFuture != null ? scheduledFuture.equals(scheduledFuture2) : scheduledFuture2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((((Arrays.hashCode(this.a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003;
        ScheduledFuture scheduledFuture = this.h;
        return hashCode ^ (scheduledFuture == null ? 0 : scheduledFuture.hashCode());
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        String arrays2 = Arrays.toString(this.b);
        boolean z = this.c;
        int i = this.d;
        int i2 = this.e;
        int i3 = this.f;
        int i4 = this.g;
        String valueOf = String.valueOf(this.h);
        int length = String.valueOf(arrays).length();
        StringBuilder sb = new StringBuilder(length + 160 + String.valueOf(arrays2).length() + String.valueOf(valueOf).length());
        sb.append("Guts{active=");
        sb.append(arrays);
        sb.append(", serialized=");
        sb.append(arrays2);
        sb.append(", isDirty=");
        sb.append(z);
        sb.append(", disposed=");
        sb.append(i);
        sb.append(", shutdownLikely=");
        sb.append(i2);
        sb.append(", changeCount=");
        sb.append(i3);
        sb.append(", serialDelaySec=");
        sb.append(i4);
        sb.append(", serializeTask=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
