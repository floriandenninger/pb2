package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.service;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.innertube.model.FancyDismissibleDialogRendererWrapper;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.e;
import com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g;
import defpackage.aqvu;
import defpackage.xla;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class d implements g {
    public com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c a;
    private final e b;

    public d(Handler handler, com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c cVar) {
        this.a = cVar;
        e eVar = new e(handler);
        this.b = eVar;
        try {
            cVar.g(eVar);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void m(int i, int i2, int i3) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.a(i, i2, i3);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void n(int i) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.f(i);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void o(CharSequence charSequence) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.h(charSequence);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void p(Bitmap bitmap) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.i(bitmap);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void r(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.j(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void t(xla xlaVar) {
        this.b.a = xlaVar;
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void u(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.k(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void v(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.l(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void w(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.m(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void x(boolean z) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.n(z);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void y(aqvu aqvuVar) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.o(new FancyDismissibleDialogRendererWrapper(aqvuVar));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.g
    public final void z(CharSequence charSequence) {
        com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared.c cVar = this.a;
        if (cVar != null) {
            try {
                cVar.p(charSequence);
            } catch (RemoteException unused) {
            }
        }
    }
}
