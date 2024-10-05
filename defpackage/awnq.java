package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awnq extends aonm implements aooz {
    public static final awnq a;
    public static final aonk b;
    private static volatile aopf f;
    public int c;
    public awpq d;
    public int e;

    static {
        awnq awnqVar = new awnq();
        a = awnqVar;
        aonm.registerDefaultInstance(awnq.class, awnqVar);
        b = aonm.newSingularGeneratedExtension(awpu.a, awnqVar, awnqVar, null, 198239242, aoqn.MESSAGE, awnq.class);
    }

    private awnq() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new awnq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awnq.class) {
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
