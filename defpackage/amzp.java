package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amzp {
    public final anav a;
    public final String b;

    public amzp(anav anavVar, String str) {
        anaf.d(anavVar, "parser");
        this.a = anavVar;
        anaf.d(str, "message");
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof amzp) {
            amzp amzpVar = (amzp) obj;
            if (this.a.equals(amzpVar.a) && this.b.equals(amzpVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }
}
