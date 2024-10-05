package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uxu extends Exception {
    public final int a;
    private final String b;

    public uxu(int i, String str) {
        super(str);
        this.b = str;
        this.a = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Error type: ");
        int i = this.a;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "TOO_LONG" : "TOO_SHORT_NSN" : "TOO_SHORT_AFTER_IDD" : "NOT_A_NUMBER" : "INVALID_COUNTRY_CODE"));
        sb.append(". ");
        sb.append(this.b);
        return sb.toString();
    }
}
