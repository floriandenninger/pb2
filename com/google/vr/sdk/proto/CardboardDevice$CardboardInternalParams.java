package com.google.vr.sdk.proto;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aonq;
import defpackage.aonr;
import defpackage.aons;
import defpackage.aonu;
import defpackage.aonv;
import defpackage.aooz;
import defpackage.aopf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CardboardDevice$CardboardInternalParams extends aonm implements aooz {
    public static final int ACCELEROMETER_FIELD_NUMBER = 5;
    private static final CardboardDevice$CardboardInternalParams DEFAULT_INSTANCE;
    public static final int EYE_ORIENTATIONS_FIELD_NUMBER = 1;
    public static final int GYROSCOPE_FIELD_NUMBER = 6;
    private static volatile aopf PARSER = null;
    public static final int SCREEN_CENTER_TO_LENS_DISTANCE_FIELD_NUMBER = 2;
    public static final int X_PPI_OVERRIDE_FIELD_NUMBER = 3;
    public static final int Y_PPI_OVERRIDE_FIELD_NUMBER = 4;
    private static final aonv eyeOrientations_converter_ = new aonv() { // from class: com.google.vr.sdk.proto.CardboardDevice$CardboardInternalParams.1
        @Override // defpackage.aonv
        public OrientationType convert(Integer num) {
            OrientationType forNumber = OrientationType.forNumber(num.intValue());
            return forNumber == null ? OrientationType.CCW_0_DEGREES : forNumber;
        }
    };
    private int bitField0_;
    private int eyeOrientationsMemoizedSerializedSize;
    private float screenCenterToLensDistance_;
    private float xPpiOverride_;
    private float yPpiOverride_;
    private aonu eyeOrientations_ = emptyIntList();
    private String accelerometer_ = "";
    private String gyroscope_ = "";

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aone implements aooz {
        private Builder() {
            super(CardboardDevice$CardboardInternalParams.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(CardboardDevice$1 cardboardDevice$1) {
            this();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public enum OrientationType implements aonq {
        CCW_0_DEGREES(0),
        CCW_90_DEGREES(1),
        CCW_180_DEGREES(2),
        CCW_270_DEGREES(3),
        CCW_0_DEGREES_MIRRORED(4),
        CCW_90_DEGREES_MIRRORED(5),
        CCW_180_DEGREES_MIRRORED(6),
        CCW_270_DEGREES_MIRRORED(7);

        public static final int CCW_0_DEGREES_MIRRORED_VALUE = 4;
        public static final int CCW_0_DEGREES_VALUE = 0;
        public static final int CCW_180_DEGREES_MIRRORED_VALUE = 6;
        public static final int CCW_180_DEGREES_VALUE = 2;
        public static final int CCW_270_DEGREES_MIRRORED_VALUE = 7;
        public static final int CCW_270_DEGREES_VALUE = 3;
        public static final int CCW_90_DEGREES_MIRRORED_VALUE = 5;
        public static final int CCW_90_DEGREES_VALUE = 1;
        private static final aonr internalValueMap = new aonr() { // from class: com.google.vr.sdk.proto.CardboardDevice.CardboardInternalParams.OrientationType.1
            @Override // defpackage.aonr
            public OrientationType findValueByNumber(int i) {
                return OrientationType.forNumber(i);
            }
        };
        private final int value;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* loaded from: classes3.dex */
        public final class OrientationTypeVerifier implements aons {
            static final aons INSTANCE = new OrientationTypeVerifier();

            private OrientationTypeVerifier() {
            }

            @Override // defpackage.aons
            public boolean isInRange(int i) {
                return OrientationType.forNumber(i) != null;
            }
        }

        OrientationType(int i) {
            this.value = i;
        }

        public static OrientationType forNumber(int i) {
            switch (i) {
                case 0:
                    return CCW_0_DEGREES;
                case 1:
                    return CCW_90_DEGREES;
                case 2:
                    return CCW_180_DEGREES;
                case 3:
                    return CCW_270_DEGREES;
                case 4:
                    return CCW_0_DEGREES_MIRRORED;
                case 5:
                    return CCW_90_DEGREES_MIRRORED;
                case 6:
                    return CCW_180_DEGREES_MIRRORED;
                case 7:
                    return CCW_270_DEGREES_MIRRORED;
                default:
                    return null;
            }
        }

        public static aons internalGetVerifier() {
            return OrientationTypeVerifier.INSTANCE;
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
        CardboardDevice$CardboardInternalParams cardboardDevice$CardboardInternalParams = new CardboardDevice$CardboardInternalParams();
        DEFAULT_INSTANCE = cardboardDevice$CardboardInternalParams;
        aonm.registerDefaultInstance(CardboardDevice$CardboardInternalParams.class, cardboardDevice$CardboardInternalParams);
    }

    private CardboardDevice$CardboardInternalParams() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001,\u0002ခ\u0000\u0003ခ\u0001\u0004ခ\u0002\u0005ဈ\u0003\u0006ဈ\u0004", new Object[]{"bitField0_", "eyeOrientations_", OrientationType.internalGetVerifier(), "screenCenterToLensDistance_", "xPpiOverride_", "yPpiOverride_", "accelerometer_", "gyroscope_"});
            case NEW_MUTABLE_INSTANCE:
                return new CardboardDevice$CardboardInternalParams();
            case NEW_BUILDER:
                return new Builder(cardboardDevice$1);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                aopf aopfVar = PARSER;
                if (aopfVar == null) {
                    synchronized (CardboardDevice$CardboardInternalParams.class) {
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
