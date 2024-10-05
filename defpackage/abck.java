package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abck {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final amru f;

    public abck() {
    }

    public abck(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, amru amruVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = amruVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abck) {
            abck abckVar = (abck) obj;
            if (this.a == abckVar.a && this.b == abckVar.b && this.c == abckVar.c && this.d == abckVar.d && this.e == abckVar.e && amkq.aV(this.f, abckVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        boolean z4 = this.d;
        boolean z5 = this.e;
        String valueOf = String.valueOf(this.f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 218);
        sb.append("OfflineSettingCategory{isCrossDeviceOfflineEnabled=");
        sb.append(z);
        sb.append(", isFullHdFormatOptionAvailable=");
        sb.append(z2);
        sb.append(", isRecommendationsEnabled=");
        sb.append(z3);
        sb.append(", isDownloadQualityEnabled=");
        sb.append(z4);
        sb.append(", shouldDisplaySmartDownloads=");
        sb.append(z5);
        sb.append(", downloadQualityFormats=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
