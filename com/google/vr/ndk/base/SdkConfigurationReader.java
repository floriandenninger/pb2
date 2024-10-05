package com.google.vr.ndk.base;

import android.content.Context;
import android.util.Log;
import com.google.vr.sdk.proto.SdkConfiguration$SdkConfigurationRequest;
import defpackage.ancv;
import defpackage.ancy;
import defpackage.anda;
import defpackage.andb;
import defpackage.aone;
import defpackage.awxr;
import defpackage.axhe;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SdkConfigurationReader {
    public static final andb DEFAULT_PARAMS;
    static final andb REQUESTED_PARAMS;
    static andb sParams;

    static {
        aone createBuilder = andb.DEFAULT_INSTANCE.createBuilder();
        createBuilder.copyOnWrite();
        andb andbVar = (andb) createBuilder.instance;
        andbVar.bitField0_ |= 2;
        andbVar.useSystemClockForSensorTimestamps_ = true;
        createBuilder.copyOnWrite();
        andb andbVar2 = (andb) createBuilder.instance;
        andbVar2.bitField0_ |= 4;
        andbVar2.useMagnetometerInSensorFusion_ = true;
        createBuilder.copyOnWrite();
        andb andbVar3 = (andb) createBuilder.instance;
        andbVar3.bitField0_ |= 512;
        andbVar3.useStationaryBiasCorrection_ = true;
        createBuilder.copyOnWrite();
        andb andbVar4 = (andb) createBuilder.instance;
        andbVar4.bitField0_ |= 8;
        andbVar4.allowDynamicLibraryLoading_ = true;
        createBuilder.copyOnWrite();
        andb andbVar5 = (andb) createBuilder.instance;
        andbVar5.bitField0_ |= 16;
        andbVar5.cpuLateLatchingEnabled_ = true;
        ancy ancyVar = ancy.DISABLED;
        createBuilder.copyOnWrite();
        andb andbVar6 = (andb) createBuilder.instance;
        andbVar6.daydreamImageAlignment_ = ancyVar.value;
        andbVar6.bitField0_ |= 32;
        ancv ancvVar = ancv.DEFAULT_INSTANCE;
        createBuilder.copyOnWrite();
        andb andbVar7 = (andb) createBuilder.instance;
        ancvVar.getClass();
        andbVar7.asyncReprojectionConfig_ = ancvVar;
        andbVar7.bitField0_ |= 64;
        createBuilder.copyOnWrite();
        andb andbVar8 = (andb) createBuilder.instance;
        andbVar8.bitField0_ |= 128;
        andbVar8.useOnlineMagnetometerCalibration_ = true;
        createBuilder.copyOnWrite();
        andb andbVar9 = (andb) createBuilder.instance;
        andbVar9.bitField0_ |= 256;
        andbVar9.useDeviceIdleDetection_ = true;
        createBuilder.copyOnWrite();
        andb andbVar10 = (andb) createBuilder.instance;
        andbVar10.bitField0_ |= 1024;
        andbVar10.allowDynamicJavaLibraryLoading_ = true;
        createBuilder.copyOnWrite();
        andb andbVar11 = (andb) createBuilder.instance;
        andbVar11.bitField0_ |= 2048;
        andbVar11.touchOverlayEnabled_ = true;
        createBuilder.copyOnWrite();
        andb andbVar12 = (andb) createBuilder.instance;
        andbVar12.bitField0_ |= 32768;
        andbVar12.enableForcedTrackingCompat_ = true;
        createBuilder.copyOnWrite();
        andb andbVar13 = (andb) createBuilder.instance;
        andbVar13.bitField0_ |= 4096;
        andbVar13.allowVrcoreHeadTracking_ = true;
        createBuilder.copyOnWrite();
        andb andbVar14 = (andb) createBuilder.instance;
        andbVar14.bitField0_ |= 8192;
        andbVar14.allowVrcoreCompositing_ = true;
        anda andaVar = anda.DEFAULT_INSTANCE;
        createBuilder.copyOnWrite();
        andb andbVar15 = (andb) createBuilder.instance;
        andaVar.getClass();
        andbVar15.screenCaptureConfig_ = andaVar;
        andbVar15.bitField0_ |= 65536;
        createBuilder.copyOnWrite();
        andb andbVar16 = (andb) createBuilder.instance;
        andbVar16.bitField0_ |= 262144;
        andbVar16.dimUiLayer_ = true;
        createBuilder.copyOnWrite();
        andb andbVar17 = (andb) createBuilder.instance;
        andbVar17.bitField0_ |= 131072;
        andbVar17.disallowMultiview_ = true;
        createBuilder.copyOnWrite();
        andb andbVar18 = (andb) createBuilder.instance;
        andbVar18.bitField0_ |= 524288;
        andbVar18.useDirectModeSensors_ = true;
        createBuilder.copyOnWrite();
        andb andbVar19 = (andb) createBuilder.instance;
        andbVar19.bitField0_ |= 1048576;
        andbVar19.allowPassthrough_ = true;
        createBuilder.copyOnWrite();
        andb.a((andb) createBuilder.instance);
        REQUESTED_PARAMS = (andb) createBuilder.build();
        aone createBuilder2 = andb.DEFAULT_INSTANCE.createBuilder();
        createBuilder2.copyOnWrite();
        andb andbVar20 = (andb) createBuilder2.instance;
        andbVar20.bitField0_ |= 2;
        andbVar20.useSystemClockForSensorTimestamps_ = false;
        createBuilder2.copyOnWrite();
        andb andbVar21 = (andb) createBuilder2.instance;
        andbVar21.bitField0_ |= 4;
        andbVar21.useMagnetometerInSensorFusion_ = false;
        createBuilder2.copyOnWrite();
        andb andbVar22 = (andb) createBuilder2.instance;
        andbVar22.bitField0_ |= 512;
        andbVar22.useStationaryBiasCorrection_ = false;
        createBuilder2.copyOnWrite();
        andb andbVar23 = (andb) createBuilder2.instance;
        andbVar23.bitField0_ |= 8;
        andbVar23.allowDynamicLibraryLoading_ = false;
        createBuilder2.copyOnWrite();
        andb andbVar24 = (andb) createBuilder2.instance;
        andbVar24.bitField0_ |= 16;
        andbVar24.cpuLateLatchingEnabled_ = false;
        ancy ancyVar2 = ancy.ENABLED_WITH_MEDIAN_FILTER;
        createBuilder2.copyOnWrite();
        andb andbVar25 = (andb) createBuilder2.instance;
        andbVar25.daydreamImageAlignment_ = ancyVar2.value;
        andbVar25.bitField0_ |= 32;
        createBuilder2.copyOnWrite();
        andb andbVar26 = (andb) createBuilder2.instance;
        andbVar26.bitField0_ |= 128;
        andbVar26.useOnlineMagnetometerCalibration_ = false;
        createBuilder2.copyOnWrite();
        andb andbVar27 = (andb) createBuilder2.instance;
        andbVar27.bitField0_ |= 256;
        andbVar27.useDeviceIdleDetection_ = false;
        createBuilder2.copyOnWrite();
        andb andbVar28 = (andb) createBuilder2.instance;
        andbVar28.bitField0_ |= 1024;
        andbVar28.allowDynamicJavaLibraryLoading_ = false;
        createBuilder2.copyOnWrite();
        andb andbVar29 = (andb) createBuilder2.instance;
        andbVar29.bitField0_ |= 2048;
        andbVar29.touchOverlayEnabled_ = false;
        createBuilder2.copyOnWrite();
        andb andbVar30 = (andb) createBuilder2.instance;
        andbVar30.bitField0_ |= 32768;
        andbVar30.enableForcedTrackingCompat_ = false;
        createBuilder2.copyOnWrite();
        andb andbVar31 = (andb) createBuilder2.instance;
        andbVar31.bitField0_ |= 4096;
        andbVar31.allowVrcoreHeadTracking_ = false;
        createBuilder2.copyOnWrite();
        andb andbVar32 = (andb) createBuilder2.instance;
        andbVar32.bitField0_ |= 8192;
        andbVar32.allowVrcoreCompositing_ = false;
        createBuilder2.copyOnWrite();
        andb andbVar33 = (andb) createBuilder2.instance;
        andbVar33.bitField0_ |= 262144;
        andbVar33.dimUiLayer_ = false;
        createBuilder2.copyOnWrite();
        andb andbVar34 = (andb) createBuilder2.instance;
        andbVar34.bitField0_ |= 131072;
        andbVar34.disallowMultiview_ = false;
        createBuilder2.copyOnWrite();
        andb andbVar35 = (andb) createBuilder2.instance;
        andbVar35.bitField0_ |= 524288;
        andbVar35.useDirectModeSensors_ = false;
        createBuilder2.copyOnWrite();
        andb andbVar36 = (andb) createBuilder2.instance;
        andbVar36.bitField0_ |= 1048576;
        andbVar36.allowPassthrough_ = false;
        createBuilder2.copyOnWrite();
        andb.a((andb) createBuilder2.instance);
        DEFAULT_PARAMS = (andb) createBuilder2.build();
    }

    public static andb getParams(Context context) {
        synchronized (SdkConfigurationReader.class) {
            andb andbVar = sParams;
            if (andbVar != null) {
                return andbVar;
            }
            axhe h = awxr.h(context);
            andb readParamsFromProvider = readParamsFromProvider(h);
            synchronized (SdkConfigurationReader.class) {
                sParams = readParamsFromProvider;
            }
            h.f();
            return sParams;
        }
    }

    private static andb readParamsFromProvider(axhe axheVar) {
        SdkConfiguration$SdkConfigurationRequest.Builder newBuilder = SdkConfiguration$SdkConfigurationRequest.newBuilder();
        newBuilder.setRequestedParams(REQUESTED_PARAMS);
        newBuilder.setSdkVersion("1.218.0");
        andb a = axheVar.a((SdkConfiguration$SdkConfigurationRequest) newBuilder.build());
        if (a == null) {
            Log.w("SdkConfigurationReader", "VrParamsProvider returned null params, using defaults.");
            return DEFAULT_PARAMS;
        }
        String.valueOf(String.valueOf(a)).length();
        return a;
    }
}
