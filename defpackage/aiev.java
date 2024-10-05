package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aiev {
    public static final aiev a = new aiev(null);
    private final afkl b;

    public aiev(afkl afklVar) {
        this.b = afklVar;
    }

    public afkl a() {
        return this.b;
    }

    public String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 8 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append(", view: ");
        sb.append(valueOf);
        return sb.toString();
    }
}
