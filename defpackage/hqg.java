package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class hqg extends ce implements axql {
    private ContextWrapper a;
    private volatile axqa b;
    private final Object c = new Object();
    private boolean d = false;

    private final void o() {
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
        o();
        n();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        o();
        n();
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // defpackage.ce
    public final LayoutInflater lW(Bundle bundle) {
        return LayoutInflater.from(axqa.c(az(), this));
    }

    @Override // defpackage.axql
    /* renamed from: me, reason: merged with bridge method [inline-methods] */
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

    /* JADX WARN: Type inference failed for: r2v13, types: [hrs, java.lang.Object] */
    protected final void n() {
        if (this.d) {
            return;
        }
        this.d = true;
        hqw hqwVar = (hqw) this;
        ehw ehwVar = (ehw) lM();
        hqwVar.av = ehwVar.b.cO();
        hqwVar.aw = new hqo((ci) ehwVar.c.s.get());
        hqwVar.ax = new hqx();
        azrw azrwVar = ehwVar.b.i;
        eed eedVar = ehwVar.c;
        hqwVar.aG = new ajyw(azrwVar, eedVar.s, eedVar.jq, (int[]) null, (byte[]) null, (byte[]) null);
        hqwVar.ay = ehwVar.c.kw();
        hqwVar.aE = (hfp) ehwVar.c.hQ.get();
        hqwVar.az = (hos) ehwVar.c.jX.get();
        hqwVar.aA = (hrq) ehwVar.c.jq.get();
        hqwVar.aB = (hmw) ehwVar.c.hR.get();
        hqwVar.aC = (hoz) ehwVar.c.mF.get();
    }

    @Override // defpackage.ce
    public final Context qR() {
        if (super.qR() == null && this.a == null) {
            return null;
        }
        o();
        return this.a;
    }
}
