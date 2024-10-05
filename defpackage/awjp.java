package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awjp implements aala {
    public static final aalb a = new awjo();
    public final awjq b;
    private final aakv c;

    public awjp(awjq awjqVar, aakv aakvVar) {
        this.b = awjqVar;
        this.c = aakvVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        awjq awjqVar = this.b;
        if ((awjqVar.c & 8) != 0) {
            amsvVar.c(awjqVar.f);
        }
        awjq awjqVar2 = this.b;
        if ((awjqVar2.c & 8192) != 0) {
            amsvVar.c(awjqVar2.p);
        }
        awjq awjqVar3 = this.b;
        if ((awjqVar3.c & 32768) != 0) {
            amsvVar.c(awjqVar3.r);
        }
        amsvVar.j(getThumbnailModel().a());
        amsvVar.j(getDescriptionModel().a());
        amsvVar.j(getFormattedDescriptionModel().a());
        getLocalizedStringsModel();
        amsvVar.j(awjl.a());
        return amsvVar.g();
    }

    public final avzf b() {
        aakt b = this.c.b(this.b.p);
        boolean z = true;
        if (b != null && !(b instanceof avzf)) {
            z = false;
        }
        amkq.O(z, "entityFromStore is not instance of VideoPlaybackPositionEntityModel, key=playbackPosition");
        return (avzf) b;
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
        return new awjn(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof awjp) && this.b.equals(((awjp) obj).b);
    }

    public final awic f() {
        aakt b = this.c.b(this.b.f);
        boolean z = true;
        if (b != null && !(b instanceof awic)) {
            z = false;
        }
        amkq.O(z, "entityFromStore is not instance of YtMainChannelEntityModel, key=channelOwner");
        return (awic) b;
    }

    public final String g() {
        return this.b.f;
    }

    public awnd getDescription() {
        awnd awndVar = this.b.k;
        return awndVar == null ? awnd.a : awndVar;
    }

    public awmv getDescriptionModel() {
        awnd awndVar = this.b.k;
        if (awndVar == null) {
            awndVar = awnd.a;
        }
        return awmv.b(awndVar).c(this.c);
    }

    public Long getDislikeCount() {
        return Long.valueOf(this.b.o);
    }

    public aqyg getFormattedDescription() {
        aqyg aqygVar = this.b.l;
        return aqygVar == null ? aqyg.a : aqygVar;
    }

    public aqyd getFormattedDescriptionModel() {
        aqyg aqygVar = this.b.l;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        return aqyd.b(aqygVar).d(this.c);
    }

    public Integer getLengthSeconds() {
        return Integer.valueOf(this.b.i);
    }

    public Long getLikeCount() {
        return Long.valueOf(this.b.n);
    }

    public awjm getLocalizedStrings() {
        awjm awjmVar = this.b.q;
        return awjmVar == null ? awjm.a : awjmVar;
    }

    public awjl getLocalizedStringsModel() {
        awjm awjmVar = this.b.q;
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

    public String getVideoId() {
        return this.b.e;
    }

    public Long getViewCount() {
        return Long.valueOf(this.b.m);
    }

    public final boolean h() {
        return (this.b.c & 128) != 0;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("YtMainVideoEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
