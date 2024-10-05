package com.google.android.libraries.user.profile.photopicker.fragment.devicephotos;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import com.google.android.libraries.user.profile.photopicker.fragment.devicephotos.DevicePhotosFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.google.android.youtube.R;
import defpackage.aac;
import defpackage.aae;
import defpackage.aao;
import defpackage.aap;
import defpackage.aih;
import defpackage.akht;
import defpackage.algs;
import defpackage.allo;
import defpackage.aloh;
import defpackage.amlr;
import defpackage.ammv;
import defpackage.amnp;
import defpackage.amru;
import defpackage.aofd;
import defpackage.aofh;
import defpackage.aofi;
import defpackage.aofj;
import defpackage.aone;
import defpackage.aox;
import defpackage.axfq;
import defpackage.axxp;
import defpackage.azrw;
import defpackage.mi;
import defpackage.tgd;
import defpackage.tgk;
import defpackage.tgn;
import defpackage.vkb;
import defpackage.vlp;
import defpackage.vlx;
import defpackage.vmk;
import defpackage.vml;
import defpackage.vnk;
import defpackage.vox;
import defpackage.vpc;
import defpackage.vpd;
import defpackage.vrp;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class DevicePhotosFragment extends vpd {
    public vml a;
    public vnk ae;
    public vlx af;
    public vlp ag;
    public azrw ah;
    public ammv ai;
    public aae aj;
    public aae ak;
    public vpc al;
    public mi am;
    public ammv an;
    public akht ao;
    public aloh ap;
    private aae ar;
    private aae as;
    private MaterialTextView at;
    private View au;
    private MaterialButton av;
    private RecyclerView aw;
    private boolean ax = false;
    private int ay = 0;
    public vrp b;
    public tgn c;
    public tgk d;
    public tgd e;

    private final void aG(boolean z) {
        if (aih.c(qR(), "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            q();
            r(0);
        } else if (aw("android.permission.READ_EXTERNAL_STORAGE")) {
            r(1);
            o(amlr.a);
        } else if (!z) {
            r(2);
            o(amlr.a);
        } else {
            n();
        }
    }

    @Override // defpackage.ce
    public final void S(Bundle bundle) {
        super.S(bundle);
        this.aw = (RecyclerView) this.O.findViewById(R.id.photo_picker_device_photos_grid);
        this.c.a.a(89737).a(this.aw);
        qR();
        this.aw.af(new GridLayoutManager(this.aw.getResources().getInteger(R.integer.photo_picker_num_columns), null));
        akht akhtVar = this.ao;
        vox voxVar = new vox(this);
        vkb vkbVar = (vkb) akhtVar.b.get();
        vkbVar.getClass();
        tgd tgdVar = (tgd) akhtVar.a.get();
        tgdVar.getClass();
        tgn tgnVar = (tgn) akhtVar.e.get();
        tgnVar.getClass();
        vnk vnkVar = (vnk) akhtVar.c.get();
        vnkVar.getClass();
        vlp vlpVar = (vlp) akhtVar.d.get();
        vlpVar.getClass();
        vpc vpcVar = new vpc(vkbVar, tgdVar, tgnVar, vnkVar, vlpVar, voxVar);
        this.al = vpcVar;
        this.aw.ac(vpcVar);
        this.al.w(amru.q());
        this.at = (MaterialTextView) this.O.findViewById(R.id.photo_picker_device_photos_permissions_message);
        this.au = this.O.findViewById(R.id.photo_picker_device_photos_permission_buttons_container);
        MaterialButton materialButton = (MaterialButton) this.O.findViewById(R.id.photo_picker_device_photos_permission_button);
        this.av = materialButton;
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: vou
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DevicePhotosFragment devicePhotosFragment = DevicePhotosFragment.this;
                devicePhotosFragment.e.a(tgc.a(), view);
                devicePhotosFragment.n();
            }
        });
        this.c.a.a(89728).a(this.av);
        this.an = ammv.i(this.ap.h("camera_image.jpg"));
        amnp amnpVar = (amnp) this.ah.get();
        amnpVar.e();
        amnpVar.f();
        this.ai = ammv.j(amnpVar);
        vlx vlxVar = this.af;
        aone createBuilder = aofi.a.createBuilder();
        createBuilder.copyOnWrite();
        aofi aofiVar = (aofi) createBuilder.instance;
        aofiVar.c = 22;
        aofiVar.b |= 1;
        vlxVar.d((aofi) createBuilder.build());
        final allo m = allo.m(this.O, R.string.op3_something_went_wrong, -2);
        this.a.a.f(M(), new aox() { // from class: vow
            @Override // defpackage.aox
            public final void a(Object obj) {
                DevicePhotosFragment devicePhotosFragment = DevicePhotosFragment.this;
                allo alloVar = m;
                vmk vmkVar = (vmk) obj;
                if (vmkVar.c.h()) {
                    alloVar.h();
                } else {
                    devicePhotosFragment.al.w(vmkVar.a);
                }
                devicePhotosFragment.o(ammv.j(vmkVar));
            }
        });
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        boolean z = this.ax;
        this.ax = false;
        aG(z);
    }

    public final void a() {
        ammv j;
        if (this.an.h()) {
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            intent.putExtra("output", (Parcelable) this.an.c());
            j = ammv.j(intent);
        } else {
            if (Log.isLoggable("DevicePhotosFragment", 5)) {
                Log.w("DevicePhotosFragment", "Uri for camera photo camera_image.jpg is not present");
            }
            j = amlr.a;
        }
        if (j.h()) {
            this.as.b((Intent) j.c());
        }
    }

    @Override // defpackage.vpd, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        if (this.aq) {
            return;
        }
        axfq.o(this);
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        algs algsVar = new algs(qR());
        algsVar.r(R.string.op3_allow_access_in_settings);
        algsVar.s(R.string.op3_dismiss);
        this.am = algsVar.b();
        final int i = 3;
        this.ar = registerForActivityResult(new aao(), new aac(this) { // from class: vov
            public final /* synthetic */ DevicePhotosFragment a;

            {
                this.a = this;
            }

            @Override // defpackage.aac
            public final void a(Object obj) {
                int i2 = i;
                if (i2 == 0) {
                    DevicePhotosFragment devicePhotosFragment = this.a;
                    ActivityResult activityResult = (ActivityResult) obj;
                    if (activityResult.a == -1) {
                        devicePhotosFragment.ae.a = awzc.OBAKE_DEVICE_PHOTO_SELECTED;
                        devicePhotosFragment.b.i(activityResult.b.getData());
                        return;
                    }
                    return;
                }
                if (i2 == 1) {
                    DevicePhotosFragment devicePhotosFragment2 = this.a;
                    if (((ActivityResult) obj).a == -1 && devicePhotosFragment2.an.h()) {
                        devicePhotosFragment2.ae.a = awzc.OBAKE_CAMERA_PHOTO_SELECTED;
                        devicePhotosFragment2.b.i((Uri) devicePhotosFragment2.an.c());
                        return;
                    }
                    return;
                }
                if (i2 == 2) {
                    DevicePhotosFragment devicePhotosFragment3 = this.a;
                    if (((Boolean) obj).booleanValue()) {
                        vlx vlxVar = devicePhotosFragment3.af;
                        aone createBuilder = aofb.a.createBuilder();
                        createBuilder.copyOnWrite();
                        aofb aofbVar = (aofb) createBuilder.instance;
                        aofbVar.c = 122;
                        aofbVar.b = 1 | aofbVar.b;
                        vlxVar.a((aofb) createBuilder.build());
                        devicePhotosFragment3.a();
                        return;
                    }
                    if (devicePhotosFragment3.aw("android.permission.CAMERA")) {
                        vlx vlxVar2 = devicePhotosFragment3.af;
                        aone createBuilder2 = aofb.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        aofb aofbVar2 = (aofb) createBuilder2.instance;
                        aofbVar2.c = com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowFixedWidthMinor;
                        aofbVar2.b = 1 | aofbVar2.b;
                        vlxVar2.a((aofb) createBuilder2.build());
                        return;
                    }
                    vlx vlxVar3 = devicePhotosFragment3.af;
                    aone createBuilder3 = aofb.a.createBuilder();
                    createBuilder3.copyOnWrite();
                    aofb aofbVar3 = (aofb) createBuilder3.instance;
                    aofbVar3.c = com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMajor;
                    aofbVar3.b = 1 | aofbVar3.b;
                    vlxVar3.a((aofb) createBuilder3.build());
                    devicePhotosFragment3.am.show();
                    return;
                }
                DevicePhotosFragment devicePhotosFragment4 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    devicePhotosFragment4.r(0);
                    if (axxp.a.get().q()) {
                        devicePhotosFragment4.ai = amlr.a;
                    }
                    devicePhotosFragment4.q();
                    return;
                }
                if (devicePhotosFragment4.aw("android.permission.READ_EXTERNAL_STORAGE")) {
                    devicePhotosFragment4.r(1);
                } else {
                    devicePhotosFragment4.r(2);
                }
            }
        });
        final int i2 = 2;
        this.aj = registerForActivityResult(new aao(), new aac(this) { // from class: vov
            public final /* synthetic */ DevicePhotosFragment a;

            {
                this.a = this;
            }

            @Override // defpackage.aac
            public final void a(Object obj) {
                int i22 = i2;
                if (i22 == 0) {
                    DevicePhotosFragment devicePhotosFragment = this.a;
                    ActivityResult activityResult = (ActivityResult) obj;
                    if (activityResult.a == -1) {
                        devicePhotosFragment.ae.a = awzc.OBAKE_DEVICE_PHOTO_SELECTED;
                        devicePhotosFragment.b.i(activityResult.b.getData());
                        return;
                    }
                    return;
                }
                if (i22 == 1) {
                    DevicePhotosFragment devicePhotosFragment2 = this.a;
                    if (((ActivityResult) obj).a == -1 && devicePhotosFragment2.an.h()) {
                        devicePhotosFragment2.ae.a = awzc.OBAKE_CAMERA_PHOTO_SELECTED;
                        devicePhotosFragment2.b.i((Uri) devicePhotosFragment2.an.c());
                        return;
                    }
                    return;
                }
                if (i22 == 2) {
                    DevicePhotosFragment devicePhotosFragment3 = this.a;
                    if (((Boolean) obj).booleanValue()) {
                        vlx vlxVar = devicePhotosFragment3.af;
                        aone createBuilder = aofb.a.createBuilder();
                        createBuilder.copyOnWrite();
                        aofb aofbVar = (aofb) createBuilder.instance;
                        aofbVar.c = 122;
                        aofbVar.b = 1 | aofbVar.b;
                        vlxVar.a((aofb) createBuilder.build());
                        devicePhotosFragment3.a();
                        return;
                    }
                    if (devicePhotosFragment3.aw("android.permission.CAMERA")) {
                        vlx vlxVar2 = devicePhotosFragment3.af;
                        aone createBuilder2 = aofb.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        aofb aofbVar2 = (aofb) createBuilder2.instance;
                        aofbVar2.c = com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowFixedWidthMinor;
                        aofbVar2.b = 1 | aofbVar2.b;
                        vlxVar2.a((aofb) createBuilder2.build());
                        return;
                    }
                    vlx vlxVar3 = devicePhotosFragment3.af;
                    aone createBuilder3 = aofb.a.createBuilder();
                    createBuilder3.copyOnWrite();
                    aofb aofbVar3 = (aofb) createBuilder3.instance;
                    aofbVar3.c = com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMajor;
                    aofbVar3.b = 1 | aofbVar3.b;
                    vlxVar3.a((aofb) createBuilder3.build());
                    devicePhotosFragment3.am.show();
                    return;
                }
                DevicePhotosFragment devicePhotosFragment4 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    devicePhotosFragment4.r(0);
                    if (axxp.a.get().q()) {
                        devicePhotosFragment4.ai = amlr.a;
                    }
                    devicePhotosFragment4.q();
                    return;
                }
                if (devicePhotosFragment4.aw("android.permission.READ_EXTERNAL_STORAGE")) {
                    devicePhotosFragment4.r(1);
                } else {
                    devicePhotosFragment4.r(2);
                }
            }
        });
        final int i3 = 0;
        this.ak = registerForActivityResult(new aap(), new aac(this) { // from class: vov
            public final /* synthetic */ DevicePhotosFragment a;

            {
                this.a = this;
            }

            @Override // defpackage.aac
            public final void a(Object obj) {
                int i22 = i3;
                if (i22 == 0) {
                    DevicePhotosFragment devicePhotosFragment = this.a;
                    ActivityResult activityResult = (ActivityResult) obj;
                    if (activityResult.a == -1) {
                        devicePhotosFragment.ae.a = awzc.OBAKE_DEVICE_PHOTO_SELECTED;
                        devicePhotosFragment.b.i(activityResult.b.getData());
                        return;
                    }
                    return;
                }
                if (i22 == 1) {
                    DevicePhotosFragment devicePhotosFragment2 = this.a;
                    if (((ActivityResult) obj).a == -1 && devicePhotosFragment2.an.h()) {
                        devicePhotosFragment2.ae.a = awzc.OBAKE_CAMERA_PHOTO_SELECTED;
                        devicePhotosFragment2.b.i((Uri) devicePhotosFragment2.an.c());
                        return;
                    }
                    return;
                }
                if (i22 == 2) {
                    DevicePhotosFragment devicePhotosFragment3 = this.a;
                    if (((Boolean) obj).booleanValue()) {
                        vlx vlxVar = devicePhotosFragment3.af;
                        aone createBuilder = aofb.a.createBuilder();
                        createBuilder.copyOnWrite();
                        aofb aofbVar = (aofb) createBuilder.instance;
                        aofbVar.c = 122;
                        aofbVar.b = 1 | aofbVar.b;
                        vlxVar.a((aofb) createBuilder.build());
                        devicePhotosFragment3.a();
                        return;
                    }
                    if (devicePhotosFragment3.aw("android.permission.CAMERA")) {
                        vlx vlxVar2 = devicePhotosFragment3.af;
                        aone createBuilder2 = aofb.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        aofb aofbVar2 = (aofb) createBuilder2.instance;
                        aofbVar2.c = com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowFixedWidthMinor;
                        aofbVar2.b = 1 | aofbVar2.b;
                        vlxVar2.a((aofb) createBuilder2.build());
                        return;
                    }
                    vlx vlxVar3 = devicePhotosFragment3.af;
                    aone createBuilder3 = aofb.a.createBuilder();
                    createBuilder3.copyOnWrite();
                    aofb aofbVar3 = (aofb) createBuilder3.instance;
                    aofbVar3.c = com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMajor;
                    aofbVar3.b = 1 | aofbVar3.b;
                    vlxVar3.a((aofb) createBuilder3.build());
                    devicePhotosFragment3.am.show();
                    return;
                }
                DevicePhotosFragment devicePhotosFragment4 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    devicePhotosFragment4.r(0);
                    if (axxp.a.get().q()) {
                        devicePhotosFragment4.ai = amlr.a;
                    }
                    devicePhotosFragment4.q();
                    return;
                }
                if (devicePhotosFragment4.aw("android.permission.READ_EXTERNAL_STORAGE")) {
                    devicePhotosFragment4.r(1);
                } else {
                    devicePhotosFragment4.r(2);
                }
            }
        });
        final int i4 = 1;
        this.as = registerForActivityResult(new aap(), new aac(this) { // from class: vov
            public final /* synthetic */ DevicePhotosFragment a;

            {
                this.a = this;
            }

            @Override // defpackage.aac
            public final void a(Object obj) {
                int i22 = i4;
                if (i22 == 0) {
                    DevicePhotosFragment devicePhotosFragment = this.a;
                    ActivityResult activityResult = (ActivityResult) obj;
                    if (activityResult.a == -1) {
                        devicePhotosFragment.ae.a = awzc.OBAKE_DEVICE_PHOTO_SELECTED;
                        devicePhotosFragment.b.i(activityResult.b.getData());
                        return;
                    }
                    return;
                }
                if (i22 == 1) {
                    DevicePhotosFragment devicePhotosFragment2 = this.a;
                    if (((ActivityResult) obj).a == -1 && devicePhotosFragment2.an.h()) {
                        devicePhotosFragment2.ae.a = awzc.OBAKE_CAMERA_PHOTO_SELECTED;
                        devicePhotosFragment2.b.i((Uri) devicePhotosFragment2.an.c());
                        return;
                    }
                    return;
                }
                if (i22 == 2) {
                    DevicePhotosFragment devicePhotosFragment3 = this.a;
                    if (((Boolean) obj).booleanValue()) {
                        vlx vlxVar = devicePhotosFragment3.af;
                        aone createBuilder = aofb.a.createBuilder();
                        createBuilder.copyOnWrite();
                        aofb aofbVar = (aofb) createBuilder.instance;
                        aofbVar.c = 122;
                        aofbVar.b = 1 | aofbVar.b;
                        vlxVar.a((aofb) createBuilder.build());
                        devicePhotosFragment3.a();
                        return;
                    }
                    if (devicePhotosFragment3.aw("android.permission.CAMERA")) {
                        vlx vlxVar2 = devicePhotosFragment3.af;
                        aone createBuilder2 = aofb.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        aofb aofbVar2 = (aofb) createBuilder2.instance;
                        aofbVar2.c = com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowFixedWidthMinor;
                        aofbVar2.b = 1 | aofbVar2.b;
                        vlxVar2.a((aofb) createBuilder2.build());
                        return;
                    }
                    vlx vlxVar3 = devicePhotosFragment3.af;
                    aone createBuilder3 = aofb.a.createBuilder();
                    createBuilder3.copyOnWrite();
                    aofb aofbVar3 = (aofb) createBuilder3.instance;
                    aofbVar3.c = com.google.cardboard.sdk.R.styleable.AppCompatTheme_windowMinWidthMajor;
                    aofbVar3.b = 1 | aofbVar3.b;
                    vlxVar3.a((aofb) createBuilder3.build());
                    devicePhotosFragment3.am.show();
                    return;
                }
                DevicePhotosFragment devicePhotosFragment4 = this.a;
                if (((Boolean) obj).booleanValue()) {
                    devicePhotosFragment4.r(0);
                    if (axxp.a.get().q()) {
                        devicePhotosFragment4.ai = amlr.a;
                    }
                    devicePhotosFragment4.q();
                    return;
                }
                if (devicePhotosFragment4.aw("android.permission.READ_EXTERNAL_STORAGE")) {
                    devicePhotosFragment4.r(1);
                } else {
                    devicePhotosFragment4.r(2);
                }
            }
        });
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(true != axxp.d() ? R.layout.photo_picker_device_photos_fragment : R.layout.photo_picker_device_photos_fragment_art_style, viewGroup, false);
        this.c.a.a(110513).a(inflate);
        return inflate;
    }

    public final void n() {
        this.ar.b("android.permission.READ_EXTERNAL_STORAGE");
    }

    public final void o(ammv ammvVar) {
        if (this.ai.h()) {
            aone createBuilder = aofj.a.createBuilder();
            createBuilder.copyOnWrite();
            aofj aofjVar = (aofj) createBuilder.instance;
            aofjVar.c = 22;
            aofjVar.b |= 1;
            long a = ((amnp) this.ai.c()).a(TimeUnit.MICROSECONDS);
            createBuilder.copyOnWrite();
            aofj aofjVar2 = (aofj) createBuilder.instance;
            aofjVar2.b |= 2;
            aofjVar2.d = a;
            aone createBuilder2 = aofh.a.createBuilder();
            if (ammvVar.h()) {
                vmk vmkVar = (vmk) ammvVar.c();
                if (vmkVar.c.h()) {
                    aone createBuilder3 = aofd.a.createBuilder();
                    createBuilder3.copyOnWrite();
                    aofd aofdVar = (aofd) createBuilder3.instance;
                    aofdVar.d = 0;
                    aofdVar.b |= 2;
                    createBuilder.copyOnWrite();
                    aofj aofjVar3 = (aofj) createBuilder.instance;
                    aofd aofdVar2 = (aofd) createBuilder3.build();
                    aofdVar2.getClass();
                    aofjVar3.e = aofdVar2;
                    aofjVar3.b |= 4;
                }
                createBuilder2.N(vmkVar.b);
            }
            createBuilder2.copyOnWrite();
            aofh aofhVar = (aofh) createBuilder2.instance;
            aofj aofjVar4 = (aofj) createBuilder.build();
            aofjVar4.getClass();
            aofhVar.d = aofjVar4;
            aofhVar.b |= 1;
            this.af.c((aofh) createBuilder2.build());
            ((amnp) this.ai.c()).e();
        }
    }

    public final void p() {
        if (at()) {
            aG(true);
        } else {
            this.ax = true;
        }
    }

    public final void q() {
        this.a.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
    
        if (r0 != 2) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
    
        if (r0 != 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(int r7) {
        /*
            r6 = this;
            int r0 = r6.ay
            r6.ay = r7
            r1 = 0
            r2 = 8
            if (r7 == 0) goto Lb8
            r3 = 2
            r4 = 1
            if (r7 == r4) goto L6e
            boolean r7 = defpackage.axxp.f()
            r5 = 118677(0x1cf95, float:1.66302E-40)
            if (r7 == 0) goto L24
            tgk r7 = r6.d
            com.google.android.material.textview.MaterialTextView r0 = r6.at
            tgn r3 = r6.c
            tfy r3 = r3.a(r5)
            r7.c(r0, r3)
            goto L3f
        L24:
            if (r0 != r4) goto L30
            tgn r7 = r6.c
            tgk r7 = r7.a
            com.google.android.material.textview.MaterialTextView r7 = r6.at
            defpackage.tgk.d(r7)
            goto L32
        L30:
            if (r0 == r3) goto L3f
        L32:
            tgn r7 = r6.c
            tgk r7 = r7.a
            tfy r7 = r7.a(r5)
            com.google.android.material.textview.MaterialTextView r0 = r6.at
            r7.a(r0)
        L3f:
            com.google.android.material.button.MaterialButton r7 = r6.av
            r7.setVisibility(r2)
            android.content.Context r7 = r6.qR()
            java.lang.String r0 = "android.permission.READ_EXTERNAL_STORAGE"
            boolean r7 = defpackage.vlu.a(r7, r0)
            if (r7 == 0) goto L63
            com.google.android.material.textview.MaterialTextView r7 = r6.at
            r7.setVisibility(r1)
            android.view.View r7 = r6.au
            r7.setVisibility(r1)
            com.google.android.material.textview.MaterialTextView r7 = r6.at
            r0 = 2132018816(0x7f140680, float:1.967595E38)
            r7.setText(r0)
            return
        L63:
            com.google.android.material.textview.MaterialTextView r7 = r6.at
            r7.setVisibility(r2)
            android.view.View r7 = r6.au
            r7.setVisibility(r2)
            return
        L6e:
            boolean r7 = defpackage.axxp.f()
            r2 = 118676(0x1cf94, float:1.663E-40)
            if (r7 == 0) goto L85
            tgk r7 = r6.d
            com.google.android.material.textview.MaterialTextView r0 = r6.at
            tgn r3 = r6.c
            tfy r2 = r3.a(r2)
            r7.c(r0, r2)
            goto La0
        L85:
            if (r0 != r3) goto L91
            tgn r7 = r6.c
            tgk r7 = r7.a
            com.google.android.material.textview.MaterialTextView r7 = r6.at
            defpackage.tgk.d(r7)
            goto L93
        L91:
            if (r0 == r4) goto La0
        L93:
            tgn r7 = r6.c
            tgk r7 = r7.a
            tfy r7 = r7.a(r2)
            com.google.android.material.textview.MaterialTextView r0 = r6.at
            r7.a(r0)
        La0:
            com.google.android.material.textview.MaterialTextView r7 = r6.at
            r7.setVisibility(r1)
            android.view.View r7 = r6.au
            r7.setVisibility(r1)
            com.google.android.material.textview.MaterialTextView r7 = r6.at
            r0 = 2132018815(0x7f14067f, float:1.9675947E38)
            r7.setText(r0)
            com.google.android.material.button.MaterialButton r7 = r6.av
            r7.setVisibility(r1)
            return
        Lb8:
            com.google.android.material.textview.MaterialTextView r7 = r6.at
            r7.setVisibility(r2)
            android.view.View r7 = r6.au
            r7.setVisibility(r2)
            com.google.android.material.button.MaterialButton r7 = r6.av
            r7.setVisibility(r2)
            android.support.v7.widget.RecyclerView r7 = r6.aw
            r7.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.user.profile.photopicker.fragment.devicephotos.DevicePhotosFragment.r(int):void");
    }
}
