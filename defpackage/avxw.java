package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avxw implements aala {
    public static final aalb a = new avxv();
    private final aakv b;
    private final avxx c;

    public avxw(avxx avxxVar, aakv aakvVar) {
        this.c = avxxVar;
        this.b = aakvVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        avxx avxxVar = this.c;
        if ((avxxVar.b & 4) != 0) {
            amsvVar.c(avxxVar.e);
        }
        amsvVar.j(getThumbnailDetailsModel().a());
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
        return new avxu(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof avxw) && this.c.equals(((avxw) obj).c);
    }

    public Integer getPercentDurationWatched() {
        return Integer.valueOf(this.c.k);
    }

    public avgg getThumbnailDetails() {
        avgg avggVar = this.c.j;
        return avggVar == null ? avgg.a : avggVar;
    }

    public avgj getThumbnailDetailsModel() {
        avgg avggVar = this.c.j;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        return avgj.b(avggVar).b(this.b);
    }

    public Long getTimePublished() {
        return Long.valueOf(this.c.h);
    }

    public String getTitle() {
        return this.c.f;
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    public String getVideoId() {
        return this.c.d;
    }

    public Integer getVideoLength() {
        return Integer.valueOf(this.c.i);
    }

    public Long getViewCount() {
        return Long.valueOf(this.c.g);
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
        sb.append("VideoEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
