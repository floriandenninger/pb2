package defpackage;

import android.content.ComponentName;
import android.content.Context;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class bpd {
    public final Context e;
    public final bpb f;
    public final bpa g;
    public bov h;
    public boolean i;
    public bpf j;
    public boolean k;
    public bpk l;

    public bpd(Context context) {
        this(context, null);
    }

    public bpc b(String str) {
        throw null;
    }

    public void d(bov bovVar) {
    }

    public boz jL(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public final void jN(bpf bpfVar) {
        bpw.c();
        if (this.j != bpfVar) {
            this.j = bpfVar;
            if (this.k) {
                return;
            }
            this.k = true;
            this.g.sendEmptyMessage(1);
        }
    }

    public final void jO(bov bovVar) {
        bpw.c();
        if (Objects.equals(this.h, bovVar)) {
            return;
        }
        jP(bovVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void jP(bov bovVar) {
        this.h = bovVar;
        if (this.i) {
            return;
        }
        this.i = true;
        this.g.sendEmptyMessage(2);
    }

    public final void jQ(bpk bpkVar) {
        bpw.c();
        this.l = bpkVar;
    }

    public bpd(Context context, bpb bpbVar) {
        this.g = new bpa(this);
        if (context != null) {
            this.e = context;
            if (bpbVar == null) {
                this.f = new bpb(new ComponentName(context, getClass()));
                return;
            } else {
                this.f = bpbVar;
                return;
            }
        }
        throw new IllegalArgumentException("context must not be null");
    }

    public bpc jM(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
        return b(str);
    }
}
