package defpackage;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rgx implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ rff d;
    private final /* synthetic */ int e;

    public rgx(rff rffVar, String str, String str2, String str3, int i) {
        this.e = i;
        this.d = rffVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public rgx(rff rffVar, String str, String str2, String str3, int i, byte[] bArr) {
        this.e = i;
        this.d = rffVar;
        this.b = str;
        this.a = str2;
        this.c = str3;
    }

    public rgx(rff rffVar, String str, String str2, String str3, int i, char[] cArr) {
        this.e = i;
        this.d = rffVar;
        this.b = str;
        this.a = str2;
        this.c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i = this.e;
        if (i == 0) {
            this.d.a.w();
            return this.d.a.j().r(this.a, this.b, this.c);
        }
        if (i == 1) {
            this.d.a.w();
            return this.d.a.j().r(this.b, this.a, this.c);
        }
        if (i == 2) {
            this.d.a.w();
            return this.d.a.j().o(this.b, this.a, this.c);
        }
        this.d.a.w();
        return this.d.a.j().o(this.a, this.b, this.c);
    }
}
