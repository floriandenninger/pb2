package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jsh extends jri {
    private final azrw b;
    private final String c;
    private Boolean d;
    private final int e;

    public jsh(axzg axzgVar, fjs fjsVar, azrw azrwVar, String str, OfflineArrowView offlineArrowView, int i, View.OnClickListener onClickListener, byte[] bArr, byte[] bArr2) {
        super(axzgVar, fjsVar, azrwVar, 1, str, offlineArrowView, onClickListener, null, null);
        this.b = azrwVar;
        this.c = str;
        this.e = i;
    }

    @Override // defpackage.jri, defpackage.jrl
    public final void a() {
        if (!c()) {
            int i = this.e;
            if (i == 3) {
                this.a.d();
                return;
            } else if (i == 2) {
                this.a.h();
                return;
            }
        }
        super.a();
    }

    @Override // defpackage.jri, defpackage.jrl
    public final void b(jqm jqmVar) {
        if (jqmVar.a || (((agof) this.b.get()).a().i().a(this.c) <= 0 && !Boolean.FALSE.equals(this.d))) {
            if (jqmVar.a) {
                int i = this.e;
                if (i == 3) {
                    this.a.d();
                    return;
                } else if (i == 2) {
                    this.a.h();
                    return;
                }
            }
            super.b(jqmVar);
            return;
        }
        jre jreVar = this.a;
        jreVar.e();
        jreVar.b.c(R.drawable.ic_offline_sync_playlist);
        jreVar.f(R.string.accessibility_offline_button_sync);
    }

    public final void d(Boolean bool) {
        this.d = bool;
        a();
    }
}
