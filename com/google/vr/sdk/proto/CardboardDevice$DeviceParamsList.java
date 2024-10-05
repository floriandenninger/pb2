package com.google.vr.sdk.proto;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aony;
import defpackage.aooz;
import defpackage.aopf;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CardboardDevice$DeviceParamsList extends aonm implements aooz {
    private static final CardboardDevice$DeviceParamsList DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile aopf PARSER;
    private aony params_ = emptyProtobufList();

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aone implements aooz {
        private Builder() {
            super(CardboardDevice$DeviceParamsList.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(CardboardDevice$1 cardboardDevice$1) {
            this();
        }
    }

    static {
        CardboardDevice$DeviceParamsList cardboardDevice$DeviceParamsList = new CardboardDevice$DeviceParamsList();
        DEFAULT_INSTANCE = cardboardDevice$DeviceParamsList;
        aonm.registerDefaultInstance(CardboardDevice$DeviceParamsList.class, cardboardDevice$DeviceParamsList);
    }

    private CardboardDevice$DeviceParamsList() {
    }

    public static CardboardDevice$DeviceParamsList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"params_", CardboardDevice$DeviceParams.class});
            case NEW_MUTABLE_INSTANCE:
                return new CardboardDevice$DeviceParamsList();
            case NEW_BUILDER:
                return new Builder(cardboardDevice$1);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                aopf aopfVar = PARSER;
                if (aopfVar == null) {
                    synchronized (CardboardDevice$DeviceParamsList.class) {
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

    public List getParamsList() {
        return this.params_;
    }
}
