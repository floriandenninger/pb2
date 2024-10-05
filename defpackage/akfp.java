package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akfp {
    public int A;
    final int B;
    final axzg D;
    final ajoy E;
    final CronetEngine a;
    final wco b;
    final afsy c;
    final Executor d;
    final Handler e;
    final String f;
    final akfn g;
    final akfm h;
    final int i;
    final String l;
    final byte[] m;
    final int n;
    final int o;
    final String p;
    final String r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public float w = 0.7f;
    int x = 1024;
    public ammv y = amlr.a;
    public int C = 2;
    String z = "embeddedassistant.googleapis.com";
    final String j = "PLACEHOLDER";
    final String k = "PLACEHOLDER";
    final String q = "AIzaSyA8eiZmM1FaDVjRy-df2KTyQ_vz_yYM39w";

    public akfp(CronetEngine cronetEngine, wco wcoVar, ajoy ajoyVar, afsy afsyVar, Executor executor, Handler handler, String str, axzg axzgVar, akfn akfnVar, akfm akfmVar, int i, String str2, byte[] bArr, int i2, int i3, int i4, String str3, String str4, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = cronetEngine;
        this.b = wcoVar;
        this.E = ajoyVar;
        this.c = afsyVar;
        this.d = executor;
        this.e = handler;
        this.f = str;
        this.D = axzgVar;
        this.g = akfnVar;
        this.h = akfmVar;
        this.i = i;
        this.l = str2;
        this.m = bArr;
        this.B = i2;
        this.n = i3;
        this.o = i4;
        this.p = str3;
        this.r = str4;
    }

    public final akfo a() {
        return new akfo(this);
    }

    public final void b(ammv ammvVar) {
        this.z = (String) ((amna) ammvVar).a;
    }

    public final void c(int i) {
        if (i <= 0) {
            i = 1024;
        }
        this.x = i;
    }
}
