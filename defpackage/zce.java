package defpackage;

import android.view.View;
import android.view.ViewStub;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zce {
    public ViewStub a;
    public View b;
    private final Class c;

    private zce(ViewStub viewStub, Class cls) {
        this.c = cls;
        viewStub.getClass();
        this.a = viewStub;
        this.b = null;
    }

    public static zce b(ViewStub viewStub, Class cls) {
        return new zce(viewStub, cls);
    }

    public final View a() {
        if (this.b == null) {
            View view = (View) this.c.cast(this.a.inflate());
            view.getClass();
            this.b = view;
            this.a = null;
        }
        return this.b;
    }

    public final boolean c() {
        return this.b != null;
    }
}
