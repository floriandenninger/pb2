package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qrd {
    public qqu a;
    public Feature[] b;
    private boolean d = true;
    public int c = 0;

    public final qre a() {
        qip.ap(this.a != null, "execute parameter required");
        return new qrc(this, this.b, this.d, this.c);
    }

    public final void b() {
        this.d = false;
    }
}
