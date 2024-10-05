package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class axnn implements axnw {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        axnw axnwVar = (axnw) obj;
        return a() == axnwVar.a() && b() == axnwVar.b();
    }

    public final String toString() {
        int a = a();
        long b = b();
        StringBuilder sb = new StringBuilder(35);
        sb.append("P(");
        sb.append(a);
        sb.append("|");
        sb.append(b);
        sb.append(")");
        return sb.toString();
    }
}
