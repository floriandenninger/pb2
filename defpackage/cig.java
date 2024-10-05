package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cig {
    public static final cig a = new cig("COMPOSITION");
    public cih b;
    private final List c;

    private cig(cig cigVar) {
        this.c = new ArrayList(cigVar.c);
        this.b = cigVar.b;
    }

    private final boolean g() {
        return ((String) this.c.get(r0.size() - 1)).equals("**");
    }

    private static final boolean h(String str) {
        return "__container".equals(str);
    }

    public final int a(String str, int i) {
        if (h(str)) {
            return 0;
        }
        if (((String) this.c.get(i)).equals("**")) {
            return (i != this.c.size() + (-1) && ((String) this.c.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final cig b(String str) {
        cig cigVar = new cig(this);
        cigVar.c.add(str);
        return cigVar;
    }

    public final cig c(cih cihVar) {
        cig cigVar = new cig(this);
        cigVar.b = cihVar;
        return cigVar;
    }

    public final boolean d(String str, int i) {
        if (i >= this.c.size()) {
            return false;
        }
        int size = this.c.size() - 1;
        String str2 = (String) this.c.get(i);
        if (!str2.equals("**")) {
            return (i == size || (i == this.c.size() + (-2) && g())) && (str2.equals(str) || str2.equals("*"));
        }
        if (i == size) {
            return true;
        }
        int i2 = i + 1;
        if (((String) this.c.get(i2)).equals(str)) {
            return i == this.c.size() + (-2) || (i == this.c.size() + (-3) && g());
        }
        if (i2 < this.c.size() - 1) {
            return false;
        }
        return ((String) this.c.get(i2)).equals(str);
    }

    public final boolean e(String str, int i) {
        if (h(str)) {
            return true;
        }
        if (i >= this.c.size()) {
            return false;
        }
        return ((String) this.c.get(i)).equals(str) || ((String) this.c.get(i)).equals("**") || ((String) this.c.get(i)).equals("*");
    }

    public final boolean f(String str, int i) {
        return "__container".equals(str) || i < this.c.size() + (-1) || ((String) this.c.get(i)).equals("**");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        boolean z = this.b != null;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
        sb.append("KeyPath{keys=");
        sb.append(valueOf);
        sb.append(",resolved=");
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }

    public cig(String... strArr) {
        this.c = Arrays.asList(strArr);
    }
}
