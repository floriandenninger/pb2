package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apht implements aala {
    public static final aalb a = new aphr();
    private final aphu b;

    public apht(aphu aphuVar) {
        this.b = aphuVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        return new amsv().g();
    }

    @Override // defpackage.aakt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aphs e() {
        return new aphs(this.b.toBuilder());
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
    public final boolean equals(Object obj) {
        return (obj instanceof apht) && this.b.equals(((apht) obj).b);
    }

    public apqx getStatus() {
        apqx b = apqx.b(this.b.d);
        return b == null ? apqx.CHANNEL_STATUS_UNKNOWN : b;
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
        sb.append("AvatarRowChannelStatusEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
