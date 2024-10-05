package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class prc {
    public static final Pattern a = Pattern.compile("\\{([^}]*)\\}");
    public static final Pattern b = Pattern.compile(pts.D("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
    public static final Pattern c = Pattern.compile(pts.D("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
    public static final Pattern d = Pattern.compile("\\\\an(\\d+)");
}
