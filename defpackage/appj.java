package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class appj implements aala {
    public static final aalb a = new appi();
    public final appk b;

    public appj(appk appkVar) {
        this.b = appkVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        return new amsv().g();
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
        return new apph(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof appj) && this.b.equals(((appj) obj).b);
    }

    public String getBlobEncryptionId() {
        return this.b.i;
    }

    public String getClientPhotoFilePath() {
        return this.b.h;
    }

    public String getErrorMessage() {
        return this.b.f;
    }

    public Boolean getIsCreateChannelLoading() {
        return Boolean.valueOf(this.b.e);
    }

    public Boolean getIsEditNameOntapDisabled() {
        return Boolean.valueOf(this.b.l);
    }

    public Boolean getIsNameTooLongMessageOn() {
        return Boolean.valueOf(this.b.k);
    }

    public Boolean getIsWaitMessageOn() {
        return Boolean.valueOf(this.b.j);
    }

    public atvp getPhotoUploadStatus() {
        atvp b = atvp.b(this.b.g);
        return b == null ? atvp.PHOTO_UPLOAD_STATUS_UNSPECIFIED : b;
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
        sb.append("ChannelCreationFormStateEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
