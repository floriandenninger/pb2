package defpackage;

import android.os.Handler;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gcl extends gan implements akbz {
    private gcs b;

    public gcl(gbh gbhVar, Handler handler) {
        super(gbhVar, handler, ejz.k, gbv.c);
    }

    @Override // defpackage.gan
    protected final /* bridge */ /* synthetic */ gbj c(BottomUiContainer bottomUiContainer) {
        if (this.b == null) {
            if (bottomUiContainer.b == null) {
                bottomUiContainer.b = (Snackbar) bottomUiContainer.d(R.layout.app_snackbar);
                TextView textView = (TextView) bottomUiContainer.b.findViewById(R.id.message);
                if (textView != null) {
                    textView.setMaxLines(3);
                }
            }
            this.b = new gcs(bottomUiContainer.b);
        }
        return this.b;
    }

    @Override // defpackage.gan
    protected final /* bridge */ /* synthetic */ boolean l(akbn akbnVar) {
        return true;
    }

    @Override // defpackage.akbz
    public final /* bridge */ /* synthetic */ akca m() {
        return (akca) super.d();
    }

    @Override // defpackage.akbz
    public final /* bridge */ /* synthetic */ void n(akcb akcbVar) {
        super.f(akcbVar);
    }

    @Override // defpackage.akbz
    public final /* bridge */ /* synthetic */ void o(akcb akcbVar) {
        super.j(akcbVar);
    }
}
