package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.embeddedplayer.service.model.f;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nbq {
    private static nbq b;
    public boolean a;

    public nbq() {
        this.a = false;
    }

    public nbq(byte[] bArr) {
    }

    public static nbq d() {
        if (b == null) {
            b = new nbq();
        }
        return b;
    }

    public final f a() {
        return new f(this.a);
    }

    public final void b() {
        this.a = true;
    }

    public final void c() {
        this.a = true;
    }

    public final absq e(adyu adyuVar, boolean z, Context context, shf shfVar, ysl yslVar, axze axzeVar, abrn abrnVar, absp abspVar) {
        if (!this.a || adyuVar == null) {
            return new abtk(z, context, shfVar, abrnVar, abspVar);
        }
        return new acoj(context, yslVar, axzeVar, abrnVar, new abrb(), abspVar, null, null, null);
    }
}
