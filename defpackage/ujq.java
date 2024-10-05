package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ujq {
    private final String a;
    private final int b;

    public ujq() {
    }

    public ujq(int i, String str) {
        this.b = i;
        this.a = str;
    }

    public static ujq b() {
        return new ujq(2, null);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ujq) {
            ujq ujqVar = (ujq) obj;
            if (this.b == ujqVar.b) {
                String str = this.a;
                String str2 = ujqVar.a;
                if (str != null ? str.equals(str2) : str2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.b ^ 1000003) * 1000003;
        String str = this.a;
        return i ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.b != 1 ? "ANONYMOUS" : "GAIA";
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 28 + String.valueOf(str2).length());
        sb.append("AuthChannel{type=");
        sb.append(str);
        sb.append(", account=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public final tga a() {
        if (this.b - 1 == 0) {
            String str = this.a;
            str.getClass();
            return sgf.Q(str);
        }
        aonk aonkVar = tgq.a;
        aone createBuilder = tgp.a.createBuilder();
        createBuilder.copyOnWrite();
        tgp tgpVar = (tgp) createBuilder.instance;
        tgpVar.d = 2;
        tgpVar.b = 2 | tgpVar.b;
        return tga.a(aonkVar, (tgp) createBuilder.build());
    }
}
