package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apxv implements aala {
    public static final aalb a = new apxu();
    private final apxw b;

    public apxv(apxw apxwVar) {
        this.b = apxwVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        return new amsv().g();
    }

    @Override // defpackage.aakt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final apxt e() {
        return new apxt(this.b.toBuilder());
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
        return (obj instanceof apxv) && this.b.equals(((apxv) obj).b);
    }

    public Boolean getIsEmojiPickerEnabled() {
        return Boolean.valueOf(this.b.h);
    }

    public Boolean getIsEmojiPickerToggled() {
        return Boolean.valueOf(this.b.i);
    }

    public Boolean getIsSendButtonEnabled() {
        return Boolean.valueOf(this.b.f);
    }

    public Boolean getIsSending() {
        return Boolean.valueOf(this.b.g);
    }

    public Boolean getIsTimestampButtonEnabled() {
        return Boolean.valueOf(this.b.e);
    }

    public Boolean getIsTimestampButtonSupported() {
        return Boolean.valueOf(this.b.j);
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("CommentComposerButtonStateEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
