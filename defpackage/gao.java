package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gao extends gdj {
    private final boolean a;

    public gao(boolean z) {
        this.a = z;
    }

    @Override // defpackage.gdj
    public boolean a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof gdj) && this.a == ((gdj) obj).a();
    }

    public int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(58);
        sb.append("FreeTextSurveyFocusedEvent{wasFreeTextSurveyFocused=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
