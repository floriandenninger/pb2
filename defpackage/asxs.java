package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asxs implements aala {
    public static final aalb a = new asxr();
    public final asxt b;
    private final aakv c;

    public asxs(asxt asxtVar, aakv aakvVar) {
        this.b = asxtVar;
        this.c = aakvVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        asxt asxtVar = this.b;
        if ((asxtVar.c & 8) != 0) {
            amsvVar.c(asxtVar.f);
        }
        asxt asxtVar2 = this.b;
        if ((asxtVar2.c & 16384) != 0) {
            amsvVar.c(asxtVar2.q);
        }
        amsvVar.j(getThumbnailModel().a());
        amsvVar.j(getFormattedDescriptionModel().a());
        getLocalizedStringsModel();
        amsvVar.j(awjl.a());
        asxu userStateModel = getUserStateModel();
        amsv amsvVar2 = new amsv();
        asxv asxvVar = userStateModel.a;
        if ((asxvVar.b & 1) != 0) {
            amsvVar2.c(asxvVar.c);
        }
        amsvVar.j(amsvVar2.g());
        return amsvVar.g();
    }

    public final asxn b() {
        aakt b = this.c.b(this.b.q);
        boolean z = true;
        if (b != null && !(b instanceof asxn)) {
            z = false;
        }
        amkq.O(z, "entityFromStore is not instance of MainVideoDownloadStateEntityModel, key=downloadState");
        return (asxn) b;
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
        return new asxq(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof asxs) && this.b.equals(((asxs) obj).b);
    }

    public final awic f() {
        aakt b = this.c.b(this.b.f);
        boolean z = true;
        if (b != null && !(b instanceof awic)) {
            z = false;
        }
        amkq.O(z, "entityFromStore is not instance of YtMainChannelEntityModel, key=owner");
        return (awic) b;
    }

    public Long getDislikeCount() {
        return Long.valueOf(this.b.n);
    }

    public aqyg getFormattedDescription() {
        aqyg aqygVar = this.b.k;
        return aqygVar == null ? aqyg.a : aqygVar;
    }

    public aqyd getFormattedDescriptionModel() {
        aqyg aqygVar = this.b.k;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        return aqyd.b(aqygVar).d(this.c);
    }

    public Integer getLengthSeconds() {
        return Integer.valueOf(this.b.i);
    }

    public Long getLikeCount() {
        return Long.valueOf(this.b.m);
    }

    public awjm getLocalizedStrings() {
        awjm awjmVar = this.b.o;
        return awjmVar == null ? awjm.a : awjmVar;
    }

    public awjl getLocalizedStringsModel() {
        awjm awjmVar = this.b.o;
        if (awjmVar == null) {
            awjmVar = awjm.a;
        }
        return awjl.b(awjmVar).d();
    }

    public Long getPublishedTimestampMillis() {
        return Long.valueOf(this.b.h);
    }

    public avgg getThumbnail() {
        avgg avggVar = this.b.j;
        return avggVar == null ? avgg.a : avggVar;
    }

    public avgj getThumbnailModel() {
        avgg avggVar = this.b.j;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        return avgj.b(avggVar).b(this.c);
    }

    public String getTitle() {
        return this.b.g;
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    public asxv getUserState() {
        asxv asxvVar = this.b.p;
        return asxvVar == null ? asxv.a : asxvVar;
    }

    public asxu getUserStateModel() {
        asxv asxvVar = this.b.p;
        if (asxvVar == null) {
            asxvVar = asxv.a;
        }
        return new asxu((asxv) asxvVar.toBuilder().build());
    }

    public String getVideoId() {
        return this.b.e;
    }

    public Long getViewCount() {
        return Long.valueOf(this.b.l);
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
        sb.append("MainVideoEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
