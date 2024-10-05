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

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand extends aonm implements aooz {
    public static final ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand a;
    private static volatile aopf e;
    public static final aonk toggleMultiSelectVideoItemCommand;
    public int b;
    public String c = "";
    public String d = "";

    static {
        ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand = new ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand();
        a = toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand;
        aonm.registerDefaultInstance(ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.class, toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand);
        toggleMultiSelectVideoItemCommand = aonm.newSingularGeneratedExtension(apxf.a, toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand, toggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand, null, 229250685, aoqn.MESSAGE, ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.class);
    }

    private ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (ToggleMultiSelectVideoItemCommandOuterClass$ToggleMultiSelectVideoItemCommand.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
