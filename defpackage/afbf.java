package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoQuality;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public class afbf implements ozr {
    final /* synthetic */ afbs a;

    public afbf(afbs afbsVar) {
        this.a = afbsVar;
    }

    @Override // defpackage.ozj
    public final void a(int i, ozv ozvVar, int i2, long j) {
        if (i == this.a.u()) {
            afbs afbsVar = this.a;
            if (afbsVar.t == null || afbsVar.G == null || !adyu.bP(i2)) {
                return;
            }
            String str = ozvVar.a;
            FormatStreamModel h = this.a.t.h(ozv.a(str), ozv.c(str));
            if (h == null) {
                return;
            }
            if (h.P()) {
                afbs afbsVar2 = this.a;
                afbsVar2.H = h;
                afdn b = afbsVar2.m.b(j);
                afbs afbsVar3 = this.a;
                afbsVar3.f42J = b.b;
                afbsVar3.L = b.c;
                afbsVar3.M = i2;
            } else {
                if (!h.C()) {
                    return;
                }
                afbs afbsVar4 = this.a;
                afbsVar4.I = h;
                if (afbsVar4.y) {
                    afbsVar4.M = i2;
                }
            }
            g();
        }
    }

    @Override // defpackage.ozj
    public void b(int i, IOException iOException) {
        if (i != this.a.u()) {
            return;
        }
        if (!(iOException instanceof afij) || this.a.g() + 1000 >= this.a.f()) {
            afbs afbsVar = this.a;
            afih a = afbsVar.l.a(iOException, afbsVar.g(), this.a.b, afif.DEFAULT, this.a.t);
            if (this.a.O.A()) {
                String i2 = a.i();
                String valueOf = String.valueOf(this.a.f.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 3 + String.valueOf(valueOf).length());
                sb.append(i2);
                sb.append(";c.");
                sb.append(valueOf);
                this.a.f.i("fberr", new aeqs(sb.toString()));
            }
            this.a.f.g(a);
        }
    }

    @Override // defpackage.ozj
    public final void c() {
    }

    @Override // defpackage.ozj
    public final void d() {
    }

    @Override // defpackage.ozj
    public void e() {
    }

    @Override // defpackage.ozj
    public final void f() {
    }

    public final void g() {
        afbs afbsVar = this.a;
        boolean z = afbsVar.y;
        boolean z2 = false;
        if (!z && afbsVar.H != null && afbsVar.I != null) {
            z2 = true;
        }
        if ((!z || afbsVar.I == null) && !z2) {
            return;
        }
        if (afbsVar.K == null) {
            afbsVar.K = afbsVar.G.c;
        }
        aeru aeruVar = afbsVar.f;
        FormatStreamModel formatStreamModel = afbsVar.H;
        FormatStreamModel formatStreamModel2 = afbsVar.I;
        FormatStreamModel formatStreamModel3 = afbsVar.K;
        aeeu aeeuVar = afbsVar.G;
        VideoQuality[] videoQualityArr = aeeuVar.d;
        aanb[] aanbVarArr = aeeuVar.e;
        aeex aeexVar = afbsVar.L;
        int i = afbsVar.M;
        aenk aenkVar = afbsVar.f42J;
        aeruVar.h(new aeqq(formatStreamModel, formatStreamModel2, formatStreamModel3, videoQualityArr, aanbVarArr, aeexVar, i, aenkVar.b, aenkVar.c, aeqp.a(afbsVar.f(), this.a.g(), this.a.b())));
    }
}
