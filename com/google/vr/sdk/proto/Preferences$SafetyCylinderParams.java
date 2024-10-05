package com.google.vr.sdk.proto;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aont;
import defpackage.aooz;
import defpackage.aopf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class Preferences$SafetyCylinderParams extends aonm implements aooz {
    public static final int ANCHOR_WARNING_DISTANCE_FIELD_NUMBER = 8;
    public static final int COLLISION_SPHERE_RADIUS_FIELD_NUMBER = 1;
    private static final Preferences$SafetyCylinderParams DEFAULT_INSTANCE;
    public static final int ENTER_EVENT_RADIUS_FIELD_NUMBER = 6;
    public static final int EXIT_EVENT_RADIUS_FIELD_NUMBER = 7;
    public static final int GRAPHICS_ENABLED_FIELD_NUMBER = 9;
    public static final int INNER_FOG_COLOR_FIELD_NUMBER = 4;
    public static final int INNER_RADIUS_FIELD_NUMBER = 2;
    public static final int OUTER_FOG_COLOR_FIELD_NUMBER = 5;
    public static final int OUTER_RADIUS_FIELD_NUMBER = 3;
    private static volatile aopf PARSER;
    private float anchorWarningDistance_;
    private int bitField0_;
    private float collisionSphereRadius_;
    private float enterEventRadius_;
    private float exitEventRadius_;
    private float innerRadius_;
    private float outerRadius_;
    private aont innerFogColor_ = emptyFloatList();
    private aont outerFogColor_ = emptyFloatList();
    private boolean graphicsEnabled_ = true;

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class Builder extends aone implements aooz {
        private Builder() {
            super(Preferences$SafetyCylinderParams.DEFAULT_INSTANCE);
        }

        public /* synthetic */ Builder(Preferences$1 preferences$1) {
            this();
        }
    }

    static {
        Preferences$SafetyCylinderParams preferences$SafetyCylinderParams = new Preferences$SafetyCylinderParams();
        DEFAULT_INSTANCE = preferences$SafetyCylinderParams;
        aonm.registerDefaultInstance(Preferences$SafetyCylinderParams.class, preferences$SafetyCylinderParams);
    }

    private Preferences$SafetyCylinderParams() {
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004\u0013\u0005\u0013\u0006ခ\u0003\u0007ခ\u0004\bခ\u0005\tဇ\u0006", new Object[]{"bitField0_", "collisionSphereRadius_", "innerRadius_", "outerRadius_", "innerFogColor_", "outerFogColor_", "enterEventRadius_", "exitEventRadius_", "anchorWarningDistance_", "graphicsEnabled_"});
            case NEW_MUTABLE_INSTANCE:
                return new Preferences$SafetyCylinderParams();
            case NEW_BUILDER:
                return new Builder(preferences$1);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                aopf aopfVar = PARSER;
                if (aopfVar == null) {
                    synchronized (Preferences$SafetyCylinderParams.class) {
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
