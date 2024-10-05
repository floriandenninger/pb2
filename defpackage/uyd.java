package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uyd {
    private final axqn a = new axqn();

    public final Pattern a(String str) {
        Pattern pattern = (Pattern) this.a.b(str);
        if (pattern != null) {
            return pattern;
        }
        Pattern compile = Pattern.compile(str);
        this.a.c(str, compile);
        return compile;
    }
}
