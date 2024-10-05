package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vjo implements vjk {
    private final vjk a;

    public vjo(vjk vjkVar) {
        this.a = vjkVar;
    }

    public static final int b(String str) {
        return str == null ? vjn.a[0] : vjn.a[Math.abs(str.hashCode()) % 21];
    }

    public final CharSequence a(uja ujaVar) {
        String[] strArr;
        String str;
        vjk vjkVar = this.a;
        if (ujaVar == null || (strArr = ujaVar.a) == null) {
            return null;
        }
        for (String str2 : strArr) {
            if (str2 == null || str2.isEmpty() || str2.equals(".")) {
                str2 = null;
            } else if (str2.length() > 2) {
                vjs vjsVar = ((vjm) vjkVar).a;
                amkq.N(vjsVar.e);
                aeg aegVar = (aeg) vjsVar.d.get();
                if (aegVar == null) {
                    str = null;
                } else {
                    int length = str2.length();
                    str = null;
                    for (int i = 0; i < length && aegVar != null; i++) {
                        vjr vjrVar = (vjr) aegVar.get(Character.valueOf(str2.charAt(i)));
                        if (vjrVar == null) {
                            break;
                        }
                        String str3 = vjrVar.a;
                        if (str3 != null) {
                            str = str3;
                        }
                        aegVar = vjrVar.b;
                    }
                }
                str2 = str == null ? new StringBuilder().appendCodePoint(str2.codePointAt(0)).toString() : str;
            }
            if (str2 != null) {
                return str2;
            }
        }
        return null;
    }
}
