package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awic implements aala {
    public static final aalb a = new awib();
    public final awid b;
    private final aakv c;

    public awic(awid awidVar, aakv aakvVar) {
        this.b = awidVar;
        this.c = aakvVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        amsvVar.j(getAvatarModel().a());
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
        return new awia(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof awic) && this.b.equals(((awic) obj).b);
    }

    public avgg getAvatar() {
        avgg avggVar = this.b.g;
        return avggVar == null ? avgg.a : avggVar;
    }

    public avgj getAvatarModel() {
        avgg avggVar = this.b.g;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        return avgj.b(avggVar).b(this.c);
    }

    public String getChannelId() {
        return this.b.e;
    }

    public String getTitle() {
        return this.b.f;
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("YtMainChannelEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
