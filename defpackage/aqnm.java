package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqnm {
    public final aakv a;
    public final aqnq b;

    public aqnm(aqnq aqnqVar, aakv aakvVar) {
        this.b = aqnqVar;
        this.a = aakvVar;
    }

    public static awxk a() {
        return new awxk((byte[]) null, (short[]) null);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof aqnm) && this.b.equals(((aqnm) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("CollageThumbnailModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
