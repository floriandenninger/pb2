package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fnd {
    public final CharSequence a;
    private final int b;

    public fnd(CharSequence charSequence, int i) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = i;
    }

    public static fnd a(CharSequence charSequence) {
        return new fnd(charSequence, 0);
    }

    public final ammv b() {
        int i = this.b;
        return i > 0 ? ammv.j(Integer.valueOf(i)) : amlr.a;
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.a;
        int i = this.b;
        objArr[1] = i > 0 ? Integer.toString(i) : "None";
        return String.format("PlayerToast[Text=%s, durationMs=%s]", objArr);
    }
}
