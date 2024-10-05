package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioManager;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahjy extends ahga implements ahip {
    public final ahiq e;
    public final float f;
    private final ahga g;
    private final float[] h;
    private final AudioManager i;
    private final ahjp j;
    private final ahjp k;
    private final ahjp m;
    private float n;
    private boolean o;

    public ahjy(Resources resources, AudioManager audioManager, azrw azrwVar, azrw azrwVar2, ahkv ahkvVar) {
        super(new ahhp(ahkvVar.clone(), 0.0f, 0.0f));
        this.i = audioManager;
        this.h = r10;
        ahiq ahiqVar = new ahiq(azrwVar, new int[]{-1695465, -5723992}, 8.0f, ahkvVar.clone(), this);
        this.e = ahiqVar;
        ahfq ahjxVar = new ahjx(this);
        ahfq ahjsVar = new ahjs(ahiqVar, new float[]{0.0f, 0.0f, 0.0f}, new float[]{4.0f, 0.0f, 0.0f});
        k(ahjxVar);
        k(ahjsVar);
        Bitmap d = ahkt.d(resources, R.raw.vr_volume_speaker);
        float a = ahkt.a(d.getWidth());
        float a2 = ahkt.a(d.getHeight());
        ahga ahgaVar = new ahga(new ahhp(ahkvVar.clone(), a, a2));
        this.g = ahgaVar;
        ahjp ahjpVar = new ahjp(d, ahku.a(a, a2, ahku.c), ahkvVar.clone(), azrwVar2);
        ahjpVar.a(new ahif(ahjpVar, 0.5f, 1.0f));
        ahjp ahjpVar2 = new ahjp(ahkt.d(resources, R.raw.vr_volume_low), ahku.a(a, a2, ahku.c), ahkvVar.clone(), azrwVar2);
        this.j = ahjpVar2;
        ahjpVar2.a(new ahif(ahjpVar2, 0.5f, 1.0f));
        ahjp ahjpVar3 = new ahjp(ahkt.d(resources, R.raw.vr_volume_high), ahku.a(a, a2, ahku.c), ahkvVar.clone(), azrwVar2);
        this.k = ahjpVar3;
        ahjpVar3.a(new ahif(ahjpVar3, 0.5f, 1.0f));
        ahjp ahjpVar4 = new ahjp(ahkt.d(resources, R.raw.vr_volume_mute), ahku.a(a, a2, ahku.c), ahkvVar.clone(), azrwVar2);
        this.m = ahjpVar4;
        ahjpVar4.a(new ahif(ahjpVar4, 0.5f, 1.0f));
        this.n = g();
        t();
        ahgaVar.n(ahjpVar);
        ahgaVar.n(ahjpVar2);
        ahgaVar.n(ahjpVar3);
        ahgaVar.n(ahjpVar4);
        ahgaVar.l(-4.0f, 0.0f, 0.0f);
        ahiqVar.l(((-8.0f) + a) / 2.0f, 0.0f, 0.0f);
        float[] fArr = {g(), 1.0f - fArr[0]};
        ahiqVar.g(fArr);
        float f = ahiqVar.h + a;
        this.f = f;
        m(f + 1.0f, a2);
        n(ahiqVar);
        n(ahgaVar);
    }

    private final float g() {
        return this.i.getStreamVolume(3) / this.i.getStreamMaxVolume(3);
    }

    private final void t() {
        ahjp ahjpVar = this.j;
        boolean z = this.o;
        ahjpVar.l = z || this.n < 0.25f;
        this.k.l = z || this.n < 0.75f;
        this.m.l = !z;
        float f = z ? 0.0f : this.n;
        float[] fArr = this.h;
        fArr[0] = f;
        fArr[1] = 1.0f - f;
        this.e.g(fArr);
    }

    @Override // defpackage.ahip
    public final void a(float f) {
    }

    @Override // defpackage.ahip
    public final void b() {
        t();
    }

    @Override // defpackage.ahip
    public final void c(float f) {
        this.n = f;
        this.o = false;
        h();
        t();
    }

    @Override // defpackage.ahga, defpackage.ahhi, defpackage.ahim
    public final void p(ahjq ahjqVar) {
        super.p(ahjqVar);
        this.e.p(ahjqVar);
        if (this.g.r(ahjqVar)) {
            this.o = !this.o;
            t();
            h();
            t();
        }
    }

    @Override // defpackage.ahga, defpackage.ahhi, defpackage.ahim
    public final void qD(boolean z, ahjq ahjqVar) {
        super.qD(z, ahjqVar);
        this.e.qD(z, ahjqVar);
    }

    private final void h() {
        this.i.setStreamVolume(3, this.o ? 0 : (int) (this.n * this.i.getStreamMaxVolume(3)), 0);
    }
}
