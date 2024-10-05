package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Looper;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hsy {
    public final boolean a;
    public final acra b;
    public final ChooseFilterView c;
    public final ChooseFilterView d;
    public final View e;
    public final View f;
    public final View g;
    public final View h;
    public final ImageView i;
    public final zsq j;
    public final View k;
    public final int l;
    public final int m;
    public final hsx n;
    public final hsx o;
    public final hsx p;
    public final hsw q;
    public boolean r;
    public boolean s;
    public boolean t;

    public hsy(ChooseFilterView chooseFilterView, ChooseFilterView chooseFilterView2, zsq zsqVar, View view, View view2, View view3, View view4, ImageView imageView, View view5, acra acraVar) {
        this.c = chooseFilterView;
        this.d = chooseFilterView2;
        zsqVar.getClass();
        this.j = zsqVar;
        view.getClass();
        this.e = view;
        view2.getClass();
        this.g = view2;
        this.h = view4;
        this.i = imageView;
        this.k = view5;
        this.f = view3;
        acraVar.getClass();
        this.b = acraVar;
        boolean z = true;
        z = true;
        if (chooseFilterView != null) {
            final int i = z ? 1 : 0;
            chooseFilterView.n(new zvb(this) { // from class: hsu
                public final /* synthetic */ hsy a;

                {
                    this.a = this;
                }

                @Override // defpackage.zfi
                public final void a(Object obj) {
                    if (i == 0) {
                        hsy hsyVar = this.a;
                        hsyVar.t = ((Boolean) obj).booleanValue();
                        hsyVar.c();
                    } else {
                        hsy hsyVar2 = this.a;
                        hsyVar2.s = ((Boolean) obj).booleanValue();
                        hsyVar2.c();
                    }
                }
            });
            chooseFilterView.h(view5);
        }
        final int i2 = 0;
        if (chooseFilterView2 != null) {
            chooseFilterView2.n(new zvb(this) { // from class: hsu
                public final /* synthetic */ hsy a;

                {
                    this.a = this;
                }

                @Override // defpackage.zfi
                public final void a(Object obj) {
                    if (i2 == 0) {
                        hsy hsyVar = this.a;
                        hsyVar.t = ((Boolean) obj).booleanValue();
                        hsyVar.c();
                    } else {
                        hsy hsyVar2 = this.a;
                        hsyVar2.s = ((Boolean) obj).booleanValue();
                        hsyVar2.c();
                    }
                }
            });
            chooseFilterView2.h(view5);
        }
        if (chooseFilterView == null && chooseFilterView2 == null) {
            z = false;
        }
        this.a = z;
        if (z) {
            this.l = (int) view2.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_outer_white_ring_height);
            this.m = (int) view2.getResources().getDimension(R.dimen.reel_camera_choose_filter_view_button_padding);
        } else {
            this.l = 0;
            this.m = 0;
        }
        this.p = new hsx(this, view3);
        this.n = new hsx(this, view);
        this.o = new hsx(this, view2);
        this.q = new hsw(this, imageView);
        zsqVar.e(new zsn() { // from class: hst
            @Override // defpackage.zfi
            public final void a(Object obj) {
                hsy.this.c();
            }
        });
    }

    private static void e(ChooseFilterView chooseFilterView, boolean z) {
        if (chooseFilterView == null || chooseFilterView.f == z) {
            return;
        }
        chooseFilterView.j();
    }

    public final void a(boolean z) {
        this.r = z;
        e(this.c, false);
        e(this.d, false);
        this.s = false;
        this.t = false;
    }

    public final void b(avwx avwxVar) {
        avwx avwxVar2 = avwx.EFFECT_SUBPACKAGE_ID_UNSPECIFIED;
        int ordinal = avwxVar.ordinal();
        if (ordinal == 1) {
            e(this.c, true);
            e(this.d, false);
        } else {
            if (ordinal != 2) {
                return;
            }
            e(this.d, true);
            e(this.c, false);
        }
    }

    public final void c() {
        Runnable runnable = new Runnable() { // from class: hsv
            @Override // java.lang.Runnable
            public final void run() {
                hsy hsyVar = hsy.this;
                if (hsyVar.a) {
                    View view = hsyVar.h;
                    if (view != null) {
                        ((ImageView) view.findViewById(R.id.reel_camera_effects_button)).setImageDrawable(hsyVar.h.getResources().getDrawable(true != hsyVar.s ? R.drawable.reel_face_filter_unselected_white_icon_v2 : R.drawable.reel_face_filter_selected_white_icon_v2));
                        if (hsyVar.s) {
                            hsyVar.b.I(3, new acqx(acsb.c(10719)), null);
                        }
                    }
                    if (hsyVar.i != null) {
                        zsl g = hsyVar.j.g();
                        boolean z = g != null && g.c == avwx.EFFECT_SUBPACKAGE_ID_PRESET;
                        ImageView imageView = hsyVar.i;
                        imageView.setImageDrawable(imageView.getResources().getDrawable(true != z ? R.drawable.ic_presets_disabled : R.drawable.ic_presets_enabled));
                        hsw hswVar = hsyVar.q;
                        ArrayList<hsw> arrayList = new ArrayList();
                        arrayList.add(hswVar);
                        AnimatorSet animatorSet = new AnimatorSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (hsw hswVar2 : arrayList) {
                            View view2 = hswVar2.a;
                            Property property = View.ROTATION;
                            float[] fArr = new float[2];
                            fArr[0] = hswVar2.a.getRotation();
                            fArr[1] = true != hswVar2.b.t ? 0.0f : 60.0f;
                            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr);
                            ofFloat.setDuration(250L);
                            arrayList2.add(ofFloat);
                        }
                        animatorSet.playTogether(arrayList2);
                        animatorSet.start();
                        if (hsyVar.t) {
                            hsyVar.b.I(3, new acqx(acsb.c(56205)), null);
                        }
                    }
                    gfw.z(hsyVar.n);
                    if (hsyVar.r) {
                        return;
                    }
                    if (hsyVar.f != null) {
                        gfw.z(hsyVar.p);
                    }
                    gfw.z(hsyVar.o);
                }
            }
        };
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            this.e.post(runnable);
        }
    }

    public final boolean d() {
        return this.s || this.t;
    }
}
