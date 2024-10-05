package defpackage;

import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amme {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final Charset b = Charset.forName("ISO-8859-1");
    public static final Charset c = Charset.forName("UTF-8");
    public static final Charset d;
    public static final Charset e;

    static {
        Charset.forName("UTF-16BE");
        d = Charset.forName("UTF-16LE");
        e = Charset.forName("UTF-16");
    }
}
