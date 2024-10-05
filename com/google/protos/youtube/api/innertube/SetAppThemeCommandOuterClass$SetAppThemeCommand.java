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
import defpackage.aukz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SetAppThemeCommandOuterClass$SetAppThemeCommand extends aonm implements aooz {
    public static final SetAppThemeCommandOuterClass$SetAppThemeCommand a;
    private static volatile aopf c;
    public static final aonk setAppThemeCommand;
    public int b;
    private int d;

    static {
        SetAppThemeCommandOuterClass$SetAppThemeCommand setAppThemeCommandOuterClass$SetAppThemeCommand = new SetAppThemeCommandOuterClass$SetAppThemeCommand();
        a = setAppThemeCommandOuterClass$SetAppThemeCommand;
        aonm.registerDefaultInstance(SetAppThemeCommandOuterClass$SetAppThemeCommand.class, setAppThemeCommandOuterClass$SetAppThemeCommand);
        setAppThemeCommand = aonm.newSingularGeneratedExtension(apxf.a, setAppThemeCommandOuterClass$SetAppThemeCommand, setAppThemeCommandOuterClass$SetAppThemeCommand, null, 195899132, aoqn.MESSAGE, SetAppThemeCommandOuterClass$SetAppThemeCommand.class);
    }

    private SetAppThemeCommandOuterClass$SetAppThemeCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "b", aukz.r});
            case NEW_MUTABLE_INSTANCE:
                return new SetAppThemeCommandOuterClass$SetAppThemeCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (SetAppThemeCommandOuterClass$SetAppThemeCommand.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
