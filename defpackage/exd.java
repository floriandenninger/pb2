package defpackage;

import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class exd implements aaha {
    private final giv a;
    private final ypa b;
    private final lkb c;

    public exd(giv givVar, ypa ypaVar, lkb lkbVar, byte[] bArr, byte[] bArr2) {
        givVar.getClass();
        this.a = givVar;
        ypaVar.getClass();
        this.b = ypaVar;
        this.c = lkbVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        PaneDescriptor f;
        if (map == null || !map.containsKey("com.google.android.libraries.youtube.rendering.presenter.PresentContext")) {
            f = this.c.f(apxfVar);
        } else {
            ajok ajokVar = (ajok) map.get("com.google.android.libraries.youtube.rendering.presenter.PresentContext");
            f = this.c.g(apxfVar, ajokVar.j("nested_fragment_key", false), ajokVar.j("selection_panel", false));
        }
        this.b.d(new fea());
        this.a.d(f);
    }
}
