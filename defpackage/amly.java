package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amly extends amlv {
    private final char a;
    private final char b;

    public amly(char c, char c2) {
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.ammd
    public final boolean b(char c) {
        return c == this.a || c == this.b;
    }

    public final String toString() {
        String e = ammd.e(this.a);
        String e2 = ammd.e(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 21 + String.valueOf(e2).length());
        sb.append("CharMatcher.anyOf(\"");
        sb.append(e);
        sb.append(e2);
        sb.append("\")");
        return sb.toString();
    }
}
