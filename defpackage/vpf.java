package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableRow;
import android.widget.ViewAnimator;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;
import com.google.android.libraries.user.profile.photopicker.common.view.error.FullscreenErrorView;
import com.google.android.material.textview.MaterialTextView;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vpf extends vpg {
    public aps a;
    public ViewAnimator ae;
    public FullscreenErrorView af;
    public ajoy ag;
    private ammv ai;
    private vlv aj;
    public tgn b;
    public vlx c;
    public azrw d;
    public ViewGroup e;

    @Override // defpackage.ce
    public final void S(Bundle bundle) {
        super.S(bundle);
        amnp amnpVar = (amnp) this.d.get();
        amnpVar.e();
        amnpVar.f();
        this.ai = ammv.j(amnpVar);
        vlx vlxVar = this.c;
        aone createBuilder = aofi.a.createBuilder();
        createBuilder.copyOnWrite();
        aofi aofiVar = (aofi) createBuilder.instance;
        aofiVar.c = 10;
        aofiVar.b |= 1;
        vlxVar.d((aofi) createBuilder.build());
        this.aj = this.ag.C(awzd.RENDER, awze.OBAKE_GOOGLE_PHOTOS_HOME_SCREEN);
        ViewAnimator viewAnimator = (ViewAnimator) this.O.findViewById(R.id.photo_picker_view_animator_container);
        this.ae = viewAnimator;
        this.af = (FullscreenErrorView) viewAnimator.findViewById(R.id.photo_picker_error_view);
        this.e = (ViewGroup) this.O.findViewById(R.id.photo_picker_google_photos_home_sections_container);
        vpt vptVar = (vpt) this.a.a(vpt.class);
        if (vptVar.e == 1) {
            vptVar.a.b(100);
            vptVar.b.a(100);
            vptVar.c.b(100);
            aov aovVar = vptVar.d;
            vptVar.e = 2;
            aovVar.j(vpz.a(2));
        }
        vptVar.d.f(M(), new aox() { // from class: vpe
            @Override // defpackage.aox
            public final void a(Object obj) {
                amru amruVar;
                int i;
                final View.OnClickListener onClickListener;
                amru amruVar2;
                int i2;
                int i3;
                amru amruVar3;
                vpf vpfVar = vpf.this;
                vpz vpzVar = (vpz) obj;
                int i4 = vpzVar.b - 1;
                if (i4 == 0) {
                    vpfVar.ae.setVisibility(8);
                    return;
                }
                int i5 = 1;
                if (i4 == 1) {
                    vpfVar.n(R.id.photo_picker_loading_view);
                    return;
                }
                if (i4 != 3) {
                    if (i4 != 4) {
                        return;
                    }
                    vpfVar.n(R.id.photo_picker_error_view);
                    FullscreenErrorView fullscreenErrorView = vpfVar.af;
                    fullscreenErrorView.c();
                    fullscreenErrorView.f.setText(R.string.op3_something_went_wrong);
                    fullscreenErrorView.g.setVisibility(8);
                    if (!axxp.h()) {
                        fullscreenErrorView.h.setVisibility(8);
                    }
                    vpfVar.a(vpzVar);
                    return;
                }
                amru amruVar4 = vpzVar.a;
                amvj amvjVar = (amvj) amruVar4;
                int i6 = amvjVar.c;
                int i7 = 0;
                while (i7 < i6) {
                    vqc vqcVar = (vqc) amruVar4.get(i7);
                    final vpm vpmVar = new vpm(vpfVar.qR());
                    vpmVar.i = vqcVar;
                    ArrayList<View> arrayList = new ArrayList();
                    int b = vqcVar.a.b() - 1;
                    if (b != 0) {
                        final int i8 = 2;
                        if (b == i5) {
                            vpmVar.c(89732);
                            vpmVar.f(R.string.op3_picker_people_and_pets);
                            amru c = vqcVar.a.c();
                            ArrayList arrayList2 = new ArrayList();
                            int size = c.size();
                            int i9 = 0;
                            while (i9 < size) {
                                final aocu aocuVar = (aocu) c.get(i9);
                                int i10 = aocuVar.b;
                                if ((i10 & 1) == 0 || (i10 & 2) == 0) {
                                    amruVar2 = amruVar4;
                                    i2 = i6;
                                    i3 = size;
                                    amruVar3 = c;
                                } else {
                                    amruVar2 = amruVar4;
                                    final View inflate = vpm.inflate(vpmVar.getContext(), R.layout.photo_picker_cluster_image, null);
                                    SquareImageView squareImageView = (SquareImageView) inflate.findViewById(R.id.photo_picker_cluster_image_view);
                                    MaterialTextView materialTextView = (MaterialTextView) inflate.findViewById(R.id.photo_picker_cluster_name);
                                    i2 = i6;
                                    vkb vkbVar = vpmVar.c;
                                    i3 = size;
                                    aodg aodgVar = aocuVar.d;
                                    if (aodgVar == null) {
                                        aodgVar = aodg.a;
                                    }
                                    Uri c2 = vls.c(aodgVar);
                                    amruVar3 = c;
                                    aoae aoaeVar = new aoae((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
                                    aoaeVar.u();
                                    vkbVar.c(c2, aoaeVar, squareImageView);
                                    boolean z = ((aocuVar.b & 4) == 0 && aocuVar.e.isEmpty()) ? false : true;
                                    materialTextView.setText(z ? aocuVar.e : "");
                                    inflate.findViewById(R.id.photo_picker_cluster_gradient).setVisibility(true != z ? 4 : 0);
                                    jw.V(squareImageView, true != z ? 1 : 2);
                                    vpmVar.d.a.a(89735).a(inflate);
                                    inflate.setOnClickListener(new View.OnClickListener() { // from class: vpj
                                        @Override // android.view.View.OnClickListener
                                        public final void onClick(View view) {
                                            vpm vpmVar2 = vpm.this;
                                            View view2 = inflate;
                                            aocu aocuVar2 = aocuVar;
                                            vpmVar2.e.a(tgc.a(), view2);
                                            vpmVar2.b.a(aocuVar2);
                                        }
                                    });
                                    arrayList2.add(inflate);
                                }
                                i9++;
                                amruVar4 = amruVar2;
                                i6 = i2;
                                size = i3;
                                c = amruVar3;
                            }
                            amruVar = amruVar4;
                            i = i6;
                            arrayList.addAll(arrayList2);
                            final int i11 = 0;
                            onClickListener = new View.OnClickListener() { // from class: vph
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i12 = i11;
                                    if (i12 == 0) {
                                        vpmVar.b.b();
                                    } else if (i12 != 1) {
                                        vpmVar.b.e();
                                    } else {
                                        vpmVar.b.c();
                                    }
                                }
                            };
                        } else {
                            vpmVar.c(89726);
                            vpmVar.f(R.string.op3_picker_more_from_google_photos);
                            arrayList.addAll(vpmVar.b(vqcVar.a.a()));
                            onClickListener = new View.OnClickListener() { // from class: vph
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    int i12 = i8;
                                    if (i12 == 0) {
                                        vpmVar.b.b();
                                    } else if (i12 != 1) {
                                        vpmVar.b.e();
                                    } else {
                                        vpmVar.b.c();
                                    }
                                }
                            };
                            amruVar = amruVar4;
                            i = i6;
                        }
                    } else {
                        amruVar = amruVar4;
                        i = i6;
                        vpmVar.f(R.string.op3_picker_photos_of_you);
                        vpmVar.c(89748);
                        arrayList.addAll(vpmVar.b(vqcVar.a.d()));
                        final int i12 = 1;
                        onClickListener = new View.OnClickListener() { // from class: vph
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i122 = i12;
                                if (i122 == 0) {
                                    vpmVar.b.b();
                                } else if (i122 != 1) {
                                    vpmVar.b.e();
                                } else {
                                    vpmVar.b.c();
                                }
                            }
                        };
                    }
                    if (vqcVar.b) {
                        final View inflate2 = vpm.inflate(vpmVar.getContext(), R.layout.photo_picker_button, null);
                        inflate2.setTag(R.id.photo_picker_more_button_tag, vls.e(vpmVar.i.a.b()));
                        MaterialTextView materialTextView2 = (MaterialTextView) inflate2.findViewById(R.id.photo_picker_button_text);
                        materialTextView2.setText(vpmVar.getContext().getString(R.string.op3_more));
                        materialTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, nz.b(vpmVar.getContext(), R.drawable.quantum_gm_ic_photo_library_vd_theme_24), (Drawable) null, (Drawable) null);
                        vpmVar.d.a.a(90596).a(inflate2);
                        inflate2.setOnClickListener(new View.OnClickListener() { // from class: vpi
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                vpm vpmVar2 = vpm.this;
                                View view2 = inflate2;
                                View.OnClickListener onClickListener2 = onClickListener;
                                vpmVar2.e.a(tgc.a(), view2);
                                onClickListener2.onClick(view);
                            }
                        });
                        arrayList.add(inflate2);
                    }
                    vpn vpnVar = vpmVar.g;
                    if (vpnVar.a.getChildCount() > 0) {
                        vpnVar.a.removeAllViews();
                    }
                    if (arrayList.iterator().hasNext()) {
                        TableRow tableRow = new TableRow(vpnVar.a.getContext());
                        TableRow tableRow2 = tableRow;
                        int i13 = 0;
                        for (View view : arrayList) {
                            if (i13 > 0 && i13 % vpnVar.b == 0) {
                                vpnVar.a.addView(tableRow2, new TableRow.LayoutParams());
                                tableRow2 = new TableRow(vpnVar.a.getContext());
                            }
                            tableRow2.addView(view, vpn.a());
                            i13++;
                        }
                        vpnVar.a.addView(tableRow2, new TableRow.LayoutParams());
                        while (tableRow2.getChildCount() < vpnVar.b) {
                            SquareImageView squareImageView2 = new SquareImageView(vpnVar.a.getContext());
                            squareImageView2.setVisibility(4);
                            tableRow2.addView(squareImageView2, vpn.a());
                        }
                    }
                    int dimensionPixelSize = vpfVar.qX().getDimensionPixelSize(R.dimen.photo_picker_title_tab_padding);
                    if (vqcVar.a.b() == 3 && amvjVar.c == 1) {
                        vpmVar.h.setVisibility(8);
                        dimensionPixelSize = vpfVar.qX().getDimensionPixelSize(R.dimen.photo_picker_photo_tab_padding);
                    }
                    vpfVar.e.setPadding(0, dimensionPixelSize, 0, 0);
                    vpfVar.e.addView(vpmVar);
                    i7++;
                    amruVar4 = amruVar;
                    i6 = i;
                    i5 = 1;
                }
                vpfVar.n(R.id.photo_picker_content_view);
                vpfVar.a(vpzVar);
            }
        });
    }

    public final void a(vpz vpzVar) {
        amrp f = amru.f();
        amru amruVar = vpzVar.a;
        int i = ((amvj) amruVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            f.j(((vqc) amruVar.get(i2)).c);
        }
        f.h(this.aj.b());
        if (this.ai.h()) {
            aone createBuilder = aofj.a.createBuilder();
            createBuilder.copyOnWrite();
            aofj aofjVar = (aofj) createBuilder.instance;
            aofjVar.c = 10;
            aofjVar.b |= 1;
            amnp amnpVar = (amnp) this.ai.c();
            amnpVar.g();
            long a = amnpVar.a(TimeUnit.MICROSECONDS);
            createBuilder.copyOnWrite();
            aofj aofjVar2 = (aofj) createBuilder.instance;
            aofjVar2.b |= 2;
            aofjVar2.d = a;
            amru amruVar2 = vpzVar.a;
            int i3 = ((amvj) amruVar2).c;
            for (int i4 = 0; i4 < i3; i4++) {
                amru amruVar3 = ((vqc) amruVar2.get(i4)).c;
                int size = amruVar3.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size) {
                        aoff aoffVar = (aoff) amruVar3.get(i5);
                        i5++;
                        if (aoffVar.k()) {
                            aofd b = aoffVar.b();
                            createBuilder.copyOnWrite();
                            aofj aofjVar3 = (aofj) createBuilder.instance;
                            b.getClass();
                            aofjVar3.e = b;
                            aofjVar3.b |= 4;
                            break;
                        }
                    }
                }
            }
            vlx vlxVar = this.c;
            aone createBuilder2 = aofh.a.createBuilder();
            createBuilder2.L(f.g());
            createBuilder2.copyOnWrite();
            aofh aofhVar = (aofh) createBuilder2.instance;
            aofj aofjVar4 = (aofj) createBuilder.build();
            aofjVar4.getClass();
            aofhVar.d = aofjVar4;
            aofhVar.b |= 1;
            vlxVar.c((aofh) createBuilder2.build());
            this.ai = amlr.a;
        }
    }

    @Override // defpackage.vpg, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        if (this.ah) {
            return;
        }
        axfq.o(this);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(true != axxp.d() ? R.layout.photo_picker_google_photos_home_fragment : R.layout.photo_picker_google_photos_home_fragment_art_style, viewGroup, false);
        this.b.a.a(109564).a(inflate);
        return inflate;
    }

    public final void n(int i) {
        this.ae.setVisibility(0);
        ViewAnimator viewAnimator = this.ae;
        this.ae.setDisplayedChild(viewAnimator.indexOfChild(viewAnimator.findViewById(i)));
    }
}
