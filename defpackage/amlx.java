package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class amlx extends amlv {
    private final char a;

    public amlx(char c) {
        this.a = c;
    }

    @Override // defpackage.ammd
    public final boolean b(char c) {
        return c == this.a;
    }

    public final String toString() {
        String e = ammd.e(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(e);
        sb.append("')");
        return sb.toString();
    }
}
