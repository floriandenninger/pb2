package defpackage;

import java.io.File;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tvq {
    public final String a;
    public final File b;
    public final String c;
    public final tvx d;
    final boolean f;
    final boolean g;
    public final vdz k;
    public final ambf m;
    private tvp o;
    public final amtt e = ampf.u();
    int h = 0;
    private boolean n = false;
    public tmw l = null;
    public int i = -1;
    public final int j = -1;

    public tvq(tvx tvxVar, String str, File file, String str2, ambf ambfVar, vdz vdzVar, byte[] bArr) {
        this.o = tvp.WIFI_ONLY;
        this.a = str;
        this.b = file;
        this.c = str2;
        this.m = ambfVar;
        this.d = tvxVar;
        this.k = vdzVar;
        boolean a = tvn.a(str);
        this.f = a;
        boolean d = d(str);
        this.g = d;
        if (d || a) {
            this.o = tvp.NONE;
        }
    }

    public static boolean d(String str) {
        return str.startsWith("file:");
    }

    public final synchronized tvp a() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        this.n = true;
    }

    public final synchronized boolean c() {
        return this.n;
    }

    public final void e(tvp tvpVar) {
        if (this.g || this.f) {
            return;
        }
        this.o = tvpVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tvq)) {
            return false;
        }
        tvq tvqVar = (tvq) obj;
        return amkq.b(this.a, tvqVar.a) && amkq.b(this.b, tvqVar.b) && amkq.b(this.c, tvqVar.c) && amkq.b(this.o, tvqVar.o) && this.n == tvqVar.n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.o, Boolean.valueOf(this.n)});
    }

    public final String toString() {
        ammu X = amkq.X(tvq.class);
        X.b("", this.a);
        X.b("targetDirectory", this.b);
        X.b("fileName", this.c);
        X.b("requiredConnectivity", this.o);
        X.g("canceled", this.n);
        return X.toString();
    }
}
