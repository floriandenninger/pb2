package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajkb {
    public final int a;
    private final String b;

    public ajkb() {
    }

    public ajkb(String str, int i) {
        this.b = str;
        this.a = i;
    }

    public static ajkb a() {
        return new ajkb(null, 1);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajkb) {
            ajkb ajkbVar = (ajkb) obj;
            String str = this.b;
            if (str != null ? str.equals(ajkbVar.b) : ajkbVar.b == null) {
                if (this.a == ajkbVar.a) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.a;
    }

    public final String toString() {
        String str = this.b;
        int i = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 44);
        sb.append("ImageParams{videoId=");
        sb.append(str);
        sb.append(", imageType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
