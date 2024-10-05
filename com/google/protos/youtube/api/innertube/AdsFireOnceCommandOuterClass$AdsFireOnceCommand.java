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
public final class AdsFireOnceCommandOuterClass$AdsFireOnceCommand extends aonm implements aooz {
    public static final AdsFireOnceCommandOuterClass$AdsFireOnceCommand a;
    public static final aonk adsFireOnceCommand;
    private static volatile aopf e;
    public int b;
    public apxf c;
    private byte f = 2;
    public String d = "";

    static {
        AdsFireOnceCommandOuterClass$AdsFireOnceCommand adsFireOnceCommandOuterClass$AdsFireOnceCommand = new AdsFireOnceCommandOuterClass$AdsFireOnceCommand();
        a = adsFireOnceCommandOuterClass$AdsFireOnceCommand;
        aonm.registerDefaultInstance(AdsFireOnceCommandOuterClass$AdsFireOnceCommand.class, adsFireOnceCommandOuterClass$AdsFireOnceCommand);
        adsFireOnceCommand = aonm.newSingularGeneratedExtension(apxf.a, adsFireOnceCommandOuterClass$AdsFireOnceCommand, adsFireOnceCommandOuterClass$AdsFireOnceCommand, null, 284059002, aoqn.MESSAGE, AdsFireOnceCommandOuterClass$AdsFireOnceCommand.class);
    }

    private AdsFireOnceCommandOuterClass$AdsFireOnceCommand() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new AdsFireOnceCommandOuterClass$AdsFireOnceCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (AdsFireOnceCommandOuterClass$AdsFireOnceCommand.class) {
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
