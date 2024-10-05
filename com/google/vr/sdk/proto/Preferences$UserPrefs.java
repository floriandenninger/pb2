package com.google.vr.sdk.proto;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aonq;
import defpackage.aonr;
import defpackage.aons;
import defpackage.aony;
import defpackage.aooz;
import defpackage.aopf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Preferences$UserPrefs extends aonm implements aooz {
    public static final int CONTROLLER_HANDEDNESS_FIELD_NUMBER = 1;
    private static final Preferences$UserPrefs DEFAULT_INSTANCE;
    public static final int DEVELOPER_PREFS_FIELD_NUMBER = 2;
    private static volatile aopf PARSER = null;
    public static final int RUNTIME_FEATURES_FIELD_NUMBER = 3;
    private int bitField0_;
    private int controllerHandedness_;
    private Preferences$DeveloperPrefs developerPrefs_;
    private aony runtimeFeatures_ = emptyProtobufList();

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aone implements aooz {
        private Builder() {
            super(Preferences$UserPrefs.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(Preferences$1 preferences$1) {
            this();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public enum Handedness implements aonq {
        RIGHT_HANDED(0),
        LEFT_HANDED(1);

        public static final int LEFT_HANDED_VALUE = 1;
        public static final int RIGHT_HANDED_VALUE = 0;
        private static final aonr internalValueMap = new aonr() { // from class: com.google.vr.sdk.proto.Preferences.UserPrefs.Handedness.1
            @Override // defpackage.aonr
            public Handedness findValueByNumber(int i) {
                return Handedness.forNumber(i);
            }
        };
        private final int value;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: PG */
        /* loaded from: classes3.dex */
        public final class HandednessVerifier implements aons {
            static final aons INSTANCE = new HandednessVerifier();

            private HandednessVerifier() {
            }

            @Override // defpackage.aons
            public boolean isInRange(int i) {
                return Handedness.forNumber(i) != null;
            }
        }

        Handedness(int i) {
            this.value = i;
        }

        public static Handedness forNumber(int i) {
            if (i == 0) {
                return RIGHT_HANDED;
            }
            if (i != 1) {
                return null;
            }
            return LEFT_HANDED;
        }

        public static aons internalGetVerifier() {
            return HandednessVerifier.INSTANCE;
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
        Preferences$UserPrefs preferences$UserPrefs = new Preferences$UserPrefs();
        DEFAULT_INSTANCE = preferences$UserPrefs;
        aonm.registerDefaultInstance(Preferences$UserPrefs.class, preferences$UserPrefs);
    }

    private Preferences$UserPrefs() {
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"bitField0_", "controllerHandedness_", Handedness.internalGetVerifier(), "developerPrefs_", "runtimeFeatures_", Preferences$RuntimeFeature.class});
            case NEW_MUTABLE_INSTANCE:
                return new Preferences$UserPrefs();
            case NEW_BUILDER:
                return new Builder(preferences$1);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                aopf aopfVar = PARSER;
                if (aopfVar == null) {
                    synchronized (Preferences$UserPrefs.class) {
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

    public Preferences$DeveloperPrefs getDeveloperPrefs() {
        Preferences$DeveloperPrefs preferences$DeveloperPrefs = this.developerPrefs_;
        return preferences$DeveloperPrefs == null ? Preferences$DeveloperPrefs.getDefaultInstance() : preferences$DeveloperPrefs;
    }

    public boolean hasDeveloperPrefs() {
        return (this.bitField0_ & 2) != 0;
    }
}
