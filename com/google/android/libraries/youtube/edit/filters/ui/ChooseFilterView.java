package com.google.android.libraries.youtube.edit.filters.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.edit.filters.model.FilterMapTable$FilterDescriptor;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.youtube.R;
import defpackage.acra;
import defpackage.adyu;
import defpackage.agcm;
import defpackage.amkq;
import defpackage.aok;
import defpackage.awav;
import defpackage.hsz;
import defpackage.zev;
import defpackage.zon;
import defpackage.zop;
import defpackage.zsk;
import defpackage.zsm;
import defpackage.ztf;
import defpackage.ztk;
import defpackage.zup;
import defpackage.zur;
import defpackage.zuy;
import defpackage.zuz;
import defpackage.zva;
import defpackage.zvb;
import defpackage.zvk;
import defpackage.zxn;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ChooseFilterView extends LinearLayout {
    public final zvk a;
    public final LinearLayout b;
    public HorizontalScrollView c;
    public zur d;
    public zsk e;
    public boolean f;
    public boolean g;
    public boolean h;
    public ValueAnimator i;
    public aok j;

    public ChooseFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = false;
        LayoutInflater.from(context).inflate(R.layout.choose_asset_view, (ViewGroup) this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zon.a, 0, 0);
        int i = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        int i2 = i != 1 ? i != 2 ? i != 3 ? R.layout.choose_filter_list_item : R.layout.choose_filter_list_item_shorts_camera_preset : R.layout.choose_filter_list_item_camera_preset : R.layout.choose_filter_list_item_camera;
        this.d = new zur(this);
        this.a = new zvk(getContext(), i2);
        this.b = (LinearLayout) findViewById(R.id.asset_list);
        this.c = (HorizontalScrollView) findViewById(R.id.asset_list_container);
        setImportantForAccessibility(1);
        setAlpha(0.0f);
    }

    private final void p(String str) {
        if (zev.e(getContext())) {
            zev.c(getContext(), this, str);
        }
    }

    private final void q(final boolean z, final boolean z2) {
        this.f = z;
        post(new Runnable() { // from class: zux
            @Override // java.lang.Runnable
            public final void run() {
                final ChooseFilterView chooseFilterView = ChooseFilterView.this;
                boolean z3 = z;
                boolean z4 = z2;
                ValueAnimator valueAnimator = chooseFilterView.i;
                if (valueAnimator != null && valueAnimator.isStarted()) {
                    chooseFilterView.i.end();
                }
                if (chooseFilterView.a.r()) {
                    int max = Math.max(chooseFilterView.getHeight(), 1);
                    if (!z3) {
                        chooseFilterView.i = chooseFilterView.b(max, 1);
                    } else {
                        chooseFilterView.setY(0.0f);
                        chooseFilterView.setAlpha(1.0f);
                        chooseFilterView.i = chooseFilterView.b(max, chooseFilterView.a());
                    }
                    if (z4) {
                        chooseFilterView.i.start();
                    } else {
                        chooseFilterView.i.end();
                    }
                    if (z3) {
                        ynm.o(chooseFilterView.j, chooseFilterView.a.d(), oph.r, new zfi() { // from class: zut
                            @Override // defpackage.zfi
                            public final void a(Object obj) {
                                ChooseFilterView chooseFilterView2 = ChooseFilterView.this;
                                Integer num = (Integer) obj;
                                if (num == null || num.intValue() <= 0) {
                                    return;
                                }
                                chooseFilterView2.d.a();
                            }
                        });
                    }
                    chooseFilterView.d.b();
                }
            }
        });
    }

    public final int a() {
        return this.a.m;
    }

    public final ValueAnimator b(int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setDuration(250L);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: zus
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                yny.z(ChooseFilterView.this, yny.n(((Integer) valueAnimator.getAnimatedValue()).intValue()), ViewGroup.LayoutParams.class);
            }
        });
        if (i2 == 1) {
            ofInt.addListener(new zuy(this));
            p(getContext().getString(R.string.accessibility_filter_view_closed));
        } else {
            ofInt.addListener(new zuz(this));
            p(getContext().getString(R.string.accessibility_filter_view_shown));
        }
        return ofInt;
    }

    public final zvk c() {
        if (this.a.r()) {
            return this.a;
        }
        return null;
    }

    public final void d() {
        this.h = true;
    }

    public final void e(final ztf ztfVar, final aok aokVar) {
        ((ztk) ztfVar).a.c(new zsm() { // from class: zuu
            @Override // defpackage.zfi
            public final void a(Object obj) {
                final ChooseFilterView chooseFilterView = ChooseFilterView.this;
                final ztf ztfVar2 = ztfVar;
                final aok aokVar2 = aokVar;
                final aoae aoaeVar = (aoae) obj;
                final byte[] bArr = null;
                final byte[] bArr2 = null;
                final byte[] bArr3 = null;
                chooseFilterView.e = ztfVar2.b(new zte(aoaeVar, ztfVar2, aokVar2, bArr, bArr2, bArr3) { // from class: zuv
                    public final /* synthetic */ ztf b;
                    public final /* synthetic */ aok c;
                    public final /* synthetic */ aoae d;

                    @Override // defpackage.zfi
                    public final void a(Object obj2) {
                        final ChooseFilterView chooseFilterView2 = ChooseFilterView.this;
                        final aoae aoaeVar2 = this.d;
                        final ztf ztfVar3 = this.b;
                        final aok aokVar3 = this.c;
                        final zor zorVar = (zor) obj2;
                        final byte[] bArr4 = null;
                        final byte[] bArr5 = null;
                        final byte[] bArr6 = null;
                        chooseFilterView2.post(new Runnable(aoaeVar2, zorVar, ztfVar3, aokVar3, bArr4, bArr5, bArr6) { // from class: zuw
                            public final /* synthetic */ ztf b;
                            public final /* synthetic */ aok c;
                            public final /* synthetic */ zor d;
                            public final /* synthetic */ aoae e;

                            @Override // java.lang.Runnable
                            public final void run() {
                                ChooseFilterView chooseFilterView3 = ChooseFilterView.this;
                                aoae aoaeVar3 = this.e;
                                zor zorVar2 = this.d;
                                ztf ztfVar4 = this.b;
                                aok aokVar4 = this.c;
                                if (chooseFilterView3.a.r()) {
                                    return;
                                }
                                chooseFilterView3.d.b = chooseFilterView3.g || aoaeVar3.h(avwy.EFFECTS_FEATURE_DOT_ON_FILTER_ICON);
                                boolean z = chooseFilterView3.h || aoaeVar3.h(avwy.EFFECTS_FEATURE_DOT_ON_EFFECT_THUMBNAIL);
                                amkq.E(!zorVar2.a().isEmpty());
                                zvk zvkVar = chooseFilterView3.a;
                                LinearLayout linearLayout = chooseFilterView3.b;
                                HorizontalScrollView horizontalScrollView = chooseFilterView3.c;
                                zvkVar.j = ztfVar4;
                                zvkVar.g = zorVar2.c;
                                if (FilterMapTable$FilterDescriptor.a(zorVar2.a(), zvkVar.c) == null) {
                                    zvkVar.c = zorVar2.b;
                                }
                                if (!FilterMapTable$FilterDescriptor.e(zvkVar.c, zorVar2.b)) {
                                    ztfVar4.c(zvkVar.c);
                                }
                                zvkVar.g(zorVar2.a(), linearLayout, horizontalScrollView, z, false);
                                chooseFilterView3.f(null, aokVar4);
                            }
                        });
                    }
                });
            }
        });
    }

    public final void f(View view, aok aokVar) {
        this.j = aokVar;
        if (view != null) {
            this.a.l(view);
        }
        this.d.a();
        if (this.f) {
            q(true, false);
        }
    }

    public final void g(String str) {
        this.a.n(str);
    }

    public final void h(View view) {
        this.a.l(view);
    }

    public final void i(zva zvaVar) {
        this.a.d = zvaVar;
    }

    public final void j() {
        k(true);
    }

    public final void k(boolean z) {
        q(!this.f, z);
    }

    public final void l(acra acraVar, zxn zxnVar) {
        zvk zvkVar = this.a;
        zvkVar.o = zxnVar;
        Iterator it = zvkVar.e.iterator();
        while (it.hasNext()) {
            zop a = zop.a(acraVar, ((FilterMapTable$FilterDescriptor) it.next()).a);
            awav awavVar = a.a;
            if (awavVar != null) {
                acraVar.D(adyu.ce(awavVar));
                acraVar.w(adyu.ce(a.a), a.b);
            }
        }
    }

    public final void m(hsz hszVar) {
        zur zurVar = this.d;
        zurVar.d = hszVar;
        zurVar.a();
        new zup(zurVar, 1);
    }

    public final void n(zvb zvbVar) {
        zur zurVar = this.d;
        zurVar.c = zvbVar;
        if (zurVar.a.c() != null && zurVar.a.f) {
            zurVar.b();
        }
        new zup(zurVar, 0);
    }

    public final void o(List list, View view, boolean z, boolean z2, agcm agcmVar, aok aokVar) {
        amkq.E(!list.isEmpty());
        zvk zvkVar = this.a;
        LinearLayout linearLayout = this.b;
        HorizontalScrollView horizontalScrollView = this.c;
        zvkVar.i = agcmVar.c(list);
        zvkVar.g(list, linearLayout, horizontalScrollView, z, z2);
        f(view, aokVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zsk zskVar = this.e;
        if (zskVar != null) {
            zskVar.a();
        }
        zvk zvkVar = this.a;
        Iterator it = zvkVar.f.iterator();
        while (it.hasNext()) {
            ((zsk) it.next()).a();
        }
        zvkVar.f.clear();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            zvk zvkVar = this.a;
            if (!zvkVar.k) {
                zvkVar.n(bundle.getString("SELECTED_FILTER"));
            }
            q(bundle.getBoolean("CHOOSE_FILTER_VIEW_VISIBLE"), false);
            parcelable = bundle.getParcelable("SUPER_STATE");
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("SUPER_STATE", super.onSaveInstanceState());
        bundle.putString("SELECTED_FILTER", this.a.c);
        bundle.putBoolean("CHOOSE_FILTER_VIEW_VISIBLE", this.f);
        return bundle;
    }
}
