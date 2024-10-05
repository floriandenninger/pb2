package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avuf implements aala {
    public static final aalb a = new avue();
    private final avug b;

    public avuf(avug avugVar) {
        this.b = avugVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        return new amsv().g();
    }

    @Override // defpackage.aakt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final avud e() {
        return new avud(this.b.toBuilder());
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
    public final boolean equals(Object obj) {
        return (obj instanceof avuf) && this.b.equals(((avuf) obj).b);
    }

    public Integer getNumVideosCompleted() {
        return Integer.valueOf(this.b.h);
    }

    public Integer getNumVideosFailed() {
        return Integer.valueOf(this.b.g);
    }

    public Integer getNumVideosInProgress() {
        return Integer.valueOf(this.b.f);
    }

    public Long getTimestampMs() {
        return Long.valueOf(this.b.i);
    }

    @Override // defpackage.aakt
    public aalb getType() {
        return a;
    }

    public Float getUploadProgress() {
        return Float.valueOf(this.b.e);
    }

    @Override // defpackage.aakt
    public final int hashCode() {
        return this.b.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("UploadStatusEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
