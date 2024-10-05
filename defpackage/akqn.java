package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akqn implements usj {
    private static final Pattern a;
    private static final Pattern b;
    private static final Pattern c;
    private static final Pattern d;
    private static final Pattern e;
    private static final amru f;

    static {
        Pattern compile = Pattern.compile("^https://youtubei\\.googleapis\\.com/[^/]+/([^/]+)/([^?]+)");
        a = compile;
        Pattern compile2 = Pattern.compile("^https://www\\.youtube\\.com/([a-zA-Z]+)_(204)\\?");
        b = compile2;
        Pattern compile3 = Pattern.compile("^https://youtubei\\.googleapis\\.com/([a-zA-Z]+)_(204)");
        c = compile3;
        Pattern compile4 = Pattern.compile("^https://.*\\.googlevideo\\.com/initplayback");
        d = compile4;
        Pattern compile5 = Pattern.compile("^https://.*\\.googlevideo\\.com/videoplayback");
        e = compile5;
        f = amru.v(new akql(compile, "rpc"), new akql(compile3, "googleapis"), new akql(compile2, "yt"), new akqm(compile4, "onesie-initplayback"), new akqm(compile5, "videoplayback"));
    }

    @Override // defpackage.usj
    public final String a(String str) {
        amru amruVar = f;
        int i = ((amvj) amruVar).c;
        int i2 = 0;
        while (i2 < i) {
            String a2 = ((akql) amruVar.get(i2)).a(str);
            i2++;
            if (a2 != null) {
                return a2;
            }
        }
        return str;
    }
}
