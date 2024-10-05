package defpackage;

import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anae extends amzq {
    private static final Set a;
    private static final amza b;
    private final String c;
    private final Level d;

    static {
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(amxn.a, amyj.a)));
        a = unmodifiableSet;
        b = amzd.a(unmodifiableSet);
    }

    public anae(String str, Level level) {
        super(str);
        this.c = amkq.ac(str);
        this.d = level;
    }

    @Override // defpackage.amyp
    public final void c(amyo amyoVar) {
        e(amyoVar, this.c, this.d);
    }

    @Override // defpackage.amyp
    public final boolean d(Level level) {
        int ab = amkq.ab(level);
        return Log.isLoggable(this.c, ab) || Log.isLoggable("all", ab);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(defpackage.amyo r17, java.lang.String r18, java.util.logging.Level r19) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anae.e(amyo, java.lang.String, java.util.logging.Level):void");
    }
}
