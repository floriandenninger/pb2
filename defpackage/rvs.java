package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rvs {
    public float a;
    public float b;
    public float c;
    public float d;
    public boolean e;
    public float f = Float.POSITIVE_INFINITY;
    public float g = Float.NEGATIVE_INFINITY;
    public float h = Float.POSITIVE_INFINITY;
    public float i = Float.NEGATIVE_INFINITY;
    public final List j;
    private final List k;
    private final Queue l;

    public rvs() {
        ArrayList x = rwh.x();
        this.k = x;
        this.j = Collections.unmodifiableList(x);
        this.l = new ArrayDeque();
    }

    public final void a(float f, float f2, int i, String str) {
        rvr rvrVar;
        if (this.l.peek() != null) {
            rvrVar = (rvr) this.l.poll();
        } else {
            rvrVar = new rvr();
        }
        rvrVar.a = f;
        rvrVar.b = f2;
        rvrVar.c = i;
        rvrVar.d = str;
        this.k.add(rvrVar);
        this.h = Math.min(this.h, rvrVar.b);
        this.i = Math.max(this.i, rvrVar.b);
        this.f = Math.min(this.f, rvrVar.a);
        this.g = Math.max(this.g, rvrVar.a);
    }

    public final void b() {
        this.a = 0.0f;
        this.c = 0.0f;
        this.b = 0.0f;
        this.d = 0.0f;
        this.e = false;
        this.f = Float.POSITIVE_INFINITY;
        this.g = Float.NEGATIVE_INFINITY;
        this.h = Float.POSITIVE_INFINITY;
        this.i = Float.NEGATIVE_INFINITY;
        this.l.addAll(this.k);
        this.k.clear();
    }
}
