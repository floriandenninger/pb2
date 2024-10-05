package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class agud extends Service implements agui {
    public Executor a;
    public boolean c;
    public Set d;
    public aguj e;
    public agvo f;
    private aguc h;
    public final Map b = new HashMap();
    protected boolean g = false;

    protected abstract aguj a(agui aguiVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        throw null;
    }

    @Override // defpackage.agui
    public void c(boolean z) {
        throw null;
    }

    @Override // defpackage.agui
    public void d(Map map) {
        throw null;
    }

    @Override // defpackage.agui
    public void e(agnz agnzVar) {
        throw null;
    }

    @Override // defpackage.agui
    public final void f(agnz agnzVar) {
        this.b.put(agnzVar.a, agnzVar);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((agtv) it.next()).d(agnzVar);
        }
    }

    @Override // defpackage.agui
    public void g(agnz agnzVar, boolean z) {
        throw null;
    }

    @Override // defpackage.agui
    public void h(agnz agnzVar) {
        throw null;
    }

    @Override // defpackage.agui
    public final void i(agnz agnzVar) {
        this.b.put(agnzVar.a, agnzVar);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((agtv) it.next()).h(agnzVar);
        }
    }

    @Override // defpackage.agui
    public final void j(agnz agnzVar) {
        this.b.put(agnzVar.a, agnzVar);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((agtv) it.next()).i(agnzVar);
        }
    }

    @Override // defpackage.agui
    public final void k(agnz agnzVar) {
        this.b.put(agnzVar.a, agnzVar);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((agtv) it.next()).j(agnzVar);
        }
    }

    @Override // defpackage.agui
    public void l(agnz agnzVar, atqs atqsVar, agnf agnfVar) {
        throw null;
    }

    @Override // defpackage.agui
    public final void m(agnz agnzVar) {
        this.b.put(agnzVar.a, agnzVar);
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((agtv) it.next()).l(agnzVar);
        }
    }

    public abstract void n();

    protected abstract void o();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.h;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.a = new agub(this);
        if (this.e == null) {
            agvo agvoVar = new agvo(this, this.a);
            this.f = agvoVar;
            this.e = a(agvoVar);
        }
        this.d = new CopyOnWriteArraySet();
        this.h = new aguc(this);
        o();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.e.j();
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            this.e.g(intent.getAction(), intent.getExtras());
        }
        this.g = false;
        return 1;
    }

    public final void p(agtv agtvVar) {
        Set set = this.d;
        agtvVar.getClass();
        if (set.add(agtvVar) && this.c) {
            agtvVar.g();
        }
    }
}
