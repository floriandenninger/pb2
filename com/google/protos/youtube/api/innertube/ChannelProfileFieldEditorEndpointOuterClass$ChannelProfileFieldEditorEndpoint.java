package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.apru;
import defpackage.apxf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint extends aonm implements aooz {
    public static final ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint a;
    public static final aonk channelProfileFieldEditorEndpoint;
    private static volatile aopf d;
    public int b;
    public apru c;
    private byte e = 2;

    static {
        ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint channelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint = new ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint();
        a = channelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint;
        aonm.registerDefaultInstance(ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.class, channelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint);
        channelProfileFieldEditorEndpoint = aonm.newSingularGeneratedExtension(apxf.a, channelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint, channelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint, null, 106088718, aoqn.MESSAGE, ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.class);
    }

    private ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (ChannelProfileFieldEditorEndpointOuterClass$ChannelProfileFieldEditorEndpoint.class) {
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
