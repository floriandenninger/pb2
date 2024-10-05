package com.google.protos.youtube.api.innertube;

import defpackage.aomf;
import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.apxf;
import defpackage.auye;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class StoriesShareCommandOuterClass$StoriesShareCommand extends aonm implements aooz {
    public static final StoriesShareCommandOuterClass$StoriesShareCommand a;
    private static volatile aopf h;
    public static final aonk storiesShareCommand;
    public Object c;
    public int e;
    private int i;
    public int b = 0;
    public aomf d = aomf.b;
    public String f = "";
    public String g = "";

    static {
        StoriesShareCommandOuterClass$StoriesShareCommand storiesShareCommandOuterClass$StoriesShareCommand = new StoriesShareCommandOuterClass$StoriesShareCommand();
        a = storiesShareCommandOuterClass$StoriesShareCommand;
        aonm.registerDefaultInstance(StoriesShareCommandOuterClass$StoriesShareCommand.class, storiesShareCommandOuterClass$StoriesShareCommand);
        storiesShareCommand = aonm.newSingularGeneratedExtension(apxf.a, storiesShareCommandOuterClass$StoriesShareCommand, storiesShareCommandOuterClass$StoriesShareCommand, null, 377377894, aoqn.MESSAGE, StoriesShareCommandOuterClass$StoriesShareCommand.class);
    }

    private StoriesShareCommandOuterClass$StoriesShareCommand() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ည\u0000\u0002ွ\u0000\u0003ွ\u0000\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"c", "b", "i", "d", "e", auye.e, "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new StoriesShareCommandOuterClass$StoriesShareCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (StoriesShareCommandOuterClass$StoriesShareCommand.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
