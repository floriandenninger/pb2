package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum akbj {
    LIGHT("Light", 300),
    REGULAR("Regular", 400),
    MEDIUM("Medium", 500),
    SEMIBOLD("SemiBold", 600),
    BOLD("Bold", 700),
    EXTRABOLD("ExtraBold", 800),
    BLACK("Black", 900);

    final String h;
    final int i;

    akbj(String str, int i) {
        this.h = str;
        this.i = i;
    }

    public static ammv a(String str, String str2) {
        for (akbj akbjVar : values()) {
            String str3 = akbjVar.h;
            StringBuilder sb = new StringBuilder(str2.length() + 1 + String.valueOf(str3).length());
            sb.append(str2);
            sb.append("-");
            sb.append(str3);
            if (str.equals(sb.toString())) {
                return ammv.j(akbjVar);
            }
        }
        return amlr.a;
    }
}
