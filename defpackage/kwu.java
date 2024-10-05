package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class kwu extends bv implements axql {
    private ContextWrapper ae;
    private volatile axqa af;
    private final Object ag = new Object();
    private boolean ah = false;

    private final void aH() {
        if (this.ae == null) {
            this.ae = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.ae;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        aH();
        aG();
    }

    @Override // defpackage.axql
    /* renamed from: aF, reason: merged with bridge method [inline-methods] */
    public final axqa lL() {
        if (this.af == null) {
            synchronized (this.ag) {
                if (this.af == null) {
                    this.af = new axqa(this);
                }
            }
        }
        return this.af;
    }

    protected final void aG() {
        if (this.ah) {
            return;
        }
        this.ah = true;
        kwx kwxVar = (kwx) this;
        ehw ehwVar = (ehw) lM();
        kwxVar.ae = muf.v((gng) ehwVar.c.ck.get(), R.style.Theme_YouTube_SuggestedPlaylistVideos_Dark, R.style.Theme_YouTube_SuggestedPlaylistVideos_Light);
        efz efzVar = ehwVar.b;
        azrw azrwVar = efzVar.a.q;
        azrw azrwVar2 = efzVar.iN;
        eed eedVar = ehwVar.c;
        kwxVar.ag = new ohx(azrwVar, azrwVar2, eedVar.f, efzVar.i, eedVar.cu, eedVar.al, eedVar.il, eedVar.mA, efzVar.B, efzVar.xp, efzVar.K, (byte[]) null, (byte[]) null);
        kwxVar.af = ehwVar.b.cO();
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.bv, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        aH();
        aG();
    }

    @Override // defpackage.axqk
    public final Object lM() {
        return lL().lM();
    }

    @Override // defpackage.bv, defpackage.ce
    public final LayoutInflater lW(Bundle bundle) {
        return LayoutInflater.from(axqa.c(super.lW(bundle), this));
    }

    @Override // defpackage.ce
    public final Context qR() {
        if (super.qR() == null && this.ae == null) {
            return null;
        }
        aH();
        return this.ae;
    }
}
