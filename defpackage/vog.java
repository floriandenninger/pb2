package defpackage;

import android.net.Uri;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vog implements anhh {
    final /* synthetic */ voh a;

    public vog(voh vohVar) {
        this.a = vohVar;
    }

    @Override // defpackage.anhh
    public final /* synthetic */ void b(Object obj) {
        aow aowVar = this.a.f;
        voi a = voj.a();
        a.a = ammv.j((Uri) obj);
        a.b = 4;
        aofe aofeVar = (aofe) voh.b.toBuilder();
        long a2 = this.a.e.a(TimeUnit.MICROSECONDS);
        aofeVar.copyOnWrite();
        ((aoff) aofeVar.instance).o(a2);
        a.b((aoff) aofeVar.build());
        aowVar.j(a.a());
        this.a.g.set(false);
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        ((amxh) ((amxh) ((amxh) voh.a.c()).h(th)).i("com/google/android/libraries/user/profile/photopicker/edit/viewmodel/EditViewModel$1", "onFailure", 'b', "EditViewModel.java")).q("Something went wrong with saving the bitmap");
        aow aowVar = this.a.f;
        voi a = voj.a();
        a.b = 5;
        aofe aofeVar = (aofe) voh.b.toBuilder();
        amnp amnpVar = this.a.e;
        amnpVar.g();
        long a2 = amnpVar.a(TimeUnit.MICROSECONDS);
        aofeVar.copyOnWrite();
        ((aoff) aofeVar.instance).o(a2);
        aone createBuilder = aofd.a.createBuilder();
        aogv aogvVar = aogv.INTERNAL;
        createBuilder.copyOnWrite();
        aofd aofdVar = (aofd) createBuilder.instance;
        aofdVar.c = aogvVar.s;
        aofdVar.b |= 1;
        aone createBuilder2 = aofk.a.createBuilder();
        createBuilder2.copyOnWrite();
        aofk aofkVar = (aofk) createBuilder2.instance;
        aofkVar.c = 8;
        aofkVar.b |= 1;
        createBuilder.copyOnWrite();
        aofd aofdVar2 = (aofd) createBuilder.instance;
        aofk aofkVar2 = (aofk) createBuilder2.build();
        aofkVar2.getClass();
        aofdVar2.e = aofkVar2;
        aofdVar2.b |= 4;
        aofeVar.copyOnWrite();
        ((aoff) aofeVar.instance).m((aofd) createBuilder.build());
        a.b((aoff) aofeVar.build());
        aowVar.j(a.a());
        this.a.g.set(false);
    }
}
