package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sfp {
    public static final amxj a = amxj.l("com/google/android/libraries/assistant/appintegration/AssistantConnector");
    public edt b = edt.APP_INTEGRATION_MIC_TAP;
    public final SettableFuture c = SettableFuture.f();
    public volatile anhy d;

    public sfp(Context context, amnv amnvVar, amnv amnvVar2) {
        anaf.Y(anfq.h(sfl.a(context), rtp.g, angq.a), new sfn(this, amnvVar2, amnvVar), angq.a);
    }

    public static void b(String str, anhy anhyVar) {
        anaf.Y(anhyVar, new sfo(str), angq.a);
    }

    public final int a() {
        if (!this.c.isDone()) {
            return this.d != null ? 2 : 0;
        }
        try {
            return ((edu) this.c.get()).a();
        } catch (InterruptedException | ExecutionException e) {
            ((amxh) ((amxh) ((amxh) a.f()).h(e)).i("com/google/android/libraries/assistant/appintegration/AssistantConnector", "getConnectionState", 'H', "AssistantConnector.java")).q("Failed to get connector while future is done");
            return 0;
        }
    }

    public final boolean c() {
        if (!this.c.isDone()) {
            return false;
        }
        try {
            return ((edu) this.c.get()).d();
        } catch (InterruptedException | ExecutionException unused) {
            return false;
        }
    }
}
