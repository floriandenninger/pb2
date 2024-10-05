package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewConfiguration;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ijz {
    public final acqz c;
    public final int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int i;
    public final PointF a = new PointF();
    public final PointF b = new PointF();
    private final PointF j = new PointF();
    public boolean h = false;

    public ijz(Context context, acqz acqzVar, final axze axzeVar, yqw yqwVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.c = acqzVar;
        final byte[] bArr4 = null;
        final byte[] bArr5 = null;
        final byte[] bArr6 = null;
        yqwVar.f(new Callable(axzeVar, bArr4, bArr5, bArr6) { // from class: ijy
            public final /* synthetic */ axze b;

            @Override // java.util.concurrent.Callable
            public final Object call() {
                final ijz ijzVar = ijz.this;
                return this.b.c().ax(new ayrs() { // from class: ijx
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        ijz.this.h = ((Boolean) obj).booleanValue();
                    }
                });
            }
        });
    }

    public static float a(PointF pointF, PointF pointF2) {
        return (float) Math.sqrt(b(pointF, pointF2));
    }

    static float b(PointF pointF, PointF pointF2) {
        float f = pointF2.x - pointF.x;
        float f2 = pointF2.y - pointF.y;
        return (f * f) + (f2 * f2);
    }

    public static awav c(int i) {
        aone createBuilder = awav.a.createBuilder();
        createBuilder.copyOnWrite();
        awav awavVar = (awav) createBuilder.instance;
        awavVar.b |= 2;
        awavVar.d = i;
        return (awav) createBuilder.build();
    }

    public final void d() {
        this.e = false;
        this.i = 0;
    }

    public final void e() {
        if (!this.e || a(this.a, this.b) <= this.d) {
            return;
        }
        this.e = false;
        float degrees = (float) Math.toDegrees(Math.atan2(this.b.y - this.a.y, this.b.x - this.a.x));
        int i = 93501;
        int i2 = 91954;
        if (degrees > -45.0f && degrees < 45.0f) {
            i2 = 91955;
            i = 93502;
        } else if (degrees < 45.0f || degrees > 135.0f) {
            if (degrees >= -135.0f && degrees <= -45.0f) {
                if (!this.f) {
                    return;
                }
                i2 = 91956;
                i = 93503;
            }
        } else {
            if (!this.f) {
                return;
            }
            i2 = 91953;
            i = 93500;
        }
        h(65, i2);
        this.i = i;
    }

    public final void f(float f, float f2) {
        if (this.e) {
            this.j.set(f, f2);
            if (b(this.a, this.j) > b(this.a, this.b)) {
                this.b.set(this.j);
            }
        }
    }

    public final void g(float f, float f2) {
        this.a.set(f, f2);
        this.b.set(this.a);
        this.e = true;
        this.i = 0;
    }

    public final void h(int i, int i2) {
        this.c.mM().I(i, new acqx(acsb.c(i2)), null);
    }
}
