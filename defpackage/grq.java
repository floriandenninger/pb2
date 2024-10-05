package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import com.google.android.apps.youtube.app.ui.YpcOffersListDialogFragmentController;
import com.google.protos.youtube.api.innertube.YpcGetCartEndpoint$YPCGetCartEndpoint;
import j$.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class grq extends yer implements ydk {
    public static final /* synthetic */ int q = 0;
    public final Activity a;
    public final ypa b;
    public final YpcOffersListDialogFragmentController c;
    public final Resources d;
    public final afsy e;
    public final aftn f;
    public final ysy g;
    public final agsg h;
    public final jws i;
    public final acqz j;
    public final ajmu k;
    public final agel l;
    public final agzr m;
    public final agof n;
    public final fvf o;
    public final zzw p;

    public grq(Activity activity, ydn ydnVar, zaw zawVar, ypa ypaVar, aahd aahdVar, YpcOffersListDialogFragmentController ypcOffersListDialogFragmentController, aoae aoaeVar, afsy afsyVar, aftn aftnVar, agof agofVar, ysy ysyVar, agsg agsgVar, jws jwsVar, zzw zzwVar, fvf fvfVar, acqz acqzVar, aben abenVar, ajmu ajmuVar, aarr aarrVar, agel agelVar, agzr agzrVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(ydnVar, zawVar, aahdVar, aoaeVar, abenVar, aarrVar, null, null);
        this.a = activity;
        this.d = activity.getResources();
        this.b = ypaVar;
        this.c = ypcOffersListDialogFragmentController;
        this.e = afsyVar;
        this.f = aftnVar;
        this.n = agofVar;
        this.g = ysyVar;
        this.h = agsgVar;
        this.i = jwsVar;
        this.p = zzwVar;
        this.o = fvfVar;
        this.j = acqzVar;
        this.k = ajmuVar;
        this.l = agelVar;
        this.m = agzrVar;
        ydnVar.k = this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yer
    public final void b(apxf apxfVar, Map map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put("OnYpcTransactionListener", new grp(this, apxfVar, (agyo) yjj.u(hashMap, "VideoToSaveInfoContainerKey", agyo.class), (ydl) yjj.u(hashMap, "OnYpcTransactionListener", ydl.class), this.t));
        super.b(apxfVar, (amrz) Collection.EL.stream(hashMap.entrySet()).filter(ghv.e).collect(ampm.a(ght.i, ght.j)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yer
    public final void c(asfy asfyVar, apxf apxfVar) {
        this.b.d(new fcd());
        super.c(asfyVar, apxfVar);
    }

    @Override // defpackage.ydk
    public final void d() {
        this.b.d(new fcg());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.yer
    public final void e(apxf apxfVar) {
        if (apxfVar != null && apxfVar.pY(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint) && !((YpcGetCartEndpoint$YPCGetCartEndpoint) apxfVar.pX(YpcGetCartEndpoint$YPCGetCartEndpoint.ypcGetCartEndpoint)).c.isEmpty()) {
            this.b.d(new fcc());
        }
        super.e(apxfVar);
    }

    @Override // defpackage.yer, defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        this.c.l();
        super.kE(apxfVar, map);
    }
}
