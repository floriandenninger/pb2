package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apwl {
    private final apvq a;

    public apwl(apvq apvqVar) {
        this.a = apvqVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof apwl) && this.a.equals(((apwl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("YouTubeCreatorCampaignDataModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
