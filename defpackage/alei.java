package defpackage;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class alei {
    private final akzm a;
    private final alaf b;
    private final File c;

    public alei(akzm akzmVar, alaf alafVar, File file) {
        this.a = akzmVar;
        this.b = alafVar;
        this.c = file;
    }

    public final alad a() {
        int n;
        akzm akzmVar = this.a;
        if (akzmVar == null || (n = akwg.n(akzmVar.c)) == 0 || n != 6) {
            return this.b.f(this.c);
        }
        amkq.N((this.a.b & 2) != 0);
        File file = new File(this.a.d);
        int length = (int) file.length();
        byte[] bArr = new byte[length];
        anbt.f(new BufferedInputStream(new FileInputStream(file)), bArr, length);
        alad f = this.b.f(this.c);
        vvh c = vvi.c();
        c.a = 4;
        akzm akzmVar2 = this.a;
        c.b = akzmVar2.g;
        c.c = akzmVar2.e;
        c.d = bArr;
        vvi a = c.a();
        amkq.E(a.a() <= a.b());
        return new alad(new vvy(new vvz(f, a.b(), a.d().length), a.a(), a.d()), f.a());
    }
}
