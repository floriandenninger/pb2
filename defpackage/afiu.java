package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afiu implements afhf {
    final /* synthetic */ afix a;
    final /* synthetic */ amnv b;
    final /* synthetic */ amnv c;
    final /* synthetic */ boolean d;
    final /* synthetic */ int e;

    public afiu(afix afixVar, amnv amnvVar, amnv amnvVar2, boolean z, int i) {
        this.a = afixVar;
        this.b = amnvVar;
        this.c = amnvVar2;
        this.d = z;
        this.e = i;
    }

    @Override // defpackage.atd
    public final ate a() {
        return b(afhi.m);
    }

    @Override // defpackage.afhf
    public final ate b(afhi afhiVar) {
        afix afixVar = this.a;
        afiv a = afiw.a((PlayerConfigModel) this.b.get());
        a.b = this.c;
        a.e = this.d;
        a.f = afhiVar;
        return afixVar.a(a.a(), this.e).a;
    }

    @Override // defpackage.afhf
    public final ate c(afhi afhiVar, String str, ammv ammvVar) {
        afix afixVar = this.a;
        afiv a = afiw.a((PlayerConfigModel) this.b.get());
        a.b = this.c;
        a.e = this.d;
        a.f = afhiVar;
        a.a = str;
        a.g = ammvVar;
        return afixVar.a(a.a(), this.e).a;
    }
}
