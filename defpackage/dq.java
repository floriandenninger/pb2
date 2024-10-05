package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dq implements aoc, bue, apu {
    public aom a = null;
    public bud b = null;
    private final ce c;
    private final apt d;
    private apo e;

    public dq(ce ceVar, apt aptVar) {
        this.c = ceVar;
        this.d = aptVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(aod aodVar) {
        this.a.e(aodVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        if (this.a == null) {
            this.a = new aom(this);
            this.b = bud.a(this);
        }
    }

    @Override // defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        Application application;
        apo defaultViewModelProviderFactory = this.c.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.c.aa)) {
            this.e = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.e == null) {
            Context applicationContext = this.c.qW().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (!(applicationContext instanceof Application)) {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = (Application) applicationContext;
                    break;
                }
            }
            this.e = new apj(application, this, this.c.m);
        }
        return this.e;
    }

    @Override // defpackage.aok
    public final aof getLifecycle() {
        b();
        return this.a;
    }

    @Override // defpackage.bue
    public final buc getSavedStateRegistry() {
        b();
        return this.b.a;
    }

    @Override // defpackage.apu
    public final apt getViewModelStore() {
        b();
        return this.d;
    }
}
