package defpackage;

import android.content.Context;
import com.google.android.libraries.youtube.media.player.scripted.jni.NativeSupport;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class affg {
    public final Context a;
    public volatile affj e;
    private final affe f;
    private volatile affp g;
    public volatile int d = 1;
    public final List b = new ArrayList();
    public final Object c = new Object();

    public affg(Context context, affe affeVar) {
        this.a = context;
        this.f = affeVar;
    }

    public final affp a() {
        afki.d(this.d != 1);
        affp affpVar = this.g;
        afki.a(affpVar);
        return affpVar;
    }

    public final void b(String str) {
        synchronized (this.c) {
            try {
                try {
                    this.f.a();
                    long nativeCreateIsolate = NativeSupport.nativeCreateIsolate();
                    amkq.O(nativeCreateIsolate != 0, "Cannot create JavaScript VM isolate");
                    this.g = new affp(NativeSupport.nativeCreateContext(nativeCreateIsolate));
                    try {
                        affp affpVar = this.g;
                        byte[] bytes = str.getBytes();
                        if (bytes != null) {
                            affpVar.a(bytes);
                        }
                        StringBuilder sb = new StringBuilder(65);
                        sb.append("new MediaFetchControllerNativeHandler(");
                        sb.append("new MediaFetchController()");
                        sb.append(")");
                        afjh a = affpVar.a(sb.toString().getBytes());
                        if (a == null) {
                            StringBuilder sb2 = new StringBuilder(51);
                            sb2.append("Instance \"");
                            sb2.append("new MediaFetchController()");
                            sb2.append("\" is not valid.");
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        this.e = new affj(a, null);
                        this.d = 2;
                    } catch (RuntimeException e) {
                        throw new afet(6, "Failed to create JS MFC.", e);
                    }
                } catch (UnsatisfiedLinkError e2) {
                    throw new afet(6, "JsApi not loaded.", e2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
