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

/* loaded from: classes3.dex */
public final class CreateGpgProfileCommand$CreateGPGProfileCommand extends aonm implements aooz {
    public static final CreateGpgProfileCommand$CreateGPGProfileCommand a;
    public static final aonk createGpgProfileCommand;
    private static volatile aopf f;
    public CommandExecutorCommandOuterClass$CommandExecutorCommand c;
    public CommandExecutorCommandOuterClass$CommandExecutorCommand d;
    public CommandExecutorCommandOuterClass$CommandExecutorCommand e;
    private int g;
    private byte h = 2;
    public String b = "";

    static {
        CreateGpgProfileCommand$CreateGPGProfileCommand createGpgProfileCommand$CreateGPGProfileCommand = new CreateGpgProfileCommand$CreateGPGProfileCommand();
        a = createGpgProfileCommand$CreateGPGProfileCommand;
        aonm.registerDefaultInstance(CreateGpgProfileCommand$CreateGPGProfileCommand.class, createGpgProfileCommand$CreateGPGProfileCommand);
        createGpgProfileCommand = aonm.newSingularGeneratedExtension(apxf.a, createGpgProfileCommand$CreateGPGProfileCommand, createGpgProfileCommand$CreateGPGProfileCommand, null, 300761790, aoqn.MESSAGE, CreateGpgProfileCommand$CreateGPGProfileCommand.class);
    }

    private CreateGpgProfileCommand$CreateGPGProfileCommand() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001ဈ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"g", "b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new CreateGpgProfileCommand$CreateGPGProfileCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (CreateGpgProfileCommand$CreateGPGProfileCommand.class) {
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
