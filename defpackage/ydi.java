package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ydi implements afwx {
    final /* synthetic */ asfy a;
    final /* synthetic */ ydn b;
    private final arpp c;

    public ydi(ydn ydnVar, asfy asfyVar) {
        arpp arppVar;
        this.b = ydnVar;
        this.a = asfyVar;
        if ((asfyVar.b & 4096) != 0) {
            ydr ydrVar = new ydr();
            ydrVar.a = asfyVar.n;
            ydrVar.c = 3;
            arppVar = ydrVar.b();
        } else {
            arppVar = null;
        }
        this.c = arppVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.b.d.dismiss();
        arpp arppVar = this.c;
        if (arppVar != null) {
            this.b.f.c(arppVar);
        }
        this.b.d(cnqVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        asfw asfwVar = (asfw) obj;
        this.b.d.dismiss();
        awhq i = wcy.i(asfwVar);
        if (i != null) {
            if ((asfwVar.b & 16) != 0) {
                this.b.e.mM().D(new acqx(asfwVar.g.I()));
            }
            CharSequence j = yjj.j(i);
            arpp arppVar = this.c;
            if (arppVar != null) {
                this.b.f.c(arppVar);
            }
            this.b.e(j);
            String str = ydn.a;
            String valueOf = String.valueOf(j);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 17 + String.valueOf(valueOf).length());
            sb.append("youtubePayment::");
            sb.append(str);
            sb.append(" ");
            sb.append(valueOf);
            afsi.b(1, 11, sb.toString());
            String.valueOf(String.valueOf(j)).length();
            ydl ydlVar = this.b.j;
            if (ydlVar != null) {
                ydlVar.f();
                return;
            }
            return;
        }
        yep yepVar = this.b.m;
        if (yepVar != null && (asfwVar.b & 8) != 0) {
            asgd asgdVar = asfwVar.e;
            if (asgdVar == null) {
                asgdVar = asgd.a;
            }
            CharSequence a = yepVar.a(asgdVar);
            if (a != null) {
                this.b.e.mM().D(new acqx(asfwVar.g.I()));
                String str2 = ydn.a;
                String valueOf2 = String.valueOf(a);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 17 + String.valueOf(valueOf2).length());
                sb2.append("youtubePayment::");
                sb2.append(str2);
                sb2.append(" ");
                sb2.append(valueOf2);
                afsi.b(1, 11, sb2.toString());
                String.valueOf(String.valueOf(a)).length();
                arpp arppVar2 = this.c;
                if (arppVar2 != null) {
                    this.b.f.c(arppVar2);
                }
                this.b.e(a);
                return;
            }
        }
        ydl ydlVar2 = this.b.j;
        if (ydlVar2 != null) {
            ydlVar2.e(asfwVar);
        }
        if ((this.a.b & 4096) != 0) {
            acpl acplVar = this.b.f;
            ydr ydrVar = new ydr();
            ydrVar.a = this.a.n;
            acplVar.c(ydrVar.f());
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
