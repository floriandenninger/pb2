package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class gdv {
    public boolean a = false;
    public boolean b = false;

    public final void a() {
        this.a = false;
        this.b = false;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        StringBuilder sb = new StringBuilder(45);
        sb.append("{entryInProgress=");
        sb.append(z);
        sb.append(", exitInProgress=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
