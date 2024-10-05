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
import defpackage.aurh;
import defpackage.auri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand extends aonm implements aooz {
    public static final SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand a;
    private static volatile aopf h;
    public static final aonk sfvAudioItemSelectCommand;
    public int b;
    public aurh e;
    public apxf g;
    private byte i = 2;
    public String c = "";
    public String d = "";
    public aony f = emptyProtobufList();

    static {
        SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand = new SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand();
        a = sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand;
        aonm.registerDefaultInstance(SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.class, sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand);
        sfvAudioItemSelectCommand = aonm.newSingularGeneratedExtension(apxf.a, sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand, sfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand, null, 313660028, aoqn.MESSAGE, SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.class);
    }

    private SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004\u001b\u0005ᐉ\u0003", new Object[]{"b", "c", "d", "e", "f", auri.class, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (SfvAudioItemSelectCommandOuterClass$SfvAudioItemSelectCommand.class) {
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
