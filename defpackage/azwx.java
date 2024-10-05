package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azwx implements azxe {
    public final boolean a;

    public azwx(boolean z) {
        this.a = z;
    }

    @Override // defpackage.azxe
    public final azxr sp() {
        return null;
    }

    @Override // defpackage.azxe
    public final boolean sq() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(true != this.a ? "New" : "Active");
        sb.append('}');
        return sb.toString();
    }
}
