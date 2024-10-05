package com.google.vr.sdk.proto;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aont;
import defpackage.aooz;
import defpackage.aopf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Display$DisplayParams extends aonm implements aooz {
    public static final int BOTTOM_BEZEL_HEIGHT_FIELD_NUMBER = 3;
    private static final Display$DisplayParams DEFAULT_INSTANCE;
    public static final int DEPRECATED_GYRO_BIAS_FIELD_NUMBER = 4;
    private static volatile aopf PARSER = null;
    public static final int X_PPI_FIELD_NUMBER = 1;
    public static final int Y_PPI_FIELD_NUMBER = 2;
    private int bitField0_;
    private float bottomBezelHeight_;
    private int dEPRECATEDGyroBiasMemoizedSerializedSize = -1;
    private aont dEPRECATEDGyroBias_ = emptyFloatList();
    private float xPpi_;
    private float yPpi_;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aone implements aooz {
        private Builder() {
            super(Display$DisplayParams.DEFAULT_INSTANCE);
        }

        public float getXPpi() {
            return ((Display$DisplayParams) this.instance).getXPpi();
        }

        public float getYPpi() {
            return ((Display$DisplayParams) this.instance).getYPpi();
        }

        public Builder setBottomBezelHeight(float f) {
            copyOnWrite();
            ((Display$DisplayParams) this.instance).setBottomBezelHeight(f);
            return this;
        }

        public Builder setXPpi(float f) {
            copyOnWrite();
            ((Display$DisplayParams) this.instance).setXPpi(f);
            return this;
        }

        public Builder setYPpi(float f) {
            copyOnWrite();
            ((Display$DisplayParams) this.instance).setYPpi(f);
            return this;
        }

        public /* synthetic */ Builder(Display$1 display$1) {
            this();
        }
    }

    static {
        Display$DisplayParams display$DisplayParams = new Display$DisplayParams();
        DEFAULT_INSTANCE = display$DisplayParams;
        aonm.registerDefaultInstance(Display$DisplayParams.class, display$DisplayParams);
    }

    private Display$DisplayParams() {
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBottomBezelHeight(float f) {
        this.bitField0_ |= 4;
        this.bottomBezelHeight_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setXPpi(float f) {
        this.bitField0_ |= 1;
        this.xPpi_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setYPpi(float f) {
        this.bitField0_ |= 2;
        this.yPpi_ = f;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        Display$1 display$1 = null;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004$", new Object[]{"bitField0_", "xPpi_", "yPpi_", "bottomBezelHeight_", "dEPRECATEDGyroBias_"});
            case NEW_MUTABLE_INSTANCE:
                return new Display$DisplayParams();
            case NEW_BUILDER:
                return new Builder(display$1);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                aopf aopfVar = PARSER;
                if (aopfVar == null) {
                    synchronized (Display$DisplayParams.class) {
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

    public float getBottomBezelHeight() {
        return this.bottomBezelHeight_;
    }

    public float getXPpi() {
        return this.xPpi_;
    }

    public float getYPpi() {
        return this.yPpi_;
    }

    public boolean hasBottomBezelHeight() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasXPpi() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasYPpi() {
        return (this.bitField0_ & 2) != 0;
    }
}
