package com.google.research.xeno.effect;

import android.util.Pair;
import com.google.mediapipe.framework.GraphGlSyncToken;
import com.google.mediapipe.framework.TextureReleaseCallback;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class Control {
    public BoolSetting a;
    public FloatSetting b;
    public StringSetting c;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class BoolSetting {
        public final long a;

        private BoolSetting(long j) {
            this.a = j;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class FloatSetting {
        public final long a;
        public final Pair b;

        private FloatSetting(long j) {
            this.a = j;
            this.b = Control.nativeGetFloatRange(j);
        }

        public final void a(float f) {
            Control.nativeSetFloatValue(this.a, f);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class GpuBufferSetting {
        private GpuBufferSetting(long j) {
        }

        private static void releaseWithSyncToken(long j, TextureReleaseCallback textureReleaseCallback) {
            textureReleaseCallback.release(new GraphGlSyncToken(j));
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class IntSetting {
        private IntSetting(long j) {
            Control.nativeGetIntRange(j);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class RuntimeOptionsSetting {
        private RuntimeOptionsSetting(long j) {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public class StringSetting {
        public final long a;

        private StringSetting(long j) {
            this.a = j;
        }
    }

    private Control(BoolSetting boolSetting, FloatSetting floatSetting, GpuBufferSetting gpuBufferSetting, IntSetting intSetting, RuntimeOptionsSetting runtimeOptionsSetting, StringSetting stringSetting) {
        this.a = boolSetting;
        this.b = floatSetting;
        this.c = stringSetting;
    }

    private static native boolean nativeGetBoolValue(long j);

    public static native Pair nativeGetFloatRange(long j);

    public static native float nativeGetFloatValue(long j);

    public static native Pair nativeGetIntRange(long j);

    private static native int nativeGetIntValue(long j);

    private static native byte[] nativeGetRuntimeOptionsValue(long j);

    private static native Set nativeGetStringPossibleValues(long j);

    private static native String nativeGetStringValue(long j);

    public static native void nativeSetBoolValue(long j, boolean z);

    public static native void nativeSetFloatValue(long j, float f);

    private static native void nativeSetGpuBufferValue(long j, int i, int i2, int i3, TextureReleaseCallback textureReleaseCallback);

    private static native void nativeSetIntValue(long j, int i);

    private static native void nativeSetRuntimeOptionsValue(long j, byte[] bArr);

    public static native void nativeSetStringValue(long j, String str);
}
