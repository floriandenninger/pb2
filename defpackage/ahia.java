package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.google.vr.sdk.base.sensors.internal.Vector3d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahia implements SensorEventListener {
    final /* synthetic */ ahic a;

    public ahia(ahic ahicVar) {
        this.a = ahicVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        ahic ahicVar = this.a;
        if (sensorEvent.sensor.getType() == 1) {
            ahicVar.q.set(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
            synchronized (ahicVar.n) {
                ahicVar.o.processAccelerometer(ahicVar.q, sensorEvent.timestamp);
            }
            return;
        }
        if (sensorEvent.sensor.getType() == 4 || sensorEvent.sensor.getType() == 16) {
            if (sensorEvent.sensor.getType() == 16) {
                if (ahicVar.p == null && sensorEvent.values.length == 6) {
                    ahicVar.p = new float[]{sensorEvent.values[3], sensorEvent.values[4], sensorEvent.values[5]};
                }
                if (ahicVar.p != null) {
                    ahicVar.r.set(sensorEvent.values[0] - ahicVar.p[0], sensorEvent.values[1] - ahicVar.p[1], sensorEvent.values[2] - ahicVar.p[2]);
                } else {
                    ahicVar.r.set(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
                }
            } else {
                ahicVar.r.set(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
            }
            synchronized (ahicVar.n) {
                ahicVar.o.processGyroscope(ahicVar.r, sensorEvent.timestamp);
                ahicVar.o.getGyroBias(ahicVar.s);
                Vector3d vector3d = ahicVar.r;
                Vector3d.sub(vector3d, ahicVar.s, vector3d);
            }
            if (ahicVar.k != -1) {
                double d = ahicVar.h == 0 ? ahicVar.r.x : ahicVar.r.y;
                long j = sensorEvent.timestamp;
                long j2 = ahicVar.k;
                float f = ahicVar.f;
                float f2 = ahicVar.i;
                double d2 = (float) d;
                double d3 = ((float) (j - j2)) * 1.0E-9f;
                Double.isNaN(d2);
                Double.isNaN(d3);
                ahicVar.f = f + (f2 * anaf.al((float) (d2 * d3), -0.1f, 0.1f));
            }
            ahicVar.k = sensorEvent.timestamp;
            return;
        }
        if (sensorEvent.sensor.getType() == 9) {
            float f3 = sensorEvent.values[0];
            float f4 = sensorEvent.values[1];
            float f5 = sensorEvent.values[2];
            ahicVar.h = Math.abs(f3) > Math.abs(f4) ? 0 : 1;
            int rotation = ahicVar.m.getRotation();
            ahicVar.g = ((rotation == 0 || rotation == 2) ? 0.0f : rotation == 1 ? 1.5707964f : -1.5707964f) + ((float) Math.atan2(-f3, f4));
            ahicVar.i = ahicVar.h == 0 ? f3 < 0.0f ? ahicVar.l[1] : ahicVar.l[0] : f4 > 0.0f ? ahicVar.l[0] : ahicVar.l[1];
            ahicVar.e = (f5 * 1.5707964f) / 9.80665f;
        }
    }
}
