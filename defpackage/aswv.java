package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aswv implements aala {
    public static final aalb a = new aswu();
    private final asww b;

    public aswv(asww aswwVar) {
        this.b = aswwVar;
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
        return new aswt(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof aswv) && this.b.equals(((aswv) obj).b);
    }

    public asws getGenerationStatus() {
        asws b = asws.b(this.b.e);
        return b == null ? asws.GENERATION_STATUS_UNKNOWN : b;
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
        sb.append("MainOfflineGenerationStatusEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
