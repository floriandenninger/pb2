package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.edit.common.RecordingInfo;
import com.google.android.youtube.R;
import j$.util.Map;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hur implements View.OnClickListener, hxg {
    public boolean A;
    public boolean B;
    public Dialog C;
    public Context D;
    public int E;
    public ContextThemeWrapper F;
    public boolean G;
    public boolean H;
    public final vgz I;

    /* renamed from: J, reason: collision with root package name */
    public final axze f219J;
    private final wdm K;
    public apxf a;
    public final afsy b;
    public final aahd c;
    public final Handler d;
    public final akwd e;
    public final zua f;
    public final akvq g;
    public final iat h;
    public final ajjz i;
    public final gni j;
    public final List k = new ArrayList();
    public final List l = new ArrayList();
    public ci m;
    public RecordingInfo n;
    public huo o;
    public Bitmap p;
    public acra q;
    public hvx r;
    public zry s;
    public apxf t;
    public View u;
    public Button v;
    public Button w;
    public View x;
    public boolean y;
    public float z;

    public hur(afsy afsyVar, aahd aahdVar, Handler handler, akwd akwdVar, zua zuaVar, akvq akvqVar, iat iatVar, axze axzeVar, wdm wdmVar, ajjz ajjzVar, gni gniVar, vgz vgzVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.b = afsyVar;
        this.c = aahdVar;
        this.d = handler;
        this.e = akwdVar;
        this.f = zuaVar;
        this.g = akvqVar;
        this.h = iatVar;
        this.f219J = axzeVar;
        this.K = wdmVar;
        this.i = ajjzVar;
        this.j = gniVar;
        this.I = vgzVar;
    }

    public static void d(FileInputStream fileInputStream, FileOutputStream fileOutputStream) {
        FileChannel fileChannel;
        FileChannel channel;
        FileChannel fileChannel2 = null;
        try {
            channel = fileInputStream.getChannel();
        } catch (Throwable th) {
            th = th;
            fileChannel = null;
        }
        try {
            fileChannel2 = fileOutputStream.getChannel();
            fileChannel2.transferFrom(channel, 0L, channel.size());
            if (channel != null) {
                channel.close();
            }
            if (fileChannel2 != null) {
                fileChannel2.close();
            }
        } catch (Throwable th2) {
            th = th2;
            FileChannel fileChannel3 = fileChannel2;
            fileChannel2 = channel;
            fileChannel = fileChannel3;
            if (fileChannel2 != null) {
                fileChannel2.close();
            }
            if (fileChannel != null) {
                fileChannel.close();
            }
            throw th;
        }
    }

    @Override // defpackage.hxg
    public final float a() {
        if (this.y) {
            return this.z;
        }
        return 0.0f;
    }

    @Override // defpackage.hxg
    public final float b() {
        if (this.y) {
            return 0.0f;
        }
        return this.z;
    }

    @Override // defpackage.hxg
    public final View c() {
        return this.u;
    }

    @Override // defpackage.hxg
    public final void e() {
    }

    @Override // defpackage.hxg
    public final void f() {
    }

    public final void g() {
        h(true);
    }

    public final void h(boolean z) {
        if (this.y) {
            if (z) {
                gfw.z(this);
            } else {
                this.u.setTranslationY(this.z);
            }
            this.y = false;
        }
    }

    public final void i() {
        this.q.n(new acqx(acsb.c(84511)));
        this.q.n(new acqx(acsb.c(36857)));
    }

    public final void j() {
        ynm.n(this.m, this.I.b(new huh(this, 1), angq.a), hue.c, hue.f);
    }

    public final void k() {
        View inflate = LayoutInflater.from(this.F).inflate(R.layout.reel_post_confirmation_dialog, (ViewGroup) null);
        inflate.findViewById(R.id.reel_post_confirmation_dialog_learn_more).setOnClickListener(new huj(this, 2));
        ((CheckBox) inflate.findViewById(R.id.reel_post_dont_show_checkbox)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: hul
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                hur hurVar = hur.this;
                hurVar.B = z;
                compoundButton.setButtonTintList(wbs.S(hurVar.D, true != z ? R.attr.ytIconInactive : R.attr.ytCallToAction));
            }
        });
        inflate.findViewById(R.id.reel_post_button).setOnClickListener(new huj(this, 3));
        inflate.findViewById(R.id.close_button).setOnClickListener(new huj(this, 4));
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.reel_post_confirmation_avatar_frame);
        if (this.K.a() == null) {
            frameLayout.setVisibility(8);
        } else {
            aami aamiVar = this.K.a().e;
            if (aamiVar == null || aamiVar.a() == null) {
                frameLayout.setVisibility(8);
            } else {
                this.i.l(aamiVar.a().a(), new hun(this, frameLayout));
            }
        }
        this.C.setContentView(inflate);
    }

    public final void l() {
        if (this.y) {
            return;
        }
        gfw.z(this);
        this.y = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0028, code lost:
    
        if (r2.f != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r5 = this;
            android.view.View r0 = r5.x
            r1 = 0
            r0.setEnabled(r1)
            zry r0 = r5.s
            huo r2 = r5.o
            r3 = r2
            hvc r3 = (defpackage.hvc) r3
            boolean r3 = r3.a
            r4 = 1
            if (r3 == 0) goto L2b
            zxz r2 = (defpackage.zxz) r2
            aaea r2 = r2.aB
            arfd r2 = r2.a()
            int r3 = r2.b
            r3 = r3 & 4096(0x1000, float:5.74E-42)
            if (r3 == 0) goto L2a
            avuj r2 = r2.h
            if (r2 != 0) goto L26
            avuj r2 = defpackage.avuj.a
        L26:
            boolean r2 = r2.f
            if (r2 == 0) goto L2b
        L2a:
            r1 = 1
        L2b:
            huf r2 = new huf
            r2.<init>()
            amlr r3 = defpackage.amlr.a
            zrx r0 = r0.r()
            if (r1 == 0) goto L43
            if (r0 == 0) goto L43
            hwr r1 = new hwr
            r1.<init>()
            r0.f(r4, r3, r1)
            return
        L43:
            r0 = 0
            r2.a(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hur.m():void");
    }

    public final void n(int i) {
        jm.u(this.w, null, nz.b(this.m, i), null);
    }

    public final boolean o(idr idrVar) {
        if (!this.G) {
            return false;
        }
        if (this.b.c() == null) {
            return true;
        }
        this.b.c().b();
        return !((Boolean) Map.EL.getOrDefault(Collections.unmodifiableMap(idrVar.r), this.b.c().b(), false)).booleanValue();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.v) {
            this.q.I(3, new acqx(acsb.c(36855)), null);
            new huq(this).execute(new Void[0]);
            return;
        }
        if (view == this.w) {
            HashMap hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.r);
            this.c.c(this.a, hashMap);
            ((hvc) this.o).aZ();
            return;
        }
        if (view == this.x) {
            if (this.A || this.G) {
                ynm.n(this.m, this.I.a(), hue.a, new hud(this, 1));
            } else {
                m();
            }
        }
    }

    public final boolean p(idr idrVar) {
        return this.A && !idrVar.d;
    }
}
