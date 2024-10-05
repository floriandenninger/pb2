package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class prs {
    public static final Pattern a = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern b = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final pth c = new pth();
    public final StringBuilder d = new StringBuilder();

    public static String a(pth pthVar, StringBuilder sb) {
        sb.setLength(0);
        int i = pthVar.b;
        int i2 = pthVar.c;
        loop0: while (true) {
            for (boolean z = false; i < i2 && !z; z = true) {
                char c = (char) pthVar.a[i];
                if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                    i++;
                    sb.append(c);
                }
            }
        }
        pthVar.H(i - pthVar.b);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(pth pthVar, StringBuilder sb) {
        c(pthVar);
        if (pthVar.a() == 0) {
            return null;
        }
        String a2 = a(pthVar, sb);
        if (!"".equals(a2)) {
            return a2;
        }
        int i = pthVar.i();
        StringBuilder sb2 = new StringBuilder(1);
        sb2.append((char) i);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(pth pthVar) {
        while (true) {
            for (boolean z = true; pthVar.a() > 0 && z; z = false) {
                int i = pthVar.b;
                byte[] bArr = pthVar.a;
                byte b2 = bArr[i];
                char c = (char) b2;
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    pthVar.H(1);
                } else {
                    int i2 = pthVar.c;
                    if (i + 2 <= i2) {
                        int i3 = i + 1;
                        if (b2 == 47) {
                            int i4 = i3 + 1;
                            if (bArr[i3] == 42) {
                                while (true) {
                                    int i5 = i4 + 1;
                                    if (i5 >= i2) {
                                        break;
                                    }
                                    if (((char) bArr[i4]) == '*' && ((char) bArr[i5]) == '/') {
                                        i4 = i5 + 1;
                                        i2 = i4;
                                    } else {
                                        i4 = i5;
                                    }
                                }
                                pthVar.H(i2 - pthVar.b);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }
}
