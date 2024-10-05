package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class btw implements Comparable {
    final int a;
    final int b;
    final String c;
    final String d;

    public btw(int i, int i2, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        btw btwVar = (btw) obj;
        int i = this.a - btwVar.a;
        return i == 0 ? this.b - btwVar.b : i;
    }
}
