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
public final class SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand extends aonm implements aooz {
    public static final SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand a;
    private static volatile aopf f;
    public static final aonk sfvAudioSearchCommand;
    public int b;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand sfvAudioSearchCommandOuterClass$SfvAudioSearchCommand = new SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand();
        a = sfvAudioSearchCommandOuterClass$SfvAudioSearchCommand;
        aonm.registerDefaultInstance(SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.class, sfvAudioSearchCommandOuterClass$SfvAudioSearchCommand);
        sfvAudioSearchCommand = aonm.newSingularGeneratedExtension(apxf.a, sfvAudioSearchCommandOuterClass$SfvAudioSearchCommand, sfvAudioSearchCommandOuterClass$SfvAudioSearchCommand, null, 321865519, aoqn.MESSAGE, SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.class);
    }

    private SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (SfvAudioSearchCommandOuterClass$SfvAudioSearchCommand.class) {
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
