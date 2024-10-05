package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum amyk {
    STRING('s', amym.GENERAL, "-#", true),
    BOOLEAN('b', amym.BOOLEAN, "-", true),
    CHAR('c', amym.CHARACTER, "-", true),
    DECIMAL('d', amym.INTEGRAL, "-0+ ,(", false),
    OCTAL('o', amym.INTEGRAL, "-#0(", false),
    HEX('x', amym.INTEGRAL, "-#0(", true),
    FLOAT('f', amym.FLOAT, "-#0+ ,(", false),
    EXPONENT('e', amym.FLOAT, "-#0+ (", true),
    GENERAL('g', amym.FLOAT, "-0+ ,(", true),
    EXPONENT_HEX('a', amym.FLOAT, "-#0+ ", true);

    public static final amyk[] k = new amyk[26];
    public final char l;
    public final amym m;
    public final int n;
    public final String o;

    static {
        for (amyk amykVar : values()) {
            k[a(amykVar.l)] = amykVar;
        }
    }

    amyk(char c, amym amymVar, String str, boolean z) {
        this.l = c;
        this.m = amymVar;
        this.n = amyl.a(str, z);
        StringBuilder sb = new StringBuilder(2);
        sb.append("%");
        sb.append(c);
        this.o = sb.toString();
    }

    public static int a(char c) {
        return (c | ' ') - 97;
    }
}
