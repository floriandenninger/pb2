package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atxb implements aala {
    public static final aalb a = new atxa();
    public final aakv b;
    public final atxc c;

    public atxb(atxc atxcVar, aakv aakvVar) {
        this.c = atxcVar;
        this.b = aakvVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        atxc atxcVar = this.c;
        if ((atxcVar.c & 32) != 0) {
            amsvVar.c(atxcVar.i);
        }
        if (this.c.j.size() > 0) {
            amsvVar.j(this.c.j);
        }
        atxc atxcVar2 = this.c;
        if ((atxcVar2.c & 64) != 0) {
            amsvVar.c(atxcVar2.k);
        }
        atxc atxcVar3 = this.c;
        if ((atxcVar3.c & 128) != 0) {
            amsvVar.c(atxcVar3.l);
        }
        return amsvVar.g();
    }

    public final aqoz b() {
        aakt b = this.b.b(this.c.k);
        boolean z = true;
        if (b != null && !(b instanceof aqoz)) {
            z = false;
        }
        amkq.O(z, "entityFromStore is not instance of DrmLicenseEntityModel, key=drmLicense");
        return (aqoz) b;
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
        return new atwz(this.c.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof atxb) && this.c.equals(((atxb) obj).c);
    }

    public final atre f() {
        aakt b = this.b.b(this.c.l);
        boolean z = true;
        if (b != null && !(b instanceof atre)) {
            z = false;
        }
        amkq.O(z, "entityFromStore is not instance of OfflineVideoPolicyEntityModel, key=offlineVideoPolicy");
        return (atre) b;
    }

    public final avjs g() {
        aakt b = this.b.b(this.c.i);
        boolean z = true;
        if (b != null && !(b instanceof avjs)) {
            z = false;
        }
        amkq.O(z, "entityFromStore is not instance of TransferEntityModel, key=transfer");
        return (avjs) b;
    }

    public aomf getPlayerResponseBytes() {
        return this.c.e;
    }

    public String getPlayerResponseJson() {
        return this.c.f;
    }

    public Long getPlayerResponseTimestamp() {
        return Long.valueOf(this.c.g);
    }

    public Long getStreamDownloadTimestampSeconds() {
        return Long.valueOf(this.c.h);
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    public final boolean h() {
        return (this.c.c & 2) != 0;
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.c.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("PlaybackDataEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
