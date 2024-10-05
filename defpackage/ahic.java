package defpackage;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Handler;
import android.view.Display;
import android.view.WindowManager;
import com.google.vr.sdk.base.sensors.internal.GyroscopeBiasEstimator;
import com.google.vr.sdk.base.sensors.internal.Vector3d;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ahic {
    public SensorEventListener b;
    public boolean c;
    public Handler d;
    public float e;
    public float f;
    public float g;
    public int h;
    public float i;
    public boolean j;
    public long k;
    public final Display m;
    public float[] p;
    private final SensorManager t;
    private boolean u;
    public final Object a = new Object();
    public final float[] l = {-1.0f, 1.0f};
    public final Object n = new Object();
    public final Vector3d q = new Vector3d();
    public final Vector3d r = new Vector3d();
    public final Vector3d s = new Vector3d();
    public final GyroscopeBiasEstimator o = new GyroscopeBiasEstimator();

    public ahic(Context context) {
        this.t = (SensorManager) context.getSystemService("sensor");
        this.m = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    public final void b() {
        if (this.c) {
            a(false);
            synchronized (this.a) {
                this.c = false;
                Handler handler = this.d;
                if (handler != null) {
                    handler.post(new ajfg(1));
                }
            }
            this.d = null;
        }
    }

    public final synchronized void a(boolean z) {
        if (z) {
            if (!this.u) {
                Sensor defaultSensor = this.t.getDefaultSensor(1);
                Sensor defaultSensor2 = this.t.getDefaultSensor(9);
                Sensor defaultSensor3 = this.t.getDefaultSensor(16);
                if (defaultSensor3 == null || Build.MANUFACTURER.equals("HTC")) {
                    defaultSensor3 = this.t.getDefaultSensor(4);
                }
                if (defaultSensor2 != null && defaultSensor3 != null) {
                    this.t.registerListener(this.b, defaultSensor, 0, this.d);
                    this.t.registerListener(this.b, defaultSensor2, 0, this.d);
                    this.t.registerListener(this.b, defaultSensor3, 0, this.d);
                    this.u = true;
                }
            }
        } else if (this.u) {
            this.t.unregisterListener(this.b);
            this.u = false;
        }
    }
}
