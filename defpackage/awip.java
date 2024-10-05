package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awip implements aala {
    public static final aalb a = new awio();
    private final awiq b;

    public awip(awiq awiqVar) {
        this.b = awiqVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        awiq awiqVar = this.b;
        if ((awiqVar.c & 4) != 0) {
            amsvVar.c(awiqVar.e);
        }
        awiq awiqVar2 = this.b;
        if ((awiqVar2.c & 8) != 0) {
            amsvVar.c(awiqVar2.f);
        }
        return amsvVar.g();
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
        return new awin(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof awip) && this.b.equals(((awip) obj).b);
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
        sb.append("YtMainDownloadsLibraryEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
