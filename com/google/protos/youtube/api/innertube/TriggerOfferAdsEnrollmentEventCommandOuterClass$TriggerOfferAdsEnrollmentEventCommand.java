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
import defpackage.atoh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand extends aonm implements aooz {
    public static final TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand a;
    private static volatile aopf d;
    public static final aonk triggerOfferAdsEnrollmentEventCommand;
    public int b;
    public atoh c;

    static {
        TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand triggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand = new TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand();
        a = triggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand;
        aonm.registerDefaultInstance(TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand.class, triggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand);
        triggerOfferAdsEnrollmentEventCommand = aonm.newSingularGeneratedExtension(apxf.a, triggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand, triggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand, null, 308059427, aoqn.MESSAGE, TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand.class);
    }

    private TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (TriggerOfferAdsEnrollmentEventCommandOuterClass$TriggerOfferAdsEnrollmentEventCommand.class) {
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
