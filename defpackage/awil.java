package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awil implements aala {
    public static final aalb a = new awik();
    private final aakv b;
    private final awim c;

    public awil(awim awimVar, aakv aakvVar) {
        this.c = awimVar;
        this.b = aakvVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        awim awimVar = this.c;
        if ((awimVar.c & 4) != 0) {
            amsvVar.c(awimVar.e);
        }
        awim awimVar2 = this.c;
        if ((awimVar2.c & 8) != 0) {
            amsvVar.c(awimVar2.f);
        }
        awim awimVar3 = this.c;
        if ((awimVar3.c & 16) != 0) {
            amsvVar.c(awimVar3.g);
        }
        return amsvVar.g();
    }

    public final atre b() {
        aakt b = this.b.b(this.c.g);
        boolean z = true;
        if (b != null && !(b instanceof atre)) {
            z = false;
        }
        amkq.O(z, "entityFromStore is not instance of OfflineVideoPolicyEntityModel, key=offlineVideoPolicy");
        return (atre) b;
    }

    @Override // defpackage.aakt
    public final byte[] c() {
        return this.c.toByteArray();
    }

    @Override // defpackage.aakt
    public final String d() {
        return this.c.d;
    }

    @Override // defpackage.aakt
    public final /* bridge */ /* synthetic */ whu e() {
        return new awij(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof awil) && this.c.equals(((awil) obj).c);
    }

    public final atxb f() {
        aakt b = this.b.b(this.c.f);
        boolean z = true;
        if (b != null && !(b instanceof atxb)) {
            z = false;
        }
        amkq.O(z, "entityFromStore is not instance of PlaybackDataEntityModel, key=playbackData");
        return (atxb) b;
    }

    public final awjp g() {
        aakt b = this.b.b(this.c.e);
        boolean z = true;
        if (b != null && !(b instanceof awjp)) {
            z = false;
        }
        amkq.O(z, "entityFromStore is not instance of YtMainVideoEntityModel, key=video");
        return (awjp) b;
    }

    public Long getAddedTimestampMillis() {
        return Long.valueOf(this.c.h);
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
        sb.append("YtMainDownloadedVideoEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
