package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.google.android.libraries.user.profile.photopicker.fragment.devicephotos.DevicePhotosFragment;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
class vqs extends ce implements axql, axqh {
    private ContextWrapper b;
    private volatile axqa c;
    private final Object d = new Object();
    public boolean a = false;

    private final void o() {
        if (this.b == null) {
            this.b = axqa.b(super.qR(), this);
        }
    }

    @Override // defpackage.ce
    public final void U(Activity activity) {
        super.U(activity);
        ContextWrapper contextWrapper = this.b;
        boolean z = true;
        if (contextWrapper != null && axqa.a(contextWrapper) != activity) {
            z = false;
        }
        ayaw.q(z, "onAttach called multiple times with different Context! Sting Fragments should not be retained.", new Object[0]);
        o();
        n();
    }

    @Override // defpackage.axql
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final axqa lL() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = new axqa(this);
                }
            }
        }
        return this.c;
    }

    @Override // defpackage.ce, defpackage.aoc
    public final apo getDefaultViewModelProviderFactory() {
        return ayaw.v(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // defpackage.axqh
    public final boolean h() {
        return this.a;
    }

    @Override // defpackage.ce
    public void ku(Context context) {
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

    protected final void n() {
        Object N = N();
        if (N instanceof axqk) {
            if ((!(N instanceof axqh) || ((axqh) N).h()) && !this.a) {
                this.a = true;
                vrm vrmVar = (vrm) this;
                ehw ehwVar = (ehw) lM();
                vrmVar.b = (vrp) ehwVar.c.lv.get();
                vrmVar.ao = (akhi) ehwVar.c.nO.get();
                vrmVar.c = (tgn) ehwVar.b.a.aX.get();
                vrmVar.d = (tgk) ehwVar.b.a.aY.get();
                vrmVar.e = ehwVar.b.a.q();
                vrmVar.ae = (String) ehwVar.c.li.get();
                vrmVar.af = ehwVar.c.fH();
                vrmVar.ag = "";
                eed eedVar = ehwVar.c;
                vqv vqvVar = vqv.DEVICE_PHOTOS;
                final axpg a = axqq.a(eedVar.nP);
                vqt a2 = vqw.a();
                a2.e(vqv.DEVICE_PHOTOS);
                a2.c(vqr.START_IN_DEVICE_PHOTOS_TAB);
                a.getClass();
                a2.b(new kgh(a, 3));
                a2.f(R.string.op3_picker_device_photos);
                a2.g(110516);
                a2.d(new vqu() { // from class: vrc
                    @Override // defpackage.vqu
                    public final void a(Context context, almc almcVar, ColorStateList colorStateList) {
                        Drawable b = nz.b(context, R.drawable.quantum_gm_ic_smartphone_vd_theme_24);
                        almcVar.c(b);
                        b.setTintList(colorStateList);
                    }
                });
                a2.b = ammv.j(new Runnable() { // from class: vrd
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((DevicePhotosFragment) axpg.this.get()).p();
                    }
                });
                vqw a3 = a2.a();
                vqv vqvVar2 = vqv.GOOGLE_PHOTOS;
                axpg a4 = axqq.a(eedVar.nQ);
                final vkb vkbVar = (vkb) eedVar.lo.get();
                vqt a5 = vqw.a();
                a5.e(vqv.GOOGLE_PHOTOS);
                a5.c(vqr.START_IN_GOOGLE_PHOTOS_TAB);
                a5.b(a4);
                a5.f(R.string.op3_picker_google_photos);
                a5.g(110515);
                a5.d(new vqu() { // from class: vrb
                    @Override // defpackage.vqu
                    public final void a(Context context, almc almcVar, ColorStateList colorStateList) {
                        vkb vkbVar2 = vkb.this;
                        if (!axxp.g()) {
                            Uri parse = Uri.parse(axxp.a.get().g());
                            aoae aoaeVar = new aoae((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                            vkbVar2.b(context, parse, aoaeVar).q(new vre(almcVar));
                            return;
                        }
                        almcVar.c(nz.b(context, R.drawable.quantum_gm_ic_photos_vd_theme_24));
                    }
                });
                vrmVar.ah = new vra(amrz.l(vqvVar, a3, vqvVar2, a5.a()), ammv.j(amkq.aR(vqv.DEVICE_PHOTOS, vqv.GOOGLE_PHOTOS)));
            }
        }
    }

    @Override // defpackage.ce
    public final Context qR() {
        if (super.qR() == null && this.b == null) {
            return null;
        }
        o();
        return this.b;
    }
}
