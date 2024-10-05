package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pra {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    private pra(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public static pra a(String str) {
        char c;
        pse.e(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            int length = split.length;
            if (i >= length) {
                if (i2 == -1 || i3 == -1 || i5 == -1) {
                    return null;
                }
                return new pra(i2, i3, i4, i5, length);
            }
            String c2 = amkq.c(split[i].trim());
            switch (c2.hashCode()) {
                case 100571:
                    if (c2.equals("end")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3556653:
                    if (c2.equals("text")) {
                        c = 3;
                        break;
                    }
                    break;
                case 109757538:
                    if (c2.equals("start")) {
                        c = 0;
                        break;
                    }
                    break;
                case 109780401:
                    if (c2.equals("style")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            c = 65535;
            if (c == 0) {
                i2 = i;
            } else if (c == 1) {
                i3 = i;
            } else if (c == 2) {
                i4 = i;
            } else if (c == 3) {
                i5 = i;
            }
            i++;
        }
    }
}
