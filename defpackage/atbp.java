package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atbp extends aonm implements aooz {
    public static final atbp a;
    private static volatile aopf g;
    public int b;
    public atbq d;
    public atca e;
    public aony c = aonm.emptyProtobufList();
    public aony f = aonm.emptyProtobufList();

    static {
        atbp atbpVar = new atbp();
        a = atbpVar;
        aonm.registerDefaultInstance(atbp.class, atbpVar);
    }

    private atbp() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0002\u0000\u0005\u001a\u0006ဉ\u0003\u0007ဉ\u0004\b\u001a", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new atbp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (atbp.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
