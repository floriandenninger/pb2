package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qva {
    public final String a;

    public qva(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qva) {
            return this.a.equals(((qva) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
