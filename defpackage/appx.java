package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class appx implements aala {
    public static final aalb a = new appw();
    private final aakv b;
    private final appy c;

    public appx(appy appyVar, aakv aakvVar) {
        this.c = appyVar;
        this.b = aakvVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        amsvVar.j(getAvatarModel().a());
        return amsvVar.g();
    }

    @Override // defpackage.aakt
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.aakt
    public final String d() {
        return this.c.c;
    }

    @Override // defpackage.aakt
    public final /* bridge */ /* synthetic */ whu e() {
        return new appv(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof appx) && this.c.equals(((appx) obj).c);
    }

    public avgg getAvatar() {
        avgg avggVar = this.c.f;
        return avggVar == null ? avgg.a : avggVar;
    }

    public avgj getAvatarModel() {
        avgg avggVar = this.c.f;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        return avgj.b(avggVar).b(this.b);
    }

    public String getChannelId() {
        return this.c.d;
    }

    public Integer getSubscriberCount() {
        return Integer.valueOf(this.c.h);
    }

    public String getTitle() {
        return this.c.e;
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    public Integer getVideoCount() {
        return Integer.valueOf(this.c.g);
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("ChannelEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
