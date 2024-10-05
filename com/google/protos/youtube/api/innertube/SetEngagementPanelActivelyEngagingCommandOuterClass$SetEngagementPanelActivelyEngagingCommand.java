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

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand extends aonm implements aooz {
    public static final SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand a;
    private static volatile aopf f;
    public static final aonk setEngagementPanelActivelyEngagingCommand;
    public int b;
    public int c = 0;
    public Object d;
    public boolean e;

    static {
        SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand = new SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand();
        a = setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand;
        aonm.registerDefaultInstance(SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.class, setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand);
        setEngagementPanelActivelyEngagingCommand = aonm.newSingularGeneratedExtension(apxf.a, setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand, setEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand, null, 321581790, aoqn.MESSAGE, SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.class);
    }

    private SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ျ\u0000\u0002ဇ\u0002\u0003ြ\u0000", new Object[]{"d", "c", "b", "e", aqtn.class});
            case NEW_MUTABLE_INSTANCE:
                return new SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (SetEngagementPanelActivelyEngagingCommandOuterClass$SetEngagementPanelActivelyEngagingCommand.class) {
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
