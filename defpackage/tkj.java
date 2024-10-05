package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tkj {
    public tkk a;
    public String b;
    public Throwable c;

    public final tkl a() {
        tkk tkkVar = this.a;
        tkkVar.getClass();
        if (this.b == null) {
            String valueOf = String.valueOf(tkkVar.name());
            this.b = valueOf.length() != 0 ? "Download result code: ".concat(valueOf) : new String("Download result code: ");
        }
        return new tkl(this);
    }
}
