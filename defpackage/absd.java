package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.AsyncTask;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class absd extends AsyncTask {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ Point c;
    final /* synthetic */ boolean d;
    final /* synthetic */ zvk e;
    final /* synthetic */ abse f;
    final /* synthetic */ ztl g;

    public absd(abse abseVar, Context context, String str, Point point, boolean z, ztl ztlVar, zvk zvkVar) {
        this.f = abseVar;
        this.a = context;
        this.b = str;
        this.c = point;
        this.d = z;
        this.g = ztlVar;
        this.e = zvkVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        synchronized (this.f.l) {
            while (true) {
                abse abseVar = this.f;
                if (abseVar.j != null || abseVar.m) {
                    break;
                }
                try {
                    abseVar.l.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
        if (this.f.m) {
            return null;
        }
        Bitmap a = new abrx(this.a, new zhr(0)).a(this.b);
        if (a == null) {
            throw new IllegalStateException("Thumbnail not found");
        }
        this.f.n.g();
        Point point = this.c;
        boolean z = this.d;
        abse.i(point, z);
        if (z) {
            point.set(Math.min(point.x, 720), Math.min(point.y, 1280));
        } else {
            point.set(Math.min(point.x, 1280), Math.min(point.y, 720));
        }
        int i = this.c.x;
        int i2 = this.c.y;
        abse abseVar2 = this.f;
        abseVar2.k = new zrs(this.a, abseVar2, abseVar2.h);
        this.f.k.l(this.g, this.e);
        this.f.k.E();
        abse abseVar3 = this.f;
        zrs zrsVar = abseVar3.k;
        arz arzVar = abseVar3.j;
        amkq.N(!zrsVar.n);
        amkq.E(i > 0);
        amkq.E(i2 > 0);
        zpw zpwVar = zrsVar.i;
        zpwVar.B = abseVar3;
        Handler handler = zpwVar.b;
        handler.sendMessage(handler.obtainMessage(8, i, i2, arzVar));
        zrsVar.B();
        zrsVar.i.n(i, i2);
        if (zrsVar.r) {
            zrsVar.i.l();
        }
        zrs zrsVar2 = this.f.k;
        zrsVar2.p = a;
        zrsVar2.q = 10L;
        zrsVar2.A();
        abse abseVar4 = this.f;
        abseVar4.k.z(abseVar4.e);
        abse abseVar5 = this.f;
        abseVar5.k.g(abseVar5.b());
        abse abseVar6 = this.f;
        zrs zrsVar3 = abseVar6.k;
        zrsVar3.i.A = abseVar6;
        zrsVar3.j();
        return null;
    }
}
