package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aufr extends aonm implements aooz {
    public static final aufr a;
    private static volatile aopf g;
    public int b;
    public boolean c;
    public apxf e;
    public apxf f;
    private byte h = 2;
    public aony d = emptyProtobufList();

    static {
        aufr aufrVar = new aufr();
        a = aufrVar;
        aonm.registerDefaultInstance(aufr.class, aufrVar);
    }

    private aufr() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0001\u0003\u0002ဇ\u0001\u0003Л\u0004ᐉ\u0002\u0005ᐉ\u0003", new Object[]{"b", "c", "d", apxf.class, "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aufr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aufr.class) {
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
