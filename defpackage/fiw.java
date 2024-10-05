package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fiw {
    public final aakt a;
    private final String b;
    private final int c;

    private fiw(String str, int i, aakt aaktVar) {
        this.b = str;
        this.c = i;
        this.a = aaktVar;
    }

    public static fiw a(aakt aaktVar) {
        String g = aalt.g(aaktVar.d());
        int i = 2;
        if ((aaktVar instanceof awil) || (aaktVar instanceof asxs) || (aaktVar instanceof asxd)) {
            i = 1;
        } else if (!(aaktVar instanceof awig) && !(aaktVar instanceof aswz)) {
            i = 3;
        }
        return new fiw(g, i, aaktVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fiw)) {
            return false;
        }
        fiw fiwVar = (fiw) obj;
        return this.b.equals(fiwVar.b) && this.c == fiwVar.c;
    }

    public final int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.c));
    }
}
