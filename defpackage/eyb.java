package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.OfflineEndpointOuterClass;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eyb implements aaha, ewk {
    private final giv a;
    private final ypa b;
    private final lkb c;
    private final lkb d;

    public eyb(giv givVar, ypa ypaVar, lkb lkbVar, lkb lkbVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = givVar;
        this.b = ypaVar;
        this.c = lkbVar;
        this.d = lkbVar2;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        PaneDescriptor f;
        String str = ((atpb) apxfVar.pX(OfflineEndpointOuterClass.offlineEndpoint)).c;
        boolean z = false;
        if (map != null && map.containsKey("com.google.android.libraries.youtube.rendering.presenter.PresentContext") && ((ajok) map.get("com.google.android.libraries.youtube.rendering.presenter.PresentContext")).j("nested_fragment_key", false)) {
            z = true;
        }
        String str2 = (String) yjj.u(map, "offline_playlist_top_level_tab_id", String.class);
        if ("PPSV".equals(str) || ammx.e(str)) {
            f = this.c.f(apxfVar);
        } else {
            f = this.d.i(str, z, str2);
        }
        this.b.d(new fea());
        this.a.d(f);
    }
}
