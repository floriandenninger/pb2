package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public class znz extends ce implements axql {
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
        aF();
    }

    protected final void aF() {
        if (this.d) {
            return;
        }
        this.d = true;
        znv znvVar = (znv) this;
        ehw ehwVar = (ehw) lM();
        znvVar.b = ehwVar.c.iA();
        znvVar.c = axqq.a(ehwVar.c.jp);
        znvVar.d = (zao) ehwVar.c.B.get();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        a();
        aF();
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

    @Override // defpackage.axql
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
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
}
