package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asxn implements aala {
    public static final aalb a = new asxm();
    private final aakv b;
    private final asxo c;

    public asxn(asxo asxoVar, aakv aakvVar) {
        this.c = asxoVar;
        this.b = aakvVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        asxo asxoVar = this.c;
        if ((asxoVar.c & 4) != 0) {
            amsvVar.c(asxoVar.e);
        }
        return amsvVar.g();
    }

    public final atxb b() {
        aakt b = this.b.b(this.c.e);
        boolean z = true;
        if (b != null && !(b instanceof atxb)) {
            z = false;
        }
        amkq.O(z, "entityFromStore is not instance of PlaybackDataEntityModel, key=playbackData");
        return (atxb) b;
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
        return new asxl(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof asxn) && this.c.equals(((asxn) obj).c);
    }

    public Long getAddedTimestampMillis() {
        return Long.valueOf(this.c.f);
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
        sb.append("MainVideoDownloadStateEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
