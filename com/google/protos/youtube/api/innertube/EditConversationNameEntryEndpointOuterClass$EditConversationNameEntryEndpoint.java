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
import defpackage.aqql;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint extends aonm implements aooz {
    public static final EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint a;
    private static volatile aopf b;
    public static final aonk editConversationNameEntryEndpoint;
    private int c;
    private aqql d;
    private byte e = 2;

    static {
        EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint = new EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint();
        a = editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint;
        aonm.registerDefaultInstance(EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.class, editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint);
        editConversationNameEntryEndpoint = aonm.newSingularGeneratedExtension(apxf.a, editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint, editConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint, null, 127156142, aoqn.MESSAGE, EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.class);
    }

    private EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (EditConversationNameEntryEndpointOuterClass$EditConversationNameEntryEndpoint.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
