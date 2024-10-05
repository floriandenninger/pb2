package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class advy implements afix {
    final /* synthetic */ Context a;
    final /* synthetic */ String b;
    final /* synthetic */ advq c;
    final /* synthetic */ aaea d;
    final /* synthetic */ Executor e;
    final /* synthetic */ aenf f;
    final /* synthetic */ afjy g;
    final /* synthetic */ adxh h;
    final /* synthetic */ aehs i;
    final /* synthetic */ azrw j;
    final /* synthetic */ afit k;
    final /* synthetic */ aeeh l;
    final /* synthetic */ ScheduledExecutorService m;
    final /* synthetic */ shf n;
    final /* synthetic */ aejn o;
    final /* synthetic */ ysy p;
    final /* synthetic */ aefy q;
    final /* synthetic */ afcu r;
    final /* synthetic */ afeu s;
    final /* synthetic */ ysw t;
    final /* synthetic */ afeq u;
    final /* synthetic */ afjy v;
    final /* synthetic */ afhs w;
    final /* synthetic */ aedn x;
    final /* synthetic */ ajoy y;
    final /* synthetic */ adyu z;

    public advy(Context context, String str, advq advqVar, aaea aaeaVar, Executor executor, aenf aenfVar, afjy afjyVar, adxh adxhVar, aehs aehsVar, azrw azrwVar, afit afitVar, aeeh aeehVar, aedn aednVar, ScheduledExecutorService scheduledExecutorService, shf shfVar, aejn aejnVar, ysy ysyVar, aefy aefyVar, afhs afhsVar, afcu afcuVar, afeu afeuVar, adyu adyuVar, ysw yswVar, afeq afeqVar, ajoy ajoyVar, afjy afjyVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = context;
        this.b = str;
        this.c = advqVar;
        this.d = aaeaVar;
        this.e = executor;
        this.f = aenfVar;
        this.g = afjyVar;
        this.h = adxhVar;
        this.i = aehsVar;
        this.j = azrwVar;
        this.k = afitVar;
        this.l = aeehVar;
        this.x = aednVar;
        this.m = scheduledExecutorService;
        this.n = shfVar;
        this.o = aejnVar;
        this.p = ysyVar;
        this.q = aefyVar;
        this.w = afhsVar;
        this.r = afcuVar;
        this.s = afeuVar;
        this.z = adyuVar;
        this.t = yswVar;
        this.u = afeqVar;
        this.y = ajoyVar;
        this.v = afjyVar2;
    }

    @Override // defpackage.afix
    public final afiy a(afiw afiwVar, int i) {
        int i2;
        att[] attVarArr;
        int i3 = i - 1;
        if (i3 == 0 || i3 == 3 || i3 == 4 || i3 == 5) {
            return new afiy(this.a, this.b, this.c, this.d, this.e, new att[]{this.f.i()}, new att[]{new aeto(afiwVar.e), this.g}, this.h, this.i, this.j, i == 1 ? null : this.k, i == 1 ? null : this.l, this.x, this.m, this.n, this.o, this.p, this.q, i, i == 5, this.w, this.r, this.s, this.z, this.t, this.u, afiwVar, this.y, null, null, null, null, null);
        }
        if (i == 2) {
            attVarArr = new att[]{this.v};
            i2 = 2;
        } else {
            i2 = i;
            attVarArr = null;
        }
        return new afiy(this.a, this.b, this.c, this.d, this.e, null, attVarArr, null, null, this.j, null, null, null, this.m, this.n, this.o, this.p, aefz.b, i2, false, this.w, this.r, this.s, this.z, this.t, this.u, afiwVar, this.y, null, null, null, null, null);
    }
}
