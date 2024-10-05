package com.google.vr.sdk.proto;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Preferences$RadialPlayAreaSettings extends aonm implements aooz {
    private static final Preferences$RadialPlayAreaSettings DEFAULT_INSTANCE;
    private static volatile aopf PARSER = null;
    public static final int RADIUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private float radius_;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aone implements aooz {
        private Builder() {
            super(Preferences$RadialPlayAreaSettings.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(Preferences$1 preferences$1) {
            this();
        }
    }

    static {
        Preferences$RadialPlayAreaSettings preferences$RadialPlayAreaSettings = new Preferences$RadialPlayAreaSettings();
        DEFAULT_INSTANCE = preferences$RadialPlayAreaSettings;
        aonm.registerDefaultInstance(Preferences$RadialPlayAreaSettings.class, preferences$RadialPlayAreaSettings);
    }

    private Preferences$RadialPlayAreaSettings() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"bitField0_", "radius_"});
            case NEW_MUTABLE_INSTANCE:
                return new Preferences$RadialPlayAreaSettings();
            case NEW_BUILDER:
                return new Builder(preferences$1);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                aopf aopfVar = PARSER;
                if (aopfVar == null) {
                    synchronized (Preferences$RadialPlayAreaSettings.class) {
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
