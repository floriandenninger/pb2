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
public final class CardboardDevice$VignetteParams extends aonm implements aooz {
    public static final int CONDITION_FIELD_NUMBER = 2;
    private static final CardboardDevice$VignetteParams DEFAULT_INSTANCE;
    private static volatile aopf PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 3;
    private int bitField0_;
    private int condition_;
    private float value_;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aone implements aooz {
        private Builder() {
            super(CardboardDevice$VignetteParams.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(CardboardDevice$1 cardboardDevice$1) {
            this();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public enum VignetteParamsCondition implements aonq {
        NO_VIGNETTE_CONDITION(0),
        HORIZ_DIMEN_LESS_THAN_METER(1);

        public static final int HORIZ_DIMEN_LESS_THAN_METER_VALUE = 1;
        public static final int NO_VIGNETTE_CONDITION_VALUE = 0;
        private static final aonr internalValueMap = new aonr() { // from class: com.google.vr.sdk.proto.CardboardDevice.VignetteParams.VignetteParamsCondition.1
            @Override // defpackage.aonr
            public VignetteParamsCondition findValueByNumber(int i) {
                return VignetteParamsCondition.forNumber(i);
            }
        };
        private final int value;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* loaded from: classes3.dex */
        public final class VignetteParamsConditionVerifier implements aons {
            static final aons INSTANCE = new VignetteParamsConditionVerifier();

            private VignetteParamsConditionVerifier() {
            }

            @Override // defpackage.aons
            public boolean isInRange(int i) {
                return VignetteParamsCondition.forNumber(i) != null;
            }
        }

        VignetteParamsCondition(int i) {
            this.value = i;
        }

        public static VignetteParamsCondition forNumber(int i) {
            if (i == 0) {
                return NO_VIGNETTE_CONDITION;
            }
            if (i != 1) {
                return null;
            }
            return HORIZ_DIMEN_LESS_THAN_METER;
        }

        public static aons internalGetVerifier() {
            return VignetteParamsConditionVerifier.INSTANCE;
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
        CardboardDevice$VignetteParams cardboardDevice$VignetteParams = new CardboardDevice$VignetteParams();
        DEFAULT_INSTANCE = cardboardDevice$VignetteParams;
        aonm.registerDefaultInstance(CardboardDevice$VignetteParams.class, cardboardDevice$VignetteParams);
    }

    private CardboardDevice$VignetteParams() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0000\u0003ခ\u0001", new Object[]{"bitField0_", "condition_", VignetteParamsCondition.internalGetVerifier(), "value_"});
            case NEW_MUTABLE_INSTANCE:
                return new CardboardDevice$VignetteParams();
            case NEW_BUILDER:
                return new Builder(cardboardDevice$1);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                aopf aopfVar = PARSER;
                if (aopfVar == null) {
                    synchronized (CardboardDevice$VignetteParams.class) {
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
