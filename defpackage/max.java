package defpackage;

import android.view.MenuItem;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class max implements fzk {
    private final avsr a;
    private final aahd b;
    private final /* synthetic */ int c;

    public max(avsr avsrVar, aahd aahdVar, int i, byte[] bArr) {
        this.c = i;
        amkq.N((avsrVar.b & 2) != 0);
        this.a = avsrVar;
        this.b = aahdVar;
    }

    @Override // defpackage.fze
    public final int g() {
        return this.c != 0 ? R.id.menu_creation : R.id.menu_upload;
    }

    @Override // defpackage.fze
    public final int h() {
        return this.c != 0 ? R.menu.creation_menu : R.menu.upload_menu;
    }

    @Override // defpackage.fze
    public final fzd i() {
        return null;
    }

    @Override // defpackage.fze
    public final /* synthetic */ void j() {
    }

    @Override // defpackage.fze
    public final boolean k() {
        return true;
    }

    @Override // defpackage.fzk
    public final int n() {
        return 40;
    }

    @Override // defpackage.fzk
    public final CharSequence o() {
        return "";
    }

    public max(avsr avsrVar, aahd aahdVar, int i) {
        this.c = i;
        amkq.N((avsrVar.b & 2) != 0);
        this.a = avsrVar;
        this.b = aahdVar;
    }

    @Override // defpackage.fze
    public final void l(MenuItem menuItem) {
        if (this.c == 0) {
            menuItem.setShowAsAction(2);
            menuItem.setIcon(R.drawable.quantum_ic_videocam_white_24);
        } else {
            menuItem.setShowAsAction(2);
            menuItem.setIcon(R.drawable.ic_yt_create_add);
        }
    }

    @Override // defpackage.fze
    public final boolean m() {
        if (this.c == 0) {
            aahd aahdVar = this.b;
            apxf apxfVar = this.a.c;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            aahdVar.c(apxfVar, null);
            return true;
        }
        aahd aahdVar2 = this.b;
        apxf apxfVar2 = this.a.c;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        aahdVar2.c(apxfVar2, null);
        return true;
    }
}
