package com.google.vr.sdk.proto;

import defpackage.aolo;
import defpackage.aomw;
import defpackage.aone;
import defpackage.aonf;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aonq;
import defpackage.aonr;
import defpackage.aons;
import defpackage.aont;
import defpackage.aooz;
import defpackage.aopf;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CardboardDevice$DeviceParams extends aonm implements aooz {
    public static final int BLUE_DISTORTION_COEFFICIENTS_FIELD_NUMBER = 9;
    public static final int DAYDREAM_INTERNAL_FIELD_NUMBER = 196883;
    private static final CardboardDevice$DeviceParams DEFAULT_INSTANCE;
    public static final int DISTORTION_COEFFICIENTS_FIELD_NUMBER = 7;
    public static final int FREEFORM_DISTORTION_FIELD_NUMBER = 13;
    public static final int GREEN_DISTORTION_COEFFICIENTS_FIELD_NUMBER = 8;
    public static final int HAS_MAGNET_FIELD_NUMBER = 10;
    public static final int INTERNAL_FIELD_NUMBER = 1729;
    public static final int INTER_LENS_DISTANCE_FIELD_NUMBER = 4;
    public static final int LEFT_EYE_FIELD_OF_VIEW_ANGLES_FIELD_NUMBER = 5;
    public static final int MODEL_FIELD_NUMBER = 2;
    private static volatile aopf PARSER = null;
    public static final int PRIMARY_BUTTON_FIELD_NUMBER = 12;
    public static final int SCREEN_TO_LENS_DISTANCE_FIELD_NUMBER = 3;
    public static final int TRAY_TO_LENS_DISTANCE_FIELD_NUMBER = 6;
    public static final int VENDOR_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 11;
    private int bitField0_;
    private CardboardDevice$DaydreamInternalParams daydreamInternal_;
    private CardboardDevice$FreeformDistortion freeformDistortion_;
    private boolean hasMagnet_;
    private float interLensDistance_;
    private CardboardDevice$CardboardInternalParams internal_;
    private float screenToLensDistance_;
    private float trayToLensDistance_;
    private int verticalAlignment_;
    private int leftEyeFieldOfViewAnglesMemoizedSerializedSize = -1;
    private int distortionCoefficientsMemoizedSerializedSize = -1;
    private int greenDistortionCoefficientsMemoizedSerializedSize = -1;
    private int blueDistortionCoefficientsMemoizedSerializedSize = -1;
    private String vendor_ = "";
    private String model_ = "";
    private aont leftEyeFieldOfViewAngles_ = emptyFloatList();
    private aont distortionCoefficients_ = emptyFloatList();
    private aont greenDistortionCoefficients_ = emptyFloatList();
    private aont blueDistortionCoefficients_ = emptyFloatList();
    private int primaryButton_ = 1;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aone implements aooz {
        private Builder() {
            super(CardboardDevice$DeviceParams.DEFAULT_INSTANCE);
        }

        public Builder addAllDistortionCoefficients(Iterable iterable) {
            copyOnWrite();
            ((CardboardDevice$DeviceParams) this.instance).addAllDistortionCoefficients(iterable);
            return this;
        }

        public Builder addAllLeftEyeFieldOfViewAngles(Iterable iterable) {
            copyOnWrite();
            ((CardboardDevice$DeviceParams) this.instance).addAllLeftEyeFieldOfViewAngles(iterable);
            return this;
        }

        public Builder clearDistortionCoefficients() {
            copyOnWrite();
            ((CardboardDevice$DeviceParams) this.instance).clearDistortionCoefficients();
            return this;
        }

        public Builder clearLeftEyeFieldOfViewAngles() {
            copyOnWrite();
            ((CardboardDevice$DeviceParams) this.instance).clearLeftEyeFieldOfViewAngles();
            return this;
        }

        public Builder setHasMagnet(boolean z) {
            copyOnWrite();
            ((CardboardDevice$DeviceParams) this.instance).setHasMagnet(true);
            return this;
        }

        public Builder setInterLensDistance(float f) {
            copyOnWrite();
            ((CardboardDevice$DeviceParams) this.instance).setInterLensDistance(f);
            return this;
        }

        public Builder setModel(String str) {
            copyOnWrite();
            ((CardboardDevice$DeviceParams) this.instance).setModel(str);
            return this;
        }

        public Builder setScreenToLensDistance(float f) {
            copyOnWrite();
            ((CardboardDevice$DeviceParams) this.instance).setScreenToLensDistance(f);
            return this;
        }

        public Builder setTrayToLensDistance(float f) {
            copyOnWrite();
            ((CardboardDevice$DeviceParams) this.instance).setTrayToLensDistance(f);
            return this;
        }

        public Builder setVendor(String str) {
            copyOnWrite();
            ((CardboardDevice$DeviceParams) this.instance).setVendor(str);
            return this;
        }

        public Builder setVerticalAlignment(VerticalAlignmentType verticalAlignmentType) {
            copyOnWrite();
            ((CardboardDevice$DeviceParams) this.instance).setVerticalAlignment(verticalAlignmentType);
            return this;
        }

        public /* synthetic */ Builder(CardboardDevice$1 cardboardDevice$1) {
            this();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public enum ButtonType implements aonq {
        NONE(0),
        MAGNET(1),
        TOUCH(2),
        INDIRECT_TOUCH(3);

        public static final int INDIRECT_TOUCH_VALUE = 3;
        public static final int MAGNET_VALUE = 1;
        public static final int NONE_VALUE = 0;
        public static final int TOUCH_VALUE = 2;
        private static final aonr internalValueMap = new aonr() { // from class: com.google.vr.sdk.proto.CardboardDevice.DeviceParams.ButtonType.1
            @Override // defpackage.aonr
            public ButtonType findValueByNumber(int i) {
                return ButtonType.forNumber(i);
            }
        };
        private final int value;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* loaded from: classes3.dex */
        public final class ButtonTypeVerifier implements aons {
            static final aons INSTANCE = new ButtonTypeVerifier();

            private ButtonTypeVerifier() {
            }

            @Override // defpackage.aons
            public boolean isInRange(int i) {
                return ButtonType.forNumber(i) != null;
            }
        }

        ButtonType(int i) {
            this.value = i;
        }

        public static ButtonType forNumber(int i) {
            if (i == 0) {
                return NONE;
            }
            if (i == 1) {
                return MAGNET;
            }
            if (i == 2) {
                return TOUCH;
            }
            if (i != 3) {
                return null;
            }
            return INDIRECT_TOUCH;
        }

        public static aons internalGetVerifier() {
            return ButtonTypeVerifier.INSTANCE;
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

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public enum VerticalAlignmentType implements aonq {
        BOTTOM(0),
        CENTER(1),
        TOP(2);

        public static final int BOTTOM_VALUE = 0;
        public static final int CENTER_VALUE = 1;
        public static final int TOP_VALUE = 2;
        private static final aonr internalValueMap = new aonr() { // from class: com.google.vr.sdk.proto.CardboardDevice.DeviceParams.VerticalAlignmentType.1
            @Override // defpackage.aonr
            public VerticalAlignmentType findValueByNumber(int i) {
                return VerticalAlignmentType.forNumber(i);
            }
        };
        private final int value;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* loaded from: classes3.dex */
        public final class VerticalAlignmentTypeVerifier implements aons {
            static final aons INSTANCE = new VerticalAlignmentTypeVerifier();

            private VerticalAlignmentTypeVerifier() {
            }

            @Override // defpackage.aons
            public boolean isInRange(int i) {
                return VerticalAlignmentType.forNumber(i) != null;
            }
        }

        VerticalAlignmentType(int i) {
            this.value = i;
        }

        public static VerticalAlignmentType forNumber(int i) {
            if (i == 0) {
                return BOTTOM;
            }
            if (i == 1) {
                return CENTER;
            }
            if (i != 2) {
                return null;
            }
            return TOP;
        }

        public static aons internalGetVerifier() {
            return VerticalAlignmentTypeVerifier.INSTANCE;
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
        CardboardDevice$DeviceParams cardboardDevice$DeviceParams = new CardboardDevice$DeviceParams();
        DEFAULT_INSTANCE = cardboardDevice$DeviceParams;
        aonm.registerDefaultInstance(CardboardDevice$DeviceParams.class, cardboardDevice$DeviceParams);
    }

    private CardboardDevice$DeviceParams() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDistortionCoefficients(Iterable iterable) {
        ensureDistortionCoefficientsIsMutable();
        aolo.addAll(iterable, (List) this.distortionCoefficients_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLeftEyeFieldOfViewAngles(Iterable iterable) {
        ensureLeftEyeFieldOfViewAnglesIsMutable();
        aolo.addAll(iterable, (List) this.leftEyeFieldOfViewAngles_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDistortionCoefficients() {
        this.distortionCoefficients_ = emptyFloatList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLeftEyeFieldOfViewAngles() {
        this.leftEyeFieldOfViewAngles_ = emptyFloatList();
    }

    private void ensureDistortionCoefficientsIsMutable() {
        aont aontVar = this.distortionCoefficients_;
        if (aontVar.c()) {
            return;
        }
        this.distortionCoefficients_ = aonm.mutableCopy(aontVar);
    }

    private void ensureLeftEyeFieldOfViewAnglesIsMutable() {
        aont aontVar = this.leftEyeFieldOfViewAngles_;
        if (aontVar.c()) {
            return;
        }
        this.leftEyeFieldOfViewAngles_ = aonm.mutableCopy(aontVar);
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static CardboardDevice$DeviceParams parseFrom(byte[] bArr, aomw aomwVar) {
        return (CardboardDevice$DeviceParams) aonm.parseFrom(DEFAULT_INSTANCE, bArr, aomwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHasMagnet(boolean z) {
        this.bitField0_ |= 64;
        this.hasMagnet_ = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInterLensDistance(float f) {
        this.bitField0_ |= 8;
        this.interLensDistance_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModel(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.model_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenToLensDistance(float f) {
        this.bitField0_ |= 4;
        this.screenToLensDistance_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrayToLensDistance(float f) {
        this.bitField0_ |= 32;
        this.trayToLensDistance_ = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVendor(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.vendor_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerticalAlignment(VerticalAlignmentType verticalAlignmentType) {
        this.verticalAlignment_ = verticalAlignmentType.getNumber();
        this.bitField0_ |= 16;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000f\u0000\u0001\u0001\ue113\u0018\u000f\u0000\u0004\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005$\u0006ခ\u0005\u0007$\b$\t$\nဇ\u0006\u000bဌ\u0004\fဌ\u0007\rဉ\bہဉ\t\ue113\u0018ဉ\n", new Object[]{"bitField0_", "vendor_", "model_", "screenToLensDistance_", "interLensDistance_", "leftEyeFieldOfViewAngles_", "trayToLensDistance_", "distortionCoefficients_", "greenDistortionCoefficients_", "blueDistortionCoefficients_", "hasMagnet_", "verticalAlignment_", VerticalAlignmentType.internalGetVerifier(), "primaryButton_", ButtonType.internalGetVerifier(), "freeformDistortion_", "internal_", "daydreamInternal_"});
            case NEW_MUTABLE_INSTANCE:
                return new CardboardDevice$DeviceParams();
            case NEW_BUILDER:
                return new Builder(cardboardDevice$1);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                aopf aopfVar = PARSER;
                if (aopfVar == null) {
                    synchronized (CardboardDevice$DeviceParams.class) {
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

    public CardboardDevice$DaydreamInternalParams getDaydreamInternal() {
        CardboardDevice$DaydreamInternalParams cardboardDevice$DaydreamInternalParams = this.daydreamInternal_;
        return cardboardDevice$DaydreamInternalParams == null ? CardboardDevice$DaydreamInternalParams.getDefaultInstance() : cardboardDevice$DaydreamInternalParams;
    }

    public List getDistortionCoefficientsList() {
        return this.distortionCoefficients_;
    }

    public boolean getHasMagnet() {
        return this.hasMagnet_;
    }

    public float getInterLensDistance() {
        return this.interLensDistance_;
    }

    public List getLeftEyeFieldOfViewAnglesList() {
        return this.leftEyeFieldOfViewAngles_;
    }

    public String getModel() {
        return this.model_;
    }

    public float getScreenToLensDistance() {
        return this.screenToLensDistance_;
    }

    public float getTrayToLensDistance() {
        return this.trayToLensDistance_;
    }

    public String getVendor() {
        return this.vendor_;
    }

    public VerticalAlignmentType getVerticalAlignment() {
        VerticalAlignmentType forNumber = VerticalAlignmentType.forNumber(this.verticalAlignment_);
        return forNumber == null ? VerticalAlignmentType.BOTTOM : forNumber;
    }

    public boolean hasDaydreamInternal() {
        return (this.bitField0_ & 1024) != 0;
    }
}
