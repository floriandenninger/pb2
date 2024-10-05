package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.protos.youtube.api.innertube.ApplicationHelpEndpointOuterClass;
import com.google.protos.youtube.api.innertube.ApplicationSettingsEndpointOuterClass;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass;
import com.google.protos.youtube.api.innertube.OfflineVideosEndpointOuterClass;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jgv implements faq, fhz {
    private final gje a;
    private final azrw b;
    private final Set c = new HashSet();
    private final its d;
    private final rxm e;
    private final lkb f;
    private final lkb g;

    public jgv(rxm rxmVar, gje gjeVar, azrw azrwVar, lkb lkbVar, its itsVar, lkb lkbVar2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.e = rxmVar;
        this.a = gjeVar;
        this.b = azrwVar;
        this.g = lkbVar;
        this.d = itsVar;
        this.f = lkbVar2;
        rxmVar.a(this);
    }

    private static void e(ajom ajomVar, boolean z) {
        View a = ajomVar.a();
        if (a != null) {
            a.setEnabled(true);
            if (a instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) a;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    viewGroup.getChildAt(i).setEnabled(true);
                }
            }
            a.setAlpha(true != z ? 0.4f : 1.0f);
        }
    }

    @Override // defpackage.faq
    public final void a(boolean z) {
        apxf e;
        PaneDescriptor d = this.a.d();
        if (d != null) {
            if ((this.d.h(d) || this.g.l(d) || this.f.j(d)) && (e = d.e()) != null && e.pY(BrowseEndpointOuterClass.browseEndpoint) && "FElibrary".equals(((aplt) e.pX(BrowseEndpointOuterClass.browseEndpoint)).c)) {
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    e((ajom) it.next(), !z);
                }
            }
        }
    }

    @Override // defpackage.fhz
    public final void b(ajom ajomVar) {
        c(ajomVar, null);
    }

    @Override // defpackage.fhz
    public final void c(ajom ajomVar, apxf apxfVar) {
        if (apxfVar == null || !(apxfVar.pY(ApplicationHelpEndpointOuterClass.applicationHelpEndpoint) || apxfVar.pY(ApplicationSettingsEndpointOuterClass.applicationSettingsEndpoint) || apxfVar.pY(DownloadsPageEndpointOuterClass.downloadsPageEndpoint) || apxfVar.pY(OfflineVideosEndpointOuterClass.offlineVideosEndpoint) || fia.c(apxfVar, this.b))) {
            Set set = this.c;
            ajomVar.getClass();
            set.add(ajomVar);
            e(ajomVar, !this.e.a);
        }
    }

    @Override // defpackage.fhz
    public final void d(ajom ajomVar) {
        ajomVar.getClass();
        if (this.c.contains(ajomVar)) {
            e(ajomVar, true);
            this.c.remove(ajomVar);
        }
    }
}
