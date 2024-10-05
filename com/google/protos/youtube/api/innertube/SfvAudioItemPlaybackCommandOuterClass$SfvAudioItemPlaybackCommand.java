package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aony;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.apxf;
import defpackage.aurf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand extends aonm implements aooz {
    public static final SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand a;
    private static volatile aopf h;
    public static final aonk sfvAudioItemPlaybackCommand;
    public int b;
    public apxf f;
    private byte i = 2;
    public String c = "";
    public String d = "";
    public aony e = emptyProtobufList();
    public String g = "";

    static {
        SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand = new SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand();
        a = sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand;
        aonm.registerDefaultInstance(SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.class, sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand);
        sfvAudioItemPlaybackCommand = aonm.newSingularGeneratedExtension(apxf.a, sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand, sfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand, null, 312722532, aoqn.MESSAGE, SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.class);
    }

    private SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0004ᐉ\u0002\u0005ဈ\u0003", new Object[]{"b", "c", "d", "e", aurf.class, "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (SfvAudioItemPlaybackCommandOuterClass$SfvAudioItemPlaybackCommand.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
