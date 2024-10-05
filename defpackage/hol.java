package defpackage;

import android.os.Bundle;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hol {
    public final hrv a;
    private final dd b;

    public hol(dd ddVar, hrv hrvVar) {
        this.b = ddVar;
        this.a = hrvVar;
    }

    public final void a(ce ceVar, String str) {
        dd ddVar = this.b;
        if (ddVar == null || ddVar.x || ddVar.Y()) {
            StringBuilder sb = new StringBuilder(str.length() + 56);
            sb.append("Attempted fragment replace after instance state saved (");
            sb.append(str);
            sb.append(")");
            zga.b(sb.toString());
            StringBuilder sb2 = new StringBuilder(str.length() + 93);
            sb2.append("[ShortsCreation][Android][Navigation]Attempted fragment replace after instance state saved (");
            sb2.append(str);
            sb2.append(")");
            afsi.b(1, 6, sb2.toString());
            return;
        }
        dn k = this.b.k();
        k.u(R.id.reel_container, ceVar, str);
        k.d();
    }

    public final void b(apxf apxfVar) {
        hhd hhdVar = new hhd();
        Bundle bundle = new Bundle();
        if (apxfVar != null) {
            bundle.putByteArray("SHORTS_EDIT_VIDEO_COMMAND_KEY", apxfVar.toByteArray());
        }
        hhdVar.af(bundle);
        a(hhdVar, "editFragment");
    }
}
