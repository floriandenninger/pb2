package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.apxf;
import defpackage.aqtn;
import defpackage.autu;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand extends aonm implements aooz {
    public static final ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand a;
    private static volatile aopf f;
    public static final aonk toggleEngagementPanelCommand;
    public Object c;
    public boolean d;
    public autu e;
    private int g;
    public int b = 0;
    private byte h = 2;

    static {
        ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand = new ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand();
        a = toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand;
        aonm.registerDefaultInstance(ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.class, toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand);
        toggleEngagementPanelCommand = aonm.newSingularGeneratedExtension(apxf.a, toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand, toggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand, null, 369951587, aoqn.MESSAGE, ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.class);
    }

    private ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ျ\u0000\u0002ြ\u0000\u0003ဇ\u0002\u0004ᐉ\u0003", new Object[]{"c", "b", "g", aqtn.class, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
