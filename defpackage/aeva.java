package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeva implements atd {
    final /* synthetic */ afiy[] a;
    final /* synthetic */ afix b;
    final /* synthetic */ PlayerConfigModel c;
    final /* synthetic */ aezf d;
    final /* synthetic */ aelf e;
    private int f = 0;

    public aeva(afiy[] afiyVarArr, afix afixVar, PlayerConfigModel playerConfigModel, aezf aezfVar, aelf aelfVar) {
        this.a = afiyVarArr;
        this.b = afixVar;
        this.c = playerConfigModel;
        this.d = aezfVar;
        this.e = aelfVar;
    }

    @Override // defpackage.atd
    public final synchronized ate a() {
        int i = this.f;
        afiy[] afiyVarArr = this.a;
        if (i < afiyVarArr.length) {
            this.f = i + 1;
            return afiyVarArr[i].a;
        }
        afix afixVar = this.b;
        afiv a = afiw.a(this.c);
        a.b = new aeuw(this.d, 3);
        a.c = this.e;
        a.d = this.d.b.a();
        aezf aezfVar = this.d;
        a.h = aezfVar.K;
        a.a = aezfVar.a;
        a.g = ammv.i(aezfVar.l());
        return afixVar.a(a.a(), 5).a;
    }
}
