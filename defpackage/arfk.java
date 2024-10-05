package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arfk implements aala {
    public static final aalb a = new arfj();
    public final arfl b;

    public arfk(arfl arflVar) {
        this.b = arflVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        return new amsv().g();
    }

    @Override // defpackage.aakt
    public final byte[] c() {
        return this.b.toByteArray();
    }

    @Override // defpackage.aakt
    public final String d() {
        return this.b.c;
    }

    @Override // defpackage.aakt
    public final /* bridge */ /* synthetic */ whu e() {
        return new arfi(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof arfk) && this.b.equals(((arfk) obj).b);
    }

    public String getBadgeText() {
        return this.b.d;
    }

    public Boolean getIsVisible() {
        return Boolean.valueOf(this.b.e);
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("IconBadgeEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
