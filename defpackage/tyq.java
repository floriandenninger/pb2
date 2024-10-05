package defpackage;

import android.content.Intent;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tyq {
    public String a;
    public twu b;
    public List c;
    public Intent d;
    public aojx e;
    private tys f;
    private Integer g;
    private aokw h;
    private aohq i;
    private ucx j;
    private Boolean k;

    public final tyr a() {
        Integer num;
        tys tysVar = this.f;
        if (tysVar == null || (num = this.g) == null || this.c == null || this.h == null || this.i == null || this.j == null || this.k == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f == null) {
                sb.append(" source");
            }
            if (this.g == null) {
                sb.append(" type");
            }
            if (this.c == null) {
                sb.append(" threads");
            }
            if (this.h == null) {
                sb.append(" threadStateUpdate");
            }
            if (this.i == null) {
                sb.append(" removeReason");
            }
            if (this.j == null) {
                sb.append(" localThreadState");
            }
            if (this.k == null) {
                sb.append(" activityLaunched");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new typ(tysVar, num.intValue(), this.a, this.b, this.c, this.h, this.i, this.d, this.j, this.e, this.k.booleanValue(), null);
    }

    public final void b(List list) {
        List list2 = this.c;
        if (list2 == null) {
            throw new IllegalStateException("Property \"threads\" has not been set");
        }
        list2.addAll(list);
    }

    public final void c(boolean z) {
        this.k = Boolean.valueOf(z);
    }

    public final void d(ucx ucxVar) {
        if (ucxVar == null) {
            throw new NullPointerException("Null localThreadState");
        }
        this.j = ucxVar;
    }

    public final void e(aohq aohqVar) {
        if (aohqVar == null) {
            throw new NullPointerException("Null removeReason");
        }
        this.i = aohqVar;
    }

    public final void f(tys tysVar) {
        if (tysVar == null) {
            throw new NullPointerException("Null source");
        }
        this.f = tysVar;
    }

    public final void g(aokw aokwVar) {
        if (aokwVar == null) {
            throw new NullPointerException("Null threadStateUpdate");
        }
        this.h = aokwVar;
    }

    public final void h(int i) {
        this.g = Integer.valueOf(i);
    }
}
