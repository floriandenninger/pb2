package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aocb extends aonm implements aooz {
    public static final aocb a;
    private static volatile aopf e;
    public aocs c;
    public String b = "";
    public String d = "";

    static {
        aocb aocbVar = new aocb();
        a = aocbVar;
        aonm.registerDefaultInstance(aocb.class, aocbVar);
    }

    private aocb() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\t\u0003Ȉ", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aocb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aocb.class) {
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
