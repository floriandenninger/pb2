package defpackage;

import java.util.Collections;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anam {
    public static final Comparator a = new ahaa(5);
    public static final anam b = new anam(new anak(Collections.emptyList()));
    public final anak c;

    private anam(anak anakVar) {
        this.c = anakVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof anam) && ((anam) obj).c.equals(this.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ (-1);
    }

    public final String toString() {
        return this.c.toString();
    }
}
