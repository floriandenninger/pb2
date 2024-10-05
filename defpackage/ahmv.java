package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.google.android.libraries.youtube.player.features.overlay.controls.ControlsOverlayStyle;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahmv extends ahhi {
    public static final /* synthetic */ int e = 0;
    private static final float f = ahkt.a(64.0f);
    public ControlsOverlayStyle a = ControlsOverlayStyle.a;
    public boolean b;
    public boolean c;
    private final ahga g;
    private final ahga h;
    private final ahga i;
    private final ahga j;
    private final ahga k;

    public ahmv(Resources resources, ahkv ahkvVar, final ahma ahmaVar, ahkm ahkmVar) {
        azrw b = ahkmVar.a.b();
        Bitmap d = ahkt.d(resources, R.raw.vr_button_fill);
        ahga ahgaVar = new ahga(ahkvVar.clone(), b, d, 9.2f, ahkt.d(resources, R.raw.vr_play));
        this.h = ahgaVar;
        final int i = 1;
        ahgaVar.c = new ahgb() { // from class: ahmu
            @Override // defpackage.ahgb
            public final void a() {
                int i2 = i;
                if (i2 == 0) {
                    ahma ahmaVar2 = ahmaVar;
                    int i3 = ahmv.e;
                    ahmaVar2.a();
                    return;
                }
                if (i2 == 1) {
                    ahma ahmaVar3 = ahmaVar;
                    int i4 = ahmv.e;
                    ahmaVar3.a();
                    return;
                }
                if (i2 == 2) {
                    ahma ahmaVar4 = ahmaVar;
                    int i5 = ahmv.e;
                    ahmc ahmcVar = ahmaVar4.a.a;
                    ahmcVar.a.post(new ahlw(ahmcVar, 0));
                    ahmcVar.k = false;
                    ahmcVar.j();
                    return;
                }
                if (i2 == 3) {
                    ahma ahmaVar5 = ahmaVar;
                    int i6 = ahmv.e;
                    ahmc ahmcVar2 = ahmaVar5.a.a;
                    ahmcVar2.a.post(new ahlw(ahmcVar2, 1));
                    ahmcVar2.o = true;
                    return;
                }
                ahma ahmaVar6 = ahmaVar;
                int i7 = ahmv.e;
                ahmc ahmcVar3 = ahmaVar6.a.a;
                ahmcVar3.a.post(new ahlw(ahmcVar3, 3));
                ahmcVar3.o = true;
            }
        };
        ahga ahgaVar2 = new ahga(ahkvVar.clone(), b, d, 9.2f, ahkt.d(resources, R.raw.vr_replay_white_24dp));
        this.i = ahgaVar2;
        final int i2 = 0;
        ahgaVar2.c = new ahgb() { // from class: ahmu
            @Override // defpackage.ahgb
            public final void a() {
                int i22 = i2;
                if (i22 == 0) {
                    ahma ahmaVar2 = ahmaVar;
                    int i3 = ahmv.e;
                    ahmaVar2.a();
                    return;
                }
                if (i22 == 1) {
                    ahma ahmaVar3 = ahmaVar;
                    int i4 = ahmv.e;
                    ahmaVar3.a();
                    return;
                }
                if (i22 == 2) {
                    ahma ahmaVar4 = ahmaVar;
                    int i5 = ahmv.e;
                    ahmc ahmcVar = ahmaVar4.a.a;
                    ahmcVar.a.post(new ahlw(ahmcVar, 0));
                    ahmcVar.k = false;
                    ahmcVar.j();
                    return;
                }
                if (i22 == 3) {
                    ahma ahmaVar5 = ahmaVar;
                    int i6 = ahmv.e;
                    ahmc ahmcVar2 = ahmaVar5.a.a;
                    ahmcVar2.a.post(new ahlw(ahmcVar2, 1));
                    ahmcVar2.o = true;
                    return;
                }
                ahma ahmaVar6 = ahmaVar;
                int i7 = ahmv.e;
                ahmc ahmcVar3 = ahmaVar6.a.a;
                ahmcVar3.a.post(new ahlw(ahmcVar3, 3));
                ahmcVar3.o = true;
            }
        };
        ahgaVar2.l = true;
        ahga ahgaVar3 = new ahga(ahkvVar.clone(), b, d, 9.2f, ahkt.d(resources, R.raw.vr_pause));
        this.g = ahgaVar3;
        final int i3 = 2;
        ahgaVar3.c = new ahgb() { // from class: ahmu
            @Override // defpackage.ahgb
            public final void a() {
                int i22 = i3;
                if (i22 == 0) {
                    ahma ahmaVar2 = ahmaVar;
                    int i32 = ahmv.e;
                    ahmaVar2.a();
                    return;
                }
                if (i22 == 1) {
                    ahma ahmaVar3 = ahmaVar;
                    int i4 = ahmv.e;
                    ahmaVar3.a();
                    return;
                }
                if (i22 == 2) {
                    ahma ahmaVar4 = ahmaVar;
                    int i5 = ahmv.e;
                    ahmc ahmcVar = ahmaVar4.a.a;
                    ahmcVar.a.post(new ahlw(ahmcVar, 0));
                    ahmcVar.k = false;
                    ahmcVar.j();
                    return;
                }
                if (i22 == 3) {
                    ahma ahmaVar5 = ahmaVar;
                    int i6 = ahmv.e;
                    ahmc ahmcVar2 = ahmaVar5.a.a;
                    ahmcVar2.a.post(new ahlw(ahmcVar2, 1));
                    ahmcVar2.o = true;
                    return;
                }
                ahma ahmaVar6 = ahmaVar;
                int i7 = ahmv.e;
                ahmc ahmcVar3 = ahmaVar6.a.a;
                ahmcVar3.a.post(new ahlw(ahmcVar3, 3));
                ahmcVar3.o = true;
            }
        };
        ahkv clone = ahkvVar.clone();
        float f2 = f;
        ahga ahgaVar4 = new ahga(clone, b, d, f2, ahkt.d(resources, R.raw.vr_next));
        this.j = ahgaVar4;
        final int i4 = 3;
        ahgaVar4.c = new ahgb() { // from class: ahmu
            @Override // defpackage.ahgb
            public final void a() {
                int i22 = i4;
                if (i22 == 0) {
                    ahma ahmaVar2 = ahmaVar;
                    int i32 = ahmv.e;
                    ahmaVar2.a();
                    return;
                }
                if (i22 == 1) {
                    ahma ahmaVar3 = ahmaVar;
                    int i42 = ahmv.e;
                    ahmaVar3.a();
                    return;
                }
                if (i22 == 2) {
                    ahma ahmaVar4 = ahmaVar;
                    int i5 = ahmv.e;
                    ahmc ahmcVar = ahmaVar4.a.a;
                    ahmcVar.a.post(new ahlw(ahmcVar, 0));
                    ahmcVar.k = false;
                    ahmcVar.j();
                    return;
                }
                if (i22 == 3) {
                    ahma ahmaVar5 = ahmaVar;
                    int i6 = ahmv.e;
                    ahmc ahmcVar2 = ahmaVar5.a.a;
                    ahmcVar2.a.post(new ahlw(ahmcVar2, 1));
                    ahmcVar2.o = true;
                    return;
                }
                ahma ahmaVar6 = ahmaVar;
                int i7 = ahmv.e;
                ahmc ahmcVar3 = ahmaVar6.a.a;
                ahmcVar3.a.post(new ahlw(ahmcVar3, 3));
                ahmcVar3.o = true;
            }
        };
        ahga ahgaVar5 = new ahga(ahkvVar, b, d, f2, ahkt.d(resources, R.raw.vr_prev));
        this.k = ahgaVar5;
        final int i5 = 4;
        ahgaVar5.c = new ahgb() { // from class: ahmu
            @Override // defpackage.ahgb
            public final void a() {
                int i22 = i5;
                if (i22 == 0) {
                    ahma ahmaVar2 = ahmaVar;
                    int i32 = ahmv.e;
                    ahmaVar2.a();
                    return;
                }
                if (i22 == 1) {
                    ahma ahmaVar3 = ahmaVar;
                    int i42 = ahmv.e;
                    ahmaVar3.a();
                    return;
                }
                if (i22 == 2) {
                    ahma ahmaVar4 = ahmaVar;
                    int i52 = ahmv.e;
                    ahmc ahmcVar = ahmaVar4.a.a;
                    ahmcVar.a.post(new ahlw(ahmcVar, 0));
                    ahmcVar.k = false;
                    ahmcVar.j();
                    return;
                }
                if (i22 == 3) {
                    ahma ahmaVar5 = ahmaVar;
                    int i6 = ahmv.e;
                    ahmc ahmcVar2 = ahmaVar5.a.a;
                    ahmcVar2.a.post(new ahlw(ahmcVar2, 1));
                    ahmcVar2.o = true;
                    return;
                }
                ahma ahmaVar6 = ahmaVar;
                int i7 = ahmv.e;
                ahmc ahmcVar3 = ahmaVar6.a.a;
                ahmcVar3.a.post(new ahlw(ahmcVar3, 3));
                ahmcVar3.o = true;
            }
        };
        float a = ahkt.a(120.0f);
        ahgaVar5.l(-a, 0.0f, 0.0f);
        ahgaVar4.l(a, 0.0f, 0.0f);
        b(2);
        n(ahgaVar);
        n(ahgaVar2);
        n(ahgaVar3);
        n(ahgaVar5);
        n(ahgaVar4);
    }

    public final void a() {
        ahga ahgaVar;
        boolean z;
        boolean z2;
        if (this.a.u && ((z2 = this.b) || this.c)) {
            this.j.j(z2);
            this.k.j(this.c);
            ahgaVar = this.j;
            z = false;
        } else {
            ahgaVar = this.j;
            z = true;
        }
        ahgaVar.l = z;
        this.k.l = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i) {
        this.h.l = i != 1;
        this.g.l = i != 2;
        this.i.l = i != 3;
    }
}
