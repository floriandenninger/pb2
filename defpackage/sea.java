package defpackage;

import com.google.common.util.concurrent.SettableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sea implements seo {
    public static final amxj a = amxj.l("com/google/android/libraries/ar/faceviewer/components/web/WebBridge");
    public final sep b;
    public final SettableFuture c = SettableFuture.f();
    public sev d;

    public sea(sep sepVar) {
        this.b = sepVar;
        ((seg) sepVar).c = this;
    }

    public final void a(awel awelVar) {
        if (this.d == null) {
            ((amxh) ((amxh) a.f()).i("com/google/android/libraries/ar/faceviewer/components/web/WebBridge", "sendMessageToWeb", 71, "WebBridge.java")).q("sendMessageToWeb before context initialized.");
        } else {
            anaf.Y(this.c, new sdz(this, awelVar), this.d.c);
        }
    }
}
