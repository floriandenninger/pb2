package defpackage;

import com.google.android.libraries.youtube.ads.model.MediaAd;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agdn extends xlf {
    private final azrw h;
    private final azrw i;
    private final aaea j;
    private final agtd k;
    private final agzz l;
    private final agzr m;

    public agdn(ypa ypaVar, aiij aiijVar, aijp aijpVar, azrw azrwVar, azrw azrwVar2, aaea aaeaVar, agtd agtdVar, Executor executor, Executor executor2, Set set, zgj zgjVar, agzz agzzVar, agzr agzrVar) {
        super(ypaVar, aiijVar, aijpVar, executor, executor2, set, zgjVar);
        azrwVar.getClass();
        this.h = azrwVar;
        azrwVar2.getClass();
        this.i = azrwVar2;
        this.j = aaeaVar;
        this.k = agtdVar;
        this.l = agzzVar;
        this.m = agzrVar;
    }

    @Override // defpackage.xlf
    public final aihs a(MediaAd mediaAd) {
        ArrayList arrayList = new ArrayList(this.f);
        arrayList.add(new xlh(mediaAd));
        return new agpu(this.a, this.b, this.c, this.h, this.i, this.d, this.e, arrayList, this.j, this.k, this.g, this.l, this.m);
    }
}
