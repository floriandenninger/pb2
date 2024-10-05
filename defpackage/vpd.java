package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.libraries.user.profile.photopicker.fragment.devicephotos.DevicePhotosFragment;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class vpd extends ce implements axql, axqh {
    private ContextWrapper a;
    public boolean aq;
    private volatile axqa b;
    private final Object c;

    public vpd() {
        this.c = new Object();
        this.aq = false;
    }

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
        Object N = N();
        if (N instanceof axqk) {
            if ((!(N instanceof axqh) || ((axqh) N).h()) && !this.aq) {
                this.aq = true;
                DevicePhotosFragment devicePhotosFragment = (DevicePhotosFragment) this;
                ehw ehwVar = (ehw) lM();
                devicePhotosFragment.a = ((vme) ehwVar.c.lm.get()).f;
                eed eedVar = ehwVar.c;
                azrw azrwVar = eedVar.lo;
                efc efcVar = ehwVar.b.a;
                devicePhotosFragment.ao = new akht(azrwVar, efcVar.cd, efcVar.aX, eedVar.nM, eedVar.nN, (byte[]) null, (byte[]) null, (byte[]) null);
                devicePhotosFragment.b = (vrp) ehwVar.c.lv.get();
                devicePhotosFragment.c = (tgn) ehwVar.b.a.aX.get();
                devicePhotosFragment.d = (tgk) ehwVar.b.a.aY.get();
                devicePhotosFragment.e = ehwVar.b.a.q();
                devicePhotosFragment.ap = ehwVar.c.mN();
                devicePhotosFragment.ae = ehwVar.c.fL();
                devicePhotosFragment.af = (vlx) ehwVar.c.lj.get();
                devicePhotosFragment.ag = ehwVar.c.fH();
                devicePhotosFragment.ah = ehwVar.b.a.bG;
            }
        }
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.axqh
    public final boolean h() {
        return this.aq;
    }

    @Override // defpackage.ce
    public void ku(Context context) {
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

    vpd(int i) {
        super(i);
        this.c = new Object();
        this.aq = false;
    }
}
