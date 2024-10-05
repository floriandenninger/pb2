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
import defpackage.autz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowInterstitialActionOuterClass$ShowInterstitialAction extends aonm implements aooz {
    public static final ShowInterstitialActionOuterClass$ShowInterstitialAction a;
    private static volatile aopf d;
    public static final aonk showInterstitialAction;
    public autz b;
    public boolean c;
    private int e;
    private byte f = 2;

    static {
        ShowInterstitialActionOuterClass$ShowInterstitialAction showInterstitialActionOuterClass$ShowInterstitialAction = new ShowInterstitialActionOuterClass$ShowInterstitialAction();
        a = showInterstitialActionOuterClass$ShowInterstitialAction;
        aonm.registerDefaultInstance(ShowInterstitialActionOuterClass$ShowInterstitialAction.class, showInterstitialActionOuterClass$ShowInterstitialAction);
        showInterstitialAction = aonm.newSingularGeneratedExtension(apxf.a, showInterstitialActionOuterClass$ShowInterstitialAction, showInterstitialActionOuterClass$ShowInterstitialAction, null, 152165632, aoqn.MESSAGE, ShowInterstitialActionOuterClass$ShowInterstitialAction.class);
    }

    private ShowInterstitialActionOuterClass$ShowInterstitialAction() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ဇ\u0002", new Object[]{"e", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new ShowInterstitialActionOuterClass$ShowInterstitialAction();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (ShowInterstitialActionOuterClass$ShowInterstitialAction.class) {
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
