package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.OfflineabilityRendererOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kza extends kyx implements ypd {
    public String b;
    public Boolean c;
    public jsh d;
    private final Activity e;
    private final jvl f;
    private final ypa g;
    private final fjs h;
    private final OfflineArrowView i;
    private final azrw j;
    private final azrw k;
    private final ogx l;
    private final ajyw m;

    public kza(Activity activity, Context context, aahd aahdVar, jvl jvlVar, ypa ypaVar, fjs fjsVar, gma gmaVar, ajyw ajywVar, ogx ogxVar, ajyw ajywVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        super(context, aahdVar, gmaVar, ajywVar, R.layout.bundle_item_layout, new we(context.getResources().getDimensionPixelSize(R.dimen.bundle_item_image_width), context.getResources().getDimensionPixelSize(R.dimen.bundle_item_image_height)), new we(context.getResources().getDimensionPixelSize(R.dimen.bundle_item_image_width), context.getResources().getDimensionPixelSize(R.dimen.bundle_item_image_double_height)), context.getResources().getDimensionPixelSize(R.dimen.bundle_item_avatar_width_height), null, null, null, null);
        this.e = activity;
        this.g = ypaVar;
        this.h = fjsVar;
        this.f = jvlVar;
        this.l = ogxVar;
        this.m = ajywVar2;
        this.i = (OfflineArrowView) a().findViewById(R.id.offline_button);
        this.j = new azrw() { // from class: kyy
            @Override // defpackage.azrw
            public final Object get() {
                Boolean bool = kza.this.c;
                boolean z = false;
                if (bool != null && !bool.booleanValue()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        };
        this.k = ejz.m;
    }

    @Override // defpackage.kyx, defpackage.ajom
    public final void b(ajos ajosVar) {
        this.g.m(this);
        this.d = null;
        this.b = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.kyx, defpackage.ajpc
    public final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        apmd apmdVar = (apmd) obj;
        super.d(ajokVar, apmdVar);
        this.g.g(this);
        atsb atsbVar = null;
        this.b = (apmdVar.b & 16) != 0 ? apmdVar.i : null;
        aulq aulqVar = apmdVar.h;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(OfflineabilityRendererOuterClass.offlineabilityRenderer)) {
            aulq aulqVar2 = apmdVar.h;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            atsbVar = (atsb) aulqVar2.pX(OfflineabilityRendererOuterClass.offlineabilityRenderer);
        }
        atsb atsbVar2 = atsbVar;
        ogx ogxVar = this.l;
        String str = this.b;
        jsh d = ogxVar.d(str, this.i, (atsbVar2 == null || !atsbVar2.c) ? 3 : 1, this.m.s(str, atsbVar2, null, this.j, this.k, ajokVar.a));
        this.d = d;
        d.a();
        if (this.h.i(this.b)) {
            jvl jvlVar = this.f;
            String str2 = this.b;
            jvlVar.c(str2, yki.c(this.e, new kyz(this, str2)));
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        switch (i) {
            case -1:
                return new Class[]{agkm.class, agkn.class, agko.class, agkq.class, agks.class, agkt.class};
            case 0:
                if (!((agkm) obj).a.equals(this.b)) {
                    return null;
                }
                this.d.a();
                return null;
            case 1:
                if (!((agkn) obj).a.equals(this.b)) {
                    return null;
                }
                this.d.a();
                return null;
            case 2:
                if (!((agko) obj).a.equals(this.b)) {
                    return null;
                }
                this.d.a();
                return null;
            case 3:
                agkq agkqVar = (agkq) obj;
                if (!agkqVar.a.d().equals(this.b)) {
                    return null;
                }
                this.d.b(jqm.a(agkqVar.a));
                return null;
            case 4:
                agks agksVar = (agks) obj;
                if (!agksVar.a.d().equals(this.b)) {
                    return null;
                }
                this.d.b(jqm.a(agksVar.a));
                return null;
            case 5:
                if (!((agkt) obj).a.equals(this.b)) {
                    return null;
                }
                this.d.a();
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
