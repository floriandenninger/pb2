package defpackage;

import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import java.lang.reflect.Field;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ymp {
    private Field a;
    private Field b;
    private Field c;
    private Class d;
    private MessageQueue e;
    private Thread f;

    ymp() {
        this(534773760L);
    }

    public final void a() {
        if (Thread.currentThread() != this.f) {
            return;
        }
        try {
            Message message = (Message) this.a.get(this.e);
            while (message != null) {
                Runnable callback = message.getCallback();
                if (callback != null && callback.getClass() == this.d) {
                    this.c.set(message, anij.a);
                    try {
                        callback.run();
                    } catch (Throwable th) {
                        this.f = null;
                        zga.d("Cannot run binder connection early", th);
                    }
                }
                message = (Message) this.b.get(message);
            }
        } catch (IllegalAccessException e) {
            this.f = null;
            zga.d("Cannot flush binder connections", e);
        }
    }

    public ymp(long j) {
        this.f = null;
        if ((j & (1 << Build.VERSION.SDK_INT)) == 0) {
            return;
        }
        try {
            Looper mainLooper = Looper.getMainLooper();
            this.f = mainLooper.getThread();
            if (Build.VERSION.SDK_INT >= 23) {
                this.e = mainLooper.getQueue();
            } else {
                Field declaredField = Looper.class.getDeclaredField("mQueue");
                declaredField.setAccessible(true);
                this.e = (MessageQueue) declaredField.get(mainLooper);
            }
            this.a = MessageQueue.class.getDeclaredField("mMessages");
            this.b = Message.class.getDeclaredField("next");
            this.c = Message.class.getDeclaredField("callback");
            this.a.setAccessible(true);
            this.b.setAccessible(true);
            this.c.setAccessible(true);
            this.d = Class.forName("android.app.LoadedApk$ServiceDispatcher$RunConnection");
        } catch (Exception e) {
            zga.d("Cannot initialize BinderConnectionFlusher", e);
            this.f = null;
        }
    }
}
