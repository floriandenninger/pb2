package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bark extends aonm implements aooz {
    public static final bark a;
    private static volatile aopf f;
    public int b;
    public int c;
    public aoot d = aoot.a;
    public aonu e;

    static {
        bark barkVar = new bark();
        a = barkVar;
        aonm.registerDefaultInstance(bark.class, barkVar);
    }

    private bark() {
        emptyProtobufList();
        this.e = emptyIntList();
        emptyIntList();
        aonm.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0001\u0001\u0000\u0002င\u0001\u00032\u0005'", new Object[]{"b", "c", "d", barj.a, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new bark();
            case NEW_BUILDER:
                return new aone((byte[][]) null, (float[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (bark.class) {
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
