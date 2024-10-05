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
public final class SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand extends aonm implements aooz {
    public static final SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand a;
    private static volatile aopf d;
    public static final aonk setPlaybackStateCommand;
    public int b;
    public int c;

    static {
        SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand setPlaybackStateCommandOuterClass$SetPlaybackStateCommand = new SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand();
        a = setPlaybackStateCommandOuterClass$SetPlaybackStateCommand;
        aonm.registerDefaultInstance(SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.class, setPlaybackStateCommandOuterClass$SetPlaybackStateCommand);
        setPlaybackStateCommand = aonm.newSingularGeneratedExtension(apxf.a, setPlaybackStateCommandOuterClass$SetPlaybackStateCommand, setPlaybackStateCommandOuterClass$SetPlaybackStateCommand, null, 327511066, aoqn.MESSAGE, SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.class);
    }

    private SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"b", "c", aukz.s});
            case NEW_MUTABLE_INSTANCE:
                return new SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (SetPlaybackStateCommandOuterClass$SetPlaybackStateCommand.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
