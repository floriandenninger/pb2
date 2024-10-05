package defpackage;

import android.net.Uri;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahre implements afxe {
    final /* synthetic */ CreatorEndscreenOverlayPresenter a;

    public ahre(CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter) {
        this.a = creatorEndscreenOverlayPresenter;
    }

    @Override // defpackage.afxe
    public final String a(Uri uri, String str) {
        if ("CPN".equals(str)) {
            String str2 = this.a.n;
            return str2 == null ? "" : str2;
        }
        if ("AD_CPN".equals(str)) {
            String str3 = this.a.o;
            return str3 == null ? "" : str3;
        }
        if (!"MT".equals(str)) {
            return null;
        }
        aixh aixhVar = this.a.m;
        if (aixhVar == null) {
            return "";
        }
        long b = aixhVar.b();
        StringBuilder sb = new StringBuilder(20);
        sb.append(b / 1000);
        return sb.toString();
    }

    @Override // defpackage.afxe
    public final String b() {
        return "CreatorEndscreenMacroSubstitutor";
    }
}
