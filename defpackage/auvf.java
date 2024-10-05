package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auvf extends aonm implements aooz {
    public static final auvf a;
    private static volatile aopf g;
    public int b;
    public auvg c;
    public aoyq d;
    public avjw f;
    private aota h;
    private aoxz i;
    private byte j = 2;
    public aomf e = aomf.b;

    static {
        auvf auvfVar = new auvf();
        a = auvfVar;
        aonm.registerDefaultInstance(auvf.class, auvfVar);
    }

    private auvf() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0003\u0001ဉ\u0000\u0002ᐉ\u0001\u0005ᐉ\u0002\u0006ည\u0003\bဉ\u0004\tᐉ\u0005", new Object[]{"b", "c", "d", "h", "e", "f", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new auvf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (auvf.class) {
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
