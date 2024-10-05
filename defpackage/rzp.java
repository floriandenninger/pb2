package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rzp implements rwi {
    public final rzo a;
    public ruv c;
    private final String d;
    private final rwh e = new rzn(this);
    public boolean b = true;

    public rzp(Context context, String str, int i) {
        this.d = str;
        this.a = new rzo(context, i);
    }

    public final void a(rwo rwoVar) {
        if (rwoVar instanceof sal) {
            throw null;
        }
        rzo rzoVar = this.a;
        rzoVar.b = -1.0f;
        rzoVar.c = -1.0f;
        rzoVar.d = -1.0f;
        rzoVar.a = new sau(this.d);
        rzoVar.d = -1.0f;
        this.a.invalidate();
    }

    @Override // defpackage.rwi
    public final void b(ruv ruvVar) {
        sbt.c(this.c == null, "Behavior already attached to a different chart");
        this.c = ruvVar;
        ruvVar.z(this.e);
        ruvVar.m(this.a);
    }

    @Override // defpackage.rwi
    public final void c(ruv ruvVar) {
        sbt.c(this.c != null, "Can't detach and unattached behavior.");
        sbt.a(this.c == ruvVar, "Can't detach from a chart that this behavior is not attached to.");
        ruvVar.A(this.e);
        ruvVar.removeView(this.a);
        this.c = null;
    }
}
