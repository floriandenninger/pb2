package defpackage;

import android.app.Activity;
import android.app.Application;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class axps implements axqk {
    protected final Activity a;
    private volatile Object b;
    private final Object c = new Object();
    private final axqk d;

    public axps(Activity activity) {
        this.a = activity;
        this.d = new axpx((zv) activity);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object b() {
        if (!(this.a.getApplication() instanceof axqk)) {
            if (Application.class.equals(this.a.getApplication().getClass())) {
                throw new IllegalStateException("Sting Activity must be attached to an @Sting Application. Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?");
            }
            String valueOf = String.valueOf(this.a.getApplication().getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 65);
            sb.append("Sting Activity must be attached to an @Sting Application. Found: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        eeb a = ((axpr) axfq.n(this.d, axpr.class)).a();
        a.b = this.a;
        return new eed(a.a, a.c, a.b);
    }

    @Override // defpackage.axqk
    public final Object lM() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = b();
                }
            }
        }
        return this.b;
    }
}
