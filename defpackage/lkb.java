package defpackage;

import android.os.Bundle;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lkb {
    public final Class a;

    public lkb(Class cls) {
        this.a = cls;
    }

    public lkb(Class cls, byte[] bArr) {
        this.a = cls;
    }

    public lkb(Class cls, byte[] bArr, byte[] bArr2) {
        this.a = cls;
    }

    public final PaneDescriptor a(apxf apxfVar, auux auuxVar, byte[] bArr, boolean z, arev arevVar, boolean z2, boolean z3, int i, int i2) {
        apxfVar.getClass();
        String str = ((aunn) apxfVar.pX(SearchEndpointOuterClass.searchEndpoint)).c;
        Bundle a = PaneDescriptor.a();
        a.putString("search_query", str);
        if (auuxVar != null) {
            a.putParcelable("innertube_search_filters", amkq.cl(auuxVar));
        }
        if (bArr != null) {
            a.putByteArray("searchbox_stats", bArr);
        }
        a.putBoolean("preserve_search_nav_history", z);
        a.putInt("network_connectivity_requirement", 2);
        double random = Math.random();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
        sb.append("SEARCH_RESULTS_");
        sb.append(str);
        sb.append(random);
        a.putString("search_cache_key", sb.toString());
        if (arevVar != null) {
            a.putByteArray("sticky_horizontal_card_list", arevVar.toByteArray());
        }
        a.putBoolean("search_filter_chip_clicked", z2);
        a.putBoolean("search_filter_chip_applied", z3);
        a.putInt("search_filter_chip_count", i);
        a.putInt("search_chip_bar_selected_position", i2);
        return PaneDescriptor.c(this.a, apxfVar, a);
    }

    public final boolean b(PaneDescriptor paneDescriptor) {
        return paneDescriptor.a == this.a;
    }

    public final PaneDescriptor c(apxf apxfVar, String str, int i, boolean z, int i2, String str2) {
        apxfVar.getClass();
        aunn aunnVar = (aunn) apxfVar.pX(SearchEndpointOuterClass.searchEndpoint);
        Bundle a = PaneDescriptor.a();
        boolean z2 = true;
        a.putBoolean("no_history", true);
        a.putString("query", aunnVar.c);
        a.putString("parent_csn", str);
        a.putInt("parent_ve_type", i);
        if (!z && !aunnVar.h) {
            z2 = false;
        }
        a.putBoolean("is_voice_search", z2);
        a.putInt("cursor_offset", i2);
        if (str2 != null) {
            a.putString("conversation_id", str2);
        }
        a.putInt("network_connectivity_requirement", 2);
        return PaneDescriptor.c(this.a, apxfVar, a);
    }

    public final boolean d(PaneDescriptor paneDescriptor) {
        return paneDescriptor.a == this.a;
    }

    public final PaneDescriptor e() {
        return f(fia.a);
    }

    public final PaneDescriptor f(apxf apxfVar) {
        return g(apxfVar, false, false);
    }

    public final PaneDescriptor g(apxf apxfVar, boolean z, boolean z2) {
        Bundle a = PaneDescriptor.a();
        a.putBoolean("detail_pane", z);
        a.putBoolean("selection_panel_selection_changed", z2);
        return PaneDescriptor.c(this.a, apxfVar, a);
    }

    public final boolean h(PaneDescriptor paneDescriptor) {
        return paneDescriptor.a == this.a;
    }

    public final PaneDescriptor i(String str, boolean z, String str2) {
        zhq.m(str);
        Class cls = this.a;
        Bundle a = PaneDescriptor.a();
        a.putString("playlist_id", str);
        a.putInt("network_connectivity_requirement", 1);
        a.putBoolean("detail_pane", z);
        if (!ammx.e(str2)) {
            a.putString("offline_playlist_top_level_tab_id", str2);
        }
        return new PaneDescriptor(cls, a);
    }

    public final boolean j(PaneDescriptor paneDescriptor) {
        return this.a.isAssignableFrom(paneDescriptor.a);
    }

    public final PaneDescriptor k(apxf apxfVar) {
        apxfVar.getClass();
        return PaneDescriptor.c(this.a, apxfVar, PaneDescriptor.a());
    }

    public final boolean l(PaneDescriptor paneDescriptor) {
        return this.a.isAssignableFrom(paneDescriptor.a);
    }

    public final boolean m(PaneDescriptor paneDescriptor) {
        return paneDescriptor.a == this.a;
    }
}
