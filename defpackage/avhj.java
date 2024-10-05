package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avhj implements aala {
    public static final aalb a = new avhi();
    private final avhk b;

    public avhj(avhk avhkVar) {
        this.b = avhkVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        getTimestampModel();
        amsvVar.j(new amsv().g());
        return amsvVar.g();
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
        return new avhh(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof avhj) && this.b.equals(((avhj) obj).b);
    }

    public String getFormattedTime() {
        return this.b.e;
    }

    public avhm getTimestamp() {
        avhm avhmVar = this.b.d;
        return avhmVar == null ? avhm.a : avhmVar;
    }

    public avhl getTimestampModel() {
        avhm avhmVar = this.b.d;
        if (avhmVar == null) {
            avhmVar = avhm.a;
        }
        return new avhl((avhm) avhmVar.toBuilder().build());
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
        sb.append("TimestampEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
