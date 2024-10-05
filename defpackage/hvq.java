package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelItemEditModel;
import com.google.android.apps.youtube.app.extensions.reel.edit.presenter.EditorButtonView;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.youtube.R;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hvq implements View.OnClickListener, zva, hxg {
    private final ayqi A;
    public final hxc a;
    public final hwa b;
    public final Handler c;
    public ci d;
    public acra e;
    public View f;
    public View g;
    public View h;
    public View i;
    public LinearLayout j;
    public View k;
    public View l;
    public View m;
    public ViewGroup n;
    public View o;
    public View p;
    public ammv q;
    public hvn r;
    public RecordingInfo s;
    public boolean t;
    public float u;
    public boolean v;
    public boolean w;
    public final axze x;
    private final hve y;
    private final ayqi z;

    public hvq(hxc hxcVar, axze axzeVar, hwa hwaVar, Handler handler, ayqi ayqiVar, ayqi ayqiVar2, hve hveVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = hxcVar;
        this.x = axzeVar;
        this.b = hwaVar;
        this.c = handler;
        this.z = ayqiVar;
        this.A = ayqiVar2;
        this.y = hveVar;
    }

    public static final void d(View view, int i) {
        if (view instanceof EditorButtonView) {
            ((EditorButtonView) view).a(i);
        } else if (view instanceof ImageButton) {
            ((ImageButton) view).setImageDrawable(view.getContext().getDrawable(i));
        }
    }

    @Override // defpackage.hxg
    public final float a() {
        if (this.t) {
            return -this.u;
        }
        return 0.0f;
    }

    @Override // defpackage.hxg
    public final float b() {
        if (this.t) {
            return 0.0f;
        }
        return -this.u;
    }

    @Override // defpackage.hxg
    public final View c() {
        return this.f;
    }

    @Override // defpackage.hxg
    public final void e() {
    }

    @Override // defpackage.hxg
    public final void f() {
    }

    @Override // defpackage.zva
    public final void g() {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hzc hzcVar;
        View view2;
        if (view == this.g) {
            this.e.I(3, new acqx(acrb.MOBILE_BACK_BUTTON), null);
            this.y.aF(this.s);
            return;
        }
        if (view == this.h) {
            this.e.I(3, new acqx(acrb.UPLOAD_VIDEO_EDITING_TRIM_BUTTON), null);
            hvc hvcVar = (hvc) this.r;
            if (!hvcVar.bs().L()) {
                etx.T(hvcVar.C(), R.string.reel_video_not_support_trim);
                return;
            }
            hvu hvuVar = hvcVar.am;
            if (!hvuVar.d) {
                whu.I(hvuVar.b, true);
                gfw.z(hvuVar);
                hvuVar.d = true;
                hvuVar.g.n(new acqx(acsb.c(61880)));
            }
            hvcVar.aZ();
            return;
        }
        if (view == this.i) {
            Object obj = this.r;
            hvc hvcVar2 = (hvc) obj;
            if (hvcVar2.c) {
                hvcVar2.al.g(hvcVar2.bm());
                hvcVar2.aZ();
                return;
            }
            boolean bm = hvcVar2.bm();
            Context qR = ((ce) obj).qR();
            if (qR != null && zev.e(qR) && (view2 = hvcVar2.ah.i) != null) {
                zev.c(qR, view2, qR.getResources().getText(true != bm ? R.string.accessibility_audio_muted : R.string.accessibility_audio_unmuted));
            }
            hvcVar2.d();
            return;
        }
        if (view == this.l) {
            hvc hvcVar3 = (hvc) this.r;
            hvcVar3.onClick(hvcVar3.ah.l);
            hut hutVar = hvcVar3.an;
            if (!hutVar.d) {
                ChooseFilterView chooseFilterView = hutVar.b;
                if (!chooseFilterView.f) {
                    chooseFilterView.j();
                }
                gfw.z(hutVar);
                hutVar.d = true;
                hutVar.g.n(new acqx(acsb.c(36856)));
            }
            hvcVar3.aZ();
            return;
        }
        if (view == this.m) {
            Object obj2 = this.r;
            hvc hvcVar4 = (hvc) obj2;
            hvcVar4.aZ();
            ce ceVar = (ce) obj2;
            dd ddVar = ceVar.z;
            if (ddVar == null || ddVar.f("draw_fragment") == null) {
                hzcVar = new hzc();
                hzcVar.af(new Bundle());
            } else {
                hzcVar = (hzc) ceVar.z.f("draw_fragment");
            }
            hzcVar.a = new hvb(hvcVar4, null);
            dn k = hvcVar4.C().getSupportFragmentManager().k();
            k.q(R.id.reel_edit_ui_container, hzcVar, "draw_fragment");
            k.a();
            return;
        }
        View view3 = this.o;
        if (view == view3) {
            view3.setClickable(false);
            View view4 = this.o;
            if (view4 instanceof EditorButtonView) {
                ((EditorButtonView) view4).b.setImageDrawable(null);
            } else if (view4 instanceof ImageButton) {
                ((ImageButton) view4).setImageDrawable(null);
            }
            this.p.setVisibility(0);
            if (this.q.h() && !((ayqx) this.q.c()).e()) {
                ((ayqx) this.q.c()).qc();
            }
            final ReelItemEditModel f = ((hvc) this.r).d.f();
            this.q = ammv.j(ayqj.C(new Callable() { // from class: hvm
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:116:0x0090  */
                /* JADX WARN: Removed duplicated region for block: B:117:0x0093  */
                /* JADX WARN: Removed duplicated region for block: B:130:0x037b  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x00c1  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x035a  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x035c  */
                /* JADX WARN: Removed duplicated region for block: B:6:0x00ab  */
                /* JADX WARN: Removed duplicated region for block: B:94:0x0348  */
                /* JADX WARN: Removed duplicated region for block: B:96:0x034c  */
                /* JADX WARN: Type inference failed for: r5v0, types: [hwa] */
                /* JADX WARN: Type inference failed for: r5v10, types: [boolean] */
                /* JADX WARN: Type inference failed for: r5v2 */
                /* JADX WARN: Type inference failed for: r5v4 */
                /* JADX WARN: Type inference failed for: r5v7 */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object call() {
                    /*
                        Method dump skipped, instructions count: 895
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.hvm.call():java.lang.Object");
                }
            }).M(this.A).I(this.z).V(new ayrs() { // from class: hvk
                @Override // defpackage.ayrs
                public final void a(Object obj3) {
                    final hvq hvqVar = hvq.this;
                    ReelItemEditModel reelItemEditModel = f;
                    boolean booleanValue = ((Boolean) obj3).booleanValue();
                    boolean z = reelItemEditModel.d().f;
                    hvqVar.p.setVisibility(8);
                    if (booleanValue) {
                        View view5 = hvqVar.o;
                        if (view5 instanceof EditorButtonView) {
                            ((EditorButtonView) view5).c(view5.getContext().getString(R.string.reel_video_editor_succeed_save_media));
                        }
                        hvq.d(hvqVar.o, R.drawable.quantum_ic_check_circle_white_24);
                        etx.T(hvqVar.d, R.string.reel_video_editor_succeed_save_media);
                        hvqVar.c.postDelayed(new Runnable() { // from class: hvl
                            @Override // java.lang.Runnable
                            public final void run() {
                                hvq hvqVar2 = hvq.this;
                                hvqVar2.o.setClickable(true);
                                hvq.d(hvqVar2.o, R.drawable.quantum_ic_get_app_white_24);
                                View view6 = hvqVar2.o;
                                if (view6 instanceof EditorButtonView) {
                                    ((EditorButtonView) view6).c(view6.getContext().getString(R.string.reel_edit_save_video_button_text));
                                }
                            }
                        }, 2000L);
                        return;
                    }
                    hvqVar.o.setClickable(true);
                    hvq.d(hvqVar.o, R.drawable.quantum_ic_get_app_white_24);
                    etx.T(hvqVar.d, true != z ? R.string.reel_video_editor_fail_save_video : R.string.reel_video_editor_fail_save_photo);
                }
            }));
        }
    }
}
