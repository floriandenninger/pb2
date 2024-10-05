package com.google.vr.sdk.proto;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Preferences$TrackingConfigurationParams extends aonm implements aooz {
    public static final int CONTROLLER_CONFIG_TYPE_FIELD_NUMBER = 1;
    private static final Preferences$TrackingConfigurationParams DEFAULT_INSTANCE;
    private static volatile aopf PARSER;
    private int bitField0_;
    private int controllerConfigType_;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aone implements aooz {
        private Builder() {
            super(Preferences$TrackingConfigurationParams.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(Preferences$1 preferences$1) {
            this();
        }
    }

    static {
        Preferences$TrackingConfigurationParams preferences$TrackingConfigurationParams = new Preferences$TrackingConfigurationParams();
        DEFAULT_INSTANCE = preferences$TrackingConfigurationParams;
        aonm.registerDefaultInstance(Preferences$TrackingConfigurationParams.class, preferences$TrackingConfigurationParams);
    }

    private Preferences$TrackingConfigurationParams() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"bitField0_", "controllerConfigType_", Preferences$ControllerConfigurationType.internalGetVerifier()});
            case NEW_MUTABLE_INSTANCE:
                return new Preferences$TrackingConfigurationParams();
            case NEW_BUILDER:
                return new Builder(preferences$1);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                aopf aopfVar = PARSER;
                if (aopfVar == null) {
                    synchronized (Preferences$TrackingConfigurationParams.class) {
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
