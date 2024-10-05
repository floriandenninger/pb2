package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agjw {
    public agng a;
    public agni b;
    public final /* synthetic */ agka c;
    private final List d;
    private final atrx e;
    private final long f;
    private final long g;
    private final int h;

    public agjw(agka agkaVar, agng agngVar, List list, atrx atrxVar, long j, long j2, int i) {
        this.c = agkaVar;
        atrx atrxVar2 = atrx.UNKNOWN_FORMAT_TYPE;
        this.a = agngVar;
        this.d = list;
        this.e = atrxVar;
        this.f = j;
        this.g = j2;
        this.h = i;
    }

    public final agng a() {
        agng agngVar;
        synchronized (this.c.k) {
            agngVar = this.a;
        }
        return agngVar;
    }

    public final agni b() {
        agni agniVar;
        int i;
        agnv e;
        synchronized (this.c.k) {
            if (this.b == null) {
                agng agngVar = this.a;
                List list = this.d;
                atrx atrxVar = this.e;
                synchronized (this.c.k) {
                    Iterator it = yjj.v(this.c.g, this.a.a).iterator();
                    i = 0;
                    while (it.hasNext()) {
                        agjy j = this.c.j((String) it.next());
                        if (j != null && (e = j.e()) != null && e.E()) {
                            i++;
                        }
                    }
                }
                this.b = new agni(agngVar, list, atrxVar, i, this.f, this.g, this.h);
            }
            agniVar = this.b;
        }
        return agniVar;
    }
}
