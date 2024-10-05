package org.webrtc;

import org.webrtc.EncodedImage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface VideoEncoder {

    /* compiled from: PG */
    /* renamed from: org.webrtc.VideoEncoder$-CC, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final /* synthetic */ class CC {
        public static long $default$createNativeVideoEncoder(VideoEncoder videoEncoder) {
            return 0L;
        }

        public static ResolutionBitrateLimits[] $default$getResolutionBitrateLimits(VideoEncoder videoEncoder) {
            return new ResolutionBitrateLimits[0];
        }

        public static boolean $default$isHardwareEncoder(VideoEncoder videoEncoder) {
            return true;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class BitrateAllocation {
        public final int[][] a;

        public BitrateAllocation(int[][] iArr) {
            this.a = iArr;
        }

        public final int a() {
            int i = 0;
            for (int[] iArr : this.a) {
                for (int i2 : iArr) {
                    i += i2;
                }
            }
            return i;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface Callback {
        void a(EncodedImage encodedImage);
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class Capabilities {
        public Capabilities(boolean z) {
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class EncodeInfo {
        public final EncodedImage.FrameType[] a;

        public EncodeInfo(EncodedImage.FrameType[] frameTypeArr) {
            this.a = frameTypeArr;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class RateControlParameters {
        public final BitrateAllocation a;
        public final double b;

        public RateControlParameters(BitrateAllocation bitrateAllocation, double d) {
            this.a = bitrateAllocation;
            this.b = d;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class ResolutionBitrateLimits {
        public int getFrameSizePixels() {
            throw null;
        }

        public int getMaxBitrateBps() {
            throw null;
        }

        public int getMinBitrateBps() {
            throw null;
        }

        public int getMinStartBitrateBps() {
            throw null;
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class ScalingSettings {
        public static final ScalingSettings a = new ScalingSettings();
        public final boolean b;
        public final Integer c;
        public final Integer d;

        private ScalingSettings() {
            this.b = false;
            this.c = null;
            this.d = null;
        }

        public ScalingSettings(int i, int i2) {
            this.b = true;
            this.c = Integer.valueOf(i);
            this.d = Integer.valueOf(i2);
        }

        public final String toString() {
            if (!this.b) {
                return "OFF";
            }
            String valueOf = String.valueOf(this.c);
            String valueOf2 = String.valueOf(this.d);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 6 + String.valueOf(valueOf2).length());
            sb.append("[ ");
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            sb.append(" ]");
            return sb.toString();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class Settings {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final boolean f;

        public Settings(int i, int i2, int i3, int i4, int i5, int i6, boolean z, Capabilities capabilities) {
            this.a = i2;
            this.b = i3;
            this.c = i4;
            this.d = i5;
            this.e = i6;
            this.f = z;
        }
    }

    long createNativeVideoEncoder();

    VideoCodecStatus d(BitrateAllocation bitrateAllocation, int i);

    VideoCodecStatus encode(VideoFrame videoFrame, EncodeInfo encodeInfo);

    String getImplementationName();

    ResolutionBitrateLimits[] getResolutionBitrateLimits();

    ScalingSettings getScalingSettings();

    VideoCodecStatus initEncode(Settings settings, Callback callback);

    boolean isHardwareEncoder();

    VideoCodecStatus release();

    VideoCodecStatus setRates(RateControlParameters rateControlParameters);
}
