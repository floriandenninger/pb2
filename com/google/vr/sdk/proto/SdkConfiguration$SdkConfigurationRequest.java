package com.google.vr.sdk.proto;

import defpackage.andb;
import defpackage.aone;
import defpackage.aonf;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SdkConfiguration$SdkConfigurationRequest extends aonm implements aooz {
    private static final SdkConfiguration$SdkConfigurationRequest DEFAULT_INSTANCE;
    private static volatile aopf PARSER = null;
    public static final int REQUESTED_PARAMS_FIELD_NUMBER = 2;
    public static final int SDK_VERSION_FIELD_NUMBER = 1;
    private int bitField0_;
    private andb requestedParams_;
    private String sdkVersion_ = "";

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aone implements aooz {
        private Builder() {
            super(SdkConfiguration$SdkConfigurationRequest.DEFAULT_INSTANCE);
        }

        public Builder setRequestedParams(andb andbVar) {
            copyOnWrite();
            ((SdkConfiguration$SdkConfigurationRequest) this.instance).setRequestedParams(andbVar);
            return this;
        }

        public Builder setSdkVersion(String str) {
            copyOnWrite();
            ((SdkConfiguration$SdkConfigurationRequest) this.instance).setSdkVersion("1.218.0");
            return this;
        }

        public /* synthetic */ Builder(SdkConfiguration$1 sdkConfiguration$1) {
            this();
        }
    }

    static {
        SdkConfiguration$SdkConfigurationRequest sdkConfiguration$SdkConfigurationRequest = new SdkConfiguration$SdkConfigurationRequest();
        DEFAULT_INSTANCE = sdkConfiguration$SdkConfigurationRequest;
        aonm.registerDefaultInstance(SdkConfiguration$SdkConfigurationRequest.class, sdkConfiguration$SdkConfigurationRequest);
    }

    private SdkConfiguration$SdkConfigurationRequest() {
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestedParams(andb andbVar) {
        andbVar.getClass();
        this.requestedParams_ = andbVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersion(String str) {
        this.bitField0_ |= 1;
        this.sdkVersion_ = "1.218.0";
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        SdkConfiguration$1 sdkConfiguration$1 = null;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "sdkVersion_", "requestedParams_"});
            case NEW_MUTABLE_INSTANCE:
                return new SdkConfiguration$SdkConfigurationRequest();
            case NEW_BUILDER:
                return new Builder(sdkConfiguration$1);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                aopf aopfVar = PARSER;
                if (aopfVar == null) {
                    synchronized (SdkConfiguration$SdkConfigurationRequest.class) {
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
