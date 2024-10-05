package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auld implements aala {
    public static final aalb a = new aulc();
    private final aule b;

    public auld(aule auleVar) {
        this.b = auleVar;
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
        return new aulb(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof auld) && this.b.equals(((auld) obj).b);
    }

    public Long getRefreshTime() {
        return Long.valueOf(this.b.d);
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("RefreshEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
