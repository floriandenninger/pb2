package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asxf {
    public final asxj a;
    private final aakv b;

    public asxf(asxj asxjVar, aakv aakvVar) {
        this.a = asxjVar;
        this.b = aakvVar;
    }

    public final asxd a() {
        asxj asxjVar = this.a;
        boolean z = true;
        aakt b = this.b.b(asxjVar.b == 1 ? (String) asxjVar.c : "");
        if (b != null && !(b instanceof asxd)) {
            z = false;
        }
        amkq.O(z, "entityFromStore is not instance of MainRecommendedDownloadVideoEntityModel, key=video");
        return (asxd) b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof asxf) && this.a.equals(((asxf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 11);
        sb.append("ItemModel{");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
