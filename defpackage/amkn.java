package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amkn extends aonm implements aooz {
    public static final amkn a;
    private static volatile aopf e;
    public amkf b;
    public String c;
    public boolean d;

    static {
        amkn amknVar = new amkn();
        a = amknVar;
        aonm.registerDefaultInstance(amkn.class, amknVar);
    }

    private amkn() {
        aomf aomfVar = aomf.b;
        this.c = "";
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0002\b\u0003\u0000\u0000\u0000\u0002Ȉ\u0003\t\b\u0007", new Object[]{"c", "b", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new amkn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (amkn.class) {
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
