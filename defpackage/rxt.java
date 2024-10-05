package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class rxt {
    public final Object a;
    public CharSequence b;
    public rwl c;
    public ryv d;

    public rxt(Object obj, CharSequence charSequence) {
        sbt.h(obj);
        this.a = obj;
        this.b = charSequence;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rxt) {
            rxt rxtVar = (rxt) obj;
            if (this.a.equals(rxtVar.a) && this.b.equals(rxtVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() + 31) * 31;
        CharSequence charSequence = this.b;
        return hashCode + (charSequence == null ? 0 : charSequence.hashCode());
    }

    public final String toString() {
        return String.format("{%s, \"%s\"}", this.a.toString(), this.b);
    }
}
