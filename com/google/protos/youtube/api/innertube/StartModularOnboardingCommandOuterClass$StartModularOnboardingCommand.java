package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.apud;
import defpackage.apxf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand extends aonm implements aooz {
    public static final StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand a;
    private static volatile aopf g;
    public static final aonk startModularOnboardingCommand;
    public apud b;
    public apxf e;
    public boolean f;
    private int h;
    private byte i = 2;
    public String c = "";
    public String d = "";

    static {
        StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand startModularOnboardingCommandOuterClass$StartModularOnboardingCommand = new StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand();
        a = startModularOnboardingCommandOuterClass$StartModularOnboardingCommand;
        aonm.registerDefaultInstance(StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.class, startModularOnboardingCommandOuterClass$StartModularOnboardingCommand);
        startModularOnboardingCommand = aonm.newSingularGeneratedExtension(apxf.a, startModularOnboardingCommandOuterClass$StartModularOnboardingCommand, startModularOnboardingCommandOuterClass$StartModularOnboardingCommand, null, 301098174, aoqn.MESSAGE, StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.class);
    }

    private StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဇ\u0004", new Object[]{"h", "b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (StartModularOnboardingCommandOuterClass$StartModularOnboardingCommand.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
