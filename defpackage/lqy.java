package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.apps.youtube.app.settings.videoquality.VideoQualityPrefsFragment;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class lqy extends lnr implements axql {
    private ContextWrapper c;
    private volatile axqa d;
    private final Object e = new Object();
    private boolean ae = false;

    private final void aL() {
        if (this.c == null) {
            this.c = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.c;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        aL();
        aK();
    }

    @Override // defpackage.axql
    /* renamed from: aJ, reason: merged with bridge method [inline-methods] */
    public final axqa lL() {
        if (this.d == null) {
            synchronized (this.e) {
                if (this.d == null) {
                    this.d = new axqa(this);
                }
            }
        }
        return this.d;
    }

    protected final void aK() {
        if (this.ae) {
            return;
        }
        this.ae = true;
        VideoQualityPrefsFragment videoQualityPrefsFragment = (VideoQualityPrefsFragment) this;
        ehw ehwVar = (ehw) lM();
        videoQualityPrefsFragment.aD = ehwVar.ar();
        videoQualityPrefsFragment.aE = (zaw) ehwVar.b.iN.get();
        videoQualityPrefsFragment.c = new lrd((ywr) ehwVar.b.ge.get(), (shf) ehwVar.b.g.get(), (aaea) ehwVar.b.K.get(), (acqz) ehwVar.c.P.get());
        videoQualityPrefsFragment.d = (aaea) ehwVar.b.K.get();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        aL();
        aK();
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
        if (super.qR() == null && this.c == null) {
            return null;
        }
        aL();
        return this.c;
    }
}
