package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class adgn implements Serializable {
    public final String c;

    public adgn(String str) {
        str.getClass();
        this.c = str;
    }

    public boolean equals(Object obj) {
        if (obj instanceof adgn) {
            return this.c.equals(((adgn) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return this.c;
    }
}
