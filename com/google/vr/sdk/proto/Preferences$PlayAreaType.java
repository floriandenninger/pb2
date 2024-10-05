package com.google.vr.sdk.proto;

import defpackage.aonq;
import defpackage.aonr;
import defpackage.aons;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum Preferences$PlayAreaType implements aonq {
    GVR_PLAY_AREA_TYPE_NOT_SET(0),
    GVR_PLAY_AREA_TYPE_RADIAL(1);

    public static final int GVR_PLAY_AREA_TYPE_NOT_SET_VALUE = 0;
    public static final int GVR_PLAY_AREA_TYPE_RADIAL_VALUE = 1;
    private static final aonr internalValueMap = new aonr() { // from class: com.google.vr.sdk.proto.Preferences$PlayAreaType.1
        @Override // defpackage.aonr
        public Preferences$PlayAreaType findValueByNumber(int i) {
            return Preferences$PlayAreaType.forNumber(i);
        }
    };
    private final int value;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    final class PlayAreaTypeVerifier implements aons {
        static final aons INSTANCE = new PlayAreaTypeVerifier();

        private PlayAreaTypeVerifier() {
        }

        @Override // defpackage.aons
        public boolean isInRange(int i) {
            return Preferences$PlayAreaType.forNumber(i) != null;
        }
    }

    Preferences$PlayAreaType(int i) {
        this.value = i;
    }

    public static Preferences$PlayAreaType forNumber(int i) {
        if (i == 0) {
            return GVR_PLAY_AREA_TYPE_NOT_SET;
        }
        if (i != 1) {
            return null;
        }
        return GVR_PLAY_AREA_TYPE_RADIAL;
    }

    public static aons internalGetVerifier() {
        return PlayAreaTypeVerifier.INSTANCE;
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
