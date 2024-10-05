package defpackage;

import android.app.Dialog;
import android.view.KeyEvent;
import androidx.mediarouter.app.MediaRouteButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class addj implements addf {
    public static final /* synthetic */ addj b = new addj(1);
    private final /* synthetic */ int c;

    public addj(int i) {
        this.c = i;
    }

    @Override // defpackage.addf
    public final ayqx a(MediaRouteButton mediaRouteButton) {
        if (this.c == 0) {
            final addi addiVar = new addi(mediaRouteButton);
            KeyEvent.Callback callback = addiVar.a;
            if (callback instanceof addo) {
                final addo addoVar = (addo) callback;
                addiVar.b = addoVar.h().D(new ayrm() { // from class: addg
                    @Override // defpackage.ayrm
                    public final void a() {
                        addi addiVar2 = addi.this;
                        addo addoVar2 = addoVar;
                        Dialog dialog = addiVar2.c;
                        if (dialog == null || !dialog.isShowing()) {
                            return;
                        }
                        addoVar2.i();
                        addiVar2.a.performClick();
                        addiVar2.c.cancel();
                    }
                }).ax(new ayrs() { // from class: addh
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        addi addiVar2 = addi.this;
                        MediaRouteButton mediaRouteButton2 = addiVar2.a;
                        if (addiVar2.c == null) {
                            addiVar2.c = new ades(mediaRouteButton2.getContext());
                        }
                        if (addiVar2.c.isShowing()) {
                            return;
                        }
                        addiVar2.c.show();
                    }
                });
            }
            return addiVar;
        }
        return new adde();
    }
}
