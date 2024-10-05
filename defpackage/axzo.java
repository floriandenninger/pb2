package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axzo {
    public static final axzo a = new axzo();
    public ayaj b;
    public Executor c;
    public List d;
    public Boolean e;
    public Integer f;
    public Integer g;
    public ayaw h;
    private Object[][] i;

    private axzo() {
        this.d = Collections.emptyList();
        this.i = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
    }

    public final axzo a(ayaj ayajVar) {
        axzo axzoVar = new axzo(this);
        axzoVar.b = ayajVar;
        return axzoVar;
    }

    public final axzo b(int i) {
        amkq.H(i >= 0, "invalid maxsize %s", i);
        axzo axzoVar = new axzo(this);
        axzoVar.f = Integer.valueOf(i);
        return axzoVar;
    }

    public final axzo c(int i) {
        amkq.H(i >= 0, "invalid maxsize %s", i);
        axzo axzoVar = new axzo(this);
        axzoVar.g = Integer.valueOf(i);
        return axzoVar;
    }

    public final axzo d(axzn axznVar, Object obj) {
        axznVar.getClass();
        obj.getClass();
        axzo axzoVar = new axzo(this);
        int i = 0;
        while (true) {
            Object[][] objArr = this.i;
            if (i >= objArr.length) {
                i = -1;
                break;
            }
            if (axznVar.equals(objArr[i][0])) {
                break;
            }
            i++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, this.i.length + (i == -1 ? 1 : 0), 2);
        axzoVar.i = objArr2;
        Object[][] objArr3 = this.i;
        System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
        if (i == -1) {
            Object[][] objArr4 = axzoVar.i;
            int length = this.i.length;
            Object[] objArr5 = new Object[2];
            objArr5[0] = axznVar;
            objArr5[1] = obj;
            objArr4[length] = objArr5;
        } else {
            Object[][] objArr6 = axzoVar.i;
            Object[] objArr7 = new Object[2];
            objArr7[0] = axznVar;
            objArr7[1] = obj;
            objArr6[i] = objArr7;
        }
        return axzoVar;
    }

    public final Object e(axzn axznVar) {
        axznVar.getClass();
        int i = 0;
        while (true) {
            Object[][] objArr = this.i;
            if (i >= objArr.length) {
                return null;
            }
            if (axznVar.equals(objArr[i][0])) {
                return this.i[i][1];
            }
            i++;
        }
    }

    public final boolean f() {
        return Boolean.TRUE.equals(this.e);
    }

    public final String toString() {
        ammu Y = amkq.Y(this);
        Y.b("deadline", this.b);
        Y.b("authority", null);
        Y.b("callCredentials", this.h);
        Executor executor = this.c;
        Y.b("executor", executor != null ? executor.getClass() : null);
        Y.b("compressorName", null);
        Y.b("customOptions", Arrays.deepToString(this.i));
        Y.g("waitForReady", f());
        Y.b("maxInboundMessageSize", this.f);
        Y.b("maxOutboundMessageSize", this.g);
        Y.b("streamTracerFactories", this.d);
        return Y.toString();
    }

    public axzo(axzo axzoVar) {
        this.d = Collections.emptyList();
        this.b = axzoVar.b;
        this.h = axzoVar.h;
        this.c = axzoVar.c;
        this.i = axzoVar.i;
        this.e = axzoVar.e;
        this.f = axzoVar.f;
        this.g = axzoVar.g;
        this.d = axzoVar.d;
    }
}
