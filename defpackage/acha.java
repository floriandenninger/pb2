package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class acha extends acri implements axql {
    private ContextWrapper a;
    private volatile axqa b;
    private final Object c = new Object();
    private boolean d = false;

    private final void a() {
        if (this.a == null) {
            this.a = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.a;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        a();
        aU();
    }

    @Override // defpackage.axql
    /* renamed from: aT, reason: merged with bridge method [inline-methods] */
    public final axqa lL() {
        if (this.b == null) {
            synchronized (this.c) {
                if (this.b == null) {
                    this.b = new axqa(this);
                }
            }
        }
        return this.b;
    }

    protected final void aU() {
        if (this.d) {
            return;
        }
        this.d = true;
        acgf acgfVar = (acgf) this;
        ehw ehwVar = (ehw) lM();
        acgfVar.a = (acra) ehwVar.c.jk.get();
        acgfVar.b = (Handler) ehwVar.b.an.get();
        acgfVar.c = (aahd) ehwVar.c.I.get();
        acgfVar.d = (Executor) ehwVar.b.f.get();
        acgfVar.e = (acfh) ehwVar.b.a.cP.get();
        acgfVar.ae = (abya) ehwVar.c.hM.get();
        acgfVar.af = (acge) ehwVar.c.od.get();
        acgfVar.ag = (abrx) ehwVar.c.oe.get();
        acgfVar.ah = (ajjz) ehwVar.b.kp.get();
        acgfVar.ai = (ajwn) ehwVar.c.og.get();
        acgfVar.ax = ehwVar.c.mO();
        acgfVar.aj = (aays) ehwVar.b.a.cQ.get();
        acgfVar.ak = ehwVar.c.is();
        acgfVar.al = (akch) ehwVar.c.aj.get();
        acgfVar.am = (SharedPreferences) ehwVar.b.z.get();
        acgfVar.aw = (agcm) ehwVar.b.a.aO.get();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        a();
        aU();
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // defpackage.ce
    public final LayoutInflater lW(Bundle bundle) {
        return LayoutInflater.from(axqa.c(az(), this));
    }

    @Override // defpackage.ce
    public final Context qR() {
        if (super.qR() == null && this.a == null) {
            return null;
        }
        a();
        return this.a;
    }
}
