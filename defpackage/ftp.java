package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ftp extends gae {
    public final ajut a;
    public final Context b;
    public boolean c;

    public ftp(ViewStub viewStub, Context context, ajut ajutVar) {
        super(viewStub);
        this.a = ajutVar;
        this.b = context;
        this.c = false;
    }

    public final void a() {
        View view = this.f;
        if (this.e && view != null && view.getVisibility() == 0) {
            view.setVisibility(8);
        }
        this.c = false;
    }
}
