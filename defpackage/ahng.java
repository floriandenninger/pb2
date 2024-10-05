package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahng extends ahhi implements ahig, ahkc {
    public final ajjz a;
    public final ahjp b;
    public final ahki c;
    public final ahjv e;
    public final ahfx f;
    private final ahhp g;

    public ahng(Context context, ahkm ahkmVar, final ahki ahkiVar, ajjz ajjzVar, ViewGroup viewGroup, final ahnh ahnhVar) {
        ahkmVar.getClass();
        ahkiVar.getClass();
        this.c = ahkiVar;
        this.a = ajjzVar;
        this.g = new ahhp(ahkmVar.c.clone(), 40.0f, 30.0f);
        ahkv clone = ahkiVar.a().clone();
        Resources resources = context.getResources();
        Bitmap d = ahkt.d(resources, R.raw.white_box);
        ahku a = ahku.a(80.0f, 45.0f, ahku.c);
        azrw b = ahkmVar.a.b();
        ahjp ahjpVar = new ahjp(d, a, clone.clone(), b);
        this.b = ahjpVar;
        ahjpVar.l(0.0f, 7.0f, 0.0f);
        ahjpVar.k = 0.3f;
        n(ahjpVar);
        ahjv ahjvVar = new ahjv(clone.clone(), ahkiVar.b);
        this.e = ahjvVar;
        String string = resources.getString(R.string.up_next);
        final int i = 1;
        if (TextUtils.isEmpty(string)) {
            ahjvVar.a.y("");
            ahjvVar.a.qE(true);
        } else {
            ahjvVar.a.y(string);
            ahjvVar.a.qE(false);
        }
        ahjvVar.l(0.0f, 14.0f, 0.0f);
        n(ahjvVar);
        final ahjc ahjcVar = new ahjc(ahkiVar, clone.clone(), b);
        final ahjp a2 = ahjc.a(ahkt.d(resources, R.raw.vr_rect_solid_white), ahjc.b(1.0f, false), ahjcVar);
        final ahjp a3 = ahjc.a(ahkt.d(resources, R.raw.vr_semicircle_solid_white), ahjc.b(2.0f, false), ahjcVar);
        final ahjp a4 = ahjc.a(ahkt.d(resources, R.raw.vr_semicircle_solid_white), ahjc.b(2.0f, true), ahjcVar);
        ahjcVar.k(new ahil(a3, ahil.b(1.0f), ahil.b(1.1f)));
        ahjcVar.k(new ahil(a4, ahil.b(1.0f), ahil.b(1.1f)));
        ahjcVar.f = new ahil(a2, ahil.b(1.0f), ahil.b(1.1f));
        ahjcVar.k(ahjcVar.f);
        float[] fArr = {0.0f, 0.0f, 0.0f};
        ahjcVar.g = new ahjs(a3, fArr, fArr);
        ahjcVar.h = new ahjs(a4, fArr, fArr);
        ahjcVar.k(ahjcVar.g);
        ahjcVar.k(ahjcVar.h);
        ahjcVar.e.g(new ahjn() { // from class: ahjb
            @Override // defpackage.ahjn
            public final void a(float f, float f2) {
                ahjp ahjpVar2 = ahjp.this;
                ahjc ahjcVar2 = ahjcVar;
                ahjp ahjpVar3 = a3;
                ahjp ahjpVar4 = a4;
                float f3 = f * 0.9f;
                ahjpVar2.rJ(f3, 1.0f, 1.0f);
                float f4 = (f3 + 2.0f) / 2.0f;
                float f5 = f4 - ahjcVar2.i;
                ahjpVar3.l(-f5, 0.0f, 0.0f);
                ahjpVar4.l(f5, 0.0f, 0.0f);
                ahjcVar2.i = f4;
                ahjcVar2.m(4.0f + f3, f2);
                ahil ahilVar = ahjcVar2.f;
                ahilVar.a = new float[]{f3, 1.0f, 1.0f};
                ahilVar.b = new float[]{f3 * 1.1f, 1.1f, 1.1f};
                float f6 = ((f3 * 0.100000024f) + 0.20000005f) / 2.0f;
                ahjcVar2.g.a = new float[]{-f6, 0.0f, 0.0f};
                ahjcVar2.h.a = new float[]{f6, 0.0f, 0.0f};
            }
        });
        ahjcVar.n(a3);
        ahjcVar.n(a2);
        ahjcVar.n(a4);
        ahjcVar.n(ahjcVar.e);
        ahjcVar.e.y(context.getString(R.string.cancel));
        ahjcVar.l(0.0f, -ahkt.a(30.0f), 0.0f);
        final Handler handler = new Handler(Looper.getMainLooper());
        ((ahga) ahjcVar).c = new ahgb() { // from class: ahnd
            @Override // defpackage.ahgb
            public final void a() {
                final int i2 = 0;
                if (i == 0) {
                    Handler handler2 = handler;
                    final ahnh ahnhVar2 = ahnhVar;
                    ahki ahkiVar2 = ahkiVar;
                    handler2.post(new Runnable() { // from class: ahne
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (i2 == 0) {
                                ahnh ahnhVar3 = ahnhVar2;
                                Iterator it = ahnhVar3.a.iterator();
                                while (it.hasNext()) {
                                    ((ahep) it.next()).q(false);
                                }
                                ahnhVar3.kV();
                                return;
                            }
                            ahnh ahnhVar4 = ahnhVar2;
                            Iterator it2 = ahnhVar4.a.iterator();
                            while (it2.hasNext()) {
                                ((ahep) it2.next()).p();
                            }
                            ahnhVar4.b = null;
                            ahnhVar4.kV();
                        }
                    });
                    ahkiVar2.g();
                    return;
                }
                Handler handler3 = handler;
                final ahnh ahnhVar3 = ahnhVar;
                ahki ahkiVar3 = ahkiVar;
                final int i3 = 1;
                handler3.post(new Runnable() { // from class: ahne
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (i3 == 0) {
                            ahnh ahnhVar32 = ahnhVar3;
                            Iterator it = ahnhVar32.a.iterator();
                            while (it.hasNext()) {
                                ((ahep) it.next()).q(false);
                            }
                            ahnhVar32.kV();
                            return;
                        }
                        ahnh ahnhVar4 = ahnhVar3;
                        Iterator it2 = ahnhVar4.a.iterator();
                        while (it2.hasNext()) {
                            ((ahep) it2.next()).p();
                        }
                        ahnhVar4.b = null;
                        ahnhVar4.kV();
                    }
                });
                ahkiVar3.a.b.l = false;
                ahkg ahkgVar = ahkiVar3.i;
                if (ahkgVar != null) {
                    ((ahmc) ahkgVar).j();
                }
            }
        };
        n(ahjcVar);
        final int i2 = 0;
        ahga ahgaVar = new ahga(clone.clone(), b, ahkt.d(resources, R.raw.vr_button_fill), 9.2f, ahkt.d(resources, R.raw.vr_play));
        ahgaVar.c = new ahgb() { // from class: ahnd
            @Override // defpackage.ahgb
            public final void a() {
                final int i22 = 0;
                if (i2 == 0) {
                    Handler handler2 = handler;
                    final ahnh ahnhVar2 = ahnhVar;
                    ahki ahkiVar2 = ahkiVar;
                    handler2.post(new Runnable() { // from class: ahne
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (i22 == 0) {
                                ahnh ahnhVar32 = ahnhVar2;
                                Iterator it = ahnhVar32.a.iterator();
                                while (it.hasNext()) {
                                    ((ahep) it.next()).q(false);
                                }
                                ahnhVar32.kV();
                                return;
                            }
                            ahnh ahnhVar4 = ahnhVar2;
                            Iterator it2 = ahnhVar4.a.iterator();
                            while (it2.hasNext()) {
                                ((ahep) it2.next()).p();
                            }
                            ahnhVar4.b = null;
                            ahnhVar4.kV();
                        }
                    });
                    ahkiVar2.g();
                    return;
                }
                Handler handler3 = handler;
                final ahnh ahnhVar3 = ahnhVar;
                ahki ahkiVar3 = ahkiVar;
                final int i3 = 1;
                handler3.post(new Runnable() { // from class: ahne
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (i3 == 0) {
                            ahnh ahnhVar32 = ahnhVar3;
                            Iterator it = ahnhVar32.a.iterator();
                            while (it.hasNext()) {
                                ((ahep) it.next()).q(false);
                            }
                            ahnhVar32.kV();
                            return;
                        }
                        ahnh ahnhVar4 = ahnhVar3;
                        Iterator it2 = ahnhVar4.a.iterator();
                        while (it2.hasNext()) {
                            ((ahep) it2.next()).p();
                        }
                        ahnhVar4.b = null;
                        ahnhVar4.kV();
                    }
                });
                ahkiVar3.a.b.l = false;
                ahkg ahkgVar = ahkiVar3.i;
                if (ahkgVar != null) {
                    ((ahmc) ahkgVar).j();
                }
            }
        };
        ahgaVar.l(0.0f, 7.0f, 0.0f);
        n(ahgaVar);
        ahfx ahfxVar = new ahfx(viewGroup, context, handler, clone.clone(), ahkmVar.a.c(), 9.2f, false);
        this.f = ahfxVar;
        ahfxVar.l(0.0f, 7.0f, 0.0f);
        n(ahfxVar);
        this.l = true;
    }

    @Override // defpackage.ahig
    public final boolean f(ahjq ahjqVar) {
        return !v() && this.g.b(ahjqVar).b();
    }

    @Override // defpackage.ahig
    public final boolean g(ahjq ahjqVar) {
        return false;
    }

    @Override // defpackage.ahig
    public final boolean h(ahjq ahjqVar) {
        return !s();
    }
}
