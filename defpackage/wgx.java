package defpackage;

import com.google.android.libraries.youtube.account.service.AccountsChangedJobIntentService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class wgx extends aif implements axql {
    private volatile axqc h;
    private final Object i = new Object();
    private boolean j = false;

    @Override // defpackage.axql
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final axqc lL() {
        if (this.h == null) {
            synchronized (this.i) {
                if (this.h == null) {
                    this.h = new axqc(this);
                }
            }
        }
        return this.h;
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // defpackage.aif, android.app.Service
    public final void onCreate() {
        if (!this.j) {
            this.j = true;
            ((AccountsChangedJobIntentService) this).h = axqq.a(((ehx) lM()).a.a.da);
        }
        super.onCreate();
    }
}
