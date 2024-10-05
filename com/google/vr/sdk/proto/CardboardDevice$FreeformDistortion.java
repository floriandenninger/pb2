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
public final class CardboardDevice$FreeformDistortion extends aonm implements aooz {
    public static final int BLUE_VIRTUAL_EYE_TAN_ANGLE_FIELD_NUMBER = 9;
    private static final CardboardDevice$FreeformDistortion DEFAULT_INSTANCE;
    public static final int EYE_TAN_ANGLE_MAX_X_FIELD_NUMBER = 4;
    public static final int EYE_TAN_ANGLE_MAX_Y_FIELD_NUMBER = 6;
    public static final int EYE_TAN_ANGLE_MIN_X_FIELD_NUMBER = 3;
    public static final int EYE_TAN_ANGLE_MIN_Y_FIELD_NUMBER = 5;
    public static final int GREEN_VIRTUAL_EYE_TAN_ANGLE_FIELD_NUMBER = 8;
    private static volatile aopf PARSER = null;
    public static final int RESOLUTION_X_FIELD_NUMBER = 1;
    public static final int RESOLUTION_Y_FIELD_NUMBER = 2;
    public static final int VIRTUAL_EYE_TAN_ANGLE_FIELD_NUMBER = 7;
    private int bitField0_;
    private float eyeTanAngleMaxX_;
    private float eyeTanAngleMaxY_;
    private float eyeTanAngleMinX_;
    private float eyeTanAngleMinY_;
    private int resolutionX_;
    private int resolutionY_;
    private aont virtualEyeTanAngle_ = emptyFloatList();
    private aont greenVirtualEyeTanAngle_ = emptyFloatList();
    private aont blueVirtualEyeTanAngle_ = emptyFloatList();

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aone implements aooz {
        private Builder() {
            super(CardboardDevice$FreeformDistortion.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(CardboardDevice$1 cardboardDevice$1) {
            this();
        }
    }

    static {
        CardboardDevice$FreeformDistortion cardboardDevice$FreeformDistortion = new CardboardDevice$FreeformDistortion();
        DEFAULT_INSTANCE = cardboardDevice$FreeformDistortion;
        aonm.registerDefaultInstance(CardboardDevice$FreeformDistortion.class, cardboardDevice$FreeformDistortion);
    }

    private CardboardDevice$FreeformDistortion() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        CardboardDevice$1 cardboardDevice$1 = null;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0003\u0000\u0001င\u0000\u0002င\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007\u0013\b\u0013\t\u0013", new Object[]{"bitField0_", "resolutionX_", "resolutionY_", "eyeTanAngleMinX_", "eyeTanAngleMaxX_", "eyeTanAngleMinY_", "eyeTanAngleMaxY_", "virtualEyeTanAngle_", "greenVirtualEyeTanAngle_", "blueVirtualEyeTanAngle_"});
            case NEW_MUTABLE_INSTANCE:
                return new CardboardDevice$FreeformDistortion();
            case NEW_BUILDER:
                return new Builder(cardboardDevice$1);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                aopf aopfVar = PARSER;
                if (aopfVar == null) {
                    synchronized (CardboardDevice$FreeformDistortion.class) {
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
