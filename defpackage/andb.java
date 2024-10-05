package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class andb extends aonm implements aooz {
    public static final int ALLOW_DYNAMIC_JAVA_LIBRARY_LOADING_FIELD_NUMBER = 11;
    public static final int ALLOW_DYNAMIC_LIBRARY_LOADING_FIELD_NUMBER = 4;
    public static final int ALLOW_HIGH_PRIORITY_APP_RENDER_THREAD_FIELD_NUMBER = 22;
    public static final int ALLOW_PASSTHROUGH_FIELD_NUMBER = 21;
    public static final int ALLOW_VRCORE_COMPOSITING_FIELD_NUMBER = 14;
    public static final int ALLOW_VRCORE_HEAD_TRACKING_FIELD_NUMBER = 13;
    public static final int ASYNC_REPROJECTION_CONFIG_FIELD_NUMBER = 7;
    public static final int CPU_LATE_LATCHING_ENABLED_FIELD_NUMBER = 5;
    public static final int DAYDREAM_IMAGE_ALIGNMENT_ENABLED_FIELD_NUMBER = 1;
    public static final int DAYDREAM_IMAGE_ALIGNMENT_FIELD_NUMBER = 6;
    public static final andb DEFAULT_INSTANCE;
    public static final int DIM_UI_LAYER_FIELD_NUMBER = 19;
    public static final int DISALLOW_MULTIVIEW_FIELD_NUMBER = 18;
    public static final int ENABLE_FORCED_TRACKING_COMPAT_FIELD_NUMBER = 16;
    private static volatile aopf PARSER = null;
    public static final int PERFORMANCE_OVERLAY_INFO_FIELD_NUMBER = 15;
    public static final int SCREEN_CAPTURE_CONFIG_FIELD_NUMBER = 17;
    public static final int TOUCH_OVERLAY_ENABLED_FIELD_NUMBER = 12;
    public static final int USE_DEVICE_IDLE_DETECTION_FIELD_NUMBER = 9;
    public static final int USE_DIRECT_MODE_SENSORS_FIELD_NUMBER = 20;
    public static final int USE_MAGNETOMETER_IN_SENSOR_FUSION_FIELD_NUMBER = 3;
    public static final int USE_ONLINE_MAGNETOMETER_CALIBRATION_FIELD_NUMBER = 8;
    public static final int USE_STATIONARY_BIAS_CORRECTION_FIELD_NUMBER = 10;
    public static final int USE_SYSTEM_CLOCK_FOR_SENSOR_TIMESTAMPS_FIELD_NUMBER = 2;
    public boolean allowDynamicJavaLibraryLoading_;
    public boolean allowDynamicLibraryLoading_;
    private boolean allowHighPriorityAppRenderThread_;
    public boolean allowPassthrough_;
    public boolean allowVrcoreCompositing_;
    public boolean allowVrcoreHeadTracking_;
    public ancv asyncReprojectionConfig_;
    public int bitField0_;
    public boolean cpuLateLatchingEnabled_;
    private boolean daydreamImageAlignmentEnabled_;
    public int daydreamImageAlignment_;
    public boolean dimUiLayer_;
    public boolean disallowMultiview_;
    public boolean enableForcedTrackingCompat_;
    private ancz performanceOverlayInfo_;
    public anda screenCaptureConfig_;
    public boolean touchOverlayEnabled_;
    public boolean useDeviceIdleDetection_;
    public boolean useDirectModeSensors_;
    public boolean useMagnetometerInSensorFusion_;
    public boolean useOnlineMagnetometerCalibration_;
    public boolean useStationaryBiasCorrection_;
    public boolean useSystemClockForSensorTimestamps_;

    static {
        andb andbVar = new andb();
        DEFAULT_INSTANCE = andbVar;
        aonm.registerDefaultInstance(andb.class, andbVar);
    }

    private andb() {
    }

    public static /* synthetic */ void a(andb andbVar) {
        andbVar.bitField0_ |= 2097152;
        andbVar.allowHighPriorityAppRenderThread_ = true;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဌ\u0005\u0007ဉ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bဇ\n\fဇ\u000b\rဇ\f\u000eဇ\r\u000fဉ\u000e\u0010ဇ\u000f\u0011ဉ\u0010\u0012ဇ\u0011\u0013ဇ\u0012\u0014ဇ\u0013\u0015ဇ\u0014\u0016ဇ\u0015", new Object[]{"bitField0_", "daydreamImageAlignmentEnabled_", "useSystemClockForSensorTimestamps_", "useMagnetometerInSensorFusion_", "allowDynamicLibraryLoading_", "cpuLateLatchingEnabled_", "daydreamImageAlignment_", ancy.b(), "asyncReprojectionConfig_", "useOnlineMagnetometerCalibration_", "useDeviceIdleDetection_", "useStationaryBiasCorrection_", "allowDynamicJavaLibraryLoading_", "touchOverlayEnabled_", "allowVrcoreHeadTracking_", "allowVrcoreCompositing_", "performanceOverlayInfo_", "enableForcedTrackingCompat_", "screenCaptureConfig_", "disallowMultiview_", "dimUiLayer_", "useDirectModeSensors_", "allowPassthrough_", "allowHighPriorityAppRenderThread_"});
            case NEW_MUTABLE_INSTANCE:
                return new andb();
            case NEW_BUILDER:
                return new aone(DEFAULT_INSTANCE);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                aopf aopfVar = PARSER;
                if (aopfVar == null) {
                    synchronized (andb.class) {
                        aopfVar = PARSER;
                        if (aopfVar == null) {
                            aopfVar = new aonf(DEFAULT_INSTANCE);
                            PARSER = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
