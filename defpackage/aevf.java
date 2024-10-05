package defpackage;

import com.google.vr.sdk.audio.GvrAudioSurround;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
class aevf implements avr {
    private final aetw b;
    private GvrAudioSurround e;
    private boolean g;
    private float i;
    private float j;
    private float k;
    private float h = 1.0f;
    private avp c = avp.a;
    private ByteBuffer f = a;
    private int d = 0;

    static {
        pmo.b("goog.exo.gvr");
    }

    public aevf(aetw aetwVar) {
        this.b = aetwVar;
    }

    private final void j() {
        GvrAudioSurround gvrAudioSurround = this.e;
        if (gvrAudioSurround != null) {
            gvrAudioSurround.release();
            this.e = null;
        }
    }

    @Override // defpackage.avr
    public final synchronized avp a(avp avpVar) {
        if (avpVar.d != 2) {
            j();
            throw new avq(avpVar);
        }
        int i = avpVar.c;
        if (i == 1) {
            this.d = 1;
        } else if (i != 2) {
            int i2 = 4;
            if (i != 4) {
                i2 = 6;
                if (i == 6) {
                    this.d = 3;
                } else if (i == 9) {
                    this.d = 5;
                } else if (i != 16) {
                    throw new avq(avpVar);
                }
            }
            this.d = i2;
        } else {
            this.d = 2;
        }
        if (this.f == a) {
            this.f = ByteBuffer.allocateDirect(4096).order(ByteOrder.nativeOrder());
        }
        this.c = avpVar;
        return new avp(avpVar.b, 2, 2);
    }

    @Override // defpackage.avr
    public ByteBuffer b() {
        GvrAudioSurround gvrAudioSurround = this.e;
        if (gvrAudioSurround == null) {
            return a;
        }
        ByteBuffer byteBuffer = this.f;
        return this.f;
    }

    @Override // defpackage.avr
    public final void c() {
        if (this.d != 0) {
            j();
            try {
                int i = this.d;
                avp avpVar = this.c;
                GvrAudioSurround gvrAudioSurround = new GvrAudioSurround(i, avpVar.b, avpVar.c, 1024);
                this.e = gvrAudioSurround;
                gvrAudioSurround.updateNativeOrientation(this.h, this.i, this.j, this.k);
                this.d = 0;
            } catch (UnsatisfiedLinkError e) {
                aezf aezfVar = this.b.n;
                if (aezfVar != null) {
                    aesa aesaVar = aezfVar.K;
                    afie afieVar = new afie("android.audiotrack", 0L);
                    afieVar.c = e;
                    afieVar.b = "c.GvrAudio";
                    aesaVar.e(afieVar.a());
                    return;
                }
                return;
            }
        } else {
            GvrAudioSurround gvrAudioSurround2 = this.e;
            if (gvrAudioSurround2 != null) {
                gvrAudioSurround2.flush();
            }
        }
        this.g = false;
    }

    @Override // defpackage.avr
    public final void d() {
        GvrAudioSurround gvrAudioSurround = this.e;
        if (gvrAudioSurround != null) {
            gvrAudioSurround.triggerProcessing();
        }
        this.g = true;
    }

    @Override // defpackage.avr
    public void e(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        pse.c(this.e);
    }

    @Override // defpackage.avr
    public final synchronized void f() {
        j();
        i(1.0f, 0.0f, 0.0f, 0.0f);
        this.g = false;
        this.c = avp.a;
        this.f = a;
        this.d = 0;
    }

    @Override // defpackage.avr
    public final boolean g() {
        return (this.d == 0 && this.e == null) ? false : true;
    }

    @Override // defpackage.avr
    public final boolean h() {
        GvrAudioSurround gvrAudioSurround;
        return this.g && ((gvrAudioSurround = this.e) == null || gvrAudioSurround.getAvailableOutputSize() == 0);
    }

    public final synchronized void i(float f, float f2, float f3, float f4) {
        this.h = f;
        this.i = f2;
        this.j = f3;
        this.k = f4;
        GvrAudioSurround gvrAudioSurround = this.e;
        if (gvrAudioSurround != null) {
            gvrAudioSurround.updateNativeOrientation(f, f2, f3, f4);
        }
    }
}
