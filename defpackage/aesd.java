package defpackage;

import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class aesd implements afgj {
    private final long a;
    private final String b;

    public aesd(long j, String str) {
        this.a = j;
        this.b = str;
    }

    @Override // defpackage.afgj
    public final String a(long j) {
        long j2 = this.a;
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25);
        double d = j2 - j;
        Double.isNaN(d);
        sb.append(d / 1000.0d);
        sb.append(";");
        sb.append(str);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aesd) {
            aesd aesdVar = (aesd) obj;
            if (this.b.equals(aesdVar.b) && this.a == aesdVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Long.valueOf(this.a)});
    }
}
