package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agcw implements agcq {
    public final asjl a;
    public final String b;
    public final Set c;
    public final Executor d;
    public final agcv e;
    public agcs f;
    public String g;
    public int h;
    private final int i;
    private final akfq j;

    public agcw(akfq akfqVar, Executor executor, String str, asjl asjlVar, agcv agcvVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.g = str;
        this.a = asjlVar;
        amkq.N((asjlVar.b & 4) != 0);
        String str2 = asjlVar.e;
        if (!TextUtils.isEmpty(str2) && !str2.startsWith("/topics/")) {
            String valueOf = String.valueOf(str2);
            str2 = valueOf.length() != 0 ? "/topics/".concat(valueOf) : new String("/topics/");
        }
        str2.getClass();
        this.b = str2;
        this.e = agcvVar;
        this.c = new HashSet();
        this.h = 4;
        this.d = executor;
        this.j = akfqVar;
        this.i = i;
    }

    private final agcs c(int i) {
        asjk asjkVar;
        akfq akfqVar = this.j;
        String str = this.g;
        String str2 = this.b;
        asjl asjlVar = this.a;
        if ((asjlVar.b & 32) != 0) {
            asjkVar = asjlVar.f;
            if (asjkVar == null) {
                asjkVar = asjk.a;
            }
        } else {
            asjkVar = null;
        }
        int i2 = this.i;
        azrw azrwVar = akfqVar.e;
        ylf ylfVar = (ylf) akfqVar.b.get();
        ylfVar.getClass();
        ysy ysyVar = (ysy) akfqVar.g.get();
        ysyVar.getClass();
        ypa ypaVar = (ypa) akfqVar.c.get();
        ypaVar.getClass();
        Executor executor = (Executor) akfqVar.a.get();
        executor.getClass();
        aaea aaeaVar = (aaea) akfqVar.f.get();
        aaeaVar.getClass();
        ajyw ajywVar = (ajyw) akfqVar.h.get();
        ajywVar.getClass();
        azrw azrwVar2 = akfqVar.d;
        str.getClass();
        return new agcs(azrwVar, ylfVar, ysyVar, ypaVar, executor, aaeaVar, ajywVar, azrwVar2, this, str, str2, i, asjkVar, i2, null, null);
    }

    public final void a() {
        if (TextUtils.isEmpty(this.g)) {
            return;
        }
        this.h = 1;
        agcs c = c(1);
        this.f = c;
        c.g();
    }

    public final void b() {
        this.h = 3;
        agcs c = c(2);
        this.f = c;
        c.g();
    }
}
