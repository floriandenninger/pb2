package com.google.vr.sdk.proto;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aonq;
import defpackage.aonr;
import defpackage.aons;
import defpackage.aooz;
import defpackage.aopf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Preferences$DeveloperPrefs extends aonm implements aooz {
    public static final int ALLOW_AR_SESSION_UPDATE_FIELD_NUMBER = 17;
    public static final int CAPTURE_ENABLED_FIELD_NUMBER = 9;
    private static final Preferences$DeveloperPrefs DEFAULT_INSTANCE;
    public static final int DEPRECATED_GVR_PLATFORM_LIBRARY_ENABLED_FIELD_NUMBER = 7;
    public static final int DEPRECATED_HEAD_TRACKING_SERVICE_ENABLED_FIELD_NUMBER = 8;
    public static final int DEPRECATED_MOTOPHO_PATCH_ENABLED_FIELD_NUMBER = 3;
    public static final int DEVELOPER_LOGGING_ENABLED_FIELD_NUMBER = 4;
    public static final int FORCE_UNDISTORTED_RENDERING_FIELD_NUMBER = 5;
    public static final int FRAME_TRACKER_ENABLED_FIELD_NUMBER = 11;
    public static final int MOTOPHO_PATCH_MODE_FIELD_NUMBER = 12;
    public static final int OPENGL_KHR_DEBUG_ENABLED_FIELD_NUMBER = 14;
    private static volatile aopf PARSER = null;
    public static final int PERFORMANCE_HUD_ENABLED_FIELD_NUMBER = 6;
    public static final int PERFORMANCE_LOGGING_ACTIVATED_FIELD_NUMBER = 13;
    public static final int PERFORMANCE_MONITORING_ENABLED_FIELD_NUMBER = 1;
    public static final int PLAY_AREA_SETTINGS_FIELD_NUMBER = 16;
    public static final int SAFETY_CYLINDER_PARAMS_FIELD_NUMBER = 10;
    public static final int SENSOR_LOGGING_ENABLED_FIELD_NUMBER = 2;
    public static final int TRACKING_CONFIGURATION_PARAMS_FIELD_NUMBER = 15;
    private boolean allowArSessionUpdate_;
    private int bitField0_;
    private boolean captureEnabled_;
    private boolean dEPRECATEDGvrPlatformLibraryEnabled_;
    private boolean dEPRECATEDHeadTrackingServiceEnabled_;
    private boolean dEPRECATEDMotophoPatchEnabled_;
    private boolean developerLoggingEnabled_;
    private boolean forceUndistortedRendering_;
    private boolean frameTrackerEnabled_;
    private int motophoPatchMode_;
    private boolean openglKhrDebugEnabled_;
    private boolean performanceHudEnabled_;
    private boolean performanceLoggingActivated_;
    private boolean performanceMonitoringEnabled_;
    private Preferences$PlayAreaSettings playAreaSettings_;
    private Preferences$SafetyCylinderParams safetyCylinderParams_;
    private boolean sensorLoggingEnabled_;
    private Preferences$TrackingConfigurationParams trackingConfigurationParams_;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aone implements aooz {
        private Builder() {
            super(Preferences$DeveloperPrefs.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(Preferences$1 preferences$1) {
            this();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public enum MotophoPatchMode implements aonq {
        NONE(0),
        VELOCITY(1),
        IMPULSE(2);

        public static final int IMPULSE_VALUE = 2;
        public static final int NONE_VALUE = 0;
        public static final int VELOCITY_VALUE = 1;
        private static final aonr internalValueMap = new aonr() { // from class: com.google.vr.sdk.proto.Preferences.DeveloperPrefs.MotophoPatchMode.1
            @Override // defpackage.aonr
            public MotophoPatchMode findValueByNumber(int i) {
                return MotophoPatchMode.forNumber(i);
            }
        };
        private final int value;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* loaded from: classes3.dex */
        public final class MotophoPatchModeVerifier implements aons {
            static final aons INSTANCE = new MotophoPatchModeVerifier();

            private MotophoPatchModeVerifier() {
            }

            @Override // defpackage.aons
            public boolean isInRange(int i) {
                return MotophoPatchMode.forNumber(i) != null;
            }
        }

        MotophoPatchMode(int i) {
            this.value = i;
        }

        public static MotophoPatchMode forNumber(int i) {
            if (i == 0) {
                return NONE;
            }
            if (i == 1) {
                return VELOCITY;
            }
            if (i != 2) {
                return null;
            }
            return IMPULSE;
        }

        public static aons internalGetVerifier() {
            return MotophoPatchModeVerifier.INSTANCE;
        }

        @Override // defpackage.aonq
        public final int getNumber() {
            return this.value;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(getNumber());
        }
    }

    static {
        Preferences$DeveloperPrefs preferences$DeveloperPrefs = new Preferences$DeveloperPrefs();
        DEFAULT_INSTANCE = preferences$DeveloperPrefs;
        aonm.registerDefaultInstance(Preferences$DeveloperPrefs.class, preferences$DeveloperPrefs);
    }

    private Preferences$DeveloperPrefs() {
    }

    public static Preferences$DeveloperPrefs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        Preferences$1 preferences$1 = null;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nဉ\t\u000bဇ\n\fဌ\u000b\rဇ\f\u000eဇ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011ဇ\u0010", new Object[]{"bitField0_", "performanceMonitoringEnabled_", "sensorLoggingEnabled_", "dEPRECATEDMotophoPatchEnabled_", "developerLoggingEnabled_", "forceUndistortedRendering_", "performanceHudEnabled_", "dEPRECATEDGvrPlatformLibraryEnabled_", "dEPRECATEDHeadTrackingServiceEnabled_", "captureEnabled_", "safetyCylinderParams_", "frameTrackerEnabled_", "motophoPatchMode_", MotophoPatchMode.internalGetVerifier(), "performanceLoggingActivated_", "openglKhrDebugEnabled_", "trackingConfigurationParams_", "playAreaSettings_", "allowArSessionUpdate_"});
            case NEW_MUTABLE_INSTANCE:
                return new Preferences$DeveloperPrefs();
            case NEW_BUILDER:
                return new Builder(preferences$1);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                aopf aopfVar = PARSER;
                if (aopfVar == null) {
                    synchronized (Preferences$DeveloperPrefs.class) {
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

    public boolean getOpenglKhrDebugEnabled() {
        return this.openglKhrDebugEnabled_;
    }
}
