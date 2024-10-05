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
import defpackage.aouo;
import defpackage.aoyn;
import defpackage.apxf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand extends aonm implements aooz {
    public static final AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand a;
    public static final aonk adsControlFlowOpportunityReceivedCommand;
    private static volatile aopf e;
    public int b;
    public aony c = emptyProtobufList();
    public boolean d;
    private int f;

    static {
        AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand adsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand = new AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand();
        a = adsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand;
        aonm.registerDefaultInstance(AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.class, adsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand);
        adsControlFlowOpportunityReceivedCommand = aonm.newSingularGeneratedExtension(apxf.a, adsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand, adsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand, null, 350496818, aoqn.MESSAGE, AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.class);
    }

    private AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0004\u001b\u0005ဇ\u0001", new Object[]{"f", "b", aouo.u, "c", aoyn.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (AdsControlFlowOpportunityReceivedCommandOuterClass$AdsControlFlowOpportunityReceivedCommand.class) {
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
