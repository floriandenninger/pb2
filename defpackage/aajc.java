package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aajc {
    public final String a;
    public final int b;

    public aajc(int i, String str) {
        this.b = i;
        this.a = str;
    }

    public aajc(int i, String str, byte[] bArr) {
        this.b = i;
        this.a = str;
    }

    public aajc(String str) {
        this(str, 1);
    }

    public aajc(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public aajc(String str, int i, byte[] bArr) {
        this.a = str;
        this.b = i;
    }

    public aajc(String str, int i, char[] cArr) {
        this.a = str;
        this.b = i;
    }

    public final void a(vin vinVar) {
        vinVar.b(this.a);
    }

    public /* bridge */ /* synthetic */ Object b(aakt aaktVar, aaku aakuVar) {
        throw null;
    }

    public /* synthetic */ void c(vin vinVar, Object obj) {
        vinVar.a.add((Long) obj);
    }
}
