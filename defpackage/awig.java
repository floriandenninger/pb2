package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awig implements aala {
    public static final aalb a = new awif();
    private final aakv b;
    private final awih c;

    public awig(awih awihVar, aakv aakvVar) {
        this.c = awihVar;
        this.b = aakvVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        awih awihVar = this.c;
        if ((awihVar.c & 4) != 0) {
            amsvVar.c(awihVar.e);
        }
        if (this.c.f.size() > 0) {
            amsvVar.j(this.c.f);
        }
        return amsvVar.g();
    }

    public final awja b() {
        aakt b = this.b.b(this.c.e);
        boolean z = true;
        if (b != null && !(b instanceof awja)) {
            z = false;
        }
        amkq.O(z, "entityFromStore is not instance of YtMainPlaylistEntityModel, key=playlist");
        return (awja) b;
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
        return new awie(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof awig) && this.c.equals(((awig) obj).c);
    }

    public Long getAddedTimestampMillis() {
        return Long.valueOf(this.c.g);
    }

    public Long getLastSyncedTimestampMillis() {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("YtMainDownloadedPlaylistEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
