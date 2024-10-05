package com.google.vr.sdk.proto;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aony;
import defpackage.aooz;
import defpackage.aopf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Preferences$PlayAreaSettings extends aonm implements aooz {
    public static final int ANCHOR_IDS_FIELD_NUMBER = 1;
    private static final Preferences$PlayAreaSettings DEFAULT_INSTANCE;
    private static volatile aopf PARSER = null;
    public static final int PLAY_AREA_TYPE_FIELD_NUMBER = 2;
    public static final int RADIAL_PLAY_AREA_FIELD_NUMBER = 3;
    private aony anchorIds_ = aonm.emptyProtobufList();
    private int bitField0_;
    private int playAreaType_;
    private Preferences$RadialPlayAreaSettings radialPlayArea_;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aone implements aooz {
        private Builder() {
            super(Preferences$PlayAreaSettings.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(Preferences$1 preferences$1) {
            this();
        }
    }

    static {
        Preferences$PlayAreaSettings preferences$PlayAreaSettings = new Preferences$PlayAreaSettings();
        DEFAULT_INSTANCE = preferences$PlayAreaSettings;
        aonm.registerDefaultInstance(Preferences$PlayAreaSettings.class, preferences$PlayAreaSettings);
    }

    private Preferences$PlayAreaSettings() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဌ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "anchorIds_", "playAreaType_", Preferences$PlayAreaType.internalGetVerifier(), "radialPlayArea_"});
            case NEW_MUTABLE_INSTANCE:
                return new Preferences$PlayAreaSettings();
            case NEW_BUILDER:
                return new Builder(preferences$1);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                aopf aopfVar = PARSER;
                if (aopfVar == null) {
                    synchronized (Preferences$PlayAreaSettings.class) {
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
