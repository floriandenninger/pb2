package defpackage;

import android.content.Context;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class qvh {
    private final String a;
    private Object b;

    /* JADX INFO: Access modifiers changed from: protected */
    public qvh(String str) {
        this.a = str;
    }

    protected abstract Object c(IBinder iBinder);

    public final Object d(Context context) {
        if (this.b == null) {
            qip.an(context);
            Context c = qnm.c(context);
            if (c == null) {
                throw new qvg();
            }
            try {
                this.b = c((IBinder) c.getClassLoader().loadClass(this.a).newInstance());
            } catch (ClassNotFoundException e) {
                throw new qvg("Could not load creator class.", e);
            } catch (IllegalAccessException e2) {
                throw new qvg("Could not access creator.", e2);
            } catch (InstantiationException e3) {
                throw new qvg("Could not instantiate creator.", e3);
            }
        }
        return this.b;
    }
}
