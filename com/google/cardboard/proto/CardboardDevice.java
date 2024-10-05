package com.google.cardboard.proto;

import defpackage.aolo;
import defpackage.aomf;
import defpackage.aomk;
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
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CardboardDevice {

    /* compiled from: PG */
    /* renamed from: com.google.cardboard.proto.CardboardDevice$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[aonl.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[aonl.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[aonl.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[aonl.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[aonl.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[aonl.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[aonl.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[aonl.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class DeviceParams extends aonm implements DeviceParamsOrBuilder {
        private static final DeviceParams DEFAULT_INSTANCE;
        public static final int DISTORTION_COEFFICIENTS_FIELD_NUMBER = 7;
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
        private float interLensDistance_;
        private float screenToLensDistance_;
        private float trayToLensDistance_;
        private int verticalAlignment_;
        private int leftEyeFieldOfViewAnglesMemoizedSerializedSize = -1;
        private int distortionCoefficientsMemoizedSerializedSize = -1;
        private String vendor_ = "";
        private String model_ = "";
        private aont leftEyeFieldOfViewAngles_ = emptyFloatList();
        private aont distortionCoefficients_ = emptyFloatList();
        private int primaryButton_ = 1;

        /* compiled from: PG */
        /* loaded from: classes3.dex */
        public final class Builder extends aone implements DeviceParamsOrBuilder {
            private Builder() {
                super(DeviceParams.DEFAULT_INSTANCE);
            }

            public Builder addAllDistortionCoefficients(Iterable iterable) {
                copyOnWrite();
                ((DeviceParams) this.instance).addAllDistortionCoefficients(iterable);
                return this;
            }

            public Builder addAllLeftEyeFieldOfViewAngles(Iterable iterable) {
                copyOnWrite();
                ((DeviceParams) this.instance).addAllLeftEyeFieldOfViewAngles(iterable);
                return this;
            }

            public Builder addDistortionCoefficients(float f) {
                copyOnWrite();
                ((DeviceParams) this.instance).addDistortionCoefficients(f);
                return this;
            }

            public Builder addLeftEyeFieldOfViewAngles(float f) {
                copyOnWrite();
                ((DeviceParams) this.instance).addLeftEyeFieldOfViewAngles(f);
                return this;
            }

            public Builder clearDistortionCoefficients() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearDistortionCoefficients();
                return this;
            }

            public Builder clearInterLensDistance() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearInterLensDistance();
                return this;
            }

            public Builder clearLeftEyeFieldOfViewAngles() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearLeftEyeFieldOfViewAngles();
                return this;
            }

            public Builder clearModel() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearModel();
                return this;
            }

            public Builder clearPrimaryButton() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearPrimaryButton();
                return this;
            }

            public Builder clearScreenToLensDistance() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearScreenToLensDistance();
                return this;
            }

            public Builder clearTrayToLensDistance() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearTrayToLensDistance();
                return this;
            }

            public Builder clearVendor() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearVendor();
                return this;
            }

            public Builder clearVerticalAlignment() {
                copyOnWrite();
                ((DeviceParams) this.instance).clearVerticalAlignment();
                return this;
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public float getDistortionCoefficients(int i) {
                return ((DeviceParams) this.instance).getDistortionCoefficients(i);
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public int getDistortionCoefficientsCount() {
                return ((DeviceParams) this.instance).getDistortionCoefficientsCount();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public List getDistortionCoefficientsList() {
                return Collections.unmodifiableList(((DeviceParams) this.instance).getDistortionCoefficientsList());
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public float getInterLensDistance() {
                return ((DeviceParams) this.instance).getInterLensDistance();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public float getLeftEyeFieldOfViewAngles(int i) {
                return ((DeviceParams) this.instance).getLeftEyeFieldOfViewAngles(i);
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public int getLeftEyeFieldOfViewAnglesCount() {
                return ((DeviceParams) this.instance).getLeftEyeFieldOfViewAnglesCount();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public List getLeftEyeFieldOfViewAnglesList() {
                return Collections.unmodifiableList(((DeviceParams) this.instance).getLeftEyeFieldOfViewAnglesList());
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public String getModel() {
                return ((DeviceParams) this.instance).getModel();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public aomf getModelBytes() {
                return ((DeviceParams) this.instance).getModelBytes();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public ButtonType getPrimaryButton() {
                return ((DeviceParams) this.instance).getPrimaryButton();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public float getScreenToLensDistance() {
                return ((DeviceParams) this.instance).getScreenToLensDistance();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public float getTrayToLensDistance() {
                return ((DeviceParams) this.instance).getTrayToLensDistance();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public String getVendor() {
                return ((DeviceParams) this.instance).getVendor();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public aomf getVendorBytes() {
                return ((DeviceParams) this.instance).getVendorBytes();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public VerticalAlignmentType getVerticalAlignment() {
                return ((DeviceParams) this.instance).getVerticalAlignment();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public boolean hasInterLensDistance() {
                return ((DeviceParams) this.instance).hasInterLensDistance();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public boolean hasModel() {
                return ((DeviceParams) this.instance).hasModel();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public boolean hasPrimaryButton() {
                return ((DeviceParams) this.instance).hasPrimaryButton();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public boolean hasScreenToLensDistance() {
                return ((DeviceParams) this.instance).hasScreenToLensDistance();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public boolean hasTrayToLensDistance() {
                return ((DeviceParams) this.instance).hasTrayToLensDistance();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public boolean hasVendor() {
                return ((DeviceParams) this.instance).hasVendor();
            }

            @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
            public boolean hasVerticalAlignment() {
                return ((DeviceParams) this.instance).hasVerticalAlignment();
            }

            public Builder setDistortionCoefficients(int i, float f) {
                copyOnWrite();
                ((DeviceParams) this.instance).setDistortionCoefficients(i, f);
                return this;
            }

            public Builder setInterLensDistance(float f) {
                copyOnWrite();
                ((DeviceParams) this.instance).setInterLensDistance(f);
                return this;
            }

            public Builder setLeftEyeFieldOfViewAngles(int i, float f) {
                copyOnWrite();
                ((DeviceParams) this.instance).setLeftEyeFieldOfViewAngles(i, f);
                return this;
            }

            public Builder setModel(String str) {
                copyOnWrite();
                ((DeviceParams) this.instance).setModel(str);
                return this;
            }

            public Builder setModelBytes(aomf aomfVar) {
                copyOnWrite();
                ((DeviceParams) this.instance).setModelBytes(aomfVar);
                return this;
            }

            public Builder setPrimaryButton(ButtonType buttonType) {
                copyOnWrite();
                ((DeviceParams) this.instance).setPrimaryButton(buttonType);
                return this;
            }

            public Builder setScreenToLensDistance(float f) {
                copyOnWrite();
                ((DeviceParams) this.instance).setScreenToLensDistance(f);
                return this;
            }

            public Builder setTrayToLensDistance(float f) {
                copyOnWrite();
                ((DeviceParams) this.instance).setTrayToLensDistance(f);
                return this;
            }

            public Builder setVendor(String str) {
                copyOnWrite();
                ((DeviceParams) this.instance).setVendor(str);
                return this;
            }

            public Builder setVendorBytes(aomf aomfVar) {
                copyOnWrite();
                ((DeviceParams) this.instance).setVendorBytes(aomfVar);
                return this;
            }

            public Builder setVerticalAlignment(VerticalAlignmentType verticalAlignmentType) {
                copyOnWrite();
                ((DeviceParams) this.instance).setVerticalAlignment(verticalAlignmentType);
                return this;
            }

            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
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
            private static final aonr internalValueMap = new aonr() { // from class: com.google.cardboard.proto.CardboardDevice.DeviceParams.ButtonType.1
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

            public static aonr internalGetValueMap() {
                return internalValueMap;
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
            private static final aonr internalValueMap = new aonr() { // from class: com.google.cardboard.proto.CardboardDevice.DeviceParams.VerticalAlignmentType.1
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

            public static aonr internalGetValueMap() {
                return internalValueMap;
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
            DeviceParams deviceParams = new DeviceParams();
            DEFAULT_INSTANCE = deviceParams;
            aonm.registerDefaultInstance(DeviceParams.class, deviceParams);
        }

        private DeviceParams() {
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
        public void addDistortionCoefficients(float f) {
            ensureDistortionCoefficientsIsMutable();
            this.distortionCoefficients_.h(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLeftEyeFieldOfViewAngles(float f) {
            ensureLeftEyeFieldOfViewAnglesIsMutable();
            this.leftEyeFieldOfViewAngles_.h(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDistortionCoefficients() {
            this.distortionCoefficients_ = emptyFloatList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInterLensDistance() {
            this.bitField0_ &= -9;
            this.interLensDistance_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLeftEyeFieldOfViewAngles() {
            this.leftEyeFieldOfViewAngles_ = emptyFloatList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModel() {
            this.bitField0_ &= -3;
            this.model_ = getDefaultInstance().getModel();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPrimaryButton() {
            this.bitField0_ &= -65;
            this.primaryButton_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreenToLensDistance() {
            this.bitField0_ &= -5;
            this.screenToLensDistance_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrayToLensDistance() {
            this.bitField0_ &= -33;
            this.trayToLensDistance_ = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVendor() {
            this.bitField0_ &= -2;
            this.vendor_ = getDefaultInstance().getVendor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVerticalAlignment() {
            this.bitField0_ &= -17;
            this.verticalAlignment_ = 0;
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

        public static DeviceParams getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return (Builder) DEFAULT_INSTANCE.createBuilder();
        }

        public static DeviceParams parseDelimitedFrom(InputStream inputStream) {
            return (DeviceParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeviceParams parseFrom(aomf aomfVar) {
            return (DeviceParams) aonm.parseFrom(DEFAULT_INSTANCE, aomfVar);
        }

        public static aopf parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDistortionCoefficients(int i, float f) {
            ensureDistortionCoefficientsIsMutable();
            this.distortionCoefficients_.f(i, f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInterLensDistance(float f) {
            this.bitField0_ |= 8;
            this.interLensDistance_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeftEyeFieldOfViewAngles(int i, float f) {
            ensureLeftEyeFieldOfViewAnglesIsMutable();
            this.leftEyeFieldOfViewAngles_.f(i, f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModel(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.model_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModelBytes(aomf aomfVar) {
            this.model_ = aomfVar.E();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrimaryButton(ButtonType buttonType) {
            this.primaryButton_ = buttonType.getNumber();
            this.bitField0_ |= 64;
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
        public void setVendorBytes(aomf aomfVar) {
            this.vendor_ = aomfVar.E();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVerticalAlignment(VerticalAlignmentType verticalAlignmentType) {
            this.verticalAlignment_ = verticalAlignmentType.getNumber();
            this.bitField0_ |= 16;
        }

        @Override // defpackage.aonm
        protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
            aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
            AnonymousClass1 anonymousClass1 = null;
            switch (aonlVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005$\u0006ခ\u0005\u0007$\u000bဌ\u0004\fဌ\u0006", new Object[]{"bitField0_", "vendor_", "model_", "screenToLensDistance_", "interLensDistance_", "leftEyeFieldOfViewAngles_", "trayToLensDistance_", "distortionCoefficients_", "verticalAlignment_", VerticalAlignmentType.internalGetVerifier(), "primaryButton_", ButtonType.internalGetVerifier()});
                case NEW_MUTABLE_INSTANCE:
                    return new DeviceParams();
                case NEW_BUILDER:
                    return new Builder(anonymousClass1);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    aopf aopfVar = PARSER;
                    if (aopfVar == null) {
                        synchronized (DeviceParams.class) {
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

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public float getDistortionCoefficients(int i) {
            return this.distortionCoefficients_.d(i);
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public int getDistortionCoefficientsCount() {
            return this.distortionCoefficients_.size();
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public List getDistortionCoefficientsList() {
            return this.distortionCoefficients_;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public float getInterLensDistance() {
            return this.interLensDistance_;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public float getLeftEyeFieldOfViewAngles(int i) {
            return this.leftEyeFieldOfViewAngles_.d(i);
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public int getLeftEyeFieldOfViewAnglesCount() {
            return this.leftEyeFieldOfViewAngles_.size();
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public List getLeftEyeFieldOfViewAnglesList() {
            return this.leftEyeFieldOfViewAngles_;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public String getModel() {
            return this.model_;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public aomf getModelBytes() {
            return aomf.z(this.model_);
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public ButtonType getPrimaryButton() {
            ButtonType forNumber = ButtonType.forNumber(this.primaryButton_);
            return forNumber == null ? ButtonType.MAGNET : forNumber;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public float getScreenToLensDistance() {
            return this.screenToLensDistance_;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public float getTrayToLensDistance() {
            return this.trayToLensDistance_;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public String getVendor() {
            return this.vendor_;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public aomf getVendorBytes() {
            return aomf.z(this.vendor_);
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public VerticalAlignmentType getVerticalAlignment() {
            VerticalAlignmentType forNumber = VerticalAlignmentType.forNumber(this.verticalAlignment_);
            return forNumber == null ? VerticalAlignmentType.BOTTOM : forNumber;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public boolean hasInterLensDistance() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public boolean hasModel() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public boolean hasPrimaryButton() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public boolean hasScreenToLensDistance() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public boolean hasTrayToLensDistance() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public boolean hasVendor() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.cardboard.proto.CardboardDevice.DeviceParamsOrBuilder
        public boolean hasVerticalAlignment() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(DeviceParams deviceParams) {
            return (Builder) DEFAULT_INSTANCE.createBuilder(deviceParams);
        }

        public static DeviceParams parseDelimitedFrom(InputStream inputStream, aomw aomwVar) {
            return (DeviceParams) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, aomwVar);
        }

        public static DeviceParams parseFrom(aomf aomfVar, aomw aomwVar) {
            return (DeviceParams) aonm.parseFrom(DEFAULT_INSTANCE, aomfVar, aomwVar);
        }

        public static DeviceParams parseFrom(aomk aomkVar) {
            return (DeviceParams) aonm.parseFrom(DEFAULT_INSTANCE, aomkVar);
        }

        public static DeviceParams parseFrom(aomk aomkVar, aomw aomwVar) {
            return (DeviceParams) aonm.parseFrom(DEFAULT_INSTANCE, aomkVar, aomwVar);
        }

        public static DeviceParams parseFrom(InputStream inputStream) {
            return (DeviceParams) aonm.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static DeviceParams parseFrom(InputStream inputStream, aomw aomwVar) {
            return (DeviceParams) aonm.parseFrom(DEFAULT_INSTANCE, inputStream, aomwVar);
        }

        public static DeviceParams parseFrom(ByteBuffer byteBuffer) {
            return (DeviceParams) aonm.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static DeviceParams parseFrom(ByteBuffer byteBuffer, aomw aomwVar) {
            return (DeviceParams) aonm.parseFrom(DEFAULT_INSTANCE, byteBuffer, aomwVar);
        }

        public static DeviceParams parseFrom(byte[] bArr) {
            return (DeviceParams) aonm.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static DeviceParams parseFrom(byte[] bArr, aomw aomwVar) {
            return (DeviceParams) aonm.parseFrom(DEFAULT_INSTANCE, bArr, aomwVar);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface DeviceParamsOrBuilder extends aooz {
        float getDistortionCoefficients(int i);

        int getDistortionCoefficientsCount();

        List getDistortionCoefficientsList();

        float getInterLensDistance();

        float getLeftEyeFieldOfViewAngles(int i);

        int getLeftEyeFieldOfViewAnglesCount();

        List getLeftEyeFieldOfViewAnglesList();

        String getModel();

        aomf getModelBytes();

        DeviceParams.ButtonType getPrimaryButton();

        float getScreenToLensDistance();

        float getTrayToLensDistance();

        String getVendor();

        aomf getVendorBytes();

        DeviceParams.VerticalAlignmentType getVerticalAlignment();

        boolean hasInterLensDistance();

        boolean hasModel();

        boolean hasPrimaryButton();

        boolean hasScreenToLensDistance();

        boolean hasTrayToLensDistance();

        boolean hasVendor();

        boolean hasVerticalAlignment();
    }

    private CardboardDevice() {
    }

    public static void registerAllExtensions(aomw aomwVar) {
    }
}
