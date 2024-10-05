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
import defpackage.atff;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint extends aonm implements aooz {
    public static final MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint a;
    private static volatile aopf d;
    public static final aonk mobileBroadcastSetupShowAdvancedSettingsScreenEndpoint;
    public int b;
    public atff c;
    private byte e = 2;

    static {
        MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint mobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint = new MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint();
        a = mobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint;
        aonm.registerDefaultInstance(MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint.class, mobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint);
        mobileBroadcastSetupShowAdvancedSettingsScreenEndpoint = aonm.newSingularGeneratedExtension(apxf.a, mobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint, mobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint, null, 134103788, aoqn.MESSAGE, MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint.class);
    }

    private MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0000", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (MobileBroadcastSetupShowAdvancedSettingsScreenEndpointOuterClass$MobileBroadcastSetupShowAdvancedSettingsScreenEndpoint.class) {
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
