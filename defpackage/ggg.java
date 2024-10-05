package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ggg {
    public final gfq a;
    public final int b;
    public ggg h;
    public int f = 0;
    public int g = 0;
    public final ArrayList c = new ArrayList();
    public final azrj d = azrj.W();
    public final azrj e = azrj.W();

    public ggg(gof gofVar, ggr ggrVar, int i) {
        this.a = new gfq(ggrVar, gofVar);
        this.b = i;
    }

    public final void a(ggf ggfVar) {
        this.c.remove(ggfVar);
    }

    public final boolean b() {
        return !this.c.isEmpty();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ Inline playback request");
        String valueOf = String.valueOf(this.a.b);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb2.append(": autoplayable = ");
        sb2.append(valueOf);
        sb.append(sb2.toString());
        int i = this.f;
        StringBuilder sb3 = new StringBuilder(29);
        sb3.append(", current state = ");
        sb3.append(i);
        sb.append(sb3.toString());
        int i2 = this.g;
        StringBuilder sb4 = new StringBuilder(22);
        sb4.append(", status = ");
        sb4.append(i2);
        sb.append(sb4.toString());
        sb.append(", next request = ");
        sb.append(this.h);
        return sb.toString();
    }
}
