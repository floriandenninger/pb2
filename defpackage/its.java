package defpackage;

import android.os.Bundle;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class its {
    public final Class a;
    private final Class b;

    public its(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static boolean d(apxf apxfVar, String str) {
        return ((aplt) apxfVar.pX(BrowseEndpointOuterClass.browseEndpoint)).c.equals(str);
    }

    public static boolean j(apxf apxfVar) {
        return d(apxfVar, "FElibrary");
    }

    private static boolean m(apxf apxfVar) {
        return d(apxfVar, "FEhistory");
    }

    public final PaneDescriptor a(apxf apxfVar) {
        apxfVar.getClass();
        amkq.E(apxfVar.pY(BrowseEndpointOuterClass.browseEndpoint));
        return b(apxfVar, etx.y(apxfVar));
    }

    public final PaneDescriptor b(apxf apxfVar, boolean z) {
        return c(apxfVar, z, false, false);
    }

    public final PaneDescriptor c(apxf apxfVar, boolean z, boolean z2, boolean z3) {
        apxfVar.getClass();
        Bundle a = PaneDescriptor.a();
        a.putBoolean("home_pane", z);
        a.putBoolean("detail_pane", z2);
        a.putBoolean("selection_panel_selection_changed", z3);
        a.putInt("network_connectivity_requirement", 2);
        if (!z) {
            return PaneDescriptor.c(this.a, apxfVar, a);
        }
        return PaneDescriptor.c(this.b, apxfVar, a);
    }

    public final boolean e(PaneDescriptor paneDescriptor) {
        return this.a.isAssignableFrom(paneDescriptor.a);
    }

    public final boolean f(PaneDescriptor paneDescriptor) {
        return e(paneDescriptor) && m(paneDescriptor.e());
    }

    public final boolean g(PaneDescriptor paneDescriptor) {
        if (!e(paneDescriptor)) {
            return false;
        }
        apxf e = paneDescriptor.e();
        return m(e) && !((aplt) e.pX(BrowseEndpointOuterClass.browseEndpoint)).e.isEmpty();
    }

    public final boolean h(PaneDescriptor paneDescriptor) {
        return paneDescriptor.a == this.b;
    }

    public final boolean i(PaneDescriptor paneDescriptor) {
        return paneDescriptor != null && e(paneDescriptor) && d(paneDescriptor.e(), "FEwhat_to_watch");
    }

    public final boolean k(PaneDescriptor paneDescriptor) {
        return e(paneDescriptor) && j(paneDescriptor.e());
    }

    public final boolean l(PaneDescriptor paneDescriptor) {
        return paneDescriptor != null && e(paneDescriptor) && etx.y(paneDescriptor.e());
    }
}
