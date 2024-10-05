package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
final class akqm extends akql {
    public akqm(Pattern pattern, String str) {
        super(pattern, str);
    }

    @Override // defpackage.akql
    public final String a(String str) {
        if (!this.a.matcher(str).find()) {
            return null;
        }
        boolean contains = str.contains("owc=yes");
        boolean contains2 = str.contains("itag=0");
        if (!contains) {
            return this.b;
        }
        if (!contains2) {
            return this.b.concat("-prewarm");
        }
        return this.b.concat("-prewarm-itag0");
    }
}
