package defpackage;

import com.google.android.apps.youtube.app.common.notification.FcmMessageListenerService;
import com.google.firebase.messaging.FirebaseMessagingService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class fho extends FirebaseMessagingService implements axql {
    private volatile axqc a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.axql
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final axqc lL() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new axqc(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            FcmMessageListenerService fcmMessageListenerService = (FcmMessageListenerService) this;
            ehx ehxVar = (ehx) lM();
            fcmMessageListenerService.a = (aaea) ehxVar.a.K.get();
            fcmMessageListenerService.b = axqq.a(ehxVar.c);
            efz efzVar = ehxVar.a;
            fcmMessageListenerService.c = efzVar.ha;
            fcmMessageListenerService.d = efzVar.lF;
        }
        super.onCreate();
    }
}
