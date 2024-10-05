package defpackage;

import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zia {
    private final zhz a;

    public zia(zhz zhzVar) {
        zhzVar.getClass();
        this.a = zhzVar;
    }

    public final owp a(String str) {
        owr a = owr.a(this.a.a);
        Matcher matcher = a.c.matcher(str);
        if (matcher.lookingAt()) {
            int i = 0;
            while (i < a.b.length) {
                int i2 = i + 1;
                if (matcher.group(i2) != null) {
                    return a.b[i];
                }
                i = i2;
            }
        }
        return owp.a;
    }
}
