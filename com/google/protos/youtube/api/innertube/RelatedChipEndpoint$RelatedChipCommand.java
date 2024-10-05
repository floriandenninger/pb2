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
import defpackage.aqew;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RelatedChipEndpoint$RelatedChipCommand extends aonm implements aooz {
    public static final RelatedChipEndpoint$RelatedChipCommand a;
    private static volatile aopf d;
    public static final aonk relatedChipCommand;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        RelatedChipEndpoint$RelatedChipCommand relatedChipEndpoint$RelatedChipCommand = new RelatedChipEndpoint$RelatedChipCommand();
        a = relatedChipEndpoint$RelatedChipCommand;
        aonm.registerDefaultInstance(RelatedChipEndpoint$RelatedChipCommand.class, relatedChipEndpoint$RelatedChipCommand);
        relatedChipCommand = aonm.newSingularGeneratedExtension(apxf.a, relatedChipEndpoint$RelatedChipCommand, relatedChipEndpoint$RelatedChipCommand, null, 189079648, aoqn.MESSAGE, RelatedChipEndpoint$RelatedChipCommand.class);
    }

    private RelatedChipEndpoint$RelatedChipCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0003\u0002\u0000\u0000\u0001\u0001ᐼ\u0000\u0003်\u0000", new Object[]{"c", "b", aqew.class});
            case NEW_MUTABLE_INSTANCE:
                return new RelatedChipEndpoint$RelatedChipCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (RelatedChipEndpoint$RelatedChipCommand.class) {
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
