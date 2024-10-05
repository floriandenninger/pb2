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
public final class AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand extends aonm implements aooz {
    public static final AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand a;
    public static final aonk adsVisualElementLoggingWrapperCommand;
    private static volatile aopf f;
    public int b;
    public apxf c;
    public boolean d;
    public boolean e;
    private byte g = 2;

    static {
        AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand adsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand = new AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand();
        a = adsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand;
        aonm.registerDefaultInstance(AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand.class, adsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand);
        adsVisualElementLoggingWrapperCommand = aonm.newSingularGeneratedExtension(apxf.a, adsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand, adsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand, null, 287920878, aoqn.MESSAGE, AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand.class);
    }

    private AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (AdsVisualElementLoggingWrapperCommandOuterClass$AdsVisualElementLoggingWrapperCommand.class) {
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
