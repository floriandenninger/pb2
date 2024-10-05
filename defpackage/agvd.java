package defpackage;

import android.app.Notification;
import android.content.Context;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agvd implements agvh {
    private final Context a;
    private final yne b;

    public agvd(Context context, yne yneVar) {
        this.a = context;
        this.b = yneVar;
    }

    @Override // defpackage.agvh
    public final String a() {
        aguc agucVar = (aguc) this.b.b();
        if (agucVar == null) {
            return null;
        }
        return agucVar.a();
    }

    @Override // defpackage.agvh
    public final Map b(String str) {
        aguc agucVar = (aguc) this.b.a(this.a);
        if (agucVar == null || !str.equals(agucVar.a())) {
            return Collections.emptyMap();
        }
        return amrz.j(agucVar.a.b);
    }

    @Override // defpackage.agvh
    public final void c(String str, String str2, int i, agmx agmxVar) {
        aguc agucVar = (aguc) this.b.a(this.a);
        agucVar.b();
        agucVar.a.e.f(str, str2, i, agmxVar);
    }

    @Override // defpackage.agvh
    public final void d(Context context) {
        this.b.c(context);
    }

    @Override // defpackage.agvh
    public final void e(Context context) {
        this.b.d(context);
    }

    @Override // defpackage.agvh
    public final void g() {
        if (((aguc) this.b.b()) == null) {
            return;
        }
        ((aguc) this.b.b()).a.n();
    }

    @Override // defpackage.agvh
    public final void h() {
        aguc agucVar = (aguc) this.b.a(this.a);
        agucVar.b();
        agucVar.a.e.h();
    }

    @Override // defpackage.agvh
    public final void i(String str) {
        aguc agucVar = (aguc) this.b.a(this.a);
        agucVar.b();
        agucVar.a.e.i(str);
    }

    @Override // defpackage.agvh
    public final void j(String str, int i) {
        aguc agucVar = (aguc) this.b.a(this.a);
        agucVar.b();
        agucVar.a.e.k(str, i);
    }

    @Override // defpackage.agvh
    public final void k(String str) {
        aguc agucVar = (aguc) this.b.a(this.a);
        str.length();
        agucVar.b();
        agucVar.a.e.l(str);
    }

    @Override // defpackage.agvh
    public final void l(String str) {
        aguc agucVar = (aguc) this.b.a(this.a);
        agucVar.b();
        agucVar.a.e.m(str);
    }

    @Override // defpackage.agvh
    public final void m(String str) {
        aguc agucVar = (aguc) this.b.a(this.a);
        String.valueOf(str).length();
        agucVar.b();
        agucVar.a.e.n(str);
    }

    @Override // defpackage.agvh
    public final boolean n(int i, Notification notification) {
        aguc agucVar = (aguc) this.b.b();
        if (agucVar == null) {
            return false;
        }
        agucVar.a.startForeground(i, notification);
        return true;
    }
}
