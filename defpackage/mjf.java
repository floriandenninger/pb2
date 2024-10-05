package defpackage;

import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mjf {
    private final gbh a;
    private final dd b;
    private final azrw c;
    private final eun d;

    public mjf(gbh gbhVar, ci ciVar, azrw azrwVar, eun eunVar, byte[] bArr) {
        this.a = gbhVar;
        this.b = ciVar.getSupportFragmentManager();
        this.c = azrwVar;
        this.d = eunVar;
    }

    public final boolean a() {
        if (!evr.aZ((aadw) this.c.get())) {
            return false;
        }
        BottomUiContainer a = this.a.a();
        if (a != null && a.getChildCount() > 0) {
            return true;
        }
        List l = this.b.l();
        if (!l.isEmpty()) {
            int size = l.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ce ceVar = (ce) l.get(size);
                if (!ceVar.G) {
                    if (ceVar instanceof bv) {
                        return true;
                    }
                }
            }
        }
        return this.d.a;
    }
}
