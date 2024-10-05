package defpackage;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.Collections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aguv implements agvh {
    public final agvx a;
    private final agzr b;

    public aguv(agvx agvxVar, agzr agzrVar) {
        this.a = agvxVar;
        this.b = agzrVar;
    }

    @Override // defpackage.agvh
    public final String a() {
        agur agurVar = this.a.h;
        if (agurVar == null) {
            return null;
        }
        return agurVar.f;
    }

    @Override // defpackage.agvh
    public final Map b(String str) {
        if (!str.equals(((agur) this.a.a()).f)) {
            return Collections.emptyMap();
        }
        return amrz.j(this.a.c);
    }

    @Override // defpackage.agvh
    public final void c(String str, String str2, int i, agmx agmxVar) {
        String.valueOf(str2).length();
        String.valueOf(str).length();
        this.a.a().f(str, str2, i, agmxVar);
    }

    @Override // defpackage.agvh
    public final void d(Context context) {
    }

    @Override // defpackage.agvh
    public final void e(Context context) {
    }

    public final void f(String str, Bundle bundle) {
        this.a.a().g(str, bundle);
    }

    @Override // defpackage.agvh
    public final void g() {
        Notification a;
        if (this.b.e()) {
            agvx agvxVar = this.a;
            if (Build.VERSION.SDK_INT < 26 || agvxVar.d.getApplicationInfo().targetSdkVersion < 26 || (a = ((agon) agvxVar.f.get()).a()) == null || !agvxVar.p(a)) {
                agvxVar.g.c();
            }
        }
    }

    @Override // defpackage.agvh
    public final void h() {
        this.a.a().h();
    }

    @Override // defpackage.agvh
    public final void i(String str) {
        String.valueOf(str).length();
        this.a.a().i(str);
    }

    @Override // defpackage.agvh
    public final void j(String str, int i) {
        String.valueOf(str).length();
        this.a.a().k(str, i);
    }

    @Override // defpackage.agvh
    public final void k(String str) {
        str.length();
        this.a.a().l(str);
    }

    @Override // defpackage.agvh
    public final void l(String str) {
        String.valueOf(str).length();
        this.a.a().m(str);
    }

    @Override // defpackage.agvh
    public final void m(String str) {
        String.valueOf(str).length();
        this.a.a().n(str);
    }

    @Override // defpackage.agvh
    public final boolean n(int i, Notification notification) {
        if (this.b.e()) {
            return this.a.p(notification);
        }
        return false;
    }
}
