package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class argl implements aala {
    public static final aalb a = new argk();
    private final argi b;

    public argl(argi argiVar) {
        this.b = argiVar;
    }

    @Override // defpackage.aakt
    public final amsx a() {
        return new amsv().g();
    }

    @Override // defpackage.aakt
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final argj e() {
        return new argj(this.b.toBuilder());
    }

    @Override // defpackage.aakt
    public final byte[] c() {
        return this.b.toByteArray();
    }

    @Override // defpackage.aakt
    public final String d() {
        return this.b.c;
    }

    @Override // defpackage.aakt
    public final boolean equals(Object obj) {
        return (obj instanceof argl) && this.b.equals(((argl) obj).b);
    }

    public Long getDisplayTime() {
        return Long.valueOf(this.b.d);
    }

    public Boolean getIsNoneOfTheAboveSelected() {
        return Boolean.valueOf(this.b.f);
    }

    public List getIsSelected() {
        return this.b.e;
    }

    public Float getNumSelected() {
        return Float.valueOf(this.b.g);
    }

    public avcw getSurveyState() {
        avcw b = avcw.b(this.b.h);
        return b == null ? avcw.SURVEY_STATE_TYPE_UNKNOWN : b;
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("SurveyStateEntityModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
