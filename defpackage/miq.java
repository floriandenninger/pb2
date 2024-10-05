package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class miq {
    public abstract int a();

    public abstract void b();

    public abstract void c(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String d(int i) {
        String i2 = mit.i(i);
        String i3 = mit.i(a());
        StringBuilder sb = new StringBuilder(i2.length() + 30 + i3.length());
        sb.append(i2);
        sb.append(" is an invalid exit state for ");
        sb.append(i3);
        return sb.toString();
    }

    public final String toString() {
        String i = mit.i(a());
        StringBuilder sb = new StringBuilder(i.length() + 26);
        sb.append("SpotlightModeState{value=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}
