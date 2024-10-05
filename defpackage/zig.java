package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zig extends Handler {
    private final WeakReference a;

    public zig(Looper looper, Object obj) {
        super(looper);
        this.a = new WeakReference(obj);
        Class<?> cls = getClass();
        if ((cls.isAnonymousClass() || cls.isMemberClass() || cls.isLocalClass()) && (cls.getModifiers() & 8) == 0) {
            String valueOf = String.valueOf(cls.getCanonicalName());
            zga.l(valueOf.length() != 0 ? "The following WeakReferenceHandler class should be static or leaks might occur: ".concat(valueOf) : new String("The following WeakReferenceHandler class should be static or leaks might occur: "));
        }
    }

    public final void a() {
        removeCallbacksAndMessages(null);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Object obj = this.a.get();
        if (obj == null) {
            a();
            return;
        }
        akcy akcyVar = (akcy) obj;
        if (message.what == 1) {
            akcyVar.d((akcv) message.obj, 2);
        }
    }
}
