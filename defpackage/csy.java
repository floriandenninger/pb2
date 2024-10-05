package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csy implements Appendable {
    private final Appendable a;
    private boolean b = true;

    public csy(Appendable appendable) {
        this.a = appendable;
    }

    private static final CharSequence a(CharSequence charSequence) {
        return charSequence == null ? "" : charSequence;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        if (this.b) {
            this.b = false;
            this.a.append("  ");
        }
        this.b = c == '\n';
        this.a.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        CharSequence a = a(charSequence);
        append(a, 0, a.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        CharSequence a = a(charSequence);
        boolean z = false;
        if (this.b) {
            this.b = false;
            this.a.append("  ");
        }
        if (a.length() > 0 && a.charAt(i2 - 1) == '\n') {
            z = true;
        }
        this.b = z;
        this.a.append(a, i, i2);
        return this;
    }
}
