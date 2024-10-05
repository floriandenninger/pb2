package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avat implements aala {
    public static final aalb a = new avas();
    public final avau b;
    private final aakv c;

    public avat(avau avauVar, aakv aakvVar) {
        this.b = avauVar;
        this.c = aakvVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        amsv amsvVar = new amsv();
        amsvVar.j(getEmojiModel().a());
        return amsvVar.g();
    }

    @Override // defpackage.aakt
    public final byte[] c() {
        return this.b.toByteArray();
    }

    @Override // defpackage.aakt
    public final String d() {
        return this.b.f;
    }

    @Override // defpackage.aakt
    public final /* bridge */ /* synthetic */ whu e() {
        return new avar(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof avat) && this.b.equals(((avat) obj).b);
    }

    public avav getAction() {
        avav b = avav.b(this.b.g);
        return b == null ? avav.SUGGEST_EDITABLE_TEXT_ACTION_UNKNOWN : b;
    }

    public aqss getEmoji() {
        avau avauVar = this.b;
        return avauVar.d == 3 ? (aqss) avauVar.e : aqss.a;
    }

    public aqsr getEmojiModel() {
        avau avauVar = this.b;
        return aqsr.b(avauVar.d == 3 ? (aqss) avauVar.e : aqss.a).k(this.c);
    }

    public Boolean getShouldAppendWhitespace() {
        return Boolean.valueOf(this.b.h);
    }

    public Boolean getShouldConditionallyPrependWhitespace() {
        return Boolean.valueOf(this.b.i);
    }

    public String getText() {
        avau avauVar = this.b;
        return avauVar.d == 2 ? (String) avauVar.e : "";
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
        sb.append("SuggestEditableTextItemEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
