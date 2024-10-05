package defpackage;

import android.location.Location;
import android.os.Bundle;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pxq {
    public final Date a;
    public final List b;
    public final int c;
    public final Set d;
    public final Location e;
    public final Bundle f;
    public final Map g;
    public final int h;
    public final Set i;
    public final Bundle j;
    public final Set k;
    public final boolean l;

    public pxq(pxp pxpVar) {
        this.a = pxpVar.g;
        this.b = pxpVar.h;
        this.c = pxpVar.i;
        this.d = Collections.unmodifiableSet(pxpVar.a);
        this.e = pxpVar.j;
        this.f = pxpVar.b;
        this.g = Collections.unmodifiableMap(pxpVar.c);
        this.h = pxpVar.k;
        this.i = Collections.unmodifiableSet(pxpVar.d);
        this.j = pxpVar.e;
        this.k = Collections.unmodifiableSet(pxpVar.f);
        this.l = pxpVar.l;
    }
}
