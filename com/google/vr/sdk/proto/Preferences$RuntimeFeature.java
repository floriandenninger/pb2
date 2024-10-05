package com.google.vr.sdk.proto;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Preferences$RuntimeFeature extends aonm implements aooz {
    private static final Preferences$RuntimeFeature DEFAULT_INSTANCE;
    public static final int ENABLED_FIELD_NUMBER = 2;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile aopf PARSER;
    private int bitField0_;
    private boolean enabled_;
    private int id_ = -1;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aone implements aooz {
        private Builder() {
            super(Preferences$RuntimeFeature.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(Preferences$1 preferences$1) {
            this();
        }
    }

    static {
        Preferences$RuntimeFeature preferences$RuntimeFeature = new Preferences$RuntimeFeature();
        DEFAULT_INSTANCE = preferences$RuntimeFeature;
        aonm.registerDefaultInstance(Preferences$RuntimeFeature.class, preferences$RuntimeFeature);
    }

    private Preferences$RuntimeFeature() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "id_", "enabled_"});
            case NEW_MUTABLE_INSTANCE:
                return new Preferences$RuntimeFeature();
            case NEW_BUILDER:
                return new Builder(preferences$1);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                aopf aopfVar = PARSER;
                if (aopfVar == null) {
                    synchronized (Preferences$RuntimeFeature.class) {
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
