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
public final class AdsDebounceCommandOuterClass$AdsDebounceCommand extends aonm implements aooz {
    public static final AdsDebounceCommandOuterClass$AdsDebounceCommand a;
    public static final aonk adsDebounceCommand;
    private static volatile aopf d;
    public apxf b;
    public boolean c;
    private int e;
    private byte f = 2;

    static {
        AdsDebounceCommandOuterClass$AdsDebounceCommand adsDebounceCommandOuterClass$AdsDebounceCommand = new AdsDebounceCommandOuterClass$AdsDebounceCommand();
        a = adsDebounceCommandOuterClass$AdsDebounceCommand;
        aonm.registerDefaultInstance(AdsDebounceCommandOuterClass$AdsDebounceCommand.class, adsDebounceCommandOuterClass$AdsDebounceCommand);
        adsDebounceCommand = aonm.newSingularGeneratedExtension(apxf.a, adsDebounceCommandOuterClass$AdsDebounceCommand, adsDebounceCommandOuterClass$AdsDebounceCommand, null, 247128500, aoqn.MESSAGE, AdsDebounceCommandOuterClass$AdsDebounceCommand.class);
    }

    private AdsDebounceCommandOuterClass$AdsDebounceCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001", new Object[]{"e", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new AdsDebounceCommandOuterClass$AdsDebounceCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (AdsDebounceCommandOuterClass$AdsDebounceCommand.class) {
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
