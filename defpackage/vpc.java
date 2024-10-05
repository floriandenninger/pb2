package defpackage;

import android.content.ContentUris;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;
import com.google.android.material.textview.MaterialTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vpc extends vw {
    public final tgd d;
    public final vnk e;
    public final vox f;
    private amru g = amru.q();
    private final amru h;
    private final vkb i;
    private final tgn j;

    public vpc(vkb vkbVar, tgd tgdVar, tgn tgnVar, vnk vnkVar, vlp vlpVar, vox voxVar) {
        this.i = vkbVar;
        this.d = tgdVar;
        this.j = tgnVar;
        this.e = vnkVar;
        this.f = voxVar;
        amrp f = amru.f();
        if (!vlpVar.a.queryIntentActivities(new Intent("android.media.action.IMAGE_CAPTURE"), 65536).isEmpty()) {
            f.h(0);
        }
        if (vlpVar.b() || vlpVar.a(new Intent("android.intent.action.GET_CONTENT").setType("image/*"))) {
            f.h(1);
        }
        this.h = f.g();
    }

    @Override // defpackage.vw
    public final int b() {
        return this.g.size() + ((amvj) this.h).c;
    }

    @Override // defpackage.vw
    public final int c(int i) {
        amru amruVar = this.h;
        if (i < ((amvj) amruVar).c) {
            return ((Integer) amruVar.get(i)).intValue();
        }
        return 2;
    }

    @Override // defpackage.vw
    public final wv f(ViewGroup viewGroup, int i) {
        SquareImageView squareImageView;
        final int i2 = 1;
        final int i3 = 0;
        if (i == 0) {
            vpa vpaVar = new vpa(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_button, viewGroup, false), null);
            MaterialTextView materialTextView = (MaterialTextView) vpaVar.t.findViewById(R.id.photo_picker_button_text);
            materialTextView.setText(R.string.op3_picker_camera);
            materialTextView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, nz.b(materialTextView.getContext(), R.drawable.quantum_gm_ic_photo_camera_vd_theme_24), (Drawable) null, (Drawable) null);
            this.j.a.a(89730).a(vpaVar.t);
            vpaVar.t.setOnClickListener(new View.OnClickListener(this) { // from class: voy
                public final /* synthetic */ vpc a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (i2 == 0) {
                        vpc vpcVar = this.a;
                        vpcVar.d.a(tgc.a(), view);
                        vox voxVar = vpcVar.f;
                        Intent type = new Intent("android.intent.action.GET_CONTENT").setType("image/*");
                        if (voxVar.a.ag.b()) {
                            aae aaeVar = voxVar.a.ak;
                            Intent intent = new Intent("android.intent.action.PICK");
                            intent.setType("image/*");
                            intent.setPackage("com.google.android.apps.photos");
                            aaeVar.b(intent);
                            return;
                        }
                        if (voxVar.a.ag.a(type)) {
                            voxVar.a.ak.b(type);
                            return;
                        }
                        return;
                    }
                    vpc vpcVar2 = this.a;
                    vpcVar2.d.a(tgc.a(), view);
                    vox voxVar2 = vpcVar2.f;
                    if (vlu.a(voxVar2.a.qR(), "android.permission.CAMERA")) {
                        voxVar2.a.aj.b("android.permission.CAMERA");
                    } else {
                        voxVar2.a.a();
                    }
                }
            });
            return vpaVar;
        }
        if (i == 1) {
            vpa vpaVar2 = new vpa(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.photo_picker_button, viewGroup, false));
            MaterialTextView materialTextView2 = (MaterialTextView) vpaVar2.t.findViewById(R.id.photo_picker_button_text);
            materialTextView2.setText(R.string.op3_picker_gallery);
            materialTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, nz.b(materialTextView2.getContext(), R.drawable.quantum_gm_ic_camera_roll_vd_theme_24), (Drawable) null, (Drawable) null);
            this.j.a.a(89743).a(vpaVar2.t);
            vpaVar2.t.setOnClickListener(new View.OnClickListener(this) { // from class: voy
                public final /* synthetic */ vpc a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (i3 == 0) {
                        vpc vpcVar = this.a;
                        vpcVar.d.a(tgc.a(), view);
                        vox voxVar = vpcVar.f;
                        Intent type = new Intent("android.intent.action.GET_CONTENT").setType("image/*");
                        if (voxVar.a.ag.b()) {
                            aae aaeVar = voxVar.a.ak;
                            Intent intent = new Intent("android.intent.action.PICK");
                            intent.setType("image/*");
                            intent.setPackage("com.google.android.apps.photos");
                            aaeVar.b(intent);
                            return;
                        }
                        if (voxVar.a.ag.a(type)) {
                            voxVar.a.ak.b(type);
                            return;
                        }
                        return;
                    }
                    vpc vpcVar2 = this.a;
                    vpcVar2.d.a(tgc.a(), view);
                    vox voxVar2 = vpcVar2.f;
                    if (vlu.a(voxVar2.a.qR(), "android.permission.CAMERA")) {
                        voxVar2.a.aj.b("android.permission.CAMERA");
                    } else {
                        voxVar2.a.a();
                    }
                }
            });
            return vpaVar2;
        }
        if (axxp.d()) {
            squareImageView = SquareImageView.a(viewGroup.getContext());
        } else {
            squareImageView = new SquareImageView(viewGroup.getContext());
        }
        return new vpb(squareImageView);
    }

    @Override // defpackage.vw
    public final void o(wv wvVar, int i) {
        int i2 = ((amvj) this.h).c;
        if (i >= i2) {
            vpb vpbVar = (vpb) wvVar;
            vmj vmjVar = (vmj) this.g.get(i - i2);
            int i3 = vpb.u;
            SquareImageView squareImageView = vpbVar.t;
            if (vmjVar.b.h()) {
                squareImageView.setContentDescription(squareImageView.getContext().getString(R.string.op3_picker_accessibility_photo, vls.h((aoqa) vmjVar.b.c())));
            }
            final Uri withAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, vmjVar.a);
            vkb vkbVar = this.i;
            aoae aoaeVar = new aoae((byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
            aoaeVar.u();
            vkbVar.c(withAppendedId, aoaeVar, vpbVar.t);
            this.j.a.a(89756).b(vpbVar.t);
            vpbVar.t.setOnClickListener(new View.OnClickListener() { // from class: voz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    vpc vpcVar = vpc.this;
                    Uri uri = withAppendedId;
                    vpcVar.d.a(tgc.a(), view);
                    vpcVar.e.a = awzc.OBAKE_DEVICE_PHOTO_SELECTED;
                    vpcVar.f.a.b.i(uri);
                }
            });
        }
    }

    @Override // defpackage.vw
    public final void p(wv wvVar) {
        if (wvVar instanceof vpb) {
            int i = vpb.u;
            tgk.d(((vpb) wvVar).t);
        }
    }

    public final void w(amru amruVar) {
        this.g = amruVar;
        mw();
    }
}
