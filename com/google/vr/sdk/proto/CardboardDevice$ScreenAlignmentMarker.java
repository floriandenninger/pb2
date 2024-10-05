package com.google.vr.sdk.proto;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CardboardDevice$ScreenAlignmentMarker extends aonm implements aooz {
    private static final CardboardDevice$ScreenAlignmentMarker DEFAULT_INSTANCE;
    public static final int HORIZONTAL_FIELD_NUMBER = 1;
    private static volatile aopf PARSER = null;
    public static final int VERTICAL_FIELD_NUMBER = 2;
    private int bitField0_;
    private float horizontal_;
    private float vertical_;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aone implements aooz {
        private Builder() {
            super(CardboardDevice$ScreenAlignmentMarker.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(CardboardDevice$1 cardboardDevice$1) {
            this();
        }
    }

    static {
        CardboardDevice$ScreenAlignmentMarker cardboardDevice$ScreenAlignmentMarker = new CardboardDevice$ScreenAlignmentMarker();
        DEFAULT_INSTANCE = cardboardDevice$ScreenAlignmentMarker;
        aonm.registerDefaultInstance(CardboardDevice$ScreenAlignmentMarker.class, cardboardDevice$ScreenAlignmentMarker);
    }

    private CardboardDevice$ScreenAlignmentMarker() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"bitField0_", "horizontal_", "vertical_"});
            case NEW_MUTABLE_INSTANCE:
                return new CardboardDevice$ScreenAlignmentMarker();
            case NEW_BUILDER:
                return new Builder(cardboardDevice$1);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                aopf aopfVar = PARSER;
                if (aopfVar == null) {
                    synchronized (CardboardDevice$ScreenAlignmentMarker.class) {
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

    public float getHorizontal() {
        return this.horizontal_;
    }

    public float getVertical() {
        return this.vertical_;
    }
}
