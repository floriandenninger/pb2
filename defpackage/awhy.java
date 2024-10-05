package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awhy implements aala {
    public static final aalb a = new awhx();
    private final awhz b;

    public awhy(awhz awhzVar) {
        this.b = awhzVar;
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
        return this.b.d;
    }

    @Override // defpackage.aakt
    public final /* bridge */ /* synthetic */ whu e() {
        return new awhw(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof awhy) && this.b.equals(((awhy) obj).b);
    }

    public Boolean getSelectQualityEveryVideoEnabled() {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("YtMainAppSettingsEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
