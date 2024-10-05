package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aulj implements aala {
    public static final aalb a = new auli();
    private final aulk b;

    public aulj(aulk aulkVar) {
        this.b = aulkVar;
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
        return new aulh(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof aulj) && this.b.equals(((aulj) obj).b);
    }

    public Long getSelectedChipIndex() {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38);
        sb.append("RelatedChipCloudSelectionEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
