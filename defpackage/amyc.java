package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class amyc {
    public final String a;
    public final boolean b;
    public final long c;
    private final Class d;

    /* JADX INFO: Access modifiers changed from: protected */
    public amyc(String str, Class cls, boolean z) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("identifier must not be empty");
        }
        if (!anaf.f(str.charAt(0))) {
            throw new IllegalArgumentException(str.length() != 0 ? "identifier must start with an ASCII letter: ".concat(str) : new String("identifier must start with an ASCII letter: "));
        }
        for (int i = 1; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!anaf.f(charAt) && ((charAt < '0' || charAt > '9') && charAt != '_')) {
                throw new IllegalArgumentException(str.length() != 0 ? "identifier must contain only ASCII letters, digits or underscore: ".concat(str) : new String("identifier must contain only ASCII letters, digits or underscore: "));
            }
        }
        this.a = str;
        this.d = cls;
        this.b = z;
        int identityHashCode = System.identityHashCode(this);
        long j = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            j |= 1 << (identityHashCode & 63);
            identityHashCode >>>= 6;
        }
        this.c = j;
    }

    public static amyc c(String str, Class cls) {
        return new amyc(str, cls, false);
    }

    public void a(Iterator it, amyb amybVar) {
        if (!this.b) {
            throw new IllegalStateException("non repeating key");
        }
        while (it.hasNext()) {
            b(it.next(), amybVar);
        }
    }

    public void b(Object obj, amyb amybVar) {
        amybVar.a(this.a, obj);
    }

    public final Object d(Object obj) {
        return this.d.cast(obj);
    }

    public final String toString() {
        String name = getClass().getName();
        String str = this.a;
        String name2 = this.d.getName();
        int length = String.valueOf(name).length();
        StringBuilder sb = new StringBuilder(length + 3 + str.length() + String.valueOf(name2).length());
        sb.append(name);
        sb.append("/");
        sb.append(str);
        sb.append("[");
        sb.append(name2);
        sb.append("]");
        return sb.toString();
    }
}
