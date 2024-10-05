package defpackage;

import com.google.android.apps.youtube.app.extensions.mediabrowser.impl.MainAppMediaBrowserService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class gzq extends arm implements axql {
    private volatile axqc f;
    private final Object g = new Object();
    private boolean h = false;

    @Override // defpackage.axql
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final axqc lL() {
        if (this.f == null) {
            synchronized (this.g) {
                if (this.f == null) {
                    this.f = new axqc(this);
                }
            }
        }
        return this.f;
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // defpackage.arm, android.app.Service
    public void onCreate() {
        if (!this.h) {
            this.h = true;
            MainAppMediaBrowserService mainAppMediaBrowserService = (MainAppMediaBrowserService) this;
            ehx ehxVar = (ehx) lM();
            mainAppMediaBrowserService.f = (gzs) ehxVar.a.jr.get();
            efz efzVar = ehxVar.a;
            mainAppMediaBrowserService.g = efzVar.fY;
            mainAppMediaBrowserService.h = efzVar.uM;
        }
        super.onCreate();
    }
}
