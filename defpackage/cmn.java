package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cmn {
    public int a;
    public String b;

    public static cmm a() {
        return new cmm();
    }

    public final String toString() {
        String e = cms.e(this.a);
        String str = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 32 + String.valueOf(str).length());
        sb.append("Response Code: ");
        sb.append(e);
        sb.append(", Debug Message: ");
        sb.append(str);
        return sb.toString();
    }
}
