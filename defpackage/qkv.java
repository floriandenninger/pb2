package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qkv {
    public static final pse a = new pse();
    public static final pse b = new pse();
    public static final pse c = new pse();

    static {
        try {
            Charset.forName("UTF-8");
        } catch (IllegalCharsetNameException | UnsupportedCharsetException unused) {
        }
        qko.c("com.google.cast.multizone");
    }
}
