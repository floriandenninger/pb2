package defpackage;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.libraries.user.profile.photopicker.edit.EditActivity;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vru implements vrp {
    public final dd a;
    public final ci b;
    public final tgd c;
    private final vrq d;
    private final vro e;
    private final azrw f;
    private final azrw g;

    public vru(ci ciVar, vrq vrqVar, tgd tgdVar, vro vroVar, azrw azrwVar, azrw azrwVar2) {
        this.a = ciVar.getSupportFragmentManager();
        this.b = ciVar;
        this.d = vrqVar;
        this.c = tgdVar;
        this.e = vroVar;
        this.f = azrwVar;
        this.g = azrwVar2;
    }

    private final void j(ce ceVar, String str) {
        String str2 = this.a.a() == 0 ? "BASE_STATE" : null;
        dn k = this.a.k();
        k.u(R.id.content, ceVar, str);
        k.i = 4097;
        k.s(str2);
        k.a();
        this.a.aa();
    }

    @Override // defpackage.vrp
    public final void a(aocu aocuVar) {
        if (this.a.f("ClusterPhotosFragment") == null) {
            Bundle bundle = new Bundle();
            amkq.cn(bundle, "clusterKey", aocuVar);
            vol volVar = new vol();
            volVar.af(bundle);
            j(volVar, "ClusterPhotosFragment");
        }
    }

    @Override // defpackage.vrp
    public final void b() {
        if (this.a.f("ClustersFragment") == null) {
            j(new voq(), "ClustersFragment");
        }
    }

    @Override // defpackage.vrp
    public final void c() {
        if (this.a.f("MeClusterPhotosFragment") == null) {
            j(new vqf(), "MeClusterPhotosFragment");
        }
    }

    @Override // defpackage.vrp
    public final void d() {
        if (this.a.f("PastProfilePhotosFragment") == null) {
            j((ce) this.g.get(), "PastProfilePhotosFragment");
        }
    }

    @Override // defpackage.vrp
    public final void e() {
        if (this.a.f("SuggestedPhotosFragment") == null) {
            j((ce) this.f.get(), "SuggestedPhotosFragment");
        }
    }

    @Override // defpackage.vrp
    public final void f() {
        vqr vqrVar = vqr.START_IN_DEVICE_PHOTOS_TAB;
        vrq vrqVar = this.d;
        vlx vlxVar = vrqVar.a;
        aone createBuilder = aofi.a.createBuilder();
        createBuilder.copyOnWrite();
        aofi aofiVar = (aofi) createBuilder.instance;
        aofiVar.c = 13;
        aofiVar.b |= 1;
        vlxVar.d((aofi) createBuilder.build());
        vlt B = vrqVar.d.B();
        B.a();
        vrqVar.c = ammv.j(B);
        if (this.a.f("SuggestionTabsFragment") == null) {
            Bundle bundle = new Bundle();
            bundle.putString("SuggestionTabsFragmentMode", vqrVar.name());
            vrm vrmVar = new vrm();
            vrmVar.af(bundle);
            j(vrmVar, "SuggestionTabsFragment");
        }
    }

    @Override // defpackage.vrp
    public final void g(ce ceVar) {
        this.b.getOnBackPressedDispatcher().b(ceVar.M(), new vrt(this, ceVar));
    }

    @Override // defpackage.vrp
    public final void h() {
        this.b.onBackPressed();
    }

    @Override // defpackage.vrp
    public final void i(Uri uri) {
        vro vroVar = this.e;
        Activity activity = vroVar.a;
        akhi akhiVar = vroVar.b;
        activity.startActivityForResult(new Intent(akhiVar.a, (Class<?>) EditActivity.class).putExtras(akhiVar.a.getIntent()).setData(uri), 10000);
    }
}
