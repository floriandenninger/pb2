package com.google.protos.youtube.api.innertube;

import defpackage.aomf;
import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.apxf;
import defpackage.atwj;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PlayBillingCommandOuterClass$PlayBillingCommand extends aonm implements aooz {
    public static final PlayBillingCommandOuterClass$PlayBillingCommand a;
    private static volatile aopf j;
    public static final aonk playBillingCommand;
    public int b;
    public atwj c;
    public apxf e;
    public apxf f;
    public apxf g;
    private apxf k;
    private byte l = 2;
    public aomf d = aomf.b;
    public String h = "";
    public String i = "";

    static {
        PlayBillingCommandOuterClass$PlayBillingCommand playBillingCommandOuterClass$PlayBillingCommand = new PlayBillingCommandOuterClass$PlayBillingCommand();
        a = playBillingCommandOuterClass$PlayBillingCommand;
        aonm.registerDefaultInstance(PlayBillingCommandOuterClass$PlayBillingCommand.class, playBillingCommandOuterClass$PlayBillingCommand);
        playBillingCommand = aonm.newSingularGeneratedExtension(apxf.a, playBillingCommandOuterClass$PlayBillingCommand, playBillingCommandOuterClass$PlayBillingCommand, null, 381321562, aoqn.MESSAGE, PlayBillingCommandOuterClass$PlayBillingCommand.class);
    }

    private PlayBillingCommandOuterClass$PlayBillingCommand() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0004\u0001ဉ\u0000\u0002ည\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ဈ\u0006\bဈ\u0007", new Object[]{"b", "c", "d", "k", "e", "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new PlayBillingCommandOuterClass$PlayBillingCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (PlayBillingCommandOuterClass$PlayBillingCommand.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
