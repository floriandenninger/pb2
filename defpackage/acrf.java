package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class acrf {
    private final int a;
    private final int b;

    public acrf(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    private final String a() {
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("_");
        sb.append(i2);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof acrf) {
            return a().equals(((acrf) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
